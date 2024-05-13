package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section01.exception.ExceptionTest;
import com.ohgiraffers.section02.userexception.exception.MoneyNagativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application01 {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(-100, 200);
            try {
                et.checkEnoughMoney(100, -200);
            } catch (MoneyNagativeException e) {
                System.out.println("너 돈 없어, 정신 챼려~~~~~");
            }
        } catch (Exception e) {
            System.out.println("상품 가격을 양수로 다시 입력해주세요.");  // 보통 이렇게 예외처리를 하지 않는다
        }
        try {
            et.checkEnoughMoney(-100, 200);
        } catch (PriceNegativeException e) {
            System.out.println("제품 가격이 음수야");
        }catch (MoneyNagativeException e){
            System.out.println("가진 돈이 음수야");
        }catch(NotEnoughMoneyException e){
            System.out.println("제품이 가진 돈 보다 비싸"); // Exception으로 상속 받으면 모든 예외를 써주고 Exception도 catch 해야함
        }catch (Exception e){
            System.out.println("모든 에러");
        }
        try {
            et.checkEnoughMoney(-100,200);
            et.checkEnoughMoney(100,-200);
            et.checkEnoughMoney(1000,200);
        } catch (PriceNegativeException e) {
            System.out.println("제품 가격이 음수네요");
        } catch (MoneyNagativeException e) {
            System.out.println("가진 돈이 음수네요");
        } catch (NotEnoughMoneyException e) {
            System.out.println("제품이 가진 돈 보다 비싸네요.");    // try에서 예외가 한 번 발생하면 그 밑은 실행하지 않고 catch로 감
        }catch (Exception e){
            System.out.println("Exception은 모든 예외의 최상위 타입이라 catch 중 맨 위에 쓰면 아래는 필요없어서 오류남");
        }
        System.out.println("쇼핑 종료");


    }
}