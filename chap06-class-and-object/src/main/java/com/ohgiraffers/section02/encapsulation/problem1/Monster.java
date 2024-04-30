package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    String name;
    //int hp;

    private int hp; // Application01 안에서만 값을 건드릴 수 있도록 private를 쓴다


    //몬스터 hp가 0보다 큰 값만 입력될 수 있도록 하여 버그를 막고자함
    public void setHp(int hp){
        if(hp>0) {
            this.hp = hp; // this.는 class 전체 안에 걸 불러오는거, this.hp는 전역 변수, hp는 지역 변수


        }else{
            System.out.println("몬스터의 체력은 0보다 작을 수 없습니다.");
        }
    }
    public int getHp(){ // hp를 보여주기만 할 수 있도록 게터를 사용한다
        return this.hp;

    }
}
