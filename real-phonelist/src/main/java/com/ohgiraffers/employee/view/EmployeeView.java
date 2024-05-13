package com.ohgiraffers.employee.view;

import com.ohgiraffers.employee.dto.EmployeeDTO;
import com.ohgiraffers.employee.service.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeView {
    private static boolean state = true;
    private static EmployeeService employeeService = new EmployeeService();

    public static void run(){
        program :
        while (state){
            System.out.println("1. 전화번호부 전체보기");
            System.out.println("2. 전화번호 이름으로 조회하기 ");
            System.out.println("3. 전화번호 정보 등록하기");
            System.out.println("4. 전화번호 정보 수정하기");
            System.out.println("5. 프로그램 종료하기");
            System.out.println("실행할 번호를 입력해주세요 : ");
            Scanner sc = new Scanner(System.in);
            int index = Integer.parseInt(sc.nextLine());

            switch (index){
                case 1 :
                    employeeViewAll();
                    break;
                case 2 :
                    employeFindByName();
                    break;
                case 3:
                    empInsert();
                    break;
                case 4:
                    empUpdate();
                    break;
                case 5 :
                    break program;
            }
//            System.out.print("종료를 하시겠습니까? 말해 (yes Or no) 오타x 소문자만 : ");
//           String result = sc.nextLine();

//            if(result.equals("yes")){
//                state = false;
//                sc.close();
//            }
        }

    }

    // 현재 html의 화면을 암시하고 만든 것이다.
    // view는 사용자에게 데이터를 입력받고 서버에 전달하며, 결과를 사용자에게 보여주기 위한 용도로 사용된다.
    public static void employeeViewAll() {
        System.out.println("전화번호부 정보 전체 조회");

        try {
            ArrayList emps =employeeService.employeeViewAll();
            System.out.println(emps);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void employeFindByName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 전화번호의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        EmployeeDTO emp = null;

        try {
            emp = employeeService.employeeFindByName(name);
            System.out.println(emp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void empInsert(){
        Scanner sc = new Scanner(System.in);
        EmployeeDTO emp = new EmployeeDTO();

        System.out.println("등록할 전화번호의 정보를 입력해주세요 ");
        System.out.print("전화번호의 이름를 입력해주세요 : ");
        emp.setUser_name(sc.nextLine());
        System.out.print("전화번호 주인의 주소를 입력해주세요 : ");
        emp.setUser_address(sc.nextLine());
        System.out.print("전화번호의 이름을 입력해주세요 예) (핸드폰, 집, 직장) : ");
        emp.setCall_name(sc.nextLine());
        System.out.print("전화번호을 입력해주세요 : ");
        emp.setCall_number(sc.nextLine());
        System.out.print("전화번호가 대표번호인지 y 나 n 으로만 입력해주세요 : ");
        emp.setMain_call(sc.nextLine());

        try {
            String result = employeeService.empInsert(emp);
            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        sc.nextLine();
    }


    public static void empUpdate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("변경할 전화번호의 이름을 입력해주세요");
        String index = sc.nextLine();
        EmployeeDTO emp = employeeService.empFindById(index);

        if(emp == null){
            System.out.println("변경할 사원이 존재하지 않습니다.");
            return;
        }
        System.out.println(emp);
        System.out.println("변경할 이름을 입력해주세요");
        String name = sc.nextLine();
        try {
            EmployeeDTO modifyEmp = employeeService.empModify(name,index);
            System.out.println(modifyEmp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}