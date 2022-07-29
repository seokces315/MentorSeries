package study_2;

import java.util.Scanner;

// Traffic_Light
public class Day02_4 {

    public static void main(String[] args) {
        
        // 변수 선언
        int sign;
        String result;
        Scanner sc = new Scanner(System.in);
        
        // 신호 입력받기
        System.out.println("☆★☆★신호등 프로그램☆★☆★");
        System.out.println("신호를 입력하세요~");
        System.out.println("빨간불: 1, 초록불: 2, 노란불: 3");
        sign = sc.nextInt();
        
        // 삼항연산자를 이용해 결과 저장 및 출력
        result = sign==1 ? "정지하세요!" : sign==2 ? "출발하세요~" : "서행하세요~";
        System.out.println(result);

    }

}
