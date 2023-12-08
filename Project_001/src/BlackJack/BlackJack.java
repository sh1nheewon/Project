package BlackJack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import BlackJack.service.Numberservice;

public class BlackJack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dealerSum = 0;
		int playerSum = 0;

		int card1 = 0;

		List<String> player = new ArrayList<>();

		// 4가지 랜덤 무늬 + 13장의 랜덤 카드( A, 2~10, KQJ(10) )
		// 문자열배열 + 13개 숫자

		Numberservice numService = new Numberservice();

		numService.inputNumber("추가 hit 멈춤 stop ");

		while (true) {
			card1 = (int) (Math.random() * 13) + 1;

		}

	}
}