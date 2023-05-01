package org.proto.rpg.mainGameScript;
import org.proto.rpg.*;
import org.proto.rpg.characterTemplate.*;



public class MainGame {

    private Template00 playerCharacter;
    private CLI cli = new CLI();


    public MainGame(){

        System.out.println("Start Game");
    }

    public void run(){
        cli.welcomeMessage();
        mainMenu(cli.mainMenu());
    }



    public void mainMenu(int selection){
        switch (selection){
            case 1: {
                createCharacter(cli.createCharacterCLI());
            }
            case 2:{
                //TODO add log file reading for loading
            }
            case 3:{
                //TODO some options
            }
            case 4:{
                //TODO exit application
            }
        }
    }
    public void createCharacter(int classId){
        int [] stats;
        String name;
        int points = 5;
        switch (classId){
            case 01:{
                name = cli.promptForString("What's your name ");
                stats = baseStats(classId);
                while (points > 0) {
                    System.out.println("Points remaining " + points);
                    displayCurrentStats(stats);
                    stats = distributeToStat(cli.promptForMenuSelection("Select a stat to invest in \n"), stats);
                    points--;
                }

               playerCharacter = new Freelancer01(name, stats[0], stats[1], stats[2], stats[3], stats[4]);
                System.out.println(playerCharacter);
            }
            case 02:{
                break;
            }

        }

    }



    public int[] baseStats(int classId){
//        int startingStr;
//        int startingDex;
//        int startingInt;
//        int startingCun;
//        int startingLuk;
        //0    1   2   3  4
        //STR DEX INT CUN LUK
        switch (classId){
            case 01:{
                int flStats[] = {5,5,5,5,5};
                return flStats;
            }
            case 02: {
                break;
            }

        }
        return null;
    }

    public void displayCurrentStats(int[] stats){
        System.out.println("1. Strength: " + stats[0]);
        System.out.println("2. Dexterity: " + stats[1]);
        System.out.println("3. Intelligence: " + stats[2]);
        System.out.println("4. Cunning: " + stats[3]);
        System.out.println("5. Luck: " + stats[4]);
    }

    public int[] distributeToStat(int selection, int[] stats){
        switch(selection){
            case 1:
                stats[0] += 1;
                break;
            case 2:
                stats[1] += 1;
                break;
            case 3:
                stats[2] +=1;
                break;
            case 4:
                stats[3] += 1;
                break;
            case 5:
                stats[4] += 1;
                break;
        }
        return stats;
    }



}
