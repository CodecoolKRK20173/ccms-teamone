package Controller;

import DataBase.SQLJDBC;

import java.sql.SQLException;

public class MainController {

    public void run() throws SQLException {
        View_controller view_controller = new View_controller();
        view_controller.print("działa");
        SQLJDBC sqljdbc = new SQLJDBC();

    }
}
