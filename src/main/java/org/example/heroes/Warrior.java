package org.example.heroes;

import org.example.enemies.Enemy;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name, 300);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println("Warrior[" + getHealth() + "hp] attacks the enemy!");
        enemy.takeDamage(100);
        enemy.hitBack(this);
    }

}
