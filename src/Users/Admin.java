package Users;

import Controller.ViewController;
import DataBase.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Admin {
    private Dao dao = new Dao();
    private ViewController vc = new ViewController();

    private Statement stmt() throws SQLException {
        return dao.connect();
    }

    public ResultSet getResult (String sql) throws SQLException {
        return dao.connect().executeQuery(sql);
    }

    public String mentorAdd() {
        System.out.print("\nEnter mentor name: ");
        String name = vc.input().nextLine();
        System.out.print("Enter mentor password: ");
        String password = vc.input().nextLine();
        System.out.print("Enter mentor e-mail address: ");
        String email = vc.input().nextLine();
        System.out.print("Enter mentor phone number: ");
        String number = vc.input().nextLine();
        System.out.print("Enter mentor's local address: ");
        String address = vc.input().nextLine();
        try {
            String mentor = "INSERT INTO Users ('ID_Type', 'Name', 'Password', 'email', 'Phone_number', 'Address') VALUES (3, '" + name + "'" + password + "'" + email + "'" + number + "'" + address + "');";
            if (getResult(mentor).next()) {
                vc.add();
            } else {
                vc.write("test");
            }
        } catch (SQLException mentor) {
            vc.error();
        }
        return null;
    }

    public ArrayList<String> mentorsList() throws SQLException {
        ArrayList<String> mentor = new ArrayList<>();
        ResultSet rs = stmt().executeQuery("SELECT Name, Phone_number From Users WHERE ID_Type = 3;");
        while (rs.next()) {
//            return rs.getString("Name");
            mentor.add(rs.getString("Name"));
            mentor.add(rs.getString("Phone_number"));
        }
        return mentor;
    }

    public String mentorRemove() {
        System.out.print("\nEnter phone number: ");
        int number = vc.input().nextInt();
        try {
            stmt().executeUpdate("DELETE FROM Users WHERE Phone_number = " + number + ";");
        } catch (SQLException e) {
            System.out.println(e.getMessage().concat("Not Correct"));
        }
        return "Correct";
    }

    public ArrayList<String> studentsList() throws SQLException {
        ArrayList<String> student = new ArrayList<>();
        ResultSet rs = stmt().executeQuery("SELECT Name, Phone_number From Users WHERE ID_Type = 4;");
        while (rs.next()) {
            student.add(rs.getString("Name"));
            student.add(rs.getString("Phone_number"));
        }
        return student;
    }
}
