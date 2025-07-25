package com.ohgiraffers.Practice02.level02.normal.book.run;

import com.ohgiraffers.Practice02.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {

        // 기본 생성자 사용 후 setter로 값 입력하지 않고 출력
        BookDTO book1 = new BookDTO();
        book1.printInformation();  // null, null, null, 0, 0.0

        // 3개 인자 생성자
        BookDTO book2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        book2.printInformation();  // 자바의 정석, 도우출판, 남궁성, 0, 0.0

        // 모든 인자 생성자
        BookDTO book3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        book3.printInformation();  // 홍길동전, 활빈당, 허균, 5000000, 0.5
    }
}
