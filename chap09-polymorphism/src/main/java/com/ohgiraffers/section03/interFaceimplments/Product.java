package com.ohgiraffers.section03.interFaceimplments;

public class Product extends Object implements Interproduct{
    /*
    * 클래스에서 인터페이스를 상속받을 때에는 implements 키워드를 사용한다.
    * 또한 인터페이스는 여러 개를 상속받을 수 있으며,
    * extends로 다른
     */
    @Override
    public void nonStaticMethod() {
        System.out.println("interProduct 클래스의 nonstaticMethod 오버라이딩한 메서드 호출됨");
    }

    @Override
    public void abMethod() {
        System.out.println("interProduct 클래스의 absMethod 오버라이딩한 메서드 호출됨");
    }
//    @Override
//    public void staticMethod(){

// @Override static 메서드 또한 프로그램이 로드될때 메모리에 할당되기 때문에 재정의가 불가능하다.
//        public static void staticMethod(){
//            System.out.println("interProduct 클래스의 staticMethod 호출됨");
//        }
// @Override 재정의가 불가능하다, 오직 인터페이스에서만 가능함
//        public default void defaultMethod(){
//            System.out.println("interProduct 클래스의 defaultMethod 호출됨");
//        }
//    }

}
