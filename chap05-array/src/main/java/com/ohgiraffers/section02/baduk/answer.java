package com.ohgiraffers.section02.baduk;

import java.util.Scanner;

public class answer {

    public static void main(String[] args){

        String[][] board = new String[19][19];

        for (int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] ="[ ]";
                System.out.print(board[i][j]);  // 바둑칸을 [ ]으로 출력하기
            }
            System.out.println();   // 한 열 쓸때마다 줄 바꿔주기
        }
        String play = "";
        Scanner scanner = new Scanner(System.in);
        int[] index = new int[2];
        int turn =0;
        while (!play.equals("exit")){
            System.out.print("첫 번째 좌표를 입력해주세요 : ");
            index[0] = scanner.nextInt();
            System.out.print("두 번째 좌표를 입력해주세요 : ");
            index[1] = scanner.nextInt();

            if(board[index[0]][index[1]].equals("[ ]")){
                if(turn % 2 == 0){
                    board[index[0]][index[1]] = "[흑]";
                }else{
                    board[index[0]][index[1]] = "[백]";
                }
            }else{
                System.out.println("같은 곳에 둘 수 없습니다.");
                turn += 2;
                continue;
            }

            for (int i = 0; i < board.length; i++){
                for(int j = 0; j < board[i].length; j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            turn++;

        }

    }
}
