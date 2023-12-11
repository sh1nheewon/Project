package blackjack.service;

import java.util.Scanner;

import blackjack.model.blackjackDto;

public class bService_Player {

	blackjackDto bDto = new blackjackDto();
	Scanner scan = new Scanner(System.in);

	public void inputBlackJack() {
		// System.out.println(" BlackJack Game Start ");
		// System.out.print("실행하려면 enter 를 눌러주세요");
		String start = scan.nextLine();
		bDto.playerPoint = 0;


		String cardPattern[] = { "Club", "Diamond", "Spade", "Heart" };
		String cardNumber[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		int pattern = 0;
		int number = 0;
		bDto.cardSum = null;

		for (int i = 0; i < 20; i++) {

			pattern = (int) (Math.random() * cardPattern.length);
			number = (int) (Math.random() * cardNumber.length);

			// 문자 배열에 있는 카드 문양 번호를 랜덤으로 뽑기 + 문자 배열의 숫자. 두가지 합한 값을 cardSum
			bDto.cardSum = cardPattern[pattern] + cardNumber[number]; 
			if (cardNumber[number] == "J" || cardNumber[number] == "Q" || cardNumber[number] == "K") {
				number = 9;
			}

			if (i == 1) {
				System.out.printf("%d 번째 카드를 뽑으려면 enter 를 눌러주세요\n", (i + 1));
				start = scan.nextLine();
				if (bDto.cardSum == cardPattern[pattern] + cardNumber[number]) {
					continue;
				}
			} else if (i == 2) {
				if (bDto.cardSum == cardPattern[pattern] + cardNumber[number]) {
					continue;
				}
				System.out.printf("점수 합 : %d\n", bDto.playerPoint);
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
			} else if (i == 3) {
			if (bDto.cardSum == cardPattern[pattern] + cardNumber[number]) {
				continue;
			}

			}
			bDto.playerPoint += (number + 1);

			System.out.printf("%d 번째 카드 : %s\n", (i + 1), bDto.cardSum);
		}
	}
	public void printBlackJack() { // s 누르면 여기로 옴
		System.out.println("리턴");
		while (true) {
			System.out.println("s키 누름"); // s 키를 눌렀을 때 break. 출력 / return은 method 종료
			if (bDto.playerPoint > bDto.dealerPoint) {
				System.out.println("Player 승");
				System.out.printf("Player 점수 : %d\n딜러 점수 : %d\n", bDto.playerPoint, bDto.cardNumber);
			} else if (bDto.dealerPoint > bDto.playerPoint) {
				System.out.println("Dealer 승");
				System.out.printf("Player 점수 : %d\n딜러 점수 : %d\n", bDto.playerPoint, bDto.cardNumber);
			}
			break;
		}
	}

	// }else if(cardNumber[number] == "Q") {
	// number = 9;
	// }else if(cardNumber[number] == "K") {
	// number = 9;

	// }

	// System.out.printf("%d 번째 카드를 뽑으려면 enter 를 눌러주세요",i+2);

	// if(i == 5) {
	// System.out.println(playerPoint);
	// start = scan.nextLine();
	// if(start.equals("")) {
	// continue; // if 문 을 끝내고 for 문 반복 실행
	// }else {
	// System.err.println("enter 키를 눌러주세요");
	// return; //

}// end for
