package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_doWhile {

    public void testSimpleDoWhileStatement() {

        /* comment. do-while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        do {
            System.out.println("최초 한번 동작함...");
        } while (false);

        System.out.println("반복문 종료 확인...");
    }

    public void testDoWhileExample() {

        /* 키보드로 문자열 입력 받아 반복적으로 출력
         *  단, exit가 입력되면 반복문을 종료한다.
         * */

        Scanner sc = new Scanner(System.in);
        String str = "";
        do {
            System.out.print("문자열을 입력하세요 : ");
            str = sc.nextLine();
            System.out.println(str);
            // 문자열은 == 비교가 불가능하기에 equals()를 이용한다.
        } while (!str.equals("exit"));

        System.out.println("프로그램을 종료합니다.");
    }
}