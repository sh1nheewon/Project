package blackjack.service;

import java.util.Scanner;

import blackjack.model.CardDeckDto;

public class BlackJackServicePlayer {

	protected Scanner scan = null;
	public BlackJackServicePlayer() {
		scan = new Scanner(System.in);
	}
	
	public void mainMenu() {
		System.out.println(" BlackJack Game Start ");
		System.out.print("실행하려면 enter 를 눌러주세요");
		String start = scan.nextLine();
	}
	
	
	
	public void inputBlackJack() {
		CardDeckDto bDto = new CardDeckDto();
		String[] card = bDto.getPattern();
		
		System.out.printf("%s",card[5]);
		
		bDto.value = 0;
		
		for (int i = 1; i < 20; i++) {

			

			
			
			System.out.printf("%d 번째 카드 : ",i);		
			System.out.println(bDto.value);
		
			
			if (i == 1) {
				System.out.printf("점수 : %d\n",bDto.value);
				System.out.printf("%d 번째 카드를 뽑으려면 enter 를 눌러주세요\n", (i+1));
				String str = scan.nextLine();
				
			} 
			
			// 2장의 카드를 뽑고, 21점 초과일 시 패배, 21점이면 무승부(첫 2장 카드의 합이 21), 21점 미만은 계속 진행 가능
			
			if (i >= 2) {
				
				System.out.printf("점수 합 : %d\n", bDto.value);
				if(i == 2 && bDto.value == 21) { // 첫2장 카드 블랙잭 : 무승부 - 끝내기
					System.out.printf("첫 2 장 카드의 합 : %d , 무승부",bDto.value);
					break;
				}				
				if(bDto.value> 21) { // 21 초과 시 패배 - 끝내기
					System.out.printf("%d 장 카드의 합 : %d, 21 점 이상으로 패배하였습니다.\n",i,bDto.value);
					break;
				}else if(bDto.value== 21) { // 21이면 승리 - 끝내기 / return 쓰면 for 문 으로 바로 감
					System.out.printf("BlackJack!\n게임에서 승리하였습니다!\n",bDto.value);
					return;
				}
				while (true) {
					System.out.println("카드 1장 더 뽑으려면 'h' 키, 멈추려면 's' 키를 입력하세요");
					String choice = scan.nextLine();
					if (choice.equals("h")) {
						break; // break : while 멈추고 if(i >=2) 로 돌아가서 점수합 출력 후 다시 while 문으로 옴.
					} else if (choice.equals("s")) {
						return;
					} else if (!choice.equals("h") && !choice.equals("s")) {
						System.out.println("h 키나 s 키를 입력하세요");
						continue; // while 반복
					}
				}		
			}// end if(i>=2)
		}	//end for
}//end inputBlackJack
	
// continue : if 가 참이면 해당 루프의 다음조건식으로 넘어감 / break : 해당 루프 빠져나감 / return : 해당 메소드 종료
// void 안에서는 return 뒤에 아무것도 안붙임
	public void printBlackJack() { // s 누르면 여기로 옴
		this.inputBlackJack();// this.method 사용하려면 protected

	
			//System.out.println("s키 누름"); // s 키를 눌렀을 때 break. 출력 / return은 method 종료
			
		
	}

	

}// end for
