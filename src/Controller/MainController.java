package Controller;

import java.sql.SQLException;

public class MainController {
    public void run() throws SQLException {
      ViewController viewController = new ViewController();
      viewController.write("work");
      LoginController loginController = new LoginController();
    }
}
