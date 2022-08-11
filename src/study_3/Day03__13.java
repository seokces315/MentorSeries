package study_3;

// Init_Array
public class Day03__13 {

    public static void main(String[] args) {
        
        // 배열 선언
        // 배열의 크기 -> 3
        int[] arInt = new int[3];
        double[] arDouble = new double[3];
        char[] arChar = new char[3];
        String[] arString = new String[3];

        // for-loop문을 작성해서 결과 출력
        for(int i=0 ; i<3 ; i++) {
            System.out.print(arInt[i] + " ");
        }
        System.out.println(); // 공백 출력
        for(int i=0 ; i<3 ; i++) {
            System.out.print(arDouble[i] + " ");
        }
        System.out.println(); // 공백 출력
        for(int i=0 ; i<3 ; i++) {
            System.out.print(arChar[i] + " ");
        }
        System.out.println(); // 공백 출력
        for(int i=0 ; i<3 ; i++) {
            System.out.print(arString[i] + " ");
        }
        System.out.println(); // 공백 출력

    }

}
