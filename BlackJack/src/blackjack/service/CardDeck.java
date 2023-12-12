package blackjack.service;

import java.util.Scanner;

import blackjack.model.blackjackDto;

public class CardDeck {
	Scanner scan = null;
	blackjackDto bDto = new blackjackDto();
	public void CardDeck() {
			
	bDto.cardPattern = null;//{ bDto.Club , bDto.Diamond, bDto.Spade, bDto.Heart };
	String[] cardNumber = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	int pattern = 0;
	int number = 0;
	bDto.cardSum = null;
	
	}
	
	public void Play() {
		
		for (int i = 1; i < bDto.getCard().length(); i++) {

			int pattern = (int) (Math.random() * bDto.cardPattern().length());
			int number = (int) (Math.random() * cardNumber.length);

			// 문자 배열에 있는 카드 문양 번호를 랜덤으로 뽑기 + 문자 배열의 숫자. 두가지 합한 값을 cardSum
			bDto.cardSum = cardPattern[pattern] + cardNumber[number]; 
			System.out.printf("%d 번째 카드 : ",i);		
			System.out.println(bDto.cardSum);
			if (cardNumber[number] == "J" || cardNumber[number] == "Q" || cardNumber[number] == "K") {
				number = 9;
			}
			bDto.playerPoint += (number + 1);
			if (i == 1) {
				System.out.printf("점수 : %d\n",bDto.playerPoint);
				System.out.printf("%d 번째 카드를 뽑으려면 enter 를 눌러주세요\n", (i+1));
				String str = scan.nextLine();
				if (bDto.cardSum == cardPattern[pattern] + cardNumber[number]) {
					continue;
				}
			} 
			
			// 2장의 카드를 뽑고, 21점 초과일 시 패배, 21점이면 무승부(첫 2장 카드의 합이 21), 21점 미만은 계속 진행 가능
			
			if (i >= 2) {
				if (bDto.cardSum == cardPattern[pattern] + cardNumber[number]) {
					continue;
				}
				System.out.printf("점수 합 : %d\n", bDto.playerPoint);
				if(i == 2 && bDto.playerPoint == 21) { // 첫2장 카드 블랙잭 : 무승부 - 끝내기
					System.out.printf("첫 2 장 카드의 합 : %d , 무승부",bDto.playerPoint);
					break;
				}				
				if(bDto.playerPoint > 21) { // 21 초과 시 패배 - 끝내기
					System.out.printf("%d 장 카드의 합 : %d, 21 점 이상으로 패배하였습니다.\n",i,bDto.playerPoint);
					break;
				}else if(bDto.playerPoint == 21) { // 21이면 승리 - 끝내기 / return 쓰면 for 문 으로 바로 감
					System.out.printf("BlackJack!\n게임에서 승리하였습니다!\n",bDto.playerPoint);
					return;
				}
				while (true) {
					System.out.println("카드 1장 더 뽑으려면 'h' 키, 멈추려면 's' 키를 입력하세요");
					String choice = scan.nextLine();
					if (choice.equals("h")) {
						break; // break : while 멈추고 if(i >=2) 로 돌아가서 점수합 출력 후 다시 while문으로 옴.
					} else if (choice.equals("s")) {
						return;
					} else if (!choice.equals("h") && !choice.equals("s")) {
						System.out.println("h 키나 s 키를 입력하세요");
						continue; // while 반복
					}
				}		
			}// end if(i>=2)
		}	//end for
	}
	
}
