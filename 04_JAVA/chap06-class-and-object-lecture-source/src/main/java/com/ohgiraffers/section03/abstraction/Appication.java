package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class Appication {

    public static void main(String[] args) {
        CarRacer racer = new CarRacer();

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("========카레이싱 프로그램=======");
            System.out.println("1.시동걸기");
            System.out.println("2.전진");
            System.out.println("3.정지");
            System.out.println("4.시동끄기");
            System.out.println("9.프로그램 종료");
            System.out.println("메뉴선택:");
            int no=sc.nextInt();

            switch (no){
                case 1:racer.startUp(); break;
                case 2:racer.stepAccelator(); break;
                case 3:racer.stepBreak(); break;
                case 4:racer.turnOff(); break;
                case 9:
                    System.out.println("프로그램을 종료합니다."); break;
                default:
                    System.out.println("잘못된 번호를 선택했씁니다.");break;

            }


        }
    }
}
