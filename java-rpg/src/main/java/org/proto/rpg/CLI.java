package org.proto.rpg;
import java.util.Scanner;

import org.proto.rpg.characterTemplate.Freelancer01;
import org.proto.rpg.mainGameScript.*;

public class CLI {

    Scanner input = new Scanner(System.in);
    public CLI(){

    }


    public void welcomeMessage(){
        //is brought here from the new game section of the title screen
    }
    public int mainMenu(){
        int response = -1;
        System.out.println("Welcome to the world of xxy");
        System.out.println("1. Start a new game");
        System.out.println("2. Load Game");
        System.out.println("3. Options");
        System.out.println("4. Quit Game");
        response = input.nextInt();

        //TODO catches
        return response;
    }

    public int createCharacterCLI(){
        int response = -1;
        System.out.println("Please Choose a class");
        System.out.println("***********************");
        System.out.println("1. Freelancer");

        response = input.nextInt(); //catch for an error

        switch (response){
            case 1: {
                //distributeStartingPoints();
                return 01;
            }
            case 2: {
                break;
            }
        }
        return 0;

    }

    //TODO change this
    public void startingPointsPrompt(){
        System.out.println("Enter a digit to invest 1 point");
        System.out.println("********************************************");
    }

    public int promptForMenuSelection(String prompt) {
        int menuSelection;
        System.out.print(prompt);
        menuSelection = input.nextInt();
        return menuSelection;
    }
    public String promptForString(String prompt) {
        String response;
        System.out.print(prompt);
        response = input.next();

        return response;
    }

}
