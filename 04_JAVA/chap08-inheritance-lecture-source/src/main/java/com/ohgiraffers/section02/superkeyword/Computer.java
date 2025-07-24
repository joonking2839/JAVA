package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {

    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer() {

        System.out.println("Computer 클래스의 기본 생성자 호출함");
    }

    /* 모든 필드를 초기화하는 생성자 */
    public Computer(String cpu, int hdd, int ram, String operationSystem) {

        /* 부모클래스의 기본생성자 호출 */
        super();

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Computer 클래스의 모든 필드를 초기화하는 생성자 호출함");
    }

    /* 부모의 필드도 모두 초기화하는 생성자 */
    public Computer(String code, String brand, String name, int price, Date manuFacturingDate, String cpu, int hdd, int ram, String operationSystem) {

        /* 부모의 모든 필드를 초기화하는 생성자로 Product클래스가 가진 필드를 초기화 할 값 전달 */
        super(code, brand, name, price, manuFacturingDate);

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Computer 클래스의 부모 필드를 초기화하는 생성자 호출함");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String getInformation() {

        /* super.getInformation() : 정상적으로 부모의 메소드 호출
         *  this.getInformation() : 재귀호출 일어나며 stackOverflow 발생
         *  getInformation() : this. 이 자동으로 추가되어 재귀 호출 일어남
         *  따라서 이런 경우 super.을 명시적으로 사용해야한다.
         * */
        return super.getInformation()
                + "Computer ["
                + "cpu=" + this.cpu
                + ", hdd=" + this.hdd
                + ", ram=" + this.ram
                + ", operationSystem=" + this.operationSystem
                + "]";
    }
}