package study_4;

// Sum_Overloading
public class Day04__10 {

    // static 메서드 선언
    // 메서드 오버로딩을 활용
    static void sum(int x, int y) {
        System.out.println(x + y);
    }

    // 메서드의 매개변수 타입에 따라
    static void sum(double x, double y) {
        System.out.println(x + y);
    }
    static void sum(String x, String y) {
        System.out.println(x + y);
    }

    // 메서드의 매개변수 개수에 따라
    static void sum(int x, int y, int z) {
        System.out.println(x + y + z);
    }
    
    public static void main(String[] args) {

        // 각 메서드를 호출
        sum(1, 2);
        sum(1.0, 2.0);
        sum("1", "2");
        sum(1, 2, 3);

    }

}
