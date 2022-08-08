package study_3;

import java.util.Random;
import java.util.Scanner;

// Up_Down_Game
public class Day03_6 {

    public static void main(String[] args) {

        // 사용할 객체 및 변수 선언
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        int user = -1; // while-loop이 실행되도록 초기값 설정, 마중물

        // while-loop문 작성
        while(user!=num) {
            // user 입력받기
            System.out.print("숫자 입력: ");
            user = sc.nextInt();

            // 조건 분기후 출력
            // user == num
            if(user==num) {
                System.out.println("정답입니다!");
            }
            // user > num
            else if(user>num) {
                System.out.println("Down!");
            }
            // user < num
            else {
                System.out.println("Up!");
            }
            
        }

    }

}
