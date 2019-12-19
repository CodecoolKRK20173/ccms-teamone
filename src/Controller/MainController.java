package Controller;

import DataBase.Dao;

import java.sql.SQLException;

public class MainController {
    public void run() throws SQLException {
        Dao dao = new Dao();
        new LoginController();
    }
}
