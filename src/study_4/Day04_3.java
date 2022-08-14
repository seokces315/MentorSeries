package study_4;

import java.util.Arrays;

// Array_Copy
public class Day04_3 {

    public static void main(String[] args) {

        // 배열 선언 및 초기화
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {0, 0, 0, 0, 0, 0, 0};

        // 선언된 배열 출력
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        // System.arraycopy() 메서드를 활용해
        // 배열 복제 및 출력
        System.arraycopy(a, 2, b, 3, 4);
        System.out.println(Arrays.toString(b));

    }

}
