package Controller;

import java.util.Scanner;

public class ViewController {

    public Scanner input() {
        return new Scanner(System.in);
    }

    public void write(String text) {
        System.out.println(text);
    }

    public String userLogin() {
        System.out.print("Enter your login: ");
        return input().nextLine();
    }

    public String userPassword() {
        System.out.print("Enter your password: ");
        return input().nextLine();
    }

    public void wrongLoginData() {
        System.out.println("Wrong username or password!");
    }

    public void userLogged() {
        System.out.println("You are logged!");
    }

    public void error() {
        System.out.println("Error!");
    }

    public void add() {
        System.out.println("Added!");
    }
}
