package com.ohgiraffers.Practice1;

import java.util.Scanner;

public class Practice9 {

    public void test9() {

        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하세요");
        String name = sc.nextLine();

        System.out.println("월을 입력하세요");
        int month =sc.nextInt();

        System.out.println("일을 입력하세요");
        int day =sc.nextInt();

        String gift;


        if ((month>=1 && month<=6) && (day>=1 && day<=15) ) {
            gift="배민쿠폰";
        }else if ((month >= 7 && month <= 12) && (day >= 16 && day <= 31)){
             gift="스타벅스커피";
        }else {
            gift="사탕";
        }

        System.out.println(name+"의 선물은"+gift+"입니다.");
    }


}
