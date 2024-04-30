package com.ohgiraffers.section03.copy;

public class Application01 {

    public static void main(String[] args){
        // 얕은 복사는 주소값을 공유한다
        String[] goldSideName = {"김재석","송재희","황정한"};
        String[] named = goldSideName;
        System.out.println(named);
        System.out.println(goldSideName);
        goldSideName[0] = "김효주";
        System.out.println(named[0]);
        System.out.println(goldSideName[0]);
        System.out.println("----깊은 복사----");
        // for each
        int i = 0;
        for(String name : goldSideName){
            named[i] = name;
            i++;
        }
        goldSideName[0] = "이상우";
        for(String name : named){
            System.out.println(named);

        }
    }
}
