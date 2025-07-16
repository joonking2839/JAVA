package com.ohgiraffers.section01.literal;

public class Application03 {

    public static void main(String[] args) {

        /* comment. 문자열 합치기 결과를 예측하고 사용할 수 있다. */
        /* 1. 두 개의 문자열 합치기 */
        System.out.println(9 + 9);
        System.out.println("9" + 9);
        System.out.println(9 + "9");
        System.out.println("9" + "9");

        /* 2. 세 개의 문자열 합치기 */
        System.out.println(9 + 9 + "9");    // '+' 연산 방향은 왼쪽에서 오른쪽이다.
        System.out.println(9 + "9" + 9);
        System.out.println("9" + 9 + 9);
        System.out.println("9" + (9 + 9));

        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("====== 결과를 보기 좋게 출력 ======");
        System.out.println("10과 20의 합 : " + (10 + 20));
    }
}