package BlackJack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import BlackJack.model.BlackJackDto;

public class BlackJack {
	private Scanner scan;
	private List<BlackJackDto> cards = null;	
	InputStream is = null;
	public 
		
		BlackJack blackJack = new BlackJack();
	
		
		
		
		
		try {
		//	is = new FileInputStream();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		scan = new Scanner(is);
		cards = new ArrayList<>();
		
		
		}
	
	
	
	
	

	while(scan.hasNext()) {
		String line = scan.nextLine();
		
		CardsDto cardsDto = new CardsDto();
			
			for(int i = 2 ; i < 10 ; i++) {
				String[]  = new String[i];
			
			try {
				BlackJackDto.Diamonds = lines[0];
				BlackJackDto.Hearts = lines[1];
				BlackJackDto.Spades = lines[2];
				BlackJackDto.Clubs = lines[3];
				
			}catch (Exception e) {
				
				System.out.println(lines);
				break;
			}
			cards.add(BlackJackDto);
			System.out.println(lines[i]);
			}
			}
}		
}

