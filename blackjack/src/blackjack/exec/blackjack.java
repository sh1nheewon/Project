package blackjack.exec;

import blackjack.service.bService;

public class blackjack {
	public static void main(String[] args) {
		bService bjService = new bService();
		bjService.inputBlackJack();
		bjService.printBlackJack();
	}
}
