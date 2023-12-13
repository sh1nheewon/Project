package blackjack.service;

import java.util.List;
import java.util.Scanner;

import blackjack.model.blackjackDto;

public class bService_Player2 {
	protected List<blackjackDto> cards =null;
	blackjackDto bDto = new blackjackDto();
	Scanner scan = new Scanner(System.in);
	
	public
	
	public void start() {
		System.out.println(" BlackJack Game Start ");
		System.out.print("실행하려면 enter 를 눌러주세요");
		String start = scan.nextLine();
	}
	
	protected void inputBlackJack() {
		bDto.playerPoint = 0;
		bDto.dealerPoint = 0;
		String cardPattern[] = { "Club", "Diamond", "Spade", "Heart" };
		String cardNumber[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		int pattern = 0;
		int number = 0;
		bDto.cardSum = null;
		
		for (int i = 1; i < 52; i++) {
			pattern = (int) (Math.random() * cardPattern.length);
			number = (int) (Math.random() * cardNumber.length);
			bDto.cardSum = cardPattern[pattern] + cardNumber[number]; // 문자 배열에 있는 카드 문양 번호를 랜덤으로 뽑기 + 문자 배열의 숫자. 두가지 합한 값을 cardSum
			if (cardNumber[number] == "J" || cardNumber[number] == "Q" || cardNumber[number] == "K") {
				number = 9; // 배열이 0부터 시작하기 때문에 cardNumber[9] 는 10 
			}
			while(true) {
				
			if (i > 1 && bDto.cardSum == bDto.cardSum) { // 중복방지
				System.out.println("중복");
				continue;
			}
			break;
			}
			
			
			
			
			
			
			bDto.playerPoint += (number + 1);
			bDto.dealerPoint += (number + 1);
			System.out.printf("%d 번째 카드 : %s",i,bDto.cardSum);		
			
			if(i == 1) { // i 의 값이 짝수 : player
				number = bDto.playerPoint;
			}else if(i == 2){ // i 의 값이 홀수 : dealer
				number = bDto.dealerPoint;
			}
			if (i < 4) {
				
				System.out.printf("점수 : %d / dealer : %d\n",bDto.playerPoint, bDto.dealerPoint);
				System.out.printf("%d 번째 카드를 뽑으려면 enter 를 눌러주세요\n", (i+1));
				String str = scan.nextLine();
				
			} 
			
			// 2장의 카드를 뽑고, 21점 초과일 시 패배, 21점이면 무승부(첫 2장 카드의 합이 21), 21점 미만은 계속 진행 가능
			
			if (i >= 4) {
				
				System.out.printf("점수 합 : %d\n", bDto.playerPoint);
				if(i >= 4 && bDto.playerPoint == 21) { // 첫2장 카드 블랙잭 : 무승부 - 끝내기
					System.out.printf("첫 2 장 카드의 합 : %d , 무승부",bDto.playerPoint);
					break;
				}				
				if(bDto.playerPoint > 21) { // 21 초과 시 패배 - 끝내기	
					break;
				}else if(bDto.playerPoint == 21) { // 21이면 승리 - 끝내기 / return 쓰면 for 문 으로 바로 감
					break;
				}
				
				while (true) {
					System.out.println("카드 1장 더 뽑으려면 'h' 키, 멈추려면 's' 키를 입력하세요");
					String choice = scan.nextLine();
					if (choice.equals("h")) {
						break; // break : while 멈추고 if(i >=2) 로 돌아가서 점수합 출력 후 다시 while 문으로 옴.
					} else if (choice.equals("s")) {
						return;
					} else if (!choice.equals("h") && !choice.equals("s")) {
						System.out.println("h 키나 s 키를 입력하세요");
						continue; // while 반복
					}
				}	
				
			}// end if(i>=2)
		}	//end for
}//end inputBlackJack
	
// continue : if 가 참이면 해당 루프의 다음조건식으로 넘어감 / break : 해당 루프 빠져나감 / return : 해당 메소드 종료
// void 안에서는 return 뒤에 아무것도 안붙임
	public void printBlackJack() { // s 누르면 여기로 옴
		this.inputBlackJack();// this.method 사용하려면 protected

		while (true) {
			
			//System.out.println("s키 누름"); // s 키를 눌렀을 때 break. 출력 / return은 method 종료
			if (bDto.playerPoint > bDto.dealerPoint && bDto.playerPoint < 21) {
				System.out.println("Player 승");
				System.out.printf("Player 점수 : %d\n딜러 점수 : %d\n", bDto.playerPoint, bDto.cardNumber);
			} else if (bDto.dealerPoint > bDto.playerPoint && bDto.dealerPoint < 21) {
				System.out.println("Dealer 승");
				System.out.printf("Player 점수 : %d\n딜러 점수 : %d\n", bDto.playerPoint, bDto.cardNumber);
			}else if(bDto.playerPoint > 21) {
				System.out.println("Player LOSE!");
				System.out.printf("Player 점수 합 : %d, 21 점 이상으로 패배하였습니다.",bDto.playerPoint);
			}else if(bDto.dealerPoint > 21) {
				System.out.println("Dealer LOSE!");
				System.out.printf("Dealer 점수 합 : %d, 21 점 이상으로 패배하였습니다.",bDto.dealerPoint);
			}else if(bDto.playerPoint == 21) {
				System.out.println("Black Jack!");
				System.out.printf("Player 점수 합 : %d, Player 승리",bDto.playerPoint);
			}else if(bDto.dealerPoint == 21) {
				System.out.println("Black Jack!");
				System.out.printf("Dealer 점수 합 : %d, Dealer 승리",bDto.dealerPoint);
			}
			break;
		}
	}

	

}// end for
