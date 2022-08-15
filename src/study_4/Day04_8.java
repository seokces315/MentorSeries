package study_4;

// Method_Return
public class Day04_8 {

    // static 메서드 선언
    static int printX(int x) {
        System.out.println("printX() 호출!");
        return x;
    }

    public static void main(String[] args) {

        // static 메서드의 리턴값을 출력
        System.out.println(printX(100));

    }

}
