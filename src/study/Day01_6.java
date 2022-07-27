package study;

// Operator
public class Day01_6 {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        float bF= 3F; // 자동 형변환, 3 -> 3.0

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println();
        System.out.println(a / bF);
        System.out.println(a % bF);
        System.out.println(bF % b);

    }

}
