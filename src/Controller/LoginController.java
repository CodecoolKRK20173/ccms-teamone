package Controller;

import DataBase.Dao;
import View.Menu;


import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class LoginController  {
    private  Dao dao = new Dao();
    private Menu menu = new Menu();


    public LoginController() throws SQLException {
        ViewController vc = new ViewController();
        try {
            String sql = "SELECT * FROM Users where Name='" + vc.userLogin() + "'and Password='" + vc.userPassword() + "'";
            ResultSet resultSet = dao.connect().executeQuery(sql);
            if (!resultSet.next()) {
                vc.wrongLoginData();
            } else {
                vc.userLogged();
                ResultSet resultSQL = getResult(sql);
                int accType = getAccountType(resultSQL);
                vc.write("" + accType);
                menu.adminMenu();
            }
        } catch (SQLException sql) {
            vc.error();
        } finally {
            dao.closeConnection();
        }
    }

    public int getAccountType(ResultSet resultSet) throws SQLException {
        int intType = 0;
        while (resultSet.next()) {
            String type = resultSet.getString("ID_Type");
            intType = Integer.parseInt(type);
        }
        return intType;
    }

    public ResultSet getResult (String sql) throws SQLException {
        return dao.connect().executeQuery(sql);
    }
}
