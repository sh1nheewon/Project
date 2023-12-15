package blackjack.exec;

import blackjack.service.bService_Player2;

public class blackjack2 {
	public static void main(String[] args) {
		bService_Player2 playerService = new bService_Player2();
		playerService.start();
		
		
		playerService.printBlackJack();
		
	}
}
