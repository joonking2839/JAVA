package com.ohgiraffers.Practice;

public class Hero extends Fighter implements Skill {
    public Hero(String name) {
        super(name);
    }

    @Override
    public void useSkill(Monster monster) {
        System.out.println(name + "의 필살기!");
        monster.takeDamage(50);
    }
}
