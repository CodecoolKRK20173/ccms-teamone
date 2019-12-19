package Controller;

import java.util.Scanner;

public class ViewController {

    public Scanner input() {
        return new Scanner(System.in);
    }

    public void labelUserLogin(){
        System.out.println("Enter Username");
    }
    public void labelUserPassword(){
        System.out.println("Enter Password");
    }

    public void labelWrongLogin(){
        System.out.println("Wrrong Username or password");
    }
    public void labelUserLogged(){
        System.out.println("YOU ARE LOGGED");
    }

    public void write(String string){
        System.out.println(string);
    }
}
