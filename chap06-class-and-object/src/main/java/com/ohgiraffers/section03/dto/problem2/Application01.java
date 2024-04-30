package com.ohgiraffers.section03.dto.problem2;

public class Application01 {
    public static void main(String[] args){
        MemberDTO song = new MemberDTO();
        song.setAge(20);
        song.setAddress("인사동");
        song.setGender('여');
        song.setPhone("010-2323-2323");
        song.setName("송재희");

        MemberDTO kim = new MemberDTO();
        kim.setAge(19);
        kim.setAddress("고전동");
        kim.setGender('남');
        //kim.setPhone("010-2323-2323");    //DTO를 사용하면 입력받고 싶은 정보만 받아서 줄 수 있다
        kim.setName("김재석");

        MemberRepository memberRepository = new MemberRepository();
        memberRepository.addMember(song);
        memberRepository.addMember(kim);
        memberRepository.print();

    }
}
