package com.ohgiraffers.Practice2;

import java.util.Scanner;

public class Practice5 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("문자열을 입력하세요:");
        String text=sc.nextLine();

        for (int i=0; i<text.length();i++){
            System.out.println(i+":"+text.charAt(i));
        }
    }
}
