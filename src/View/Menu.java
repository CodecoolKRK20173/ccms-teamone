package View;

import Controller.MenuController;
import Controller.ViewController;

import java.sql.SQLException;

public class Menu {
    private ViewController vc = new ViewController();

    public void adminMenu() throws SQLException {
        MenuController mc = new MenuController();
        System.out.println("\n(0) Exit");
        System.out.println("(1) Add new mentor");
        System.out.println("(2) List all mentors");
        System.out.println("(3) Remove mentor");
        System.out.println("(4) Edit mentor data");
        System.out.println("(5) List all students");
        int choice = vc.input().nextInt();
        mc.adminChoose(choice);
    }

    public void mentorMenu() {
        MenuController mc = new MenuController();
        System.out.println("\n(0) Exit");
        System.out.println("(1) Add a student to the class");
        System.out.println("(2) Remove student from a class");
        System.out.println("(3) Edit student data");
        System.out.println("(4) List of students");
        System.out.println("(5) Add assignment");
        System.out.println("(6) Grade an assignment");
        int choice = vc.input().nextInt();
    }

    public void studentMenu() {
        MenuController mc = new MenuController();
        System.out.println("\n(0) Exit");
        System.out.println("(1) Submit an assignment to mentor");
        System.out.println("(2) View my grades");
        int choice = vc.input().nextInt();
    }

    public void employeeMenu() {
        MenuController mc = new MenuController();
        System.out.println("\n(0) Exit");
        System.out.println("(1) See list of students");
        int choice = vc.input().nextInt();
    }
}
