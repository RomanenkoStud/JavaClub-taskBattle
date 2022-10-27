package org.example.enemies;

import org.example.heroes.Hero;

import java.util.Random;

public class Zombie extends Enemy {


    public Zombie(int health) {
        super(health);
    }

    @Override
    public boolean isAlive() {
        if (getHealth() > 0)
            return true;
        else {
            Random random = new Random();
            if(random.nextBoolean()) {
                setHealth(100);
                System.out.println("Zombie[" + getHealth() + "hp] resurrected.");
                return true;
            }
            return false;
        }
    }

    public void hitBack(Hero hero) {
        System.out.println("Zombie[" + getHealth() + "hp] hit back!");
        hero.takeDamage(75);
    }

}
