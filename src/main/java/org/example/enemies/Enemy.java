package org.example.enemies;

import org.example.types.Mortal;
import org.example.heroes.Hero;

public class Enemy implements Mortal {

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void hitBack(Hero hero) {
        System.out.println("Enemy[" + getHealth() + "hp] hit back!");
        hero.takeDamage(100);
    }

}
