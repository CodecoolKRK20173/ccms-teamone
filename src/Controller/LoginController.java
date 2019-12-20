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
            String sql = "SELECT * FROM Users WHERE Name='" + vc.userLogin() + "'AND Password='" + vc.userPassword() + "';";
            if (!getResult(sql).next()) {
                vc.wrongLoginData();
            } else {
                vc.userLogged();

              chooseMenu(sql);



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

    public void chooseMenu(String sql) throws SQLException {
        switch (getAccountType(getResult(sql))) {
            case 0 -> {
                System.exit(0);
            }
            case 1 -> {

                menu.adminMenu();
            }
            case 2 -> {

                menu.employeeMenu();
            }
            case 3 -> {

                menu.mentorMenu();
            }
            case 4 -> {
                menu.studentMenu();
            }

            default -> { ;
            }


        }
        chooseMenu(sql);
    }
}
