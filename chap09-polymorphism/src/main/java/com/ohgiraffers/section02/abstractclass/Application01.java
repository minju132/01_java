package com.ohgiraffers.section01.section02.abstractclass;

public class Application01 {

    public static void main(String[] args){

        /*
        * 추상 클래스와 추상 메서드
        * 추상메서드를 0개 이상 포함하는 클래스를 추상클래스라고한다.
        * 추상클래스는 인스턴스를 생성할 수 없다.
        * 추상클래스를 사용하려면 추상클래스를 상속받은 하위 클래스를 이용해서 인스턴스를 생성해야 한다.
        * 이때 추상클래스는 상위 타입으로 사용될 수 있으며, 다형성을 이용할 수 있다.
        *
        * 추상클래스에 작성한 추상메서드는 반드시 후손이 오버라이딩 해서 작성해야 하며,
        * 후손클래스의 메서드들의 공통 인터페이스로의 역할을 수행할 수 있다.
        * 추상클래스에 작성한 메서드를 호출하게 되면 실제 후손 타입의 인스턴스가 가지는 메서드는
        * 다형성이 적용되어 동적바인딩에 의해 다양한 응답을 할 수 있게 된다.
        *
        * 추상클래스를 상속받아 수현할 때는 extends 키워드를 사용하며
        * 자바에서는 extends 로 클래스를 상속받을 시 하나의 부모클래스로만 가질 수 있다.
         */

    //        Product pro = new Product();  추상 클래스는 인스턴스 생성 불가
        Smartphone smartphone = new Smartphone();
        smartphone.printSmartphone();
        smartphone.absMethod();

        Product product2 = new Product() {
            @Override
            public void absMethod() {

            }
        };
        Product product = new Smartphone();
        product.absMethod();
        product.nonStaticMethod();


    }
}
