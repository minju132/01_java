package com.ohgiraffers.section05.logical;

public class Application01 {
    public static void main(String[] args){
        /*
        * 논리 연산자
        * 논리값(true or false) 취급하는 연산자이다.
        *
        * 논리 연산자의 종류
        * 1. 논리 연결 연산자 : 두 개의 피연산자를 가지는 이형 연산자이며, 연산자의 결합 방향은 왼쪽에서 오른쪽이다.
        * 두개의 논리 식을 판단하여 참과 거짓을 판단한다.
        *   1-1. &&(논리 AND) : 두 개의 논리식 모두 참일 경우 참을 반환
        *   1-2. ||(논리 OR) : 두 개의 논리식 중 하나라도 참일 경우 참을 반환
        * 2. 논리 부정 연산자 : 피연산자가 하나인 단항연산자로, 피연산자의 결합 방향은 왼쪽에서 오른쪽이다.
        *   2-1. !(논리 NOT) : 논리식의 결과가 참이라면 거짓을, 거짓이라면 참을 변환한다.
        * */

        System.out.println("true와 true의 논리 and 연산자 :" + (true && true && true));
        System.out.println("true와 false의 논리 and 연산자 :" + (true && false));
        System.out.println("true와 true의 논리 and 연산자 :" + (false && false && false));

        System.out.println("true와 true의 논리 or 연산자 :" + (true || true || true));
        System.out.println("true와 true의 논리 or 연산자 :" + (true || false || true));
        System.out.println("true와 true의 논리 or 연산자 :" + (false || false || false));

        System.out.println("논리 부정 연산자 :" + !true);

        System.out.println(true && !false || false);

        System.out.println("t, f, f, f, t, t, t, f");


    }
}
