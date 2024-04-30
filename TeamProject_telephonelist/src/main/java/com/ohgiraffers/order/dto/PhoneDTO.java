package com.ohgiraffers.order.dto;

public class PhoneDTO {
    private String name;
    private String phoneNum;
    private String adress;

    public PhoneDTO(String name, String phoneNum, String adress) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.adress = adress;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum){this.phoneNum = phoneNum;}

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "name='" + name + '\'' +
                ", phoneNum=" + phoneNum +
                ", adress=" + adress +
                '}';
    }


}
