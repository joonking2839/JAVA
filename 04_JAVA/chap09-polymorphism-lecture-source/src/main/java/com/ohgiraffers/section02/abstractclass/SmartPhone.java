package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product {

    public SmartPhone() {}

    // 추상클래스가 가지는 추상메소드를 반드시 오버라이딩 해야 한다.(강제성 부여)
    @Override
    public void abstMethod() {

        System.out.println("Product 클래스의 abstMethod를 오버라이딩 한 메소드 호출함");
    }

    // 추가적으로 메소드도 작성할 수 있다.
    public void printSmartPhone() {

        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함");
    }
}