package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args){
            A_if aIf = new A_if();
            aIf.testSimpleIfStatement();
            int x =0;
            System.out.println("result"+10*x++ + x);
        }


        /*
         * 계산기 만들기
         * 두 수와 연산기호를 입력받아
         * 연산기호에 맞는 연산을 수행하는 프로그램을 만들어주세요
         * */
        // 1. calculator 메서드를 만든다.
        public double calculator(){
            // 입력 받을 수 있는 기능을 추가한다.
            Scanner sc = new Scanner(System.in);
            // 2. 첫번재 수를 입력받는다.
            int first = sc.nextInt();
            // 3. 두번째 수를 입력받는다.
            int second = sc.nextInt();
            // 3. 연산 기호를 입력받는다.
            char operator = sc.nextLine().charAt(0);
            // 4. 연산 기호를 확인힌다.

            double result;
            if(operator == '+'){
                result = first + second;
            }else if (operator == '-'){
                result = first - second;
            } else if (operator == '*') {
                result = first * second;
            } else if (operator == '/') {
                result = first/second;
            }

            return 0.0;

        }
        // 5. 연산을 진행한다.
        // 6. 반환한다.


        //한번에 연산식 입력받기
        //
        public String call(){
            Scanner sc  = new Scanner(System.in);
            String input = sc.nextLine();
            String[] target = input.split(" ");
            int result = 0;

            if(target[1].equals("+")){
                result = Integer.parseInt(target[0]) + Integer.parseInt(target[2]);
            }
            String a = "1";
            String b = "1";
            return ""+result;
        }


    }