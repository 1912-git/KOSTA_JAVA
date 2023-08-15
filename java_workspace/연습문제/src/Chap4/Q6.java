package Chap4;

public class Q6 {

	public static void main(String[] args) {
		// 서로 다른 주사위인 경우
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7; j++) {
				if (i + j == 6)
					System.out.println(String.format("{%d, %d}", i, j));
			}
		}

		// 두 주사위가 동일하다고 여겨지는 경우
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 7; j++) {
				if (i + j == 6)
					System.out.println(String.format("{%d, %d}", i, j));
			}
		}
	}

}
