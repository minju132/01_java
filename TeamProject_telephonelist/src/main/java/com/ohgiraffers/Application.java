package com.ohgiraffers;

import com.ohgiraffers.order.controller.PhoneController;
import com.ohgiraffers.order.dto.PhoneDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        PhoneController phoneController = new PhoneController();
        String result = "";
        // 왜 실행하면 쓸데없이 엔터 한번 더 눌러야 됨?
        program:
        while(true){
            System.out.println("1. 번호 등록");
            System.out.println("2. 번호 삭제");
            System.out.println("3. 번호 수정");
            System.out.println("4. 번호 상세조회");
            System.out.println("5. 번호 전체조회");
            System.out.println("6. 프로그램 종료");
            System.out.print("어떤 메뉴를 동작하시겠나요? ");
            int input = sc.nextInt();
            sc.nextLine();

            switch (input){
                case 1 : // 번호 등록
                    System.out.print("몇 개의 번호를 등록하시겠나요? : ");
                    int cnt = sc.nextInt();
                    sc.nextLine();
                    PhoneDTO[] orders = new PhoneDTO[cnt];
                    for (int i = 0; i < orders.length; i++) {
                        System.out.println("등록할 번호의 이름을 입력해주세요 : ");
                        String name = sc.nextLine();
                        if(name.equals("")){
                            System.out.println("이름을 다시 입력해주세요");
                            i--;
                            continue;
                        }
                        System.out.println("등록할 번호를 입력해주세요 :");
                        String phoneNum = sc.nextLine();
                        if(phoneNum.equals("")){
                            System.out.println("전화번호를 다시 입력해주세요");
                            i--;
                            continue;
                        }
                        System.out.println("등록할 번호 주인의 주소를 입력해주세요 : ");
                        String adress = sc.nextLine();
                        if(adress.equals("")){
                            System.out.println("주소를 다시 입력해주세요");
                            i--;
                            continue;
                        }
                        orders[i] = new PhoneDTO(name, phoneNum, adress);
                    }
                    result = phoneController.order(orders);
                    break;

                case 2 : // 번호 삭제
                    System.out.println("삭제할 번호 입력해주세요");
                    int no = Integer.parseInt(sc.nextLine());
                    result = no + "번 ";
                    result += phoneController.orderDelete(no);
                    break;


                case 3 : // 번호 수정
                    System.out.println("수정 하실 번호를 입력해주세여.");
                    int num1 = sc.nextInt();
                    System.out.println(PhoneController.orderModify(num1));
                    break;

                case 4 : // 번호 상세조회
                    System.out.println(phoneController.orderRead());
                    System.out.println("상세 조회할 번호을 입력해주세요");
                    int num = sc.nextInt();
                    sc.nextLine();
                    result = phoneController.orderDetail(num);
                    break;

                case 5 :// 번호 전체조회
                    result = phoneController.orderRead();
                    break;

                case 6 :
                    System.out.println("프로그램을 종료하겠습니다.");
                    break program;

                default:
                    System.out.println("입력이 잘못되었습니다.");
                    break;
            }

            System.out.println(result);     //result 경로 : controller -> service -> repository

//            System.out.print("주문을 종료하시겠나요?");
//            order = sc.nextBoolean();
        }
    }
}
