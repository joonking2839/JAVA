package com.ohgiraffers.section02.string;

public class Application2 {

    public static void main(String[] args) {

        /* comment. 문자열 객체를 만드는 다양한 방법을 숙지하고 인스턴스가 생성되는 방식을 이해할 수 있다. */
        /* 문자열 객체를 만드는 방법
         *  " " 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다. (singleton)
         *  new String("문자열") : 매번 새로운 인스턴스를 생성한다.
         * */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);

        str2 += "oracle";

        System.out.println(str1 == str2);
    }
}