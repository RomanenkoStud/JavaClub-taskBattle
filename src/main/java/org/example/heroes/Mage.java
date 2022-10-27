package org.example.heroes;

import org.example.enemies.Enemy;

public class Mage extends Hero {

    public Mage(String name) {
        super(name, 200);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println("Mage[" + getHealth() + "hp] attacks the enemy!");
        enemy.takeDamage(200);
        enemy.hitBack(this);
    }

}
