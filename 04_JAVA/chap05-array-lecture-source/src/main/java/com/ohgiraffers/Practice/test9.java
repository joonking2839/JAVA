package com.ohgiraffers.Practice;

import java.util.Scanner;

public class test9 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String[] sarr=new String[]{"딸기", "바나나", "복숭아", "키위", "사과"};

        System.out.println("0부터 4까지의 정수를 입력해주세요:");
        int num= sc.nextInt();

        if (num>=0 && num<=4){
            System.out.println(sarr[num]);
        }else {
            System.out.println("준비된 과일이 없습니다.");
        }


    }
}
