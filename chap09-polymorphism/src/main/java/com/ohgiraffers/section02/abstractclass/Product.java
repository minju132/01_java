package com.ohgiraffers.section01.section02.abstractclass;

public abstract class Product {

    private int nonStaticField;

    private static int staticField;

    public Product(){

    }
    public void nonStaticMethod(){
        System.out.println("Product 클래스의 nonStaticMethod 호출함");
    }
    public static void StaticMethod(){
        System.out.println("Product 클래스의 StaticMethod 호출함");
    }
    public abstract void absMethod();   //추상 클래스로 만들어야 인스턴스 사용가능

}
