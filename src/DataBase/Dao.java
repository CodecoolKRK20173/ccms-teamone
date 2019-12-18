package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
    public Connection connect() {
        Connection cnn = null;
        try {
            String username = "079yZXjtkg";
            String passwordBase = "e4wKGw62Tl";
            String url = "jdbc:mysql://remotemysql.com:3306/079yZXjtkg";
            cnn = DriverManager.getConnection(url, username, passwordBase);
            System.out.println("Connection to base has been established.");

//            return cnn;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cnn;
    }

    public void closeConnection(){
        try {
            connect().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
