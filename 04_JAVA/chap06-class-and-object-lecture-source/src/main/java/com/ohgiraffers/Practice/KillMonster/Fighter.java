package com.ohgiraffers.Practice.KillMonster;

import java.util.Scanner;

public class Fighter {
    private Player player;

    public Fighter(String job) {
        this.player = new Player(job);
    }

    public void attack() {
        player.attack();
    }

    public void defend() {
        player.defend();
    }

    public void heal() {
        player.heal();
    }

    public void monsterAttack() {
        if (player.isMonsterDead()) return;

        int damage = (int)(Math.random() * 10) + 10;
        player.monsterDamege(damage);
    }


    public boolean isPlayerDead() {
        return player.isDead();
    }

    public boolean isMonsterDead() {
        return player.isMonsterDead();
    }
}
