package com.ohgiraffers.section02.variable;

public class Application02 {
    public static void main(String[] args){

        /*
        * 자료형이란/
        * 다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 compiler와 약속한 키워드이다
        * 예) 앞으로 사용한 int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급하겠다는 약속이다.
        *   이러한 자료형은 기본자료형(primitive type)과 참조자료형(Referance type)으로 나뉘어진다.
        * */

        // 정수를 취급하는 자료형 4가지
        byte bnum; // 1byte
        short snum; // 2byte
        int inum; // 4byte
        long lnum; // 8byte

        // 실수를 취급하는 자료형 2가지
        float fnum;  // 4byte
        double dnum;  // 8byte

        // 문자를 취급하는 자료형
        char ch;   // 2byte

        // 논리형을 취급하는 자료형
        boolean isTrue;  // 1byte

        // 문자열을 취급하는 자료형, 문자열은 기본자료형이 아님
        String str;  // 4byte

        // 변수 초기화 하기, int가 기본단위라서 그보다 큰 수는 L를 붙임
        bnum = 1;
        snum = 2;
        inum = 3;
        lnum = 4L;
        System.out.println((bnum + snum));
        System.out.println((inum + lnum));

        // 실수에 값을 초기화 하기 기본이 double이라서 float에 f 붙임
        fnum = 0.5f;
        dnum = 0.6;

        // 논리를 취급하는 자료형, 아스키코드가 적용된 자바코드
        isTrue = true;
        isTrue = false;

        ch = 'A';
        ch = 97;
        System.out.println(bnum + ch);  // 출력은 큰 값으로 출력됨
        System.out.println(ch);

        // 문자열을 취급하는 자료형 값 대입
        str = "안녕하세요";


    }
}
