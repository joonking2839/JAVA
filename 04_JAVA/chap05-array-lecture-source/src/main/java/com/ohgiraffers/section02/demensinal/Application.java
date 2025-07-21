package com.ohgiraffers.section03.copy;

public class Application1 {

    public static void main(String[] args) {

        /* comment. 배열의 복사 개념 중 얕은 복사에 대해 이해할 수 있다. */
        /* 배열의 복사에는 두 가지 종류가 있다.
         *  1. 얕은 복사 : stack의 주소값만 복사
         *  2. 깊은 복사 : heap의 배열에 저장된 값 복사
         * */

        int[] originArr = {1, 2, 3, 4, 5};

        int[] copyArr = originArr;
        System.out.println(originArr.hashCode());
        System.out.println(copyArr.hashCode());

        for(int i = 0; i < originArr.length; i++) {
            System.out.print(originArr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
        System.out.println();

        copyArr[0] = 99;

        for(int i = 0; i < originArr.length; i++) {
            System.out.print(originArr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
        System.out.println();
    }
}