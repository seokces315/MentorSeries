package study_4;

// Open_Method
public class Day04_6 {

    // 전역 함수 - static 메서드 선언
    static void open() {
        System.out.println("문 열기");
        System.out.println("바닥 청소");
        System.out.println("포스기 가동");
        System.out.println("빵 진열");
    }

    public static void main(String[] args) {

        // static 메서드 실행
        // 전역 함수는 객체를 생성할 필요가 없음
        open();

    }

}
