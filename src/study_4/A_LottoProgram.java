package study_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.StringTokenizer;

public class A_LottoProgram {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 6개의 랜덤 숫자와 보너스 점수를 로또 배열에 저장
        Random random = new Random();
        int[] lottoArr = new int[6];
        int lottoNum;
        boolean flag = true;
        // for-loop문 작성
        for(int i=0 ; i<lottoArr.length ; i++) {
            // 중복되는 숫자가 나오지 않게 알고리즘 설계
            lottoNum = random.nextInt(45) + 1;
            for(int j=0 ; j<=i ; j++) {
                if(lottoArr[j]==lottoNum) {
                    i--;
                    flag = false;
                    break;
                }
            }
            if(flag) {
                lottoArr[i] = lottoNum;
            }
        }
        int lottoBonus = random.nextInt(45) + 1;

        // 1~45까지의 6개의 숫자를 입력받아 배열에 저장
        int[] myArr = new int[6];
        bw.write("1 ~ 45까지의 숫자 6개 입력(중복 X) -> ");
        bw.flush();
        st = new StringTokenizer(br.readLine());
        // for-loop문 작성
        for(int i=0 ; i<myArr.length ; i++) {
            myArr[i] = Integer.parseInt(st.nextToken());
        }
        // 보너스 점수 입력받아서 배열에 저장
        bw.write("보너스 점수 입력: ");
        bw.flush();
        int myBonus = Integer.parseInt(br.readLine());

        // 두 배열을 비교해서 같은 번호의 개수 체크
        int count = 0;
        for(int i=0 ; i<lottoArr.length ; i++) {
            for(int j=0 ; j<myArr.length ; j++) {
                if(lottoArr[i] == myArr[j]) {
                    count++;
                    break;
                }
            }
        }

        // 조건 분기
        int rank;
        if(count == 6) {
            rank = 1;
        }
        else if((count==5) && (lottoBonus==myBonus)) {
            rank = 2;
        }
        else if(count == 5) {
            rank = 3;
        }
        else if(count == 4) {
            rank = 4;
        }
        else if(count == 3) {
            rank = 5;
        }
        else {
            rank = -1;
        }

        // 원하는 결과 출력
        if(rank == -1) {
            bw.write("순위권이 아닙니다!\n아쉽지만 다음 기회에~");
        }
        else {
            bw.write(String.valueOf(rank));
            bw.write("등!\n 축하드립니다~");
        }
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
