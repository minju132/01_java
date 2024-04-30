package com.ohgiraffers.section03.dto.problem1;

import java.util.ArrayList;

public class MemberRepository {

    ArrayList data = new ArrayList();   //배열의 길이를 동적으로 갖고있는 자료형

    public void addMember(String name, char gender, int age, String phone, String address){
        data.add(name);
        data.add(gender);
        data.add(age);
        data.add(address);
        data.add(phone);

    }

    public void print(){
        System.out.println(this.data);

    }

}
