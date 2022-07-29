package study_2;

// If_Else
public class Day02__10 {

    public static void main(String[] args) {

        int age = 15;

        if(age > 19) {
            System.out.println("성인입니다.");
            System.out.println("성인 요금이 적용됩니다.");
        }
        else {  // (age <= 19)인 조건
            System.out.println("청소년입니다.");
            System.out.println("청소년 요금이 적용됩니다.");
        }
        System.out.println("결제를 진행해주세요.");

    }

}
