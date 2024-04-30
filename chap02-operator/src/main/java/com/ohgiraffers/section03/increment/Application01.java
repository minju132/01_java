package com.ohgiraffers.section03.increment;

public class Application01 {
    public static void main(String[] args){
        /*
        * 증감연산자
        * 피연산자의 앞 or 뒤에 사용이 가능하다.
        * ++, -- 각각 1씩 증감된다.
        * ++를 뒤에쓰면 다음줄부터 +1이 된다.
         */
        int num = 0;
        System.out.println(num++);
        System.out.println(num++);
        System.out.println(++num);
        char a ='+';
        System.out.println(++a);


    }
}
