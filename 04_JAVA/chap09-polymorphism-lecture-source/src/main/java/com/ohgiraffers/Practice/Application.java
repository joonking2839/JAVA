package com.ohgiraffers.Practice;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("플레이어 이름 입력: ");
        String name = sc.nextLine();

        Fighter hero = new Hero(name);
        Monster monster = new Monster();

        while (!hero.isDead() && !monster.isDead()) {
            hero.showStatus();
            monster.showStatus();

            System.out.println("1.공격  2.방어  3.회복  4.스킬");
            int action = sc.nextInt();

            switch (action) {
                case 1 -> hero.attack(monster);
                case 2 -> hero.defend(0);
                case 3 -> hero.heal();
                case 4 -> hero.useSkill(monster);
                default -> System.out.println("잘못된 입력입니다.");
            }

            if (!monster.isDead()) {
                monster.attack(hero);
            }
        }

        if (hero.isDead()) {
            System.out.println("게임 오버! 패배했습니다.");
        } else {
            System.out.println("승리! 몬스터를 쓰러뜨렸습니다.");
        }
    }
}
