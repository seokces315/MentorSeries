package study_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_Cafe {

    public static void main(String[] args) throws IOException {

        // 사용할 객체 및 변수 초기화
        // 인덱스 번호를 기준으로 데이터쌍 구분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb1, sb2, sb3, sb4, sb5;
        ArrayList<String> menuList = new ArrayList<>(); // 가변 배열 선언
        String[] menus = {"아메리카노", "에스프레소", "카페라떼", "밀크티"};
        int[] costs = {3800, 2400, 4200, 5100};
        int count = 0;
        int total = 0;
        int index;
        int order;
        
        // 카페 프로그램 알고리즘
        // while문을 이용한 무한루프로 기능을 이용할 수 있음
        // '끝내기' 기능으로 프로그램을 종료할 수 있음
        while(true) {
            sb1 = new StringBuilder();
            sb1.append("☆★☆★ Cafe ☆★☆★\n");
            sb1.append("1. 주문하기\n2. 취소하기\n3. 결제하기\n4. 끝내기");
            System.out.println(sb1);
            
            // 선택할 기능을 번호로 입력받기
            bw.write("사용할 기능을 번호로 입력하세요: ");
            bw.flush();
            int choice = Integer.parseInt(br.readLine());
            
            // 조건 분기
            if(choice == 1) {
                // '주문하기' 알고리즘
                // 주문가능한 메뉴 출력
                sb2 = new StringBuilder();
                sb2.append("----- 주문 가능한 메뉴 -----\n");
                for(int i=0 ; i<menus.length ; i++) {
                    sb2.append(i+1).append(". ");
                    sb2.append(menus[i]).append(" -> ");
                    sb2.append(costs[i]).append("원\n");
                }
                System.out.print(sb2);

                // 주문 받을 메뉴를 입력받기
                bw.write("주문할 메뉴를 입력하세요~\n");
                bw.flush();
                // 무한루프를 특정 조건이 나타날 때 까지 진행
                while(true) {
                    // 메뉴를 입력받기
                    order = Integer.parseInt(br.readLine());

                    // 0이 입력되면 무한루프를 탈출함
                    // 주문 번호와 다른 것이 입력되면 continue
                    if (order == 0) {
                        break;
                    }
                    else if((order!=1) && (order!=2) && (order!=3) && (order!=4) ) {
                        bw.write("주문 번호에 맞게 입력해주세요!\n");
                        bw.flush();
                        continue;
                    }

                    // 입력받은 메뉴를 메뉴리스트에 추가
                    menuList.add(menus[order-1]);
                    // 배열을 형변환후 indexOf() 메서드로 인덱스 번호 반환
                    index = Arrays.asList(menus).indexOf(menus[order-1]);
                    // 인덱스 번호에 해당하는 금액을 총 금액에 누적시키기
                    total += costs[index];
                    // 주문한 개수도 한 개 증가시키기
                    count++;
                }
            }
            else if(choice == 2) {
                // '취소하기' 알고리즘
                // 주문한 메뉴리스트를 출력
                sb3 = new StringBuilder();
                sb3.append("-----주문한 메뉴리스트-----\n");
                for(String menu : menuList) {
                    sb3.append(menu).append(" ");
                }
                System.out.println(sb3);

                // 취소할 메뉴 입력받기
                bw.write("취소할 메뉴를 입력하세요~\n");
                bw.flush();
                StringTokenizer cancelList = new StringTokenizer(br.readLine());
                sb4 = new StringBuilder();
                sb4.append("[ ");
                boolean flag = true;
                // while문으로 메뉴리스트에서 취소할 메뉴에 대한 작업을 진행
                while(cancelList.hasMoreTokens()) {
                    String cancel = cancelList.nextToken();

                    // 입력 받은 메뉴를 메뉴리스트에서 제거
                    // 조건 분기
                    if(menuList.contains(cancel)) {
                        menuList.remove(cancel);
                        // 배열을 형변환후 indexOf() 메서드로 인덱스 번호 반환
                        index = Arrays.asList(menus).indexOf(cancel);
                        // 인덱스 번호에 해당하는 금액을 총 금액에서 차감시키기
                        total -= costs[index];
                        // 주문한 개수도 한 개 감소시키기
                        count--;
                    }
                    else {
                        flag = false;
                        sb4.append(cancel).append(" ");
                    }
                }

                if(!flag) {
                    sb4.append("] 메뉴가 리스트에 존재하지 않습니다.");
                    System.out.println(sb4);
                }
            }
            else if(choice == 3) {
                // '결제하기' 알고리즘
                // 현재까지 주문한 메뉴리스트를 최종적으로 출력
                // 결제해야 할 총 금액 출력
                sb5 = new StringBuilder();
                sb5.append("-----최종 주문리스트-----\n");
                for(String menu : menuList) {
                    sb5.append(menu).append(" ");
                }
                sb5.append("\n결제해야 할 총 금액 -> ").append(total).append("원");
                System.out.println(sb5);

                // 사용자에게 지불할 금액을 입력받기
                bw.write("지불할 금액: ");
                bw.flush();
                int spend = Integer.parseInt(br.readLine());

                // 조건 분기
                if(spend < total) {
                    bw.write("금액이 부족합니다\n");
                    bw.flush();
                }
                else {
                    bw.write(String.valueOf(count));
                    bw.write("개 메뉴에 대한 계산이 완료되었습니다!\n잔돈은 ");
                    bw.write(Integer.toString(spend-total));
                    bw.write("원 입니다.\n");
                    bw.flush();

                    // 다음 사용을 위해 사용했던 객체들을 초기화
                    // 총 금액 -> 0원
                    total = 0;
                    // 메뉴리스트 비우기
                    menuList.clear();
                    // 전체 개수 -> 0개
                    count = 0;
                }
            }
            else if(choice == 4){
                // '끝내기' 알고리즘
                // 반복문 탈출
                bw.write("프로그램을 종료합니다!\n");
                break;
            }
            else {
                bw.write("잘못된 입력입니다!\n");
                bw.flush();
            }
        }

        // 스트림 출력 및 닫기
        bw.flush();
        bw.close();

    }

}
