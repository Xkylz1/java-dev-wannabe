package oop;

public class Mage extends RPGCharacter {
    private int manaPoints;
    final int MAX_MANA_POINTS = 500;

    public Mage(String name, int lvl, int hp, int ap, int manaPoints) {
        super(name, lvl, hp, ap);
        this.manaPoints = manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public int getManaPoints() {
        return this.manaPoints;
    }

    public void castSpell(RPGCharacter target) {
        if (this.manaPoints >= 100) {
            int magicDmg = this.getLevel() * 2;

            if (target.getHealthPoints() - magicDmg <= 0) {
                target.setHealthPoints(0);
                System.out.println(target.getName() + " is dead by magic spell");
            } else {
                target.setHealthPoints(target.getHealthPoints() - magicDmg);
            }
        } else {
            System.out.println(this.getName() + " out of mana");
        }
    }

    public void regenerateMana() {
        if (this.manaPoints + 50 > MAX_MANA_POINTS) {
            this.setManaPoints(MAX_MANA_POINTS);
        } else {
            this.setManaPoints(this.getManaPoints() + 50);
        }
    }
}
