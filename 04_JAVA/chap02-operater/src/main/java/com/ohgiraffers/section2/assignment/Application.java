package com.ohgiraffers.section02.assignment;

public class Application {

    public static void main(String[] args) {

        /* comment. 대입연산자와 산술 복합 대입연산자를 이해하고 활용할 수 있다. */
        /* =, +=, -=, *=, /=, %= */

        int num = 12;

        num = num + 3;  // 대입연산자의 오른쪽에는 값, 왼쪽에는 공간의 의미이다.

        num += 3;

        num -= 5;   // num = num - 5

        num *= 2;

        num /= 2;

        /* 주의사항 : 산술 복합 대입 연산자의 작성 순서에 주의해야한다. */
        num =- 5;
        System.out.println("num = " + num);

    }
}