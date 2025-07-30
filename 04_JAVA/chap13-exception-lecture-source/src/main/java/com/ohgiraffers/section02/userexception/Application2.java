package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {

    public static void main(String[] args) {

        /* comment. 다양한 타입의 예외를 multi block을 이용해서 처리할 수 있다. */

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(20000, 10000);

            /* 예외 상황별로 catch블럭을 따로 작성해서 처리할 수 있다. */
        } catch (PriceNegativeException e) {

            System.out.println("PriceNegativeException발생!");
            System.out.println(e.getMessage());

        } catch (MoneyNegativeException e) {

            System.out.println("MoneyNegativeException발생!");
            System.out.println(e.getMessage());

        } catch (NotEnoughMoneyException e) {

            System.out.println("NotEnoughMoneyException발생!");
            System.out.println(e.getMessage());

        } finally {

            // 예외 발생 여부 상관없이 실행할 내용
            System.out.println("finally 블록의 내용이 동작함");
        }

        System.out.println("프로그램을 종료합니다.");

        /* 디테일한 예외 상황별로 처리 로직을 다르게 할 수 있다.
         * 이 때 주의할 점은 catch블럭은 위에서부터 아래로 자신의 타입과 맞는 경우
         * 동작하기 때문에 상위 타입이 위쪽으로 오게 되는 경우
         * 하단에 작성한 코드는 절대 도달할 수 없는 코드가 되므로 컴파일 에러를 발생시킨다.
         * */
    }
}