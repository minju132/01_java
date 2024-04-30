package com.ohgiraffers.order.dao;

import com.ohgiraffers.fakeDB.PhoneDB;
import com.ohgiraffers.order.dto.PhoneDTO;

import java.util.ArrayList;

public class PhoneRepository {
    private final PhoneDB phoneDB = PhoneDB.getInstance();

    public String order(PhoneDTO[] orders){
        //0
        int oldNum = phoneDB.getOrders().size();

        for (PhoneDTO phoneDTO : orders) {
            phoneDB.setItem(phoneDTO);
        }

        if(oldNum >= phoneDB.getOrders().size()){
            return "등록실패";
        }

        return "등록성공";
    }

    public ArrayList orderRead() {

        return phoneDB.getOrders();

    }

    public PhoneDTO orderDetail(int no) {

        PhoneDTO order = (PhoneDTO) phoneDB.getOrders().get(no);
        return order;
    }

    public String orderDelete(int no) {
        int oldSize = phoneDB.getOrders().size();
        phoneDB.getOrders().remove(no);
        if(phoneDB.getOrders().size() >= oldSize){
            return "번호 삭제에 실패하였습니다.";
        }
        return "번호가 삭제되었습니다.";

    }

    public String orderModify( int num,int num2,String data)
    {
        if (num < phoneDB.getOrders().size())
        {
            PhoneDTO order= (PhoneDTO) phoneDB.getOrders().get(num);
            switch (num2)
            {
                case 1:
                    order.setName(data); break;
                case 2:
                    order.setPhoneNum(data); break;
                case 3:
                    order.setAdress(data); break;
                default:
                    return "잘못된 입력입니다.";
            }
            return order +" 로 수정 되었습니다.";
        }
        else
            return "잘못된 입력입니다.";


    }
}
