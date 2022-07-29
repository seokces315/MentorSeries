package study_2;

import java.util.Scanner;

// If_Elseif
public class Day02_11 {

    public static void main(String[] args) {

        // 변수 선언
        int age;
        Scanner sc = new Scanner(System.in);
        
        // 나이 입력받기
        System.out.print("나이: ");
        age = sc.nextInt();
        
        // 조건 분기후 출력
        if(age > 19) {
            System.out.println("성인입니다.");
            System.out.println("성인 요금이 적용됩니다.");
        }
        else if(age > 13) { // (13 < age <= 19)인 조건
            System.out.println("청소년입니다.");
            System.out.println("청소년 요금이 적용됩니다.");
        }
        else if(age > 8) { // (8 < age <= 13)인 조건
            System.out.println("어린이입니다.");
            System.out.println("어린이 요금이 적용됩니다.");
        }
        else { // (0 < age <= 8)인 조건
            System.out.println("유아입니다.");
            System.out.println("유아 요금이 적용됩니다.");
        }
        System.out.println("결제를 진행해주세요.");
        
    }

}
