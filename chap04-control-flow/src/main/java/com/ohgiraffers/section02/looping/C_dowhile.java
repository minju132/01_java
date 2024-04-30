package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_dowhile {
    public void testSimpledoWhileStatement(){
        /*
        * do-while문 표현식
        * 초기식;
        * do{
        *
        * }while(조건식);
         */
        do{
            System.out.println("일단 실행");
        }while(false);
    }
    public void testDowhileExample(){
        Scanner sc = new Scanner(System.in);
        String str = "";
        do {
            System.out.println("문자열을 입력해주세요 : ");
            str = sc.nextLine();
            System.out.println(str);
        }while(!str.equals("exit"));
    }
}
