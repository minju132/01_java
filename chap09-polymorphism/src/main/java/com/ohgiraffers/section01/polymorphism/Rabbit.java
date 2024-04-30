package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal {

    @Override
    public void eat() {
        System.out.println("토끼가 풀을 뜯어 먹고 있습니다.");
    }

    @Override
    public void run() {
        System.out.println("토끼가 뛰어갑니다~~.");
    }

    @Override
    public void cry() {
        System.out.println("토끼는 울음소리가 없습니다.");
    }
    public void jump(){
        System.out.println("토끼가 점프합니다.");
    }
}
