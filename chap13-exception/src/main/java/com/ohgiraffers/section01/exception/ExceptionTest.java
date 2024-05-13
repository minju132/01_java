package com.ohgiraffers.section01.exception;

import com.ohgiraffers.section02.userexception.exception.MoneyNagativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {

//    public void checkEnoughMoney(int price, int money) throws Exception {
//        System.out.println("가지고 계신 돈은 " + money + "원 입니다.");
//
//        if (money >= price){
//            System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
//        }else {
//            // 예외를 강제로 발생시킴
//            throw new Exception();
//        }
//        System.out.println("즐 쇼~~~~~~");
//    }
    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNagativeException, NotEnoughMoneyException{

        if (price < 0){
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");

        }
        if (money < 0){
            throw new MoneyNagativeException("가지고 있는 돈은 음수일 수 없습니다.");

        }
        if (money < price){
            throw new NotEnoughMoneyException("가진 돈 보다 상품 가격이 더 비쌉니다.");
        }
        System.out.println("즐 쇼~~~~~");
    }

}
