package Chap4;

public class Q3 {

	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		int sum = 0;
		int totalsum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
			totalsum += sum;
		}
		System.out.println("totalsum:" + totalsum);
	}

}
