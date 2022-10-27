package org.example;

import org.example.enemies.Enemy;
import org.example.heroes.Archer;
import org.example.heroes.Mage;
import org.example.heroes.Warrior;

public class TrainingGround {

    public static void main(String[] args) {
        Archer archer = new Archer("Kyle");
        Mage mage = new Mage("Gandalf");
        Warrior warrior = new Warrior("Dave");
        Enemy enemy = new Enemy(1000);
        archer.attackEnemy(enemy);
        mage.attackEnemy(enemy);
        warrior.attackEnemy(enemy);
    }

}
