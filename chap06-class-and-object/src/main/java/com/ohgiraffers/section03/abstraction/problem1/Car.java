package com.ohgiraffers.section03.abstraction.problem1;

public class Car {

    private boolean isOn;
    private int speed;

    public void startUp(){

        if(isOn){
            System.out.println("이미 시동이 걸려 있습니다.");
        }else{
            this.isOn = true;
            System.out.println("시동이 걸렸습니다.");
        }
    }
    public void turnOff(){
        if(this.isOn){
            if(this.speed > 0) {
                System.out.println("차를 멈추고 다시 시도해주세요.");
            }else{
                this.isOn = false;
                System.out.println("시동이 꺼졌습니다.");
            }
        }else{
            System.out.println("이미 시동이 꺼져 있습니다.");
        }
    }
    public  void go(){
        if(this.isOn){
            this.speed +=10;
            System.out.println("현재 차의 시속은" + this.speed + "Km/h 입니다.");
        }else{
            System.out.println("시동을 걸어주세요.");
        }
    }
    public void stop(){
        if(this.isOn){
            if(this.speed > 0) {
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다.");
            }else{
                System.out.println("차가 멈춰있는 상태입니다.");

            }
        }else{
            System.out.println("시동이 걸려있지 않습니다.");
        }

    }

}
