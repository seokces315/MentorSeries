package study_4;

import java.util.Scanner;

// Scores_Array
public class Day04_2 {

    public static void main(String[] args) {

        // 사용할 객체 및 변수 선언
        Scanner sc = new Scanner(System.in);
        String[] subjects = {"국어", "영어", "수학"};
        int[][] scores = new int[4][3];
        
        // 이중 for문으로 각 학생의 과목별 점수 입력받기
        // 입력받은 값들을 배열에 저장
        for(int i=0 ; i<scores.length ; i++) {
            System.out.printf("%d번 학생 점수----\n", i+1);
            for(int j=0 ; j<subjects.length ; j++) {
                System.out.printf("%s:", subjects[j]);
                scores[i][j] = sc.nextInt();
            }
        }

        // 2차원 배열에 저장된 값들을 출력
        System.out.print("\t"); // 출력 조정
        for(int i=0 ; i<subjects.length ; i++) {
            System.out.printf("  \t%s ", subjects[i]);
        }
        System.out.println(); // 줄바꿈
        for(int i=0 ; i<scores.length ; i++) {
            System.out.printf("%d번:\t", i+1);
            for (int j=0; j < scores[0].length; j++) {
                System.out.printf("%3d     ", scores[i][j]);
            }
            System.out.println(); // 줄바꿈
        }

    }

}
