package com.ohgiraffers.section02.looping;

public class B_nestedWhile {

    public void testWhileExample3() {

        /* comment. 중첩된 while문 흐름을 이해하고 적용할 수 있다. */
        int dan = 2;
        while (dan < 10) {

            int su = 1;
            while (su < 10) {

                System.out.println(dan + " * " + su + " = " + (dan * su));
                su++;
            }

            System.out.println();
            dan++;
        }
    }
}