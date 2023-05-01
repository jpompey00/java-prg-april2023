package org.proto.rpg.characterTemplate;

public class Freelancer01 extends Template00 {
    /*
    Variables
    Default Constructor
    Constructor With Inputted Name and Base Stat Distribution based on random roll?
    To String to Print out Character Sheet
    Getters and setters
    Starting Points
    5 all around
    give 4 free points?

    Map of Skills
     */

    private int classId = 01;
    private String characterName = "Test";
    private String className = "Freelancer";

    private int startingStr = 5;
    private int startingDex = 5;
    private int startingInt = 5;
    private int startingCun = 5;
    private int startingLuk = 5;



    public Freelancer01(){

    }
    public Freelancer01(String name, int strength, int dexterity, int intelligence, int cunning, int luck){
        //TODO set the starting values during the constructor call
        super( strength,  dexterity,  intelligence,  cunning,  luck);
        characterName = name;
    }



    @Override
    public String toString(){
        return "Name = " + characterName + "\n" +
                "Class = " + className + "\n" +
                super.toString();
    }



}
