package study_2;

// AND_OR_XOR_NOT_SHIFT_Practice
public class Day02_2 {

    public static void main(String[] args) {

        int a = 15; // 1111(2)
        int b = 5;  // 0101(2)

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);

        // not b = -b-1
        System.out.println(~b);

        // 시프트 연산자
        System.out.println(a >>> 2); // 0으로 채움
        System.out.println(a >> 2);  // 최상위 부호 비트로 채움
        System.out.println(b << 4);  // 0으로 채움

    }

}
