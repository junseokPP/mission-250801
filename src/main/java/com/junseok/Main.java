package com.junseok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int no=0,lastIndex = 0;
        WiseSaying[] wiseSaying = new WiseSaying[100];
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

                wiseSaying[lastIndex] = new WiseSaying();
                wiseSaying[lastIndex].num = no;
                wiseSaying[lastIndex].author = author;
                wiseSaying[lastIndex].saying = saying;
                lastIndex++;

            }else if(command.equals("목록")){
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                for(int i=lastIndex-1;i>=0;i--){
                    System.out.println("%d / %s / %s".formatted(wiseSaying[i].num,wiseSaying[i].author,wiseSaying[i].saying));
                }
            }else if(command.startsWith("삭제")){
                String[] split = command.split("=");
                if(split.length != 2){
                    System.out.println("번호를 제대로 입력해주세요");
                    return;
                }
                int id = Integer.parseInt(split[1]);
                boolean flag = false;
                for(int i=0;i<lastIndex;i++){
                    if(id == wiseSaying[i].num){
                        wiseSaying[i] = wiseSaying[i+1];
                        System.out.println("%d번 명언이 삭제되었습니다.".formatted(id));
                        flag = true;
                        break;
                    }
                }
                if(flag == false){
                    System.out.println("%d번 명언은 존재하지 않습니다.".formatted(id));
                }
            }else if(command.equals("종료")){
                break;
            }
        }
    }
}
