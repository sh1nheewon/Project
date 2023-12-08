package BlackJack.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import BlackJack.BlackJack;
import BlackJack.model.BlackJackDto;

public class BlackJack_service {
	private List<BlackJackDto> cards = null;
	private Scanner scan = null;

	public BlackJack_service() {
		scan = new Scanner(System.in);
		cards = new ArrayList<BlackJackDto>();
	}

	InputStream is = null;
	BlackJack blackJack = new BlackJack();

	public static void main(String[] args) {
		BlackJack blackJack = new BlackJack();

	}

}
