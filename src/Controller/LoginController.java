package Controller;

import DataBase.Dao;
import View.Menu;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController  {

    public LoginController() throws SQLException {
        Dao dao = new Dao();
        ViewController vc = new ViewController();
        try {
            System.out.print("Enter your login: ");
            String username = vc.input().nextLine();
            System.out.print("Enter your password: ");
            String userPassword = vc.input().nextLine();
            String sql = "SELECT * FROM Users where Name='" + username + "'and Password='" + userPassword + "'";
            ResultSet resultSet = dao.connect().executeQuery(sql);
            if(!resultSet.next()) {
                System.out.println("Wrong username or password!");

            } else {
                System.out.println("You are logged!");
            }
        } catch (SQLException sql) {
            System.out.println("Error!");
        } finally {
            dao.closeConnection();
        }
    }
}
