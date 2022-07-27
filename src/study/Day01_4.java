package study;

// DataType
public class Day01_4 {

    public static void main(String[] args) {

        int a = 65;

        // 묵시적, 자동 형변환
        float f = a;
        System.out.println(f);

        // 명시적, 강제 형변환
        char c = (char)a;
        System.out.println(c);

    }

}
