package am.aca.Shop.controller;

import java.util.Scanner;

/**
 * Created by Armen on 9/4/2016.
 */
public class Controller {


    public void executor(){
        Scanner input = new Scanner(System.in);
        String comman;
        comman = input.nextLine();
        while(true){
            switch(comman){
                case "register":
                    register();
                    break;
                case "logIn":
                    logIn();
                    break;

            }
        }
    }

    public void register(){

    }
    public void logIn(){

    }
}
