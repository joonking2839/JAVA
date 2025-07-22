package com.ohgiraffers.practice01;

public class Application{

    public static void main(String[] args) {
        Calculator calc = new Calculator();

         int a=10;
         int b=20;
        calc.checkMethod();

        int sum2= calc.sum1to10();
        System.out.println("1부터 10까지의 합:"+sum2);


        calc.checkMaxNumber(a,b);

        int result2=calc.sumTwoNumber(a,b);
        System.out.println("두 수의 합은"+result2);

        int result3=calc.minusTwoNumber(a,b);
        System.out.println("두 수의 차는"+result3);

    }
}
