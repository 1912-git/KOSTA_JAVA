package Chap3;

public class Q4 {

	public static void main(String[] args) {
//		아래는 변수 의 값 중에서 백의 자리 이하를 버리는 코드이다 만일 변수 num . num
//		의 값이 ‘456’ ‘400’ , ‘111’ ‘100’ 이라면 이 되고 이라면 이 된다 에 알맞은 코드를 (1)에 넣으
//		시오
		
		int num = 456;
		System.out.println(num-num%100);  //숫자-숫자/100 나머지
	}

}
