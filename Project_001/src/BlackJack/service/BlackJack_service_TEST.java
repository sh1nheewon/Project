package BlackJack.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import BlackJack.BlackJack;
import BlackJack.model.BlackJackDto;

public class BlackJack_service_TEST {
	private List<BlackJackDto> cards = null;
	private Scanner scan = null;

	public BlackJack_service_TEST() {
		scan = new Scanner(System.in);
		cards = new ArrayList<BlackJackDto>();
	}

	InputStream is = null;
	BlackJack blackJack = new BlackJack();

	String[] lines = null;

//	int card = 0;
//		card = (int) (Math.random() * 13) + 1;

	

	public void inputScores() {
		BlackJackDto bDto = new BlackJackDto();
		int num = 0;
		String pattern = ""; 
		int clubCard = 0;				
				for(int i = 1 ; i < 4 ; i++) {
				int rndNum = (int) (Math.random() * 13) + 1;
								
				if(num == 1) {
					pattern = "A";
				}else if(num == 11) {
					pattern = "J";
				}else if(num == 12) {
					pattern = "Q";
				}else if(num == 13) {
					pattern = "K";
				}
					
				clubCard = bDto.Clubs[rndNum];
				}
				System.out.printf("%d",clubCard);
			//	System.out.printf("%d\t%d\t%d\t%d\t",
			//			bDto.Clubs[3],bDto.Hearts[1],bDto.Spades[2],bDto.Diamonds[0]);
	}	
		

		

}
