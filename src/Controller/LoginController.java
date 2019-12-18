package Controller;

import DataBase.Dao;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class LoginController  {


    public LoginController() throws SQLException {
       Dao dao = new Dao();
        ViewController v = new ViewController();


        try {
            String UName = "Testo";
            String password = "qwe";

            String sql = "SELECT * FROM Users where Name='"+UName+"'and Password='"+password+"'";
            ResultSet resultSet = dao.connect().executeQuery(sql);



            if(!resultSet.next()) {
                v.write("wrong username or password");

            }
            else {
                v.write("YOU ARE iN ");
            }



        } catch (SQLException sql) {
            ViewController viewController = new ViewController();
            v.write("sql exception");
        }finally{
            //closing ResultSet,PreparedStatement and Connection object


        }




        System.out.println("loginController");



    }
}
