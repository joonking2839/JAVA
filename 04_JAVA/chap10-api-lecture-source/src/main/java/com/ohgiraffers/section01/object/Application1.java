package com.ohgiraffers.section01.object;

public class Application1 {

    public static void main(String[] args) {

        /* comment. Object 클래스의 toString() 메소드 오버라이딩 목적을 이해하고 활용할 수 있다. */
        /* 모든 클래스는 Object 클래스의 후손이다.
         * 따라서 Object 클래스가 가진 메소드를 자신의 것 처럼 사용할 수 있다.
         * 또한 부모 클래스가 가지는 메소드를 오버라이딩 해서 사용하는 것도 가능하다.
         * */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(2, "목민심서", "정약용", 30000);

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        /* 자동으로 toString() 메소드를 호출해준다. */
        System.out.println(book1);
        System.out.println(book2);
    }
}