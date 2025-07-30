package com.ohgiraffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {

    public static void main(String[] args) {

        /* comment. FileWriter를 이해하고 사용할 수 있다. */
        /* 글자 단위로 데이터를 처리한다. */

        FileWriter fw = null;

        try {
            fw = new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testWriter");

            fw.write(97);

            fw.write('A');

            fw.write(new char[] {'a', 'p', 'p', 'l', 'e'});

            fw.write("우리나라 대한민국");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}