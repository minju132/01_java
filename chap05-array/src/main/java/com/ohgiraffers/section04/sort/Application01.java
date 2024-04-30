package com.ohgiraffers.section04.sort;

import java.util.Arrays;

public class Application01 {
    public static void main(String []args){
        int[] num = {20,10};

        int temp = num[0];
        num[0] = num[1];
        num[1] = temp;
        System.out.println(temp);

        int[] arr = {2,1,3};
        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("정렬 후");
        Arrays.sort(arr);
        for(int x : arr){
            System.out.print(x+" ");
        }


    }
}
