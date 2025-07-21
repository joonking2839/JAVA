package com.ohgiraffers.Practice1;

import java.util.Scanner;

public class Practice11 {

    public void test11(){

        Scanner sc = new Scanner(System.in);

        System.out.println("당첨 번호가 어떻게 되세요?");

        int num = sc.nextInt();

        if (num>=1 && num<=10){
            if (num%2 !=0 ){
                System.out.println("홀수네요.인형 선물입니다!");
            }else {
                System.out.println("짝수네요.모자 선물입니다");
            }
        }else {
            System.out.println("당첨 번호는 1부터 10사이에만 있습니다");
        }
    }
}
