package com.ohgiraffers.section03.branching;

public class A_break {
    /*
    * break문 실행 흐름을 확인하기 위한 용도의 기능을 제공 분기문(break) 기본 흐름에 대해 확인
     */
    public void testSimpleBreakStatement(){
        int i = 2;
        test:
        while(true){
            if (i>=10) {
                break;
            }
            int x = 0;
            while (x<=9){
                if(x>=10){
                    break test; //라벨 브레이크
                }
                if(x>=5){
                    break;
                }
                if(x==0){
                    x++;
                    continue; //밑에는 실행하지않고 다시 바로 위에 while 문으로 돌아가기
                }
                System.out.println(i+"*"+ x +"="+ i*x);
                x++;
            }
            i++;
        }
    }
}
