package Chap3;

public class Q10 {
	

	public static void main(String[] args) {
//		다음은 대문자를 소문자로 변경하는 코드인데 문자 에 저장된 문자가 대문자 , ch
//		인 경우에만 소문자로 변경한다 문자코드는 소문자가 대문자보다 만큼 더 크다 예를 . 32 .
//		들어 의 코드는 이고 의 코드는 이다 에 알맞은 코드를 넣으시오 'A‘ 65 ’a' 97 . (1)~(2) .

		char ch = 'A';
		char lowerCase = (('A'<=ch||ch<='Z' ) ? (char)(ch+32)  : ch);
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
	}

}
