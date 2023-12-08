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

	int card[] = new int[3];

	public void inputScores() {
		BlackJackDto bDto = new BlackJackDto();
		
			
			int num = 0;
			while (true) { // 1~13 숫자 나열
				num++;
				if (num > 13) {
					break;
				}
				
				for (int i = 0; i < 4; i++) {
		}
		System.out.println(num);
		} // end while

		// System.out.println(card);
	}

}
