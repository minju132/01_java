package com.ohgiraffers.section03.abstraction.problem2;

public class Application01 {
    public static void main(String[] args){
        Car car = new Car();
        Car_racer carRacer = new Car_racer();
        carRacer.setName("이상우");
        // 자동차에 시동을 건다.
        car.setOn(true);
        if(car.isOn()){
            System.out.println("시동이 걸렸습니다.");
            System.out.println("자동차가 출발합니다.");
            // 자동차를 출발한다고 가정함, 원래 스캔으로 물어보고 명령해야 출발함
            carRacer.setOn(true);
            if(carRacer.isOn()){
                car.setSpeed(10);
            }
            System.out.println("자동차의 현재 속도" + car.getSpeed() + "Km/h");

            if(car.getSpeed() == 0){
                System.out.println("자동차의 시동을 끕니다.");
                car.setOn(false);
            }else{
                System.out.println("자동차가 정지하지 않은 상태 입니다.");
            }
            System.out.println("자동차를 멈추겠습니다.");
            car.setSpeed(0);
            System.out.println("자동차가 정지하였습니다.");
            System.out.println("시동을 끄겠습니다.");
            car.setOn(false);

        }

    }

}
