package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section01.exception.ExceptionTest;
import com.ohgiraffers.section02.userexception.exception.MoneyNagativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ExceptionTest et = new ExceptionTest();
        try {
            System.out.println("제품 가격을 입력해주세요.");
            int price = sc.nextInt();
            System.out.println("가진 돈을 입력해주세요.");
            int money = sc.nextInt();
            et.checkEnoughMoney(price, money);
        } catch (PriceNegativeException e) {
            System.out.println("PriceNegativeException이 실행됨");
        }catch (MoneyNagativeException e){
            System.out.println("MoneyNagativeException이 실행됨");
        }catch(NotEnoughMoneyException e){
            System.out.println("NotEnoughMoneyException이 실행됨");
        }finally {  // finally 블럭은 오류가 있던 없던 항상 실행하는 블럭이다.

            sc.close();
            System.out.println("오류가 나던 말던 내 갈 길 간다.");
        }
        //sc.nextInt(); // sc.close();로 입력을 닫아서 오류남

        try (Scanner sc2 = new Scanner(System.in)){ // Scanner 확장 문법 try()에 변수를 설정하면 항상 try가 끝날때 close를 해줌
            System.out.println("제품 가격을 입력해주세요.");
            int price = sc2.nextInt();
            System.out.println("가진 돈을 입력해주세요.");
            int money = sc2.nextInt();
            et.checkEnoughMoney(price, money);
        } catch (PriceNegativeException e) {
            System.out.println("PriceNegativeException이 실행됨");
        }catch (MoneyNagativeException e){
            System.out.println("MoneyNagativeException이 실행됨");
        }catch(NotEnoughMoneyException e){
            System.out.println("NotEnoughMoneyException이 실행됨");
        }finally {
            System.out.println("오류가 나던 말던 내 갈 길 간다.");
        }
    }
}
