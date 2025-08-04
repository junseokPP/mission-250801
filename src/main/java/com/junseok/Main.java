package com.junseok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int no=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        while(true) {
            System.out.print("명령) ");
            String command = sc.nextLine();

            if(command.equals("등록")){
                System.out.print("명언 : ");
                String saying = sc.nextLine();
                System.out.print("작가 : ");
                String author = sc.nextLine();
                no++; // 4단계에서 해야하는데 3단계로 해버림 따로 코드 변경 없음
                System.out.println("%d번 명언이 등록되었습니다.".formatted(no));
            }else if(command.equals("종료")){
                break;
            }
        }
    }
}
