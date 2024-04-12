package com.ohgiraffers.section04.overflow;

public class Application01 {
    public static void main(String[] args){

        // 자로형 별 값의 최대 범위를 벗어나느 경우 발생한 carry를 버림처리하고 sing bit를 반전시켜 최소값으로 순환시킴

        byte num1 = 127;
        System.out.println("byte num ; " + num1);
        num1++; //= num1 + num1;

        System.out.println("byte num ; " + num1);

        int firstNum = 1000000;
        int secondNum = 700000;
        System.out.println("firstNum * secondNum = "+ (firstNum * secondNum));
        //-2,147,483,648 ~ 2,147,483,647 int의 오버플로우 범위

        long longMulti = firstNum * secondNum;
        System.out.println("firstNum * secondNum =" + longMulti);

        long result = (long) firstNum * secondNum;
        System.out.println("firstNum * secondNum =" + result);

        // 컴퓨터는 우항에서 좌항으로 연산


    }
}
