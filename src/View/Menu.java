package View;

import Controller.ViewController;

public class Menu {
    private ViewController vc = new ViewController();

    public void adminMenu() {
        System.out.println("(0) Exit");
        System.out.println("(1) Add new mentor");
        System.out.println("(2) List all mentors");
        System.out.println("(3) Remove mentor");
        System.out.println("(4) Edit mentor data");
        System.out.println("(5) List all students");
        int choice = vc.input().nextInt();
        adminChoose(choice);
    }

    public void adminChoose(int number){
        switch (number) {
            case 0: {
                System.exit(0);
                break;
            }
            case 1: {
                System.out.println("jeden");
                break;
            }
            case 2: {
                System.out.println("dwa");
                break;
            }
            case 3: {
                System.out.println("jtrzy");
                break;
            }
            case 4: {
                System.out.println("cztery");
                break;
            }
            case 5: {
                System.out.println("piec");
                break;
            }

            default: {
                adminMenu();
                break;
            }
        }

    }

}
