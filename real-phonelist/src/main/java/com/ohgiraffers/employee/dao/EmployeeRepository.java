package com.ohgiraffers.employee.dao;

import com.ohgiraffers.employee.dto.EmployeeDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import static com.ohgiraffers.common.JDBCTemplate.*;
/*
 * repository란?
 * 데이터를 등록하고 수정하고 삭제하고 조회하는 등의
 * 데이터베이스와 연결되어 동작하는 로직을 수행하는 계층이다.
 * */
public class EmployeeRepository {

    private Properties pros =new Properties();
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private PreparedStatement pstmt2 = null;
    private ResultSet rset = null;

    public EmployeeRepository() {
        try {
            this.pros.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/employee/mapper/employee-query.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList employeeViewAll(){
        ArrayList arrayList = new ArrayList();
        String query = pros.getProperty("employeeAll");
        con = getConnection();
        try {
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery();
            while (rset.next()){
                EmployeeDTO emp = new EmployeeDTO();
                emp.setUser_no(rset.getInt("user_no"));
                emp.setUser_name(rset.getString("user_name"));
                emp.setUser_address(rset.getString("user_address"));
                emp.setCall_name(rset.getString("call_name"));
                emp.setCall_number(rset.getString("call_number"));
                emp.setMain_call(rset.getString("main_call"));
                arrayList.add(emp);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(rset);
            close(pstmt);
            close(con);
        }

        return arrayList;
    }

    public EmployeeDTO employeeFindByName(String name) {
        String query = pros.getProperty("employeeFindByName");
        con = getConnection();
        EmployeeDTO emp = new EmployeeDTO();

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, name);
            rset = pstmt.executeQuery();
            if(rset.next()){
                emp.setUser_no(rset.getInt("user_no"));
                emp.setUser_name(rset.getString("user_name"));
                emp.setUser_address(rset.getString("user_address"));
                emp.setCall_name(rset.getString("call_name"));
                emp.setCall_number(rset.getString("call_number"));
                emp.setMain_call(rset.getString("main_call"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(rset);
            close(pstmt);
            close(con);
        }

        return emp;
    }

    public EmployeeDTO empFindById(String index){
        String query = pros.getProperty("employeeFindByName");
        con = getConnection();
        EmployeeDTO emp = null;

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, index);
            rset = pstmt.executeQuery();
            if(rset.next()){
                emp = new EmployeeDTO();
                emp.setUser_no(rset.getInt("user_no"));
                emp.setUser_name(rset.getString("user_name"));
                emp.setUser_address(rset.getString("user_address"));
                emp.setCall_name(rset.getString("call_name"));
                emp.setCall_number(rset.getString("call_number"));
                emp.setMain_call(rset.getString("main_call"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(con);
            close(pstmt);
            close(rset);
        }

        return emp;
    }

    public int empInsert(EmployeeDTO emp) {
        String query = pros.getProperty("empInsert");
        String query2 = pros.getProperty("numInsert");
        con = getConnection();
        int result = 0;
        int result1 = 0;

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1,emp.getUser_name());
            pstmt.setString(2,emp.getUser_address());

            result = pstmt.executeUpdate();

            pstmt2 = con.prepareStatement(query2);
            pstmt2.setString(1,emp.getCall_name());
            pstmt2.setString(2,emp.getCall_number());
            pstmt2.setString(3,emp.getMain_call());
            result1 = pstmt2.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(con);
            close(pstmt);
            close(pstmt2);
        }

        return result + result1;
    }

    public int empModify(String name, String index) {
        // 쿼리불러오기
        String query = pros.getProperty("empModify");
        con = getConnection();
        int result = 0;
        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setString(2, index);
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(con);
            close(pstmt);
        }

        return result;

    }
}