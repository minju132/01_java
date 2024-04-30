package com.ohgiraffers.section03;

public class SubClass extends SuperClass{
//    아래의 메서드들는 자식이 접근할 수 없는 메서드들로 재정의가 불가능하다.
//    private void privateMethod(){}
//    private final void finalMethod(){}

    @Override
    public void method(int num) {
        super.method(num);
    }
//    @Override     부모보다 접근범위를 좁게 만들 수 없다.
//    protected void method(int num) {
//        super.method(num);
//    }
//    @Override     메서드의 시그니처가 다른 경우 오버라이딩 불가능
//    public void method(int num, int num2) {
//        super.method(num);
//    }
//    @Override     반환 타입이 다른 경우 오버라이딩 불가능
//    public String method(int num) {
//        return "";
//    }

//    @Override     부모보다 더 넓은 범위의 예외를 처리할 수 없음
//    public void exceptionMethod() throws Exception {
//        super.exceptionMethod();
//    }

    @Override     //runtimeException의 자식클래스로 예외의 범위가 더욱 좁아서 가능하다.
    public void exceptionMethod() throws NullPointerException {
        super.exceptionMethod();
    }

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
    }
}
