package com.ohgiraffers.section02.userexception;


public class Application1 {

    public static void main(String[] args) {

        /* comment. 사용자 정의의 예외클래스 정의 후 발생한 사용자 정의의 예외를 처리할 수 있다. */

        ExceptionTest et = new ExceptionTest();

        try {
            // 상품 가격보다 가진 돈이 적은 경우
            et.checkEnoughMoney(50000, 30000);

            // 상품 가격을 음수로 입력한 경우
//            et.checkEnoughMoney(-50000, 30000);

            // 가진 돈을 음수로 입력하는 경우
//            et.checkEnoughMoney(50000, -30000);

//            et.checkEnoughMoney(50000, 60000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}