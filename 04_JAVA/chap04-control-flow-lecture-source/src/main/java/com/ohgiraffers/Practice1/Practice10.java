package com.ohgiraffers.Practice1;

import java.util.Scanner;

public class Practice10 {

    public void test10() {

        Scanner sc = new Scanner(System.in);

        System.out.println("나이가 어떻게 되세요?");

        int age = sc.nextInt();

        if(age>=20){
            System.out.println("판매 가능합니다");
        } else {
            System.out.println("음료코너에서 골라주세요.");
        }
    }
}
