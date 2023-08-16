package Chap5;

public class Q1 {

	public static void main(String[] args) {
		// 다음은 배열을 선언하거나 초기화한 것이다.
		// 잘못된 것을 고르고 그 이유를 설명 하시오.
		// a. int[] arr[];
		// b. int[] arr = {1,2,3,};
		// c. int[] arr = new int[5];
		// d. int[] arr = new int[5] {1,2,3,4,5};
		// e. int arr[5];
		// f. int[] arr[] = new int[3][];

		// 답 :d,e
		// d번 - new int[]{1,2,3,4,5}에서는 대괄호[]안에 배열의 크기를 지정할 수 없다.
		// 괄호 {}안의 데이터의 개수에 따라 자동적으로 결정되기 때문이다.
		// e번 - 배열을 선언할때는 배열의 크기를 지정할 수 없음
	}

}
