package com.ohgiraffers.section05.typecasting;

public class Application02 {
    public static void main(String[] args){
        /*
        * 강제형변환
        * 바꾸려는 자료형을 캐스트 연산자를 이용하여 형변환된다.
        *
        * 자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
        * 1. 강제 형변환 규칙
        *   1-1. 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다.
        *   1-2. 실수를 정수로 변경 시 강제 형변환이 필요한다.
        *   1-3. 문자형을 int 미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
        *   1-4. 논리형은 강제 형변환 규칙에서 제외된다.
        * */

        long lnum = 9999999999999L;
        int inum = (int)lnum;
        short snum = (short)inum;
        byte bnum = (byte)snum;
        System.out.println(inum);
        // 자동 형변환이 발생된다.

        //실수를 정수로 변경 시 강제 형변환이 필요하다.
        double dnum = 8.8;
        float fnum= (float) dnum;

        //문자형을 int 미만의 크기변수에 저장할 때 강제 형변환이 필요하다.
        char ch = 'a';
        byte bnum2 = (byte) ch;
        System.out.println(bnum2);
        int noway = ch;
        System.out.println(ch);


    }
}
