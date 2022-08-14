package study_3;

// AverageScore
public class Day03__15 {

    public static void main(String[] args) {

        // 사용할 배열 및 변수 초기화
        int[] students = {100, 95, 90, 88, 93};
        int sum = 0;

        // for문으로 배열 요소들의 합 연산
        for(int i=0 ; i<students.length ; i++) {
            sum += students[i];
        }

        // 결과 출력
        // 정수 / 정수 -> 정수, 따라서 실수값을 출력하기 위해 실수로 강제 형변환
        System.out.println("시험 점수의 평균: " + (sum / (float)students.length));

    }

}
