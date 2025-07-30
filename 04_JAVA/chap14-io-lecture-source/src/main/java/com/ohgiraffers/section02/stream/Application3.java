package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

    public static void main(String[] args) {

        /* comment. FileOutputStream을 이해하고 사용할 수 있다. */
        /* 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다.
         *  1바이트 단위로 데이터를 처리한다.
         * */

        FileOutputStream fout = null;

        try {
            fout = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputstream");

            fout.write(97);

            // 10 : 개행문자 (엔터)
            byte[] bar = new byte[] {98, 99, 100, 101, 102, 10};
            fout.write(bar);

            fout.write(bar, 1, 3);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}