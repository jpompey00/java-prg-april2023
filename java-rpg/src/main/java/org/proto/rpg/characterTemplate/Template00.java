package org.proto.rpg.characterTemplate;

public class Template00 {
    //NOTE will have all the commands that are used by all the classes such as subtracting health, adding exp, leveling, etc
    private String name;
    private int level;
    private double experience; //TODO need a function for how much needed to level up from this point
    private double healthPoints = 20; //TODO tweak the starting numbers for health and mana
    private double manaPoints = 20;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int cunning;
    private int luck;

    public Template00(){

    }
    public Template00( int strength, int dexterity, int intelligence, int cunning, int luck){

        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.cunning = cunning;
        this.luck = luck;
        this.level = 1;
        this.experience = 0;
        this.healthPoints = calculateStartingHealth(strength,dexterity,intelligence,cunning,luck);
        this.manaPoints = calculateStartingMana(strength,dexterity,intelligence,cunning,luck);
    }

    private double calculateStartingHealth(int strength, int dexterity, int intelligence, int cunning, int luck){
        /*
        Every Point in Strength past 5
            -Add 2pt to health per strPoint for 6-8
                -(Add 2pt to health per str Point for 1-3)
            -Add 1 pt in health per strPoint 9+
                -(Add 1pt to health per strPoint for 4+)
        Every Point in Dex past 5
            -Add .5pt to health per dexPoint for 6-8
            -Add .25 pt to health per dexPoint for 9+
        Every Point in Int past 5
            -Subtract .5pt to health per intPoint for 6-8
            -Subtract .25 pt to health per intPoint for 9+
        Every Point in Cunning past 5
            -Subtract .25 to health per cunPoint
        Every Point in Luck past 5
            -Add 1pt in health per luckPoint for 6-8
            -Add .5 in health per lucPoint from 9+
         */
        double preCalcHealth = healthPoints;
        if(strength > 5){
            for(int i = 0; i < strength - 5; i++){
                if(i <4){
                    preCalcHealth+=2;
                } else {
                    preCalcHealth+=1;
                }
            }
        }
        if(dexterity > 5){
            for(int i = 0; i < dexterity - 5; i++){
                if(i <4){
                    preCalcHealth+=.5;
                } else {
                    preCalcHealth+=.25;
                }
            }
        }
        if(intelligence > 5){ //Ex Str is 10
            for(int i = 0; i < intelligence - 5; i++){
                if(i <4){
                    preCalcHealth-=.5;
                } else {
                    preCalcHealth-=.25;
                }
            }
        }

        if(cunning > 5){ //Ex Str is 10
            for(int i = 0; i < cunning - 5; i++){
                preCalcHealth -=.25;
            }
        }

        if(luck > 5){
            for(int i = 0; i < luck - 5; i++){
                if(i < 4){
                    preCalcHealth +=1;
                }
                else {
                    preCalcHealth +=.5;
                }
            }
        }

        return preCalcHealth;
    }

    private double calculateStartingMana(int strength, int dexterity, int intelligence, int cunning, int luck){
        /*
        Every Point in Strength past 5
            -Subtract 1pt to Mana per strPoint for 6-8
            -Subtract .5 pt in health per strPoint 9+
        Every Point in Dex past 5
            -Subtract .25pt to health per dexPoint for 6-9
        Every Point in Int past 5
            -Add 2pt to health per intPoint for 6-8
            -Add  1pt to health per intPoint for 9+
        Every Point in Cunning past 5
            -Add 1.5pt to mana per Cunning for 6-7
            -Add 1pt to mana per Cunning for 8-9+
        Every Point in Luck past 5
            -Add .5pt in health per luckPoint for 6-9+
         */


        double preCalcMana = manaPoints;
        if(strength > 5){
            for(int i = 0; i < strength - 5; i++){
                if(i <4){
                   preCalcMana -=1;
                } else {
                    preCalcMana-=.5;
                }
            }
        }
        if(dexterity > 5){
            for(int i = 0; i < dexterity - 5; i++){
                preCalcMana -=.25;
            }
        }
        if(intelligence > 5){ //Ex Str is 10
            for(int i = 0; i < intelligence - 5; i++){
                if(i <4){
                    preCalcMana+= 2;
                } else {
                    preCalcMana += 1;
                }
            }
        }

        if(cunning > 5){ //Ex Str is 10
            for(int i = 0; i < cunning - 5; i++){
                if(i < 3){
                    preCalcMana += 1.5;
                } else {
                    preCalcMana +=1;
                }
            }
        }

        if(luck > 5){
            for(int i = 0; i < luck - 5; i++){
               preCalcMana += .5;
            }
        }
        return preCalcMana;
    }

    public double subtractHealth(int damage){
        setHealthPoints(getHealthPoints() - damage);
        return getHealthPoints();
    }

    //level experience health mana str dex int cunning luck
    public String toString(){
        String result = "Level = " + level + "\n" +
                "Experience " + experience + "\n" +
                "Health  = " + healthPoints + "\n"+
                "Mana = " + manaPoints + "\n"+
                "Strength = " + strength +"\n" +
                "Dexterity = " + dexterity +"\n" +
                "Intelligence = " + intelligence + "\n" +
                "Cunning = " + cunning + "\n"+
                "Luck = " + luck + "\n";

        return result;
    }



    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public double getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(double manaPoints) {
        this.manaPoints = manaPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

}
