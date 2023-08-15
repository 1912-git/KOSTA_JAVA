package Variable;

public class VariableTest {

	public static void main(String[] args) {
		char  ch = 'A';  //char :자료형, ch:변수명, = 대입연산자, 'A' :리터럴 데이터
		// true는 예약어 
		//$ 시작 변수 가능
		// 변수 와 메서드 이름의 첫 글자는 항상 소문자
		// 상수의 이름은 대문자 
		char up7;
		up7='7';
		ch='b';
		System.out.println(ch);// syso  /ctrl+spacebar
		byte b =127;   //01111111    -128~127
		int score=100;
		score=200;
		int i=10;
		float f= 1.25f;
		double d=3.14;
		boolean b2= true;
		String name="park";
		
		final double pi= 3.14;
		System.out.println(pi);
		//pi=3.141; //final 변수는 변경 불가능한 상수
	}

}
