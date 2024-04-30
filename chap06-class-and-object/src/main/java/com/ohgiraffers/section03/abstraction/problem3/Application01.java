package com.ohgiraffers.section03.abstraction.problem3;


public class Application01 {

    public static void main(String[] args){
        Car ram = new Car();
        ram.setName("람보르기니");
        Car po = new Car();
        po.setName("포르쉐");

        Car_racer lee = new Car_racer();
        lee.setCar(ram);
        lee.myCarInfo();

        lee.startUp();
        lee.go();
        lee.stop();
        lee.turnOff();


    }
}
