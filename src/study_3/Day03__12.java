package study_3;

// Array
public class Day03__12 {

    public static void main(String[] args) {

        // 배열 선언 및 초기화
        // 배열의 크기 -> 3
        int[] scores = new int[3];
        scores[0] = 100;
        scores[1] = 80;
        scores[2] = 70;
        
        // for-loop문을 작성해서 결과 출력
        for(int i=0 ; i<3 ; i++) {
            System.out.println((i+1) + "번째 학생의 점수: " + scores[i] + "점");
        }

    }

}
