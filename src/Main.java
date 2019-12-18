import Controller.MainController;
import DataBase.Dao;

import java.sql.SQLException;

public class Main {
  public  static void main(String[] args) throws SQLException {
//        SQLJDBC sqljdbc = new SQLJDBC();
//        System.out.println("Test");
//        sqljdbc.connect();
//        sqljdbc.closeConnection();
      MainController mainController = new MainController();
      mainController.run();
  }
}
