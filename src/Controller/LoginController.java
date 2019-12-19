package Controller;

import DataBase.Dao;
import View.Menu;


import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class LoginController  {


    public LoginController() throws SQLException {
       Dao dao = new Dao();
        ViewController view = new ViewController();


        try {
            view.labelUserLogin();
            String UName = view.input().nextLine();
            view.labelUserLogin();
            String password = view.input().nextLine();

            String sql = "SELECT * FROM Users where Name='"+UName+"'and Password='"+password+"'";
            ResultSet resultSet = dao.connect().executeQuery(sql);



            if(!resultSet.next()) {
                view.labelWrongLogin();

            }
            else {
                view.labelUserLogged();
                String sqlAccType = "SELECT * FROM Users where Name='"+UName+"'and Password='"+password+"'";
                ResultSet acresultset = getResult(sqlAccType);
                int accType = getAccountType(acresultset);
                view.write(""+accType);
            }



        } catch (SQLException sql) {
          //  view.write("sql exception");
        } finally {
            dao.closeConnection();
        }


    }


    public int getAccountType(ResultSet resultSet) throws SQLException {


        int intType = 0;
        while (resultSet.next()) {

            String type = resultSet.getString("ID_Type");

            intType = Integer.parseInt(type);


        }
        return  intType;
    }


    public ResultSet getResult (String sql) throws SQLException {
        Dao dao = new Dao();
        ResultSet resultSet = dao.connect().executeQuery(sql);
        return resultSet;
    }
}
