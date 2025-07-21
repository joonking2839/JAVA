package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {

    public static void main(String[] args) {

        /* name -> kinds로 변경했기 때문에
         * 직접 name필드에 접근하는 코드는 전부 컴파일 에러 발생!!
         * 즉, Monster 클래스의 일부를 수정한 것 뿐인데,
         * 사용한 곳에서는 전부 함께 수정을 해야하는 부담이 생긴 것이다.
         * 이것은 유지보수에 악영향을 미친다.
         * */
        Monster monster1 = new Monster();
        monster1.name = "드라큘라";
        monster1.hp = 200;

        Monster monster2 = new Monster();
        monster2.name = "미이라";
        monster2.hp = 300;

        System.out.println("monster1.name = " + monster1.name);
        System.out.println("monster1.hp = " + monster1.hp);
        System.out.println("monster2.name = " + monster2.name);
        System.out.println("monster2.hp = " + monster2.hp);
    }
}