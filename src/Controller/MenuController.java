package Controller;
import View.Menu;

public class MenuController {
    private Menu menu = new Menu();

    public void adminChoose(int number) {
        switch (number) {
            case 0 -> {
                System.exit(0);
            }
            case 1 -> {
                System.out.println("jeden");
            }
            case 2 -> {
                System.out.println("dwa");
            }
            case 3 -> {
                System.out.println("jtrzy");
            }
            case 4 -> {
                System.out.println("cztery");
            }
            case 5 -> {
                System.out.println("piec");
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
