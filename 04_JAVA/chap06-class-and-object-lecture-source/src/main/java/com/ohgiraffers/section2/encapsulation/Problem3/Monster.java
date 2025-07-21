package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {

    /* 접근 제한자
     *  : 클래스 혹은 클래스의 멤버 참조연산자로 접근할 수 있는 범위를 제한하기 위한 키워드이다.
     *  1. public
     *  2. protected
     *  3. default
     *  4. private
     *
     *  위의 4가지 접근제한자는 클래스의 멤버(필드, 메소드)에 모두 사용 가능하다.
     *  단, 클래스 선언 시 사용하는 접근제한자는 public과 default만 사용 가능하다.
     * */

    private String kinds;
    private int hp;

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    public void setHp(int hp) {
        if(hp > 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }

    public String getInfo() {

        return "몬스터의 종류는 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";
    }

}