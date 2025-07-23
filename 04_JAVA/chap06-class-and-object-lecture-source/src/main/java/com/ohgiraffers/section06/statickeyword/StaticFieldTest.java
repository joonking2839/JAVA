package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {

    private int nonStaticCount;

    private static int staticCount;

    public StaticFieldTest() {}

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    /* static 필드에 접근하기 위해서는 클래스명.필드명으로 접근한다.
     *  this.으로도 접근은 가능하지만 this.을 사용하지 않는 것이 좋다.
     * */
    public int getStaticCount() {
        return StaticFieldTest.staticCount;
    }

    /* 두 필드 값을 1씩 증가시키기 위한 용도의 메소드 */
    public void increaseNonstaticCount() {
        nonStaticCount++;
    }

    public void increaseStaticCount() {
        StaticFieldTest.staticCount++;
    }
}