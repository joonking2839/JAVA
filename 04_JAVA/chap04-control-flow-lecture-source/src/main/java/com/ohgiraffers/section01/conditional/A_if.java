package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    public void testSimpleIfStatement(){

        //comment if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.
        /*if문 표현식
        * [if문 표현식]
        * if(조건식){
        * 조건식이 true일 때 실행할 명령문;
        * }
        * 조건식:true or false 나오는 연산식을 조건식이라고 한다
        * if문은 조건식의 결거ㅏ 값이 참이면 {}안 코드 실행
        * 거짓이면 무시하고 넘어감*/

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 한개를 입력하세요:");

        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("입력하신 숫자는 짝수입니다.");
        }

        System.out.println("프로그램을 종료합니다.");
    }

    public void testNestedIfstatement(){
        //comment 중첩된 if문의 흐름을 이해하고 적용할 수 있다.
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 한개를 입력하세요:");

        int num = sc.nextInt();

        if(num>0){
            if(num % 2==0){
                System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
            }

        }

        System.out.println("프로그램을 종료합니다.");
    }
}
