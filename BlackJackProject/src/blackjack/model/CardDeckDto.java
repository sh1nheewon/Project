package blackjack.model;

public class CardDeckDto {
	public String suit;
	public String denomination;
	
	public int value;
	public int playerPoint;
	
	
	public int playerPoint() {
		playerPoint += this.value;
		return playerPoint;
		
	}

	public String[] getPattern() {
		String pattern[] = {
			String.format("┌──────┐ "),
			String.format("│  %1s   │ ",this.suit),
			String.format("│      │ "),
			String.format("│      │ "),
			String.format("│  %2s  │ ",this.denomination),
			String.format("└──────┘ ")
		};
		return pattern;
	}
}
