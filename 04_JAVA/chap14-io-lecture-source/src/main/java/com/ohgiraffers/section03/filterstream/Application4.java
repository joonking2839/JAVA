package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.filterstream.dto.MemberDTO;

import java.io.*;

public class Application4 {

    public static void main(String[] args) {

        /* comment. 객체단위 입출력 보조스트림을 이해하고 사용할 수 있다. */

        MemberDTO[] outputMembers = {
                new MemberDTO("user01", "pass01", "홍길동", "hong@email.com", 25, '남', 1250.7),
                new MemberDTO("user02", "pass02", "유관순", "yoo@email.com", 16, '여', 1221.6),
                new MemberDTO("user03", "pass03", "이순신", "lee@email.com", 22, '남', 1234.7)};

        ObjectOutputStream objOut = null;

        try {
            objOut = new ObjectOutputStream
                    (new BufferedOutputStream
                            (new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjectStream.txt")));

            for(int i = 0; i < outputMembers.length; i++) {
                objOut.writeObject(outputMembers[i]);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(objOut != null) {
                try {
                    objOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        ObjectInputStream objIn = null;

        try {
            objIn = new ObjectInputStream
                    (new BufferedInputStream
                            (new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjectStream.txt")));

            while (true) {
                System.out.println(objIn.readObject());
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (EOFException e) {
            System.out.println("끝!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(objIn != null) {
                try {
                    objIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}