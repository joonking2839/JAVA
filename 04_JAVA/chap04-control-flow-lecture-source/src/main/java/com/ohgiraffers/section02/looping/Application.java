package com.ohgiraffers.section02.looping;

public class Application {

    public static void main(String[] args) {

        A_for a = new A_for();
//        a.testSimpleForStatement();
//        a.testForExample1();
//        a.testForExample2();
//        a.testForExample3();
//        a.printSimpleGugudan();

        A_nestedFor a1 = new A_nestedFor();
        a1.printGugudanFromTwoToNine();
//        a1.printStarInputRowTimes();

        B_while b = new B_while();
//        b.testSimpleWhileStatement();
//        b.testWhileExample1();
//        b.testWhileExample2();

        B_nestedWhile b1 = new B_nestedWhile();
//        b1.testWhileExample3();

        C_doWhile c = new C_doWhile();
//        c.testSimpleDoWhileStatement();
        c.testDoWhileExample();
    }
}