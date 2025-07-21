package com.ohgiraffers.Practice2;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요:");

        int num = sc.nextInt();

        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("1부터"+num+"까지의 합은"+sum+"입니다");

        //가우스 공식

        System.out.println("정수를 입력하세요");
        int num2 = sc.nextInt();

        int result = (num2*(num2+1))/2;

        System.out.println("1부터"+num2+"까지의 합은"+result+"입니다");






    }
}