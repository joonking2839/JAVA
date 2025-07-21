package com.ohgiraffers.Practice1;

import java.util.Scanner;

public class Practice7 {

    public void test7() {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("양수다.");
        } else {
            System.out.println("양수가 아니다.");
        }
    }
}
