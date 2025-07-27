package com.ohgiraffers.Practice;

public abstract class Fighter  {
    public static int hp = 100;
    public String name;
    public boolean isDefending = false;

    public Fighter(String name) {
        this.name = name;
    }

    public void attack(Monster monster) {
        System.out.println(name + "의 일반 공격!");
        monster.takeDamage(20);
    }

    public void defend(int damage) {
        isDefending = true;
        System.out.println(name + "이(가) 방어 태세에 들어갔습니다!");
    }

    public void heal() {
        hp += 15;
        if (hp > 100) hp = 100;
        System.out.println(name + "이(가) 회복! (HP: " + hp + ")");
    }

    public boolean isDead() {
        return hp <= 0;
    }

    public void showStatus() {
        System.out.println(name + " HP: " + hp);
    }

    public abstract void useSkill(Monster monster);
}
