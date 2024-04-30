package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application01 {
    public static void main(String[] args){

        // Animal 클래스는 Rabbit의 조상 타입으로 타입이 맞지 않음.
        // RabbitFarm<animal> farm1 = new RabbitFarm<animal>();

        // Mammal 클래스는 Rabbit의 부모 타입으로 타입이 맞지 않음.
        // RabbitFarm<Mammal> farm2 = new RabbitFarm<Mammal>();

        // Snake 클래스는 Rabbit과 관련이 없는 타입으로 타입이 맞지 않는다.
        // RabbitFarm<Snake> farm3 = new RabbitFarm<Snake>();

        // Rabbit은 Rabbit 과 같은 타입으로 제네릭스 타입의 지정이 가능하다.
        RabbitFarm<Rabbit> farm1 = new RabbitFarm<>(new Rabbit());
        farm1.getAnimal().cry();

        // Bunny은 Rabbit 과 자식 타입으로 제네릭스 타입의 지정이 가능하다.
        RabbitFarm<Bunny> farm4 = new RabbitFarm<>(new Bunny());
        farm4.getAnimal().cry();
        // DrunkenBunny은 Rabbit 과 증손 타입으로 제네릭스 타입의 지정이 가능하다.
        RabbitFarm<DrunkenBunny> farm5 = new RabbitFarm<>(new DrunkenBunny());
        farm5.getAnimal().cry();
    }
}
