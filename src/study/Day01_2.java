package study;

// 입력기능을 코드에 연결
import java.util.Scanner;

// Input
public class Day01_2 {

    public static void main(String[] args) {

        // Scanner를 sc라는 변수로 사용
        Scanner sc = new Scanner(System.in);

        // 문자열로 입력받기
        System.out.println(sc.next());
        // 정수로 입력받기
        System.out.println(sc.nextInt());
        // 실수로 입력받기
        System.out.println(sc.nextFloat());
        // 줄이 바뀔때까지 입력받기
        sc.nextLine(); // Enter 입력으로 생긴 '\n' 제거
        System.out.println(sc.nextLine());

    }

}
