package com.ohgiraffers.section01.generic;

public class GenericTest<T> {

    /* 제네릭 설정은 클래스 선언부 마지막 부분에 다이아몬드 연산자를 이용하여 작성하게 된다.
     *  다이아몬드 연산자 내부에 작성하는 영문자는 관례상 대문자로 작성한다.
     * */

    // 현재 해당 필드는 타입이 결정되지 않은 상태이다.
    private T value;

    // setter/getter 작성 시에도 구체적인 타입 대신 T를 이용할 수 있다.
    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}