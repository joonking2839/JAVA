package com.ohgiraffers.Practice.KillMonster;

public class Player {
    private final String job;
    private int hp = 100;
    private int monsterHp = 100;

    public Player(String job) {
        this.job = job;
    }

    public void attack() {
        int damage = 20;
        if (Math.random() < getAttackCrit()) {
            damage = 30;
            System.out.println("크리티컬 공격!");
        }
        monsterHp -= damage;
        System.out.println(job + "가 공격! 몬스터에게 " + damage + " 데미지를 입힘 (몬스터 HP: " + monsterHp + ")");
    }

    public void defend() {
        int damage = (Math.random() < getDefendCrit()) ? 0 : 5 ;
        if (damage == 0) {
            System.out.println("완전 방어 성공!");
        } else {
            hp -= damage;
            System.out.println("방어 실패! " + "약간의 데미지를 입었습니다. (내 HP: " + hp + ")");
        }
    }

    public void heal() {
        int heal = (Math.random() < getHealCrit()) ? 30: 10;
            hp += heal;
        if (hp>=100){
            System.out.println("hp한계 초과!! (현재 hp:"+hp+")");
            return;
        }
        if (hp>100){
            hp=100;
        }
        System.out.println(job + "가 " + heal + "만큼 회복! (현재 HP: " + hp + ")");
    }

    public void monsterDamege(int damage){
        hp-=damage;
        System.out.println("몬스터에게"+damage+"의 데미지를 받았습니다.(현재 HP:"+hp+")");
    }

    public boolean isDead() {
        return hp <= 0;
    }

    public boolean isMonsterDead() {
        return monsterHp <= 0;
    }

    // 크리티컬 확률 메서드
    private double getAttackCrit() {
        return switch (job) {
            case "딜러" -> 0.5;
            case "탱커" -> 0.2;
            case "힐러" -> 0.1;
            default -> 0.0;
        };
    }

    private double getDefendCrit() {
        return switch (job) {
            case "탱커" -> 0.5;
            default -> 0.1;
        };
    }

    private double getHealCrit() {
        return switch (job) {
            case "힐러" -> 0.5;
            default -> 0.1;
        };
    }
}
