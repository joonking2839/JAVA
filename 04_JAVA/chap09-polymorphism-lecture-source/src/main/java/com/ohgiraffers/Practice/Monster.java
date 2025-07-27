package com.ohgiraffers.Practice;

public class Monster {
    private int hp = 100;

    public void attack(Fighter player) {
        if (player.isDefending) {
            System.out.println("방어 성공! 몬스터의 공격이 무효화됨!");
            player.isDefending = false; // 방어 해제
            return;
        }
        int damage = (int)(Math.random() * 11 + 10); // 10~20
        System.out.println("몬스터의 공격! 데미지: " + damage);
        Fighter.hp-=damage;
        System.out.println("현재 내 hp:"+hp);
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
        System.out.println("몬스터가 " + damage + " 데미지를 입었습니다! (남은 HP: " + hp + ")");
        Fighter.hp-=damage;
    }

    public boolean isDead() {
        return hp <= 0;
    }

    public void showStatus() {
        System.out.println("몬스터 HP: " + hp);
    }
}
