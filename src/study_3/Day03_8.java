package study_3;

import java.util.Scanner;

// Break
public class Day03_8 {

    public static void main(String[] args) {

        // 사용할 객체 및 변수 선언
        Scanner sc = new Scanner(System.in);
        int num;

        // while-loop문 작성
        // 분기가 없으면 무한반복하게끔 설계
        while(true) {
            // 숫자 입력받기
            System.out.print("숫자 입력: ");
            num = sc.nextInt();

            // 조건 분기로 프로그램 종료
            if(num==0) {
                System.out.println("프로그램 종료!");
                break;
            }

            System.out.println("입력값 -> " + num);

        }
        
    }

}
