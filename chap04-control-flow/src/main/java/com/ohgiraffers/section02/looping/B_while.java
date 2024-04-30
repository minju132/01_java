package com.ohgiraffers.section02.looping;

public class B_while {

    public void testSimpleWhileStatement(){


        int i = 1;
        while (i < 10) { int j = 1;
            while (j < 10) {
                System.out.println(i + "*" + j + "=" + i * j);
                j++;
            }
            ; // 반복해야 하는 대상의 길이를 알 수 없을 때 사용한다
            i++;
        }

            /*
            1. 초기식 작성
            int i = 2; int j = 2;
            2. while문의 조건식
            while (i < 10){
            3. 중첩 while 조건식
            while (j < 10){
            4. i * j 연산 , 5. 출력
            System.out.println(i+ "*" +j+ "=" + i*j);
            6. 중첩 while 증감식
            j++;    }
            7. while 증감식
            i++;
            8. 중첩 while의 조건 변수 초기화
            j = 2;  } */

    }
}
