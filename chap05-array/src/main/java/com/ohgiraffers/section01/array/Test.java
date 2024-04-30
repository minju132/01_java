package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        /*
        * A학생의 평균 점수를 구하는 프로그램을 만들어주세요
        * 시험의 과목은 5개로 점수의 단위는 정수 입니다.
        * 5개 과목의 점수를 입력받고 평균을 구하여 화면에 출력합니다.
        * 예) A학생의 수학 90점, 영어 80점, 국어 100점, 과학 79점, 사회 80점이며 평균은 X입니다.
         */
        System.out.println("성적을 입력주세요");
        Scanner sc = new Scanner(System.in);
        double[] 과목 = new double[5];
        double result = 0;
        for (int i =0; i< 과목.length; i++){
            if(과목[i]<0) { break;} //왜 음수면 점수 다시 입력하게 하는게 어렵냐
            과목[i] = sc.nextDouble();
            result += 과목[i];
            if(과목[i]<0) { continue;} //왜 음수면 점수 다시 입력하게 하는게 어렵냐
        }
        double avg =result / 과목.length;
                String[] subject ={"국어","영어","수학","과학","사회"};
        for(int i = 0; i <과목.length; i++){
            System.out.print(subject[i] +" : "+ 과목[i]+"점 ");
        }

        System.out.println("평균점수 : "+ avg+"점");

    }
}
