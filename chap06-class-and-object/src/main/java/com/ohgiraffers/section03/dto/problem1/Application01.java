package com.ohgiraffers.section03.dto.problem1;

public class Application01 {

    public static void main(String[] args){

        String name = "송재희";
        char gender = '여';
        int age = 20;
        String phone = "010-2323-2323";
        String address = "인사동";

        MemberRepository memberRepository = new MemberRepository();
        memberRepository.addMember(name, gender, age, phone, address);  // 매게 변수의 갯수, 이름 맞춰서 입력해주기

        String name1 = "김재석";
        char gender1 = '남';
        int age1 = 19;
        String phone1 = "010-2323-2323";
        String address1 = "고잔동";
        memberRepository.addMember(name1, gender1, age1, phone1, address1);
        memberRepository.print();   // 출력하면 데이터 구분이 어렵고 가리고싶은 정보를 가릴 수 없음

    }
}
