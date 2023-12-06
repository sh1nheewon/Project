package BlackJack.service;

import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import BlackJack.BlackJack;
import BlackJack.model.BlackJackDto;

public class BlackJack_service {
	private Scanner scan = null;
	private List<BlackJackDto> cards = null;
	InputStream is = null ;
	BlackJack blackJack = new BlackJack();

	public BlackJack_service() { 
		scan = new Scanner(System.in);
	}
	
	
public static void main(String[] args) {
	BlackJack blackJack = new BlackJack();
		
	
	}
		
}


