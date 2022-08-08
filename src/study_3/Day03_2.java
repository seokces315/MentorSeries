package study_3;

// Computer_On_Off
public class Day03_2 {

    public static void main(String[] args) {

        // 컴퓨터 상태변경 for-loop문 작성
        for(int i=1 ; i<=10 ; i++) {
            System.out.println(i + "번 컴퓨터 켜줘~");
        }
        
        System.out.println(); // 출력 공백
        
        for(int j=10 ; j>=1 ; j--) {
            System.out.println(j + "번 컴퓨터 꺼줘~");
        }

        System.out.println(); // 출력 공백

        for(int k=1 ; k<=10 ; k++) {
            // 짝수 번호의 컴퓨터만 상태변경
            if(k%2==0) {
                System.out.println(k + "번 컴퓨터 켜줘~");
            }
        }

        System.out.println(); // 출력 공백

        // 증감식을 변경해 홀수 번호의 컴퓨터만 상태변경
        for(int l=1 ; l<=10 ; l+=2) {
            System.out.println(l + "번 컴퓨터 켜줘~");
        }

    }

}
