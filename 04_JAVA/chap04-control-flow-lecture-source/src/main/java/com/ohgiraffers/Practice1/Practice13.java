package com.ohgiraffers.Practice1;

import java.util.Scanner;

public class Practice13 {

    public void test13() {

        Scanner sc = new Scanner(System.in);

        System.out.println("월 급여액:");

        int salary = sc.nextInt();

        System.out.println("월 매출액:");

        int sales = sc.nextInt();

        if (sales >= 50000000) {
            double bonus = 0.05;
            System.out.println("==============");
            System.out.println("매출액:" + sales);
            System.out.println("보너스율:5%");
            System.out.println("월급여:" + salary);
            System.out.println("보너스금액:"+(sales*bonus));
            System.out.println("==============");
            System.out.println("총급여" + (int) (salary + (sales * bonus)));
        } else if (sales >= 30000000) {
            double bonus = 0.03;
            System.out.println("==============");
            System.out.println("매출액:" + sales);
            System.out.println("보너스율:3%");
            System.out.println("월급여:" + salary);
            System.out.println("보너스금액:"+(sales*bonus));
            System.out.println("==============");
            System.out.println("총급여" + (int) (salary + (sales * bonus)));
        } else if (sales >= 10000000) {
            double bonus = 0.01;
            System.out.println("==============");
            System.out.println("매출액:" + sales);
            System.out.println("보너스율:1%");
            System.out.println("월급여:" + salary);
            System.out.println("보너스금액:"+(sales*bonus));
            System.out.println("==============");
            System.out.println("총급여" + (int) (salary + (sales * bonus)));
        } else {
            double bonus = 0.00;
            System.out.println("==============");
            System.out.println("매출액:" + sales);
            System.out.println("보너스율:0%");
            System.out.println("월급여:" + salary);
            System.out.println("보너스금액:"+(int)(sales*bonus));
            System.out.println("==============");
            System.out.println("총급여" + (int) (salary + (sales * bonus)));
        }
    }
}