package study_2;

import java.util.Random;

// Pokemon
public class Day02_15 {

    public static void main(String[] args) {

        // 변수 선언
        int myPokemon;
        Random random = new Random();

        System.out.println("☆★☆★Random Choosing Pokemon☆★☆★");
        System.out.println("1. 피카츄 - 전기괴물");
        System.out.println("2. 꼬부기 - 물괴물");
        System.out.println("3. 이상해씨 - 풀괴물");
        System.out.println();

        // 랜덤으로 포켓몬 결정하기
        myPokemon = random.nextInt(3) + 1;
        System.out.println("선택된 번호 -> " + myPokemon);

        // switch문으로 결과 출력하기
        switch(myPokemon) {
            case 1 :
                System.out.println("피카츄 선택!");
                break;
            case 2 :
                System.out.println("꼬부기 선택!");
                break;
            case 3 :
                System.out.println("이상해씨 선택!");
                break;
        }

    }

}
