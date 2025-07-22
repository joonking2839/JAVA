package com.ohgiraffers.practice01;

public class Calculator {
    protected void checkMethod(){
        System.out.println("매소드 호출 확인");
    }

    protected int sum1to10(){
        int sum=(10*11)/2;
        return sum;
    }

    protected void checkMaxNumber(int a,int b){
        int big = (a>b) ? a:b;
        System.out.println("두 수 중 더 큰 수는"+big+"이다.");
    }

    protected int sumTwoNumber(int a,int b){
        int sum=a+b;
        return sum;
    }

    protected int minusTwoNumber(int a,int b){
        int min=a-b;
        return Math.abs(min);
    }

}