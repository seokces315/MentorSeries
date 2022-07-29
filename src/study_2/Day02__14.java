package study_2;

import java.util.Scanner;

// Switch
public class Day02__14 {

    public static void main(String[] args) {

        // 1년동안 읽은 책의 수에 따라 멘트를 출력
        int book;
        Scanner sc = new Scanner(System.in);

        // 읽은 책의 수 입력받기
        System.out.println("몇 권 읽었는지 입력하세요.");
        book = sc.nextInt();

        // switch문으로 결과 출력하기
        switch(book/10) {
            case 0 : // 0 <= book < 10
                System.out.println("조금 더 노력하세요.");
                break;
            case 1 : // 10 <= book < 20
                System.out.println("책 읽는 것을 즐기시네요.");
                break;
            case 2 : // 20 <= book < 30
                System.out.println("책을 사랑하시네요.");
                break;
            default : // 30 <= book
                System.out.println("당신은 다독왕입니다.");
        }

    }

}
