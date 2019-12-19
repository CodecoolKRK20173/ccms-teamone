package Controller;

import DataBase.Dao;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginController  {

    public LoginController() throws SQLException {
        Dao dao = new Dao();
        ViewController vc = new ViewController();
        try {
            String Username = "Testo";
            String UserPassword = "qwe";
            String sql = "SELECT * FROM Users where Name='" + Username + "'and Password='" + UserPassword + "'";
            ResultSet resultSet = dao.connect().executeQuery(sql);
            if(!resultSet.next()) {
                vc.write("Wrong username or password");

            } else {
                vc.write("You are logged");
            }
        } catch (SQLException sql) {
            vc.write("sql exception");
        } finally {
            dao.closeConnection();
        }
    }
}
