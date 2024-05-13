package com.ohgiraffers.employee.dto;

import java.util.Date;

public class EmployeeDTO {
    private int user_no;
    private String user_name;
    private String user_address;
    private String call_name;
    private String call_number;
    private String main_call;

    public EmployeeDTO() {
    }

    public EmployeeDTO(int user_no, String user_name, String user_address, String call_name, String call_number, String main_call) {
        this.user_no = user_no;
        this.user_name = user_name;
        this.user_address = user_address;
        this.call_name = call_name;
        this.call_number = call_number;
        this.main_call = main_call;
    }

    public int getUser_no() {
        return user_no;
    }

    public void setUser_no(int user_no) {
        this.user_no = user_no;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getCall_name() {
        return call_name;
    }

    public void setCall_name(String call_name) {
        this.call_name = call_name;
    }

    public String getCall_number() {
        return call_number;
    }

    public void setCall_number(String call_number) {
        this.call_number = call_number;
    }

    public String getMain_call() {
        return main_call;
    }

    public void setMain_call(String main_call) {
        this.main_call = main_call;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "user_no=" + user_no +
                ", user_name='" + user_name + '\'' +
                ", user_address='" + user_address + '\'' +
                ", call_name='" + call_name + '\'' +
                ", call_number='" + call_number + '\'' +
                ", main_call='" + main_call + '\'' +
                '}'+ "\n";
    }
}