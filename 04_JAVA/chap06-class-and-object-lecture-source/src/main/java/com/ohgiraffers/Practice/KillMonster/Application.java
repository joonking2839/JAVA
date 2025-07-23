package com.ohgiraffers.Practice.KillMonster;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*딜러,탱커,힐러 중 한명의 캐릭터를 선택하여 공격,방어,힐을 적절히 사용하여 몬스터를 쓰러뜨리는게임*/

        System.out.println("직업을 선택해주세요 (딜러 / 탱커 / 힐러):");
        System.out.println("딜러: 공격 크리티컬 확률이 올라갑니다");
        System.out.println("탱커: 완전 방어 확률이 올라갑니다");
        System.out.println("힐러: 일정 확률의 힐량이 늘어납니다");
        String job = sc.nextLine();
        Fighter fighter = new Fighter(job);
        System.out.println("당신이 선택한 직업은"+" "+job+"입니다.");

        while (true) {

            System.out.println("\n======== 게임 메뉴 ========");
            System.out.println("2. 공격");
            System.out.println("3. 방어");
            System.out.println("4. 힐");
            System.out.println("9. 도망가기");
            System.out.print("메뉴 선택: ");
            int no = sc.nextInt();

            switch (no) {
                case 2: fighter.attack();
                        fighter.monsterAttack(); break;
                case 3: fighter.defend();break;
                case 4: fighter.heal();
                    fighter.monsterAttack();break;
                case 9:
                    System.out.println("도망쳤습니다! 게임 종료.");
                    return;
                default:
                    System.out.println("잘못된 번호입니다. 다시 선택해주세요.");
            }

            if (fighter.isMonsterDead()) {
                System.out.println("몬스터를 처치했습니다!!");
                break;
            }
            if (fighter.isPlayerDead()) {
                System.out.println("플레이어가 쓰러졌습니다 ㅠㅠ");
                break;
            }
        }
    }
}
