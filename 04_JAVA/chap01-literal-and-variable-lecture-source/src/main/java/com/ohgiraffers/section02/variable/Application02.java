package com.ohgiraffers.section02.variable;

public class Application02 {

    public static void main(String[] args) {

        /* comment. 변수를 선언하고 값을 할당하여 사용할 수 있다. */
        /* 변수를 사용하는 방법
         *  1. 변수를 준비한다.(선언)
         *  2. 변수에 값을 대입한다.(값 대입 및 초기화)
         *  3. 변수를 사용한다.
         * */

        /* 1-1. 변수를 선언하는 방법 */
        /* 자료형 변수명; */

        /* 자료형이란?
         *  다양한 값의 형태별로 어느 정도 크기를 하나의 값으로 취급할 것인지 미리 compiler와 약속한 키워드이다.
         *  예) 앞에서 사용한 int 자료형은 정수를 4byte만큼을 읽어서 하나의 값을 취급하겠다는 약속이다.
         *  이러한 자료형은 기본자료형과 참조자료형으로 나누어진다.
         *  그 중 기본자료형 8가지부터 살펴보자.
         * */

        /* 1-1-1. 숫자를 취급하는 자료형 */
        /* 정수를 취급하는 자료형은 4가지가 있다. */
        byte bnum; // 1byte
        short snum; // 2byte
        int inum; // 4byte
        long lnum; // 8byte

        /* 실수를 취급하는 자료형은 2가지가 있다. */
        float fnum; // 4byte
        double dnum; // 8byte

        /* 1-1-2. 문자를 취급하는 자료형 */
        char ch;    // 2byte

        /* 1-1-3. 논리값을 취급하는 자료형 */
        boolean isTrue; // 1byte

        /* 1-1-4. 문자열을 취급하는 자료형 */
        String str; // 4byte

        /* 2. 변수에 값을 대입한다. */
        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8L;  // 소문자 l을 써도 되지만 대문자로 하는 것을 권장한다.

        fnum = 4.0f;    // 실수 뒤에 'f'를 붙여야한다. 소문자를 사용하는 것이 일반적이다.
        dnum = 8.0;

        ch = 'a';
        ch = 97;    // 숫자로도 저장할 수 있다.

        isTrue = true;
        isTrue = false;

        str = "안녕하세요";

        /* 숫자로 된 형태의 값을 그대로 사용하는 자료형은 byte, short, int, double이다.
         *  일반적으로 사용하는 값을 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을
         *  대표자료형이라고 하며, 정수형은 int, 실수형은 double이 대표 자료형이다.
         * */

        /* 선언과 동시에 초기화 */
        int point = 100;
        int bouns = 10;

        /* 3. 변수를 사용한다. */
        /* 3-1. 변수에 저장한 값 출력하기 */
        System.out.println("bnum = " + bnum);
        System.out.println("snum = " + snum);
        System.out.println("inum = " + inum);
        System.out.println("lnum = " + lnum);

        /* 3-2. 변수를 이용해서 연산하기 */
        System.out.println("포인트와 보너스의 합은 ? : " + (bouns + point));

        /* 3-3. 대입연산자의 왼쪽과 오른쪽 편에 사용하기 */
        point = point + 100;
    }
}