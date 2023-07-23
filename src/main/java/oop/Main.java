package oop;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        RPGCharacter warrior = new RPGCharacter("Warrior", 1, 100, 20);
        System.out.println("Initial Health Points: " + warrior.getHealthPoints()); // Output: Initial Health Points: 100

        warrior.attack(warrior); // Reduce health points
        System.out.println("After Attack Health Points: " + warrior.getHealthPoints()); // Output: After Attack Health Points: 80

        warrior.heal(50); // Heal back to maximum limit
        System.out.println("After Healing Health Points: " + warrior.getHealthPoints()); // Output: After Healing Health Points: 100
    }


}
