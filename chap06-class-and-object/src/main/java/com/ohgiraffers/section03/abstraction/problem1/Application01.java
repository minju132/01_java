package com.ohgiraffers.section03.abstraction.problem1;

public class Application01 {

    public static void main(String[] args){
        Car car = new Car();
        Car car1 = new Car();

        Car_racer carRacer = new Car_racer();

        carRacer.startUp(car);
        carRacer.go(car1);
        carRacer.stop(car1);
        carRacer.turnOff(car1);

        car.go();   // 차가 혼자 그냥 출발가능한 문제

    }
}
