package com.ohgiraffers.section01.section02.uses;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        //객체배열을 매개변수와 리턴값으로 사용할 수 있다.

        /*시스템 요구사항
        * 1.여러 명의 회원 정보를 받아 한 번에 회원정보를 등록
        * 2.전체 조회 시 여러 명의 회원 정보를 반환
        *
        * 제약사항
        * 1.MemberRepository에 static 필드로 회원 정보를 관리한다.
        * 2.회원 정보는 최대 10명까지 저장할 수 있다.
        * */

        Scanner sc=new Scanner(System.in);

        MemberService memberService = new MemberService();

        while (true) {
            System.out.println("===회원관리프로그램===");
            System.out.println("1.회원등록");
            System.out.println("2.회원 전체 조회");
            System.out.println("9.프로그램 종료");
            System.out.println("메뉴선택:");
            int no = sc.nextInt();

            switch (no) {
                case 1: memberService.signupMembers(); break;
                case 2: memberService.showAllMembers(); break;
                case 9:
                    System.out.println("프로그램을 종료합니다");
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        }
    }
}
