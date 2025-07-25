package com.ohgiraffers.section03.interfaceimplements;

/* 클래스에서 인터페이스를 상속받을 때에는 implements 키워드를 사용한다. */
public class Product implements InterProduct {

    @Override
    public void nonStaticMethod() {

        System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메소드 호출");
    }

    @Override
    public void abstMethod() {

        System.out.println("InterProduct의 abstMethod 오버라이딩한 메소드 호출");

    }

    // static 메소드는 오버라이딩 할 수 없다.
//    @Override
//    public static void staticMethod() {}


    // default 키워드를 제외하면 오버라이딩 가능하다.
    @Override
    public void defaultMethod() {

        System.out.println("Product 클래스의 defaultMethod 호출됨");
    }
}