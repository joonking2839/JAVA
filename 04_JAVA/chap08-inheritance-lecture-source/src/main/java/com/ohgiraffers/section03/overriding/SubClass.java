package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass{

    /*1.메소드 이름 변경하면 에러발생*/
//    @Override
//    public void method2(int num){}

    //2.메소드의 리턴타입 변경하면 에러
    //@O/verride
//    public int method(int num){
//        return 0;

    //3.매개변수의 갯수나.타입 변경하면 애러
        //@Override
    //public void method(String num){}

    //5.private 불가
    //6.final 메소드 오버라이딩 불가

    //7.부모 메소드의 접근제한자와 같거나 더 넓은 범위로 오버라이딩 불가
//    @Override
//    void protectedMethod(){} //더 좁은 범위로는 불가능

    @Override
    protected void pro
}
