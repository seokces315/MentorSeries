package study_2;

import java.util.Scanner;

// If_If
public class Day02_12 {

    public static void main(String[] args) {

        // 변수 선언
        String id, passwd;
        Scanner sc = new Scanner(System.in);

        // 아이디 입력받기
        System.out.print("아이디 입력: ");
        id = sc.next();

        // 조건 분기후 출력
        if(id.equals("java")) {
            System.out.println("id 일치!");
            System.out.print("비밀번호 입력: ");
            passwd = sc.next();
            if(passwd.equals("abc123")) {
                System.out.println("password 일치!");
                System.out.println("로그인 성공~");
            }
            else { // (passwd != abc123)인 조건
                System.out.println("password 불일치!");
            }
        }
        else { // (id != java)인 조건
            System.out.println("id 불일치!");
        }

    }

}
