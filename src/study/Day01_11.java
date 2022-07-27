package study;

// Equality_Sign_Operator
public class Day01_11 {

    public static void main(String[] args) {

        double a = 3.14;
        double b = 9.61;
        String s = "Hello Java!";

        System.out.println(a == b);
        System.out.println(a != b);
        // 문자열 비교시 등가비교연산자 사용X
        // String 클래스의 equlas 메서드를 사용O
        System.out.println(s.equals("Hello Java!"));
        System.out.println(s.equals("hello java!")); // 대소비교 O

    }

}
