package study_3;

import java.util.Scanner;

// MusicPlayer
public class Day03_5 {

    public static void main(String[] args) {
        
        // 변수 선언 및 초기화
        Scanner sc = new Scanner(System.in);
        String answer = "Y"; // while문이 실행되도록 초기값 설정, 마중물
        int count = 0;
        
        // while-loop문 작성
        // answer 변수의 값이 "Y"일 때 반복
        while(answer.equals("Y")) {
            // answer 새로 입력받기
            System.out.print("음악을 재생하시겠습니까? (Y / Else) -> ");
            answer = sc.next();

            // 조건 분기로 출력여부 결정
            if(answer.equals("Y")) {
                System.out.printf("음악을 %d번 재생했습니다.\n", ++count);
            }
        }
        // while-loop가 끝나면 종료문 출력
        System.out.println("재생 종료됨");
        
    }

}
