package com.ohgiraffers.section04.uses;

public class FireCar extends Car implements Soundable{
    @Override
    public void go() {
        System.out.println("소방차가 출발합니다.");
    }
    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다.");
    }
    @Override
    public void horn(){
        System.out.println("소방차가 나갑니다, 길을 비키세요.");
    }
}
