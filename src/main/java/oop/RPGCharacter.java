package oop;

public class RPGCharacter {
    private String name;
    private int level;
    private int healthPoints;
    private int attackPoints;
    private final int MAX_HEALTH_POINTS=1000;

    public RPGCharacter(String name, int lvl, int hp, int ap) {
        this.name = name;
        this.level = lvl;
        this.healthPoints = hp;
        this.attackPoints = ap;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public int getAttackPoints() {
        return this.attackPoints;
    }

    //behavior
    public void attack(RPGCharacter target) {
        int damage = target.getHealthPoints() - this.getAttackPoints();
        if (damage <= 0) {
            System.out.println(target.getName() + " slained by " + this.getName());
            target.setHealthPoints(0);
        } else {
            target.setHealthPoints(target.getHealthPoints() - damage);
        }
    }

    public void heal(int healAmount) {
        if (this.getHealthPoints() + healAmount>MAX_HEALTH_POINTS){
            this.setHealthPoints(MAX_HEALTH_POINTS);
        }else {
            this.setHealthPoints(this.getHealthPoints() + healAmount);

        }

    }
}
