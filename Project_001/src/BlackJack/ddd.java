package BlackJack;


import java.util.Random;
import java.util.Scanner;
 
public class ddd {
    public static void main(String[] args) {
 
        int deck[] = new int[52]; // 덱(deck) 저장공간 생성
        String cardShape[] = { "스페이스", "크로바", "다이아", "하트" }; // 카드 모양 선언
        String cardNumber[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" }; // 카드 숫자 선언
 
        // 카드 생성
        for (int i = 0; i < 52; i++) { // deck[0]=0;deck[1]=1;의 작업을 for문으로 빠르게 선언함
            deck[i] = i; // deck[0]=0;deck[1]=1;의 작업을 for문으로 빠르게 선언함
        }
        // 카드 섞기
        Random rd = new Random();
        for (int i = 0; i < 10000; i++) { // 카드를 만번 섞는다는 의미. 10000대신 다른 숫자를 넣어도 무방
            int rNumber = rd.nextInt(52);
            int temp;
            temp = deck[0];
            deck[0] = deck[rNumber];
            deck[rNumber] = temp;
        }
        // 카드를 한장씩 뽑아서 플레이어에게 나눠주는 작업 (중복되면 안되므로 나눠준 카드와 나눠줄 카드를 구분해야 한다)
        // -1이란 값은 -1이라는 숫자를 랜덤하게 나눠받은 카드에 대입하고자 사용함
        int deckIndex = 0;
        int userADeck[] = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }; // 유저 A가 플레이할동안 카드를 받을 횟수를 10번으로 잡고 배열 선언
        int userBDeck[] = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }; // 유저 B가 플레이할동안 카드를 받을 횟수를 10번으로 잡고 배열 선언
        int userAIndex = 0;
        int userBIndex = 0;
        boolean userAFlag = true;
        boolean userBFlag = true;
        Scanner sc = new Scanner(System.in);
        int ScoreASum = 0;
        int ScoreBSum = 0;
 
        for (int j = 0; j < 10; j++) { // 분배받을 카드의 횟수를 10으로 지정함
            if (userAFlag) {
                System.out.println("user A님, 카드를 계속 받으시겠습니까? 0-NO/1-YES");
                if (sc.nextLine().equals("0")) {
                    userAFlag = false;
                }
            }
            if (userBFlag) {
                System.out.println("user B님, 카드를 계속 받으시겠습니까? 0-NO/1-YES");
                if (sc.nextLine().equals("0")) {
                    userBFlag = false;
                }
            }
            if (!(userAFlag || userBFlag)) {
                break;
            }
            if (userAFlag) {
                userADeck[userAIndex] = deck[deckIndex]; // deck[deckIndex]는 0이니까 userADeck[userAIndex]에 0을 넣어 userADeck[0]값이 된다
                deckIndex++; // 0 더하기 1
                userAIndex++; // 1을 더해서 값이 1로 변경된다
            }
            if (userBFlag) {
                userBDeck[userBIndex] = deck[deckIndex];
                userBIndex++;
                deckIndex++;
            }
            // userADeck 점수계산
            ScoreASum=0;
            for (int i = 0; i < userAIndex; i++) {
                int ScoreA = 0;
                ScoreA = userADeck[i] % 13 + 1;
                if (ScoreA > 10) {
                    ScoreA = 10;
                }
                ScoreASum = ScoreASum + ScoreA;
            }
            // A카드의 점수를 1점으로 정할것인지 11점으로 정할것인지 선택하자
            for (int i = 0; i < userAIndex; i++) {
                if (userADeck[i] % 13 == 0) {
                    // 만약 A카드가 있다면 10을 더할텐데, 여기서 22가 넘지 않으면 10을 더해주고 넘으면 더하지 않으면 된다
                    if ((ScoreASum + 10) <= 21) {
                        ScoreASum = ScoreASum + 10;
                    }
                }
            }
            System.out.println(" ");
            System.out.println("***total userA 점수:" + ScoreASum);
            if(ScoreASum>21) {
                System.out.println("21점을 초과했군요....");
                break;
            }
        // userBDeck 점수계산
        ScoreBSum=0;
        for (int i = 0; i < userAIndex; i++) {
            int ScoreB = 0;
            ScoreB = userBDeck[i] % 13 + 1;
            if (ScoreB > 10) {
                ScoreB = 10;
            }
            ScoreBSum = ScoreBSum + ScoreB;
        }
        if(ScoreASum>21) {
            System.out.println("21점을 초과했군요....");
            break;
        }
        // A카드의 점수를 1점으로 정할것인지 11점으로 정할것인지 선택하자
        for (int i = 0; i < userAIndex; i++) {
            if (userADeck[i] % 13 == 0) {
                // 만약 A카드가 있다면 10을 더할텐데, 여기서 22가 넘지 않으면 10을 더해주고 넘으면 더하지 않으면 된다
                if ((ScoreASum + 10) <= 21) {
                    ScoreASum = ScoreASum + 10;
                }
            }
        }
        // userA와 userB가 어떤 카드를 받았는지 출력해보자
        System.out.println("[A user] Card");
        for (int i : userADeck) {
            if (i != -1) {
                // System.out.println(i + " "); A유저가 뽑은 카드 덱 번호 (출력되지 않아도 무관하므로 주석처리)
                System.out.println("카드 모양: " + cardShape[i / cardNumber.length]);
                System.out.println("카드 숫자: " + cardNumber[i % cardNumber.length]);
                System.out.println("--------------");
            }
        }
        System.out.println(" ");
        System.out.println("[B user] Card");
        for (int i = 0; i < userBIndex; i++) {
            // System.out.println(userBDeck[i] + " "); B유저가 뽑은 카드 덱 번호 (출력되지 않아도 무관하므로 주석처리)
            System.out.println("카드 모양: " + cardShape[userBDeck[i] / cardNumber.length]);
            System.out.println("카드 숫자: " + cardNumber[userBDeck[i] % cardNumber.length]);
            System.out.println("--------------");
        }
        System.out.println("***total userB 점수:" + ScoreBSum);
        System.out.println(" ");
    }
    // 승패 결정
    String playState = "계속 진행하세요 ===>";
    if(ScoreASum>21){
        playState = "B user 승리!";
    }else{
        if (ScoreBSum > 21) {
            playState = "A user 승리!";
        } else {
            if (ScoreASum > ScoreBSum) {
                playState = "A user 승리!";
            } else if (ScoreASum == ScoreBSum) {
                playState = "무승부!";
            } else {
                playState = "B user 승리!";
            }
        }
    }
    System.out.println(playState);
    }
}