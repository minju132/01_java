package com.ohgiraffers.order.service;

import com.ohgiraffers.order.dao.PhoneRepository;
import com.ohgiraffers.order.dto.PhoneDTO;

import java.util.ArrayList;

public class PhoneService {

    private final PhoneRepository phoneRepository = new PhoneRepository();

    // 서비스 계층
    // 비즈니스 로직 수행 및 데이터 베이스의 대한 리소스를 관리한다.
    public String order(PhoneDTO[] orders){
//        if(!orderDTO.getMenuName().equals("아메리카노")){
//            return "주문 실패";
//        }
//        for (OrderDTO orderDTO:orders) {
//            if(orderDTO.getPrice() <= 0){
//                return "땅파서 장사하냐?";
//            }
//        }

        String result = phoneRepository.order(orders);

        return result;
    }

    public ArrayList orderRead() {
        ArrayList menuList = phoneRepository.orderRead();

        return menuList;
    }

    public PhoneDTO orderDetail(int no) {

        PhoneDTO order = phoneRepository.orderDetail(no);
        return order;

    }

    public String orderDelete(int no) {
        String result = phoneRepository.orderDelete(no);
        return result;
    }
    public String ordermodify(int num,int num2,String data)
    {
        return phoneRepository.orderModify(num,num2,data);
        //sel 수정할 번호, num 수정할 세부사항, input2 덮어쓸 정보? = 수정할 번호
    }

}
