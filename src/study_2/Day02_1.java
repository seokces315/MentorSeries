package study_2;

// Logic_Operator2
public class Day02_1 {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = true;

        // AND: a와 b가 모두 참일 때만 결과가 참
        System.out.println(a && b);
        System.out.println(a && c);
        System.out.println((2<4) && (4<5));
        // OR: a와 b 중 하나라도 참이면 결과가 참
        System.out.println(a || b);
        System.out.println(a || c);
        System.out.println((2>4) && (4>5));
        // NOT: a가 true면 false, false면 true
        System.out.println(!a);

    }

}
