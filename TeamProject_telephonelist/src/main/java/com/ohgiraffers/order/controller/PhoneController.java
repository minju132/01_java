package com.ohgiraffers.order.controller;

import com.ohgiraffers.order.dto.PhoneDTO;
import com.ohgiraffers.order.service.PhoneService;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneController {

    private static final PhoneService phoneService = new PhoneService();

    public String order(PhoneDTO[] orders){
        // 컨트롤러 계층에서는 각 기능을 수행하기 위한 필수값의 누락이 있는지 검사한다.
        for (PhoneDTO phoneDTO : orders) {
//            if(orderDTO.getMenuName().equals("")){
//                return "메뉴를 정해주세요";
//            }
//            if(orderDTO.getQuantity() <= 0){
//                return "수량을 입력해주세요";
//            }
        }


        // service 로직으로 넘김
        String result = phoneService.order(orders);
        return result;
    }

    public static String orderModify(int sel){
        Scanner sc = new Scanner(System.in);
        if(sel < 0)
            return "번호를 다시 입력해주세요.";
        int num=0;
        System.out.println("수정을 원하시는 정보를 입력 해주세요. \nex) 이름, 전화번호, 주소");
        String input = sc.nextLine();
        if(input.equals("이름"))
            num=1;
        else if(input.equals("전화번호"))
            num=2;
        else if(input.equals("주소"))
            num=3;
        else
            return "글자를 확인하여 다시 쳐주세요.";
        System.out.println("덮어쓸 정보를 입력해주세요.");
        String input2 = sc.nextLine();

        return phoneService.ordermodify(sel,num,input2);
        //sel 수정할 번호, num 수정할 세부사항, input2 덮어쓸 정보? = 수정할 번호
    }

    public  String orderDelete(int no){
        String result = phoneService.orderDelete(no);

        return result;
    }

    public String orderRead(){
        ArrayList orderList = phoneService.orderRead();
        String result = "주문 목록 : " + orderList.toString();
        return result;
    }

    public String orderDetail(int no){
        if(no < 0){
            return "메뉴 번호를 잘못 입력하였습니다.";
        }
        PhoneDTO phoneDTO = phoneService.orderDetail(no);
        if(phoneDTO == null){
            return "존재하지 않는 주문입니다.";
        }

        return phoneDTO.toString();
    }
}
















