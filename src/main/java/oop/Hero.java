package oop;

public class Hero extends RPGCharacter{
    private String specialAbility;
    public Hero(String name, int lvl, int hp, int ap,String specialAbility) {
        super(name, lvl, hp, ap);
        this.specialAbility=specialAbility;

    }
    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }
}
