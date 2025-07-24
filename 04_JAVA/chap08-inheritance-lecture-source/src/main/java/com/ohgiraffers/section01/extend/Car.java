package com.ohgiraffers.section01.extend;

public class Car {

    /* 자동차가 달리는 상태를 확인할 수 있는 필드 */
    private boolean runningStatus;

    public Car() {

        System.out.println("Car 클래스의 기본 생성자가 호출됨");
    }

    public void run() {

        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }

    public void soundHorn() {

        if(isRunning()) {
            System.out.println("빵! 빵!");
        } else {
            System.out.println("주행중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
        }
    }

    public boolean isRunning() {

        return runningStatus;
    }

    public void stop() {

        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }
}