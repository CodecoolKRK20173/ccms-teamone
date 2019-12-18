package View;

import java.util.Scanner;

public class Menu {

    public Scanner input() {
        return new Scanner(System.in);
    }

    public String adminMenu() {
        System.out.println("(1) Add new mentor");
        System.out.println("(2) List all mentors");
        System.out.println("(3) Remove mentor");
        System.out.println("(4) Edit mentor data");
        System.out.println("(5) List all students");
        String choice = input().nextLine();
        return choice;
    }
}
