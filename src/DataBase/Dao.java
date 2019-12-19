package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
    private Connection cnn = null;

    public Statement connect() throws SQLException {
        try {
            String username = "079yZXjtkg";
            String passwordBase = "e4wKGw62Tl";
            String url = "jdbc:mysql://remotemysql.com:3306/079yZXjtkg";
            cnn = DriverManager.getConnection(url, username, passwordBase);
//            System.out.println("Connection to base has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (cnn == null) {
                assert false;
                cnn.close();
            }
        }
        return cnn.createStatement();
    }

    public void closeConnection() throws SQLException {
        cnn.close();
    }
}
