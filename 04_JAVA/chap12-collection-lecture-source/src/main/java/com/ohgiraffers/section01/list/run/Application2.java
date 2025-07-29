package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application2 {

    public static void main(String[] args) {

        /* comment. ArrayList의 정렬 기능을 이용할 수 있다. */
        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));

//        Collections.sort(bookList);

        // 정렬 전 책 리스트 출력
        for(BookDTO book : bookList) {
            System.out.println("book = " + book);
        }

        bookList.sort(new AscendingPrice());

        System.out.println("가격 오름차순 정렬 ==============");
        for(BookDTO book : bookList) {
            System.out.println("book = " + book);
        }

        /* 한 번만 사용하기 위해서는 조금 더 간편한 방법을 이용할 수 있다.
         *  익명클래스를 이용할 수 있다.
         * */

//        bookList.sort(new Comparator<BookDTO>());

        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {

                return o1.getPrice() > o2.getPrice()? -1: 1;
            }
        });

        System.out.println("가격 내림차순 정렬============");
        for(BookDTO book : bookList) {
            System.out.println("book = " + book);
        }

        // 제목 기준 오름차순 정렬
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {

                /* a.compareTo(b)
                 *  (a < b) 음수 반환
                 *  같으면 0 반환
                 *  (a > b) 양수 반환
                 * */
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        System.out.println("책 제목 순으로 오름차순 정렬============");
        for(BookDTO book : bookList) {
            System.out.println("book = " + book);
        }

        // 제목 기준 내림차순 정렬
        // 람다식을 활용할 수 있다.
        bookList.sort((BookDTO b1, BookDTO b2) -> b2.getTitle().compareTo(b1.getTitle()));

        System.out.println("책 제목 순으로 내림차순 정렬============");
        for(BookDTO book : bookList) {
            System.out.println("book = " + book);
        }
    }
}