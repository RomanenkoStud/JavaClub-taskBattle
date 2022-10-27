package org.example.heroes;

import org.example.enemies.Enemy;

public class Archer extends Hero {

    public Archer(String name) {
        super(name, 100);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer[" + getHealth() + "hp] attacks the enemy!");
        enemy.takeDamage(300);
        enemy.hitBack(this);
    }

}
