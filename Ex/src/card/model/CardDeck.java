package card.model;

import java.util.ArrayList;
import java.util.List;

public class CardDeck { // 카드덱
	public void card() {
		String strSuit = "◆♥♠♣";
		String strDenomination = "A,2,3,4,5,6,7,8,9,10,K,Q,J";

		String[] suits = strSuit.split("");
		String[] denos = strDenomination.split(",");

		List<CardDeckDto> deckList = new ArrayList<CardDeckDto>();

		for (String suit : suits) {
			for (String deno : denos) {
				CardDeckDto dto = new CardDeckDto();
				dto.suit = suit;
				dto.denomination = deno;

				int value = 0;
				try {
					value = Integer.valueOf(deno);
					dto.value = value;
				} catch (Exception e) {
					if (deno.equals("A"))
						value = 1;
					else
						value = 10;
					dto.value = value;
				}
				deckList.add(dto);
			}

		}
		
	}
	public void Card() {
		
		int suitsNum = (int) (Math.random() * 4);
		int denosNum = (int) (Math.random() * 13);

		for (int i = 0; i < 6; i++) {
			
			CardDeckDto dto = new CardDeckDto();
			dto.denomination = denos[denosNum];
			dto.suit = suits[suitsNum];
			System.out.println(dto.getPattern()[i]);
		}	
	}
}
		
		
		// 카드 1장 출력
//		for(CardDeckDto dto : deckList) {
//			//System.out.println(dto.suit + dto.denomination + "," + dto.value);
//			for(String pattern : dto.getPattern()) {
//					System.out.println(pattern);
//				}
//			}

//		// 카드 52장 전체 보여주기
//		int cardLines = deckList.get(0).getPattern().length;
//		for (int line = 0; line < cardLines; line++) {
//			for (CardDeckDto dto : deckList) {
//				System.out.printf("%10s", dto.getPattern()[line]);
//			}
//			System.out.println();
//		}

//		// dto.getPattern()[0] 이면 1번 줄 52개, 5면 마지막 줄만 52개가 출력
//	
//		int cardLines = deckList.get(0).getPattern().length;
//		for(int i = 0 ; i < 2 ; i++) {
//			for(CardDeckDto dto : deckList) {
//				System.out.println(dto.getPattern()[i]);
//			}
//			}

//		// 카드 아래로 출력
//		for(CardDeckDto dto : deckList) {
//			//System.out.println(dto.suit + dto.denomination + "," + dto.value);
//			for(String pattern : dto.getPattern()) {
//					System.out.println(pattern);
//				}
//			}

	

