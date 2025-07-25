package com.ohgiraffers.section01.literal;

public class Application02 {

    public static void main(String[] args) {

        /* comment. 값을 직접 연산하여 출력할 수 있다. */

        /* 1. 숫자와 숫자의 연산 */
        /* 1-1. 정수와 정수의 연산 */
        System.out.println("=========== 정수와 정수의 연산 ============");
        System.out.println(123 + 456);
        System.out.println(123 - 456);
        System.out.println(123 * 456);
        System.out.println(123 / 456);
        System.out.println(123 % 456);  // 나머지를 구하는 연산

        /* 1-2. 실수와 실수의 연산 */
        System.out.println("=========== 실수와 실수의 연산 ============");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 1.23);
        System.out.println(1.23 * 1.23);
        System.out.println(1.23 / 1.23);
        System.out.println(1.23 % 1.0);

        /* 1-3. 정수와 실수의 연산 */
        /* 결과는 항상 실수가 나온다. */
        System.out.println("=========== 정수와 실수의 연산 =============");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        /* 2. 문자의 연산 */
        /* 2-1. 문자와 문자의 연산 */
        System.out.println("=========== 문자와 문자의 연산 =============");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        /* 2-2. 문자와 정수의 연산 */
        System.out.println("=========== 문자와 정수의 연산 =============");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 1);
        System.out.println('a' / 1);
        System.out.println('a' % 1);

        /* 2-3. 문자와 실수의 연산 */
        System.out.println("=========== 문자와 실수의 연산 =============");
        System.out.println('a' + 0.1);
        System.out.println('a' - 0.1);
        System.out.println('a' * 0.1);
        System.out.println('a' / 0.1);
        System.out.println('a' % 0.1);

        /* 3. 문자열의 연산 */
        /* 3-1. 문자열과 문자열의 연산 */
        /* 문자열과 문자열의 '+' 연산 결과 문자열 합치기(이어 붙이기)가 된다. */
        System.out.println("========== 문자열과 문자열의 연산 ===========");
        System.out.println("hello" + "world");
//        System.out.println("hello" - "world");
//        System.out.println("hello" * "world");
//        System.out.println("hello" / "world");
//        System.out.println("hello" % "world");

        /* 3-2. 문자열과 다른 형태의 값 연산 */
        /* 문자열과의 연산은 '+' 연산만 가능하다. */
        System.out.println("helloworld" + 123);
        System.out.println("helloworld" + 1.23);
        System.out.println("helloworld" + 'a');
        System.out.println("helloworld" + true);

        /* 4. 논리값 연산 */
        /* 4-1. 논리값과 논리값 연산 */
//        System.out.println(true + false);
//        System.out.println(true - false);
//        System.out.println(true * false);
//        System.out.println(true / false);
//        System.out.println(true % false);

        /* 4-2. 논리값과 다른 형태의 값 연산 */
//        System.out.println(true + 1);
//        System.out.println(true + 1.0);
//        System.out.println(true + 'a');
        System.out.println(true + "a");
//        System.out.println(true - "a");
//        System.out.println(true * "a");
//        System.out.println(true / "a");
//        System.out.println(true % "a");
    }
}