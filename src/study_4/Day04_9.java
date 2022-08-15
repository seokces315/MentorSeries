package study_4;

// Square_Area
public class Day04_9 {

    // static 메서드 선언
    static int calculator(int a, int b) {
        System.out.println("< 계산 시작 >");
        int area = a * b;
        return area;
    }

    public static void main(String[] args) {

        // static 메서드를 호출
        // 사각형의 넓이를 출력
        System.out.println("사각형의 넓이: " + calculator(10, 20));
        
    }

}
