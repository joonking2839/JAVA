package com.ohgiraffers.section01.section02.uses;

public class MemberService {

    //회원 가입 기능
    public void signupMembers(){

        Member[] members=new Member[5];
        members[0]=new Member(1,"user01","pass01","홀길동",20,'남');
        members[1]=new Member(2,"user02","pass02","이순신",40,'남');
        members[2]=new Member(3,"user03","pass03","유관순",16,'여');
        members[3]=new Member(4,"user04","pass04","신사임당",36,'여');
        members[4]=new Member(5,"user05","pass05","윤봉길",22,'남');

        MemberRegister memberRegister=new MemberRegister();
        memberRegister.regist(members);
    }




    //전체 회원 조회 기능
    public void showAllMembers(){

        MemberFinder memberFinder=new MemberFinder();
        System.out.println("=========가입된 회원 목록=========");
        for (Member member:memberFinder.findALlmembers()){
            if (member !=null){
                System.out.println(member.getInforamation());
            }
        }
        System.out.println("================================");
    }
}
