package Chap5;

public class Q3 {

	public static void main(String[] args) {
		// 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; // 배열의 0부터 4까지 계속더함
		}
		System.out.println("sum=" + sum); // 결과 : sum=150

	}

}
