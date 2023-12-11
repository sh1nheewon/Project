package blackjack.service;

import java.util.Scanner;

import blackjack.model.blackjackDto;

public class bService_Dealer {

	blackjackDto bDto = new blackjackDto();
	Scanner scan = new Scanner(System.in);

	String cardPattern[] = { "Club", "Diamond", "Spade", "Heart" };
	String cardNumber[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	public void number1() {	
		String start = scan.nextLine();
		bDto.dealerPoint = 0;
		int pattern = 0;
		int number = 0;
		String cardSum = null;
	}
	public void number2() {
		this.number1();
		
		for (int i = 0; i < 20; i++) {

			int pattern = (int) (Math.random() * cardPattern.length);
			int number = (int) (Math.random() * cardNumber.length);

			// 문자 배열에 있는 카드 문양 번호를 랜덤으로 뽑기 + 문자 배열의 숫자. 두가지 합한 값을 cardSum
			String cardSum = cardPattern[pattern] + cardNumber[number]; 
			if (cardNumber[number] == "J" || cardNumber[number] == "Q" || cardNumber[number] == "K") {
				number = 9;
			}

			if (i == 1) {
				System.out.printf("%d 번째 카드를 뽑으려면 enter 를 눌러주세요\n", (i + 1));
				String start = scan.nextLine();
				if (cardSum == cardPattern[pattern] + cardNumber[number]) {
					continue;
				}
			} else if (i == 2) {
				if (cardSum == cardPattern[pattern] + cardNumber[number]) {
					continue;
				}
				System.out.printf("점수 합 : %d\n", bDto.dealerPoint);
				while (true) {

					System.out.println("카드 1장 더 뽑으려면 'h' 키, 멈추려면 's' 키를 입력하세요");
					String choice = scan.nextLine();
					if (choice.equals("h")) {
						break;
					} else if (choice.equals("s")) {
						return;
					} else if (!choice.equals("h") && !choice.equals("s")) {
						System.out.println("h 키나 s 키를 입력하세요");
						continue;
					}
				}
				bDto.dealerPoint += (number + 1);
			}
		}
			
//			} else if (i == 3) {
//			if (cardSum == cardPattern[pattern] + cardNumber[number]) {
//				continue;
//
//			}
//
//			System.out.printf("%d 번째 카드 : %s\n", (i + 1), cardSum);
//
//		}
//
//	}
//	public void play () {
//		this.inputBlackJack();
//		
//		
	}


}// end for
