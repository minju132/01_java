package com.ohgiraffers.section04.dto;

import java.util.Date;

public class UserDTO {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date encollDate;

    //접근제어자 클래스명 (){}
    public UserDTO(){}

    public UserDTO(String id, String pwd, String name, java.util.Date encollDate){
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.encollDate = encollDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEncollDate() {
        return encollDate;
    }

    public void setEncollDate(Date encollDate) {
        this.encollDate = encollDate;
    }

    //@Override//어노테이션



}
