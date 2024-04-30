package com.ohgiraffers.section02.assignment;

public class Application01 {
    public static void main(String[] args){
        // int인 정수형의 변수를 num1오 선언하고 10의 값을 할당한다.
        int num1 = 10;
        int num2 = 10;
        // num2라는 변수에 num1과 num2를 더해서 대입한다.
        // num2 = num1 +  num2;
        /*
        * 대입연산자와 산술 복합 대입 연산자
        * =, +=, -=, *=, /=, %=
         */
        System.out.println(num2+(num1 + num2));
        System.out.println(num2 += num1 += num1 += num1 += num1);   //num2=50 num1=40
        System.out.println(num2 += num1 += num1 += num1 += num1);   //num2=210 num1=160
        System.out.println(num2 *= num1 *= num1);                   //num2=5376000 num1=25600

    }
}
