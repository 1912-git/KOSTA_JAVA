package ForWhile;

public class ForTest {

	public static void main(String[] args) {
		// 1~50까지 출력
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);

		// 예제 구구단 2단
		for (int i = 1; i < 10; i++) {
			System.out.println("2x" + i + "=" + i * 2);
		}

		// 예제 구구단 2단~9단
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				// System.out.print(j+"X"+i+"="+i*j + " ");
				System.out.print(String.format("%dX%d=%2d\t", j, i, j * i));
			}
			System.out.println();
		}
	}

}
