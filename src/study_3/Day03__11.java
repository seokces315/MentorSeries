package study_3;

import java.util.Scanner;

// BankSystem
public class Day03__11 {

    public static void main(String[] args) {

        // 사용할 객체 및 변수 선언
        Scanner sc = new Scanner(System.in);
        int money = 10000;

        System.out.printf("현재 가진 돈은 %d원입니다.\n", money);
        // while-loop문 작성
        while(true) {
            // 지출 금액 입력받기
            System.out.print("얼마를 사용하시겠습니까? ");
            int spend = sc.nextInt();

            // 조건 분기
            if(!((0<=spend) && (spend<=money))) {
                System.out.println("사용할 수 있는 금액을 초과하였습니다.");
                System.out.println("다시 입력해주세요~");
                continue;
            }
            // 지출 범위가 알맞을 때
            System.out.printf("이제 %d원이 남았습니다.\n", money-=spend);
            // 만약 금액이 0원이 된다면 프로그램을 종료
            if(money==0) {
                break;
            }
        }
        // loop가 끝나면 종료문 출력
        System.out.println("가진 돈을 모두 사용했습니다. 프로그램 종료!");

    }

}
