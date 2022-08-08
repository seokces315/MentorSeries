package study_3;

// For_Sum
public class Day03_3 {

    public static void main(String[] args) {
        
        // 1 ~ 10까지의 합을 계산해서 출력하는 프로그램
        
        // 변수 선언 및 초기화
        int sum = 0;

        // for-loop문 작성
        for(int i=1 ; i<=10 ; i++) {
            System.out.printf("i=%2d, sum -> %2d\n", i, sum+=i);
        }
        
    }

}
