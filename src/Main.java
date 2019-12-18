import Controller.MainController;
import DataBase.SQLJDBC;

public class Main {
  public  static void main(String[] args) {
//        SQLJDBC sqljdbc = new SQLJDBC();
//        System.out.println("Test");
//        sqljdbc.connect();
//        sqljdbc.closeConnection();
      MainController mainController = new MainController();
      mainController.run();
  }
}
