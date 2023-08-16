package Chap4;

public class Q1 {

	public static void main(String[] args) {
		// 조건식으로 표현하기
				// 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
				int x = 10;
				if(x > 10 && x < 20) {};
						
				// 2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
				char ch = 'a';
				if(ch!=' ' && ch!='\t') {};
				
				// 3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
				if(ch=='x' || ch=='X') {};
				
				// 4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
				if(ch>=0 && ch<=9) {};
				
				// 5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
				if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z') {};
				
				// 6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식
				int year = 2023;
				if (year%400==0 || year%4==0 && year%100!=0) {};
				
				// 7. boolean형 변수 powerOn가 false일 때 true인 조건식
				boolean powerOn = false;
				if(!powerOn) {};
				
				// 8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
				String str = "yes";
				if(str.equals("yes"));

		}
	}


