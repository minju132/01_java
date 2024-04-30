package com.ohgiraffers.fakeDB;

import com.ohgiraffers.order.dto.PhoneDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneDB {

    private final ArrayList orders;
    private static PhoneDB phoneDB = new PhoneDB();

    private PhoneDB(){
       orders = new ArrayList();
       PhoneDTO phoneDTO = new PhoneDTO("이름", "번호", "주소");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
       orders.add(phoneDTO);
    }

    public static PhoneDB getInstance(){
        return phoneDB;
    }

    public void setItem(PhoneDTO phoneDTO){
        orders.add(phoneDTO);
    }

    public ArrayList getOrders(){
        return orders;
    }

}
