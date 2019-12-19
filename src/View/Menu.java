package View;
import Controller.MenuController;

import Controller.ViewController;

public class Menu {
    private ViewController vc = new ViewController();
    private MenuController menuController = new MenuController()

    public void adminMenu() {
        System.out.println("(0) Exit");
        System.out.println("(1) Add new mentor");
        System.out.println("(2) List all mentors");
        System.out.println("(3) Remove mentor");
        System.out.println("(4) Edit mentor data");
        System.out.println("(5) List all students");
        int choice = vc.input().nextInt();
        menuController.adminChoose(choice);
    }



}
