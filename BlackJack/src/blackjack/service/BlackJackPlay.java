package blackjack.service;

import java.util.Scanner;

import blackjack.model.blackjackDto;

public class BlackJackPlay {

	blackjackDto bDto = new blackjackDto();
	Scanner scan = new Scanner(System.in);

	public void start() {
		System.out.println("=".repeat(50));
		System.out.println(" BlackJack Game Start ");
		System.out.print("실행하려면 enter 를 눌러주세요");
		String start = scan.nextLine();
		System.out.println("=".repeat(50));
	}

	public void inputBlackJack() {
		bDto.playerPoint = 0;
		bDto.dealerPoint = 0;
		String cardPattern[] = { "Club", "Diamond", "Spade", "Heart" };
		String cardNumber[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		int pattern = 0;
		int number = 0;
		bDto.cardSum = null;

		for (int i = 1; i < 53; i++) {
			pattern = (int) (Math.random() * cardPattern.length);
			number = (int) (Math.random() * cardNumber.length);

			bDto.cardSum = cardPattern[pattern] + cardNumber[number];

			if (bDto.cardSum == cardPattern[pattern] + cardNumber[number])
				continue;

			if (cardNumber[number] == "J" || cardNumber[number] == "Q" || cardNumber[number] == "K")
				number = 9;

			if (i % 2 == 0)
				bDto.dealerPoint += (number + 1);
			else
				bDto.playerPoint += (number + 1);

			if (i == 1) {
				if (bDto.cardSum == cardPattern[pattern] + cardNumber[number])
					continue;
				System.out.printf("카드 : %s\n player 점수 : %d\n\n dealer 차례 : enter\n", bDto.cardSum, bDto.playerPoint);
				String str = scan.nextLine();
			}
			if (i == 2) {
				if (bDto.cardSum == cardPattern[pattern] + cardNumber[number])
					continue;
				System.out.println("dealer 카드 획득 완료");
				System.out.println("player 카드 획득 : enter");
				// System.out.printf("dealer 카드 : %s\n dealer 점수 :
				// %d\n",bDto.cardSum,bDto.dealerPoint);
				String str = scan.nextLine();
			}
			if (i == 3) {
				if (bDto.cardSum == cardPattern[pattern] + cardNumber[number]) {
					continue;
				}
				System.out.printf("카드 : %s\n player 점수 : %d\n\n dealer 차례 : enter\n", bDto.cardSum, bDto.playerPoint);
				String str = scan.nextLine();
			}
			if (i == 4) {
				if (bDto.cardSum == cardPattern[pattern] + cardNumber[number]) {
					continue;
				}
				System.out.printf("dealer 카드 획득 완료\n");
				// System.out.printf("dealer 점수 : %s\n", bDto.dealerPoint);
				System.out.printf("player 총 점수 : %d\n", bDto.playerPoint);
			}
			if (i >= 4) {
				if (bDto.cardSum == cardPattern[pattern] + cardNumber[number]) {
					continue;
				}
				if (i >= 4 && bDto.dealerPoint < 17) {// dealer 점수 17미만이면 카드 획득
					bDto.dealerPoint += (number + 1);
					continue;
				}
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

				if (i == 4 && bDto.playerPoint >= 21)
					break;
				else if (i == 4 && bDto.dealerPoint >= 21)
					break;
			}
		} // end for
	}// end inputBlackJack

	public void printBlackJack() {
		this.inputBlackJack();

		while (true) {
			if (bDto.playerPoint > bDto.dealerPoint && bDto.playerPoint < 21) {
				System.out.println("Player 승");
				System.out.printf("Player 점수 : %d\n Player 획득 카드 : %s\n Dealer 점수 : %d\n ", bDto.playerPoint,
						bDto.cardSum, bDto.cardNumber);

			} else if (bDto.dealerPoint > bDto.playerPoint && bDto.dealerPoint < 21) {
				System.out.println("Dealer 승");
				System.out.printf("Player 점수 : %d\n Player 획득 카드 : %s\nDealer 점수 : %d\n", bDto.playerPoint,
						bDto.cardSum, bDto.cardNumber);

			} else if (bDto.playerPoint > 21 && bDto.playerPoint > bDto.dealerPoint) {
				System.out.println("Player LOSE!");
				System.out.printf("Player 점수 합 : %d\n Player 획득 카드 : %s\n Dealer 점수 : %d\n", bDto.playerPoint,
						bDto.cardSum, bDto.dealerPoint);

			} else if (bDto.dealerPoint > 21 && bDto.dealerPoint > bDto.playerPoint) {
				System.out.println("Dealer LOSE!");
				System.out.printf("Dealer 점수 합 : %d\n Player 획득 카드 : %s\n Playler 점수 : %d\n", bDto.dealerPoint,
						bDto.cardSum, bDto.playerPoint);

			} else if (bDto.playerPoint == 21) {
				System.out.println("Black Jack!");
				System.out.printf("Player 승리!\n Player 점수 : %d\n Player 획득 카드 : %s\n Dealer 점수 : %d\n",
						bDto.playerPoint, bDto.cardSum, bDto.dealerPoint);

			} else if (bDto.dealerPoint == 21) {
				System.out.println("Black Jack!");
				System.out.printf("Dealer 점수 합 : %d\n Dealer 승리\n Player 획득 카드 : %s\n Player 점수 : %d\n",
						bDto.dealerPoint, bDto.cardSum, bDto.playerPoint);

			} else if (bDto.playerPoint > 21 && bDto.playerPoint == bDto.dealerPoint) {
				System.out.println("무승부");
				System.out.printf("Player 점수 합 : %d\n Player 획득 카드 : %s\n Dealer 점수 : %d\n", bDto.playerPoint,
						bDto.cardSum, bDto.dealerPoint);
			}
			break;
		}
	}

}// end for
