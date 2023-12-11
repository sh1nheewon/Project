package blackjack.exec;

import blackjack.service.bService_Player;

public class blackjack {
	public static void main(String[] args) {
		bService_Player playerService = new bService_Player();
		playerService.start();
		playerService.inputBlackJack();
		playerService.printBlackJack();
	
		
	}
}
