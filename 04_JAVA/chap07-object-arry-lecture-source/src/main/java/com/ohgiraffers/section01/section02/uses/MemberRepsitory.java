package com.ohgiraffers.section01.section02.uses;

public class MemberRepsitory {

    private final static Member[] members;

    private static int count;

    static {
        members = new Member[10];
    }

    public static boolean store(Member[] newMembers){

        for (int i=0; i<newMembers.length; i++){
            members[count++]=newMembers[i];
        }

        return true;
    }

    public static Member[] findAllMembers() {

        return members;
    }
}
