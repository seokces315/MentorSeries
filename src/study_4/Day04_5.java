package study_4;

import java.util.Scanner;

// Fruits
public class Day04_5 {

    public static void main(String[] args) {
        
        // 사용할 객체 및 배열 선언
        Scanner sc = new Scanner(System.in);
        String[] fruits = new String[3];

        // for-loop문 작성해서 배열에 데이터 저장
        for(int i=0 ; i<fruits.length ; i++) {
            System.out.print("주문할 과일: ");
            fruits[i] = sc.nextLine();
        }
        System.out.println("---주문받은 과일---");
        // for-each문으로 배열에 저장된 데이터 출력
        for(String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
        System.out.println(); // 줄바꿈

    }
    
}
