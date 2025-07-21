package com.ohgiraffers.section03.copy;

public class Application2 {

    public static void main(String[] args) {

        /* comment. 얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다.
         *  얕은 복사의 활용
         *  주로 메소드 호출 시 인자로 사용하는 경우와
         *  리턴값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다.
         * */

        /* 1. 인자와 매개변수로 활용 */
        String[] names = {"홍길동", "유관순", "이순신"};

        System.out.println("names의 hashCode : " + names.hashCode());

        print(names);

        /* 2. 리턴값으로 활용 */
        String[] animals = getAnimals();

        System.out.println("리턴 받은 animals hashCode : " + animals.hashCode());

        print(animals);
    }

    public static void print(String[] sarr) {

        /* 전달받은 배열의 hashCode */
        System.out.println("sarr의 hashCode : " + sarr.hashCode());

        for(int i = 0; i < sarr.length; i++) {
            System.out.println(sarr[i] + " ");
        }
        System.out.println();
    }

    public static String[] getAnimals() {

        String[] animals = new String[] {"낙타", "호랑이", "나무늘보"};

        System.out.println("새로 만든 animals의 hashCode : " + animals.hashCode());

        return animals;
    }
}