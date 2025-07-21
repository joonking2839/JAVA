package com.ohgiraffers.Practice2;

import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요:");

        int num = sc.nextInt();

        int sum = 0;

        for (int i = 0; i <= num; i+=2) {
            sum += i;
        }
        System.out.println("1부터"+num+"까지의 짝수의 합은"+sum+"입니다");

        //가우스 공식

        System.out.print("정수를 입력하세요: ");
        int num2 = sc.nextInt();

        // 첫 짝수는 2
        int first = 2;

        // 마지막 짝수
        int last = (num2 % 2 == 0) ? num2 : num2 - 1;

        // 항의 개수
        int n = ((last - first) / 2) + 1;

        // 가우스 공식
        int sum2 = n * (first + last) / 2;

        System.out.println("1부터 " + num2 + "까지의 짝수의 합은 " + sum2 + "입니다");






    }
}