package BlackJack;

import java.util.List;
import java.util.Scanner;

import BlackJack.Blackjack_model.CardsDto;

public class BlackJack {
	private Scanner scan;
	private List<CardsDto> cards = null;	
	
public void loadCards() {
		
		while(scan.hasNext()) {
			String line = scan.nextLine();
			CardsDto cardsDto = new CardsDto();
			
			for(int i = 2 ; i < 10 ; i++) {
				String[] lines = new String[i];
			
			try {
				cardsDto.Diamonds = lines[0];
				cardsDto.Hearts = lines[1];
				cardsDto.Spades = lines[2];
				cardsDto.Clubs = lines[3];
				
			}catch (Exception e) {
				System.out.println("데이터 읽는 중 오류 발생");
				System.out.println(lines);
				break;
			}
			cards.add(cardsDto);
			System.out.println(lines[i]);
			}
			}
}		
}

