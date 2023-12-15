package blackjack.exec;

import blackjack.service.BlackJackPlay;

public class blackjack {
	public static void main(String[] args) {
		BlackJackPlay playerService = new BlackJackPlay();
		playerService.start();
		playerService.printBlackJack();
		
	}
}
