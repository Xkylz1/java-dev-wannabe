package oop;

public class Warrior extends RPGCharacter {
    private int defensePoints;

    public Warrior(String name, int lvl, int hp, int ap, int defensePoints) {
        super(name, lvl, hp, ap);
        this.defensePoints = defensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void defense() {
        if (getDefensePoints() < 200) {
            setDefensePoints(getDefensePoints() + 50);
        } else {
            setDefensePoints(200);
        }
    }
    public void takeDamage(int damage){
        int damageTaken=damage-(getDefensePoints()/100);
        setHealthPoints(getHealthPoints()-damageTaken);
    }
}
