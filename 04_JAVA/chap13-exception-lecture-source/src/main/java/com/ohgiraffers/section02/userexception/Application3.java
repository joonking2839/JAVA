package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application3 {

    public static void main(String[] args) {

        /* comment. multi-catch 블럭으로 동일한 레벨의 다른 타입의 예외를 하나의 catch 블럭으로 처리할 수 있다. */

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(20000, 10000);

            /* 동일 레벨의 예외만 같이 예외를 잡을 수 있다. */
        } catch (PriceNegativeException | MoneyNegativeException e) {
            /* 예외 클래스명, 예외발생 위치, 예외 메시지 등을 빨간색 글씨를 이용해서 로그 형태로 출력해주는 메소드 */
            e.printStackTrace();

        } catch (NotEnoughMoneyException e) {

            // 예외클래스의 이름을 알 수 있다.
            System.out.println(e.getClass() + "발생");
            System.out.println(e.getMessage());
        }
    }
}