package blackjack.exec;

import blackjack.service.BlackJackServicePlayer;

public class BlackJack {
	public static void main(String[] args) {
		BlackJackServicePlayer blackJack = new BlackJackServicePlayer();
		blackJack.mainMenu();
		blackJack.inputBlackJack();		

		
	}
}
