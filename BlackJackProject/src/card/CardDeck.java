package card;

import java.util.ArrayList;
import java.util.List;

import blackjack.model.CardDeckDto;

public class CardDeck { 
	public void card() {
		String strSuit = "◆♥♠♣";
		String strDenomination = "A,2,3,4,5,6,7,8,9,10,K,Q,J";

		String[] suits = strSuit.split("");
		String[] denos = strDenomination.split(",");

		List<CardDeckDto> deckList = new ArrayList<CardDeckDto>();

		int suitsNum = (int) (Math.random() * 4);
		int denosNum = (int) (Math.random() * 13);
		int value = 0;

		CardDeckDto dto = new CardDeckDto();
		for (String suit : suits) {
			for (String deno : denos) {
				dto = new CardDeckDto();
				dto.suit = suit;
				dto.denomination = deno;

				value = 0;
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
		
			
		

		for (int i = 0; i < 6; i++) {
			dto.denomination = denos[denosNum];
			dto.suit = suits[suitsNum];
			
			
			System.out.println(dto.getPattern()[i]); // >>>> 카드1장
			try {
				value = Integer.valueOf(dto.denomination);
			} catch (Exception e) {
				if (dto.denomination.equals("A"))
					value = 1;
				else if (dto.denomination.equals("J"))
					value = 10;
				else if (dto.denomination.equals("Q"))
					value = 10;
				else if (dto.denomination.equals("K"))
					value = 10;
			}
		}
		dto.value = value;
		deckList.add(dto);
		System.out.printf("점수 : %s\n", dto.value); // >>>> 카드 1장의 점수
	}

}

//}
		
		
		// 카드 1장 출력


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
