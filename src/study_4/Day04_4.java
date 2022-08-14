package study_4;

// For_Each
public class Day04_4 {

    public static void main(String[] args) {

        // 배열 선언 및 초기화
        String[] a = {"Java", "Hello", "Programming"};
        int[] b = {1, 2, 3, 4, 5};

        // for-each문 작성해서 배열의 요소들 출력
        for(String s : a) {
            System.out.printf("%s ", s);
        }
        System.out.println(); // 공백 출력
        for(int i : b) {
            System.out.printf("%d ", i);
        }
        System.out.println(); // 줄바꿈

    }

}
