package com.ohgiraffers.section04.comparison;

public class Application {

    public static void main(String[] args) {

        /* comment. 비교연산자에 대해 이해하고 활용할 수 있다. */
        /* 비교연산자는 피연산자 사이에서 상대적인 크기를 판단해서 참 혹은 거짓을 반환하는 연산자이다.
         *  연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건절에 많이 사용된다.
         * */

        /* 비교연산자의 종류
         *  '==', '!=' '>' '>=' '<' '<='
         * */

        /* 숫자값 비교 - 정수 비교 */
        int inum1 = 10;
        int inum2 = 20;

        System.out.println(inum1 == inum2);
        System.out.println(inum1 != inum2);
        System.out.println(inum1 > inum2);
        System.out.println(inum1 >= inum2);
        System.out.println(inum1 < inum2);
        System.out.println(inum1 <= inum2);

        /* 숫자값 비교 - 실수 비교 */
        double dnum1 = 10.0;
        double dnum2 = 20.0;

        System.out.println(dnum1 == dnum2);
        System.out.println(dnum1 != dnum2); // 대소 비교 생략 - 모두 가능

        /* 문자값 비교 */
        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println(ch1 == ch2);
        System.out.println(ch1 != ch2);
        System.out.println(ch1 > ch2);
        System.out.println(ch1 >= ch2);
        System.out.println(ch1 < ch2);
        System.out.println(ch1 <= ch2);

        /* 논리값 비교 */
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(bool1 == bool2);
        System.out.println(bool1 != bool2);
//        System.out.println(bool1 > bool2);    // 대소 비교 불가능
//        System.out.println(bool1 >= bool2);

        /* 문자열값 비교 */
        String str1 = "java";
        String str2 = "java";

        System.out.println(str1 == str2);
        System.out.println(str1 != str2);
//        System.out.println(str1 > str2);      // 대소 비교 불가능
    }
}