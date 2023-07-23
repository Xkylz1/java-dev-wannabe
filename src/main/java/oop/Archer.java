package oop;

public class Archer extends RPGCharacter{
    private  int arrows;
    public Archer(String name, int level, int helathPoints, int attackPoints, int arrows){
        super(name,level, helathPoints, attackPoints);
        this.arrows=arrows;
    }

    public int getArrows() {
        return arrows;
    }
    public void setArrows(int arrows){
        this.arrows=arrows;
    }

    public void shootArrow(RPGCharacter target){
        if (getArrows()>0){
            setArrows(getArrows()-1);
            target.setHealthPoints(target.getHealthPoints()-this.getAttackPoints());
        }else {
            System.out.println("no arrow left");
        }

    }

    @Override
    public void attack(RPGCharacter target) {
        shootArrow(target);
    }
}
