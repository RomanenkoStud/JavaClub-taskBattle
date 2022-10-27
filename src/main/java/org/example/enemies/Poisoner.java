package org.example.enemies;

import org.example.heroes.Hero;

import java.util.ArrayList;

public class Poisoner extends Enemy {

    ArrayList<Hero> victims;

    public Poisoner(int health) {
        super(health);
        victims = new ArrayList<Hero>();
    }

    public void hitBack(Hero hero) {
        victims.add(hero);
        for (Hero victim: victims)
            victim.takeDamage(50);
        System.out.println("Poisoner[" + getHealth() + "hp] hit back!");
    }

}
