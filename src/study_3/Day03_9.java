package study_3;

import java.util.Scanner;

// Break_Sum
public class Day03_9 {

    public static void main(String[] args) {

        // 사용할 객체 및 변수 선언
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;

        // 무한 while-loop문 작성
        while(true) {
            // 숫자 입력받기
            System.out.print("더할 숫자 입력(종료:0) -> ");
            num = sc.nextInt();
            
            // 조건 분기로 종료 결정
            if(num==0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            
            // 입력한 숫자 더하기
            sum += num;
        }

        // loop가 종료될때 더한 숫자들의 총합 출력
        System.out.println("현재까지의 총합 = " + sum);

    }

}
