package study_2;

import java.util.Scanner;

// Traffic_Light_Switch
public class Day02__13 {

    public static void main(String[] args) {

        // 변수 선언
        int sign;
        Scanner sc = new Scanner(System.in);

        // 신호 입력받기
        System.out.println("☆★☆★신호등 프로그램☆★☆★");
        System.out.println("신호를 입력하세요.");
        System.out.println("빨간불: 1, 초록불: 2, 노란불: 3");
        sign = sc.nextInt();

        // switch문으로 결과 출력하기
        switch(sign) {
            case 1 :
                System.out.println("빨간불이므로 정지하세요.");
                break;
            case 2 :
                System.out.println("초록불이므로 출발하세요.");
                break;
            case 3 :
                System.out.println("노란불이므로 브레이크를 밟으세요.");
                break;
            default :
                System.out.println("잘못된 입력입니다.");
        }
        
    }
    
}
