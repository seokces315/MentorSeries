package study_3;

// Do_While
public class Day03_7 {

    public static void main(String[] args) {
        
        // 변수 선언 및 초기화
        int i = 100;

        // while-loop문 작성
        while(i<10) {
            System.out.println("while문의 명령을 실행!");
            System.out.println("적어도 한번은 출력되는 문장");
        }

        // 같은 내용을 do-while-loop로 작성
        do {
            System.out.println("do-while문의 명령을 실행!");
            System.out.println("적어도 한번은 출력되는 문장");
        } while(i<10);

        // 모든 loop가 끝나면 종료문 출력
        System.out.println("프로그램 종료");

    }

}
