package com.ohgiraffers.section01.section02.abstractclass;

public class Smartphone extends Product{


    @Override
    public void absMethod() {
        System.out.println("Product 클래스의 absMethod를 오버라이딩 한 메소드를 호출함.");
    }
    public void printSmartphone(){
        System.out.println("Product 클래스의 printSmartphone를 오버라이딩 한 메소드를 호출함.");
    }

}
