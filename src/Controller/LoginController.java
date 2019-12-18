package Controller;

import DataBase.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginController  {


    public LoginController() throws SQLException {
       Dao dao = new Dao();

        Statement statement = dao.connect().createStatement();
         ResultSet resultSet = statement.executeQuery("SELECT * from  Users");

        System.out.println("loginController");



    }
}
