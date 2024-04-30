package com.ohgiraffers.section01.array;

public class Application01 {

    public static void main(String[] args){
        /*
        * 배열이란
        * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다.
        * 배열은 heap 영역에 new 연산자를 이용하여 할당한다.
        *
        *
        * 배열의 사용 이유
        * 만약 배열을 사용하지 않는다면 변수를 여러 개 사용해야 한ㄷ.
        * 1. 연속된 메모리 공간을 관리할 수 없다.
        * 2. 반복문을 이용한 연속 처리가 불가능하다.
        * */
        String bread ="식빵";
        String bread2 ="식빵";
        String bread3 ="식빵";
        String bread4 ="식빵";
        String bread5 ="식빵";
        // 배열을 사용한 배열의 표현식
        // 자료형[] 변수명 = new 자료형[길이];
        String[] breads = new String[5];
        breads[0] = "식빵";
        breads[1] = "식빵";
        breads[2] = "식빵";
        breads[3] = "식빵";
        breads[4] = "식빵";

        for (int i= 0; i <= 4; i++){
            System.out.println(breads[i]);
        }
        int[] iarr = new int[5];  // 0~5
        char carr[] = new char[10]; // 0~9
        iarr[2] = 10;
        System.out.println(iarr);  //변수는 주소이다. 그래서 나오는 것이 메모리얼의 주소값
        int result = iarr[2];
        System.out.println(iarr[0]); // 정수의 초기화 된 기본값은 0, 문자열 자료형은 null

        iarr = null;
        System.out.println(iarr);
        iarr[0] = 10;
        System.out.println(iarr[0]);





    }
}
