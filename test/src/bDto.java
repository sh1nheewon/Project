//카드덱 - 52개의 서로 다른 카드 갖고있음
//카드 1장을 뽑아준다

//카드 - 다이아, 하트, 스페이드, 클럽 중 1가지 무늬를 가짐
//		A,2~10,J,Q,K 중 하나를 가짐

//규칙 - 점수 측정
//		승패 판단

//딜러 - 추가 카드 획득
//단, 2장의 카드 합이 16 이하이면 반드시 1장 추가
// 17 이상이면 획득 x 
// 뽑은 카드 소유 및 카드 오픈

//게이머 - 추가 카드 획득
// 뽑은 카드 소유 및 카드 오픈
public class bDto {
	private String pattern;
	private String number;
	
	public String getPattern() {
		return pattern;
	}
	public String getNumber() {
		return number;
	}
	
}
