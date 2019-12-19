package Controller;
import View.Menu;


public class MenuController {
    private Menu menu = new Menu();

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
                menu.adminMenu();
                break;
            }
        }

    }


}
