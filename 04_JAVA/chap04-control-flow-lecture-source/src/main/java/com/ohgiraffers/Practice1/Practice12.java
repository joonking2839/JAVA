package com.ohgiraffers.Practice1;

import java.util.Scanner;

public class Practice12 {

    public void test12(){

        Scanner sc =new Scanner(System.in);

        System.out.println("성실 점수");

        int sincerity = sc.nextInt();

        System.out.println("서비스 점수");

        int service = sc.nextInt();

        System.out.println("미소 점수");

        int smile =sc.nextInt();

        if (((sincerity+service+smile)/3)>=60 && sincerity>=40 && service>=40 && smile>=40 ){
            System.out.println("합격입니다!");
        }else {
            if ((sincerity+service+smile)/3<60){
                System.out.println("평균 점수 미달로 불합격입니다");
            }
            if (sincerity<40){
                System.out.println("성실 점수 미달로 불합격");
            }
            if (service<40){
                System.out.println("서비스 점수 미달로 불합격");
            }
            if (smile<40){
                System.out.println("웃음 점수 미달로 불합격");
            }
        }


    }
}
