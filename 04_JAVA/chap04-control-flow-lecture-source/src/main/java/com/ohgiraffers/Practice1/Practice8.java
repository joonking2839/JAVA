package com.ohgiraffers.Practice1;

import java.util.Scanner;

public class Practice8 {

    public void test8() {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력하세요:");

        int num = sc.nextInt();

        if (num%2==0){
            System.out.println("짝수입니다");
        } else {
            System.out.println("홀수입니다.");
        }


    }
}
