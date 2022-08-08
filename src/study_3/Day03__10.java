package study_3;

import java.util.Scanner;

// Continue
public class Day03__10 {

    public static void main(String[] args) {

        // 사용할 객체 및 변수 선언
        Scanner sc = new Scanner(System.in);
        int num;

        // while-loop문 작성
        while (true) {
            // 숫자 입력받기
            System.out.print("숫자 입력: ");
            num = sc.nextInt();

            // 조건 분기
            // num == 0 -> 종료
            if(num==0) {
                System.out.println("프로그램 종료!");
                break;
            }
            // num < 0 -> 다시 반복 시작
            else if(num<0) {
                System.out.println("아래 명령을 무시하고 다음 반복진행!");
                continue;
            }
            // 위 조건에 부합하지 않으면 입력된 숫자 출력
            else {
                System.out.println("num: " + num);
            }

        }

    }

}
