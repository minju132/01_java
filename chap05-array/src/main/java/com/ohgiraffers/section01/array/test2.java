package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class test2 {
    public static void main(String[]args){



        System.out.print("과목 갯수를 입력해주세요 : ");   //갯수도 음수 안되게 만들어보기!!and 또 오류남 ㅋㅋ
        Scanner sc = new Scanner(System.in);    //입력 권한 주기

        int a = sc.nextInt();   // 변수 a를 입력칸으로 과목 갯수 만큼 초기화 하기
        String[] 과목종류 = new String[a];   // 과목 종류 물어보는 배열 변수 선언 초기화 하기
        double[] 과목 = new double[a];    // 과목 점수 배열 변수 선언 초기화 하기
        sc.nextLine();  // 엔터도 또 하나의 입력값을 받기 때문에 빈칸 하나 주기

        // 시험 과목 입력 받기
        double result = 0;  //
        for (int i =0; i< a ; i++){
            System.out.println("무슨 과목인지 입력해주세요 : ");
            과목종류[i] = sc.nextLine();

            System.out.print("과목의 점수를 입력해주세요 :  ");

            while (과목[i]<=100 && 과목[i]>=0){
                과목[i] = sc.nextDouble();

                while (과목[i]<0 || 과목[i] > 100){
                    System.out.print("음수는 입력할 수 없습니다. 다시 입력해주세요 : ");
                    과목[i] = sc.nextDouble();

                   // continue; 왜 필요없는지 다음에
                }
                break;

            }


            result += 과목[i];
        }

        double avg =result / a;

        for(int i = 0; i <a; i++){
            System.out.print(과목종류[i] +":"+ 과목[i]+"점 ");
        }

        System.out.println("평균점수: "+ avg+"점");



    }
}
