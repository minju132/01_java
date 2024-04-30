package main.java.com.ohgiraffers.section01.method;

public class Application04 {

    public static void main(String[] args){

        int first = 100;
        int second = 50;

        Calculator cal = new Calculator();
        int min = cal.minNumberOf(first,second);
        System.out.println(min);

        int max = Calculator.maxNumberOf(first,second);
        System.out.println(max);

    }
}
