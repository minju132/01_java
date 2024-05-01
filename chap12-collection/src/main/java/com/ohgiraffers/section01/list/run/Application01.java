package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application01 {

    public static void main(String[] args){

        // 배열은 length
        // list는 size
        ArrayList alist = new ArrayList();  // ArrayList는 역순 정렬을 제공하지 않음

        List list = new ArrayList();  //연속된 타입의 주소 정보의 묶음

        Collection clist = new ArrayList();

        alist.add("apple");
        alist.add(132);
        alist.add(13.142);
        alist.add(new Date());

        System.out.println(alist);

        // list의 길이를 확인할 때 이용할 때 size를 이용한다.
        System.out.println(alist.size());

        for (int i = 0; i < alist.size(); i++) {    //Arraylist 도출 방법
            System.out.println(alist.get(i));
        }
        System.out.println("변경테스트");
        String target = "사용자 입력";
        alist.add(0,target);    //Arraylist 변경방법
        System.out.println(alist.get(0));

        alist.remove(0);    //Arraylist 삭제방법
        System.out.println(alist.get(0));
        for (int i = 0; i < alist.size(); i++) {
            System.out.println(alist.get(i));
        }
        alist.set(0,"이것을 수정함");
        for (int i = 0; i < alist.size(); i++) {
            System.out.println(alist.get(i));
        }
        List<String> stringList = new ArrayList<>();    //generics를 String으로 정해서 문자열만 입력가능
        stringList.add("안녕");
        //stringList.add(10);
        stringList.add("10");
        System.out.println(stringList);

        stringList.add("apple");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("grape");
        System.out.println();
        System.out.println(stringList);

        Collections.sort(stringList);   //배열을 아스키코드로 바꿔서 오름차순대로 배열해서 원본 배열에 영향을 줌
        System.out.println(stringList);

        stringList = new LinkedList<>(stringList);
        /*
        * Iterator 란
        * Collection 인터페이스의 iterator() 메서드를 이용해서 인스턴스를 생성할 수 있다.
        * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용된다.
        * 반복자라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내오는 방식으로 사용하기 위함이다.
        * 인덱스로 관리된느 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
        * 인덱스를 사용하지 않고 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면 된다.
        * hasNext() : 다음 요소를 가지고 있는 경우 true, 더이상 요소가 없는 경우 false를 반환
        * next : 다음 차례 요소를 반환
         */
        Iterator<String> dIter =((LinkedList<String>) stringList).descendingIterator(); // 역순으로 정열됨

//        while (dIter.hasNext()){
//            System.out.println(dIter.next());
//        }
//        System.out.println(dIter.next());   // 한 번 쓴 정보가 사라져서 오류남
        System.out.println(dIter);

        List<String> descList = new ArrayList<>();
        while (dIter.hasNext()) {
            descList.add(dIter.next());
        }

        for (int i = 0; i < descList.size(); i++) {
            System.out.println(descList.get(i));

        }

    }
}
