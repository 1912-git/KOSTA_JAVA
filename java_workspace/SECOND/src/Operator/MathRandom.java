package Operator;

public class MathRandom {

	public static void main(String[] args) {
		// Math.random은 0보다 크거나 같고 1보다 작은(1과 같지 않음) 랜덤한 실수 값을 무작위로 출력

		// 1. 1~10 범위의 정수
		// 0부터 1 이전까지 이므로 플러스 1을 해야 1부터 10까지의 정수가 랜덤으로 출력됨
		int i = (int) (Math.random() * 10) + 1;

		// 예제) 로또 번호(1~45)를 랜덤하게 출력
		int rotto = (int) (Math.random() * 45) + 1; // 0보다 크거나 같고 45보다 작은 범위로 만든 후 1을 더하면 됨
		System.out.println(rotto);
	}

}
