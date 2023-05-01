package org.proto.rpg;
import org.proto.rpg.characterTemplate.*;
import org.proto.rpg.mainGameScript.MainGame;


//TODO make a save log file w/ a string of encrypted numbers and a newgame and load function. One save slot
public class Main {


    public static void main(String[] args) {
        MainGame mainGame = new MainGame();
        mainGame.run();



//
//        Freelancer01 TestCharacter = new Freelancer01("Proto",6,5,5,5,5);
//        System.out.println(TestCharacter);
//        TestCharacter.subtractHealth(1);
//        System.out.println(TestCharacter);
    }
}