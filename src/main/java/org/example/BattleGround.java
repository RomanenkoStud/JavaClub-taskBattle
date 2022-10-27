package org.example;

import org.example.enemies.Enemy;
import org.example.enemies.Zombie;
import org.example.heroes.Archer;
import org.example.heroes.Hero;
import org.example.heroes.Mage;
import org.example.enemies.Poisoner;
import org.example.heroes.Warrior;

public class BattleGround {

    private int heroesAlive, enemiesAlive;

    public BattleGround(int heroesAlive, int enemiesAlive) {
        this.heroesAlive = heroesAlive;
        this.enemiesAlive = enemiesAlive;
    }

    public void round(Enemy enemy, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.isAlive()) {
                hero.attackEnemy(enemy);
                if (!hero.isAlive()) {
                    heroesAlive--;
                    System.out.println("Hero has been defeated.");
                    break;
                }
            }
            if (!enemy.isAlive()) {
                enemiesAlive--;
                System.out.println("Enemy has been defeated.");
                break;
            }
        }
    }

    public void result() {
        if (enemiesAlive == heroesAlive)
            System.out.println("Draft.");
        else if (enemiesAlive > heroesAlive)
            System.out.println("Enemies won.");
        else
            System.out.println("Heroes won.");
    }

    public static void main(String[] args) {
        Hero[] heroes = { new Warrior("Dave"), new Mage("Gandalf"), new Archer("Kyle")};
        Enemy[] enemies = { new Enemy(100), new Zombie(200), new Poisoner(600)};
        BattleGround battleGround = new BattleGround(heroes.length, enemies.length);
        while (battleGround.heroesAlive > 0 && battleGround.enemiesAlive > 0) {
            for (Enemy enemy : enemies) {
                battleGround.round(enemy, heroes);
                if (battleGround.enemiesAlive == 0) {
                    break;
                }
            }
        }
        battleGround.result();
    }

}
