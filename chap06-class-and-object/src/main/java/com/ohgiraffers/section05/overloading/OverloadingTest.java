package com.ohgiraffers.section05.overloading;

public class OverloadingTest {
    /*
    * 오버로딩이란?
    * 오버로딩은 동일한 이름을 가진 메서드를 생성하는 것을 의미한다.
    * 여기서 동일한 메서드는 생성이 불가능한데 이때 메서드의 시그니처 부분을 다르게하면
    * 생성이 가능하게 된다. 우리가 가장 많이 사용했던 오버로딩 메서드는 System.out.println이다.
    *
    * 오버로딩의 사용 이유
    * 매개변수의 종류별로 메소드 내용을 다르게 작성해야 하는 경우들이 종종있다.
    * 이때 동일한 기능의 메소드를 매개변수에 따라 다르게 이름을 정의하면 복잡하고
    * 관리하기가 매우 어려울 것이다.
    * 따라서 동일한 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 여러 메솓를 동일한 이름을 관리하기 위해
    * 사용하는 기술을 오버로딩이라고 한다.
    * */
    public void test(){}
//    public void test(){}  시그니처 부분이 같아서 반환 값의 존재와 상관없이 오류가 발생함
//    private void test(){}  내부에서 구분을 할 수 없어서 메서드 부분이 달라도 오류남
    public void test(int age){} //입력했을때 받는 조건이 다르면 구별이 가능하여 오류가 안남
    public void test(String name){}
    public void test(int age, String name){}
}
