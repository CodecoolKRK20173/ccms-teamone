package Controller;

import DataBase.Dao;
import Users.Admin;
import View.Menu;

import java.sql.SQLException;

public class MenuController {
    private Menu menu = new Menu();
    private Admin admin = new Admin();
//    private LoginController lc = new LoginController();

    public void adminChoose(int number) throws SQLException {
        switch (number) {
            case 0 -> {
                System.exit(0);
            }
            case 1 -> {
                System.out.println("\n" + admin.mentorAdd());
                menu.adminMenu();
            }
            case 2 -> {
                System.out.println("\n" + admin.mentorsList());
                menu.adminMenu();
            }
            case 3 -> {
                System.out.println("\n" + admin.mentorRemove());
                menu.adminMenu();
            }
            case 4 -> {
                System.out.println("\nEdit mentor data");
            }
            case 5 -> {
                System.out.println("\n" + admin.studentsList());
                menu.adminMenu();
            }
            default -> {
                menu.adminMenu();
            }
        }
    }

    public void mentorChoice(int number) {
        switch (number) {
            case 0 -> {
                System.exit(0);
            }
            case 1 -> {
                String addStudent = "";
            }
            case 2 -> {
                String removeStudent = "";
            }
            case 3 -> {
                String editStudent = "";
            }
            case 4 -> {
                String listStudent = "";
            }
            case 5 -> {
                String assigmentAdd = "";
            }
            case 6 -> {
                String gradeAssigment = "";
            }
        }
    }

    public void studentChoice(int number) {
        switch (number) {
            case 0 -> {
                System.exit(0);
            }
            case 1 -> {
                String assigment = "";
            }
            case 2 -> {
                String grades = "";
            }
        }
    }

    public void employee(int number) {
        switch (number) {
            case 0 -> {
                System.exit(0);
            }
            case 1 -> {
                String studentsList = "";
            }
        }
    }
}
