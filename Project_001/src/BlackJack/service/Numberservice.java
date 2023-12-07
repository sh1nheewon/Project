/*
 * 문자나 숫자 입력 할 때
 * Numberservice numService = new Numberservice();
 * 사용
 */





package BlackJack.service;

import java.util.Scanner;

public class Numberservice {
	private Scanner scan = null;
	
	public Numberservice() {
		scan = new Scanner(System.in);
	}
	
		public int inputNumber(String title) {
		
		while (true) {
			
			System.out.print(title + " >> ");
			String str = scan.nextLine();
			int num = 0;
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.err.println("** 정확히 입력해 주세요 **");
				continue;
			}
			
			return num;
		}
	}
}
