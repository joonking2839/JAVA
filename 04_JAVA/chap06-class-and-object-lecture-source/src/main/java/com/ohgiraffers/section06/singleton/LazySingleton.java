package com.ohgiraffers.section06.singleton;

public class LazySingleton {

    // 클래스 초기화 되는 시점에서는 정적 필드로 선언해두고 null로 초기화된다.
    private static LazySingleton lazy;

    private LazySingleton() {}

    public static LazySingleton getInstance() {

        /* 인스턴스를 생성한 적이 없는 경우 인스턴스를 생성해서 반환하고
         *  생성한 인스턴스가 있는 경우 만들어둔 인스턴스를 반환한다. */
        if(lazy == null) {
            lazy = new LazySingleton();
        }

        return lazy;
    }
}