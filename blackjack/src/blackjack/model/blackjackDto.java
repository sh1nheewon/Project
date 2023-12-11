package blackjack.model;

public class blackjackDto {

	public String cardPattern ;
	public String cardNumber ;
	
	public String cardSum;
	
	public String getCard() {
		cardSum = cardPattern + cardNumber;
		return cardSum;
	}
	
	
	
	public int playerPoint;
	public int dealerPoint;
	
	public String playerCard;
	public String dealerCard;
	
}
