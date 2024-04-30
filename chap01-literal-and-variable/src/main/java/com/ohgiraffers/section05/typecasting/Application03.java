package com.ohgiraffers.section05.typecasting;

public class Application03 {
    public static void main(String[] args){
        /*
        * 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
        * 다른 자료형 끼리 연사은 큰 자료형으로 자동 형변환 수 연산 처리된다.
        * */
        int inum = 10000;               //계산중 잠깐이라도 int를 넘으면 오버플러우가 발생된다
        long lnum = 1000000;
        int isum = (int)(inum + lnum);
        System.out.println(isum);

        byte byteNum1 = 1;
        byte byteNum2 = 2;
        short shortNum1 = 1;
        short shortNum2 = 2;
        int result = byteNum1 + byteNum2;   //한쪽이 int로 변하고 둘다 자동변환 후 byte 다시 자동변환 하는게
        int result2 = shortNum2 + shortNum1;    //자바 계산법



    }

}
