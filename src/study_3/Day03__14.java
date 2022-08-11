package study_3;

import java.util.Arrays;

// ArraysUtil
public class Day03__14 {

    public static void main(String[] args) {

        // 배열 선언과 동시에 초기화
        int[] a = new int[] {10, 20, 4, 25, 18};
        // 선언과 동시에 초기화할 때 new int[] 생략가능
        int[] b = {1, 2, 3, 4, 5, 6, 7};
        // 배열 선언후 변수에 값 저장하기
        int[] c = new int[10];
        for(int i=0 ; i<c.length ; i++) {
            c[i] = i+1;
        }

        // 배열과 for문으로 결과 출력
        for(int i=0 ; i<c.length ; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println(); // 공백 출력

        // 배열을 문자열로 출력하는 메서드
        System.out.println(Arrays.toString(c));

    }

}
