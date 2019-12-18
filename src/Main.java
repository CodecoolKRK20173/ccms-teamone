import Controller.MainController;
import DataBase.Dao;
import java.sql.SQLException;

public class Main {
  public  static void main(String[] args) throws SQLException {
      Dao dao = new Dao();
      MainController mainController = new MainController();
      dao.connect();
      mainController.run();
      dao.closeConnection();
  }
}
