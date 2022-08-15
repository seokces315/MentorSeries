package study_4;


// Calculator
// 두 수를 전달받아 사칙연산 구현하기(단, 정수/실수 모두 가능)
public class Day04__11 {

    // static 메서드 선언
    // 정수형 메서드
    static int add(int x, int y) {
        return x + y;
    }
    static int sub(int x, int y) {
        return x - y;
    }
    static int mul(int x, int y) {
        return x * y;
    }
    static int div(int x, int y) {
        return x / y;
    }
    
    // 실수형 메서드
    static double add(double x, double y) {
        return x + y;
    }
    static double sub(double x, double y) {
        return x - y;
    }
    static double mul(double x, double y) {
        return x * y;
    }
    static double div(double x, double y) {
        return x / y;
    }

    public static void main(String[] args) {
        
        // static 메서드 호출 및 출력
        // 정수형의 사칙연산
        System.out.println("--- 정수의 사칙연산 ---");
        System.out.println("add(10, 20) -> " + add(10, 20));
        System.out.println("sub(10, 20) -> " + sub(10, 20));
        System.out.println("mul(10, 20) -> " + mul(10, 20));
        System.out.println("div(10, 20) -> " + div(10, 20));
 
        // 실수형의 사칙연산
        System.out.println("--- 실수의 사칙연산 ---");
        System.out.println("add(1.2, 2.3) -> " + add(1.2, 2.3));
        System.out.println("sub(1.2, 2.3) -> " + sub(1.2, 2.3));
        System.out.println("mul(1.2, 2.3) -> " + mul(1.2, 2.3));
        System.out.println("div(1.2, 2.3) -> " + div(1.2, 2.3));

    }

}
