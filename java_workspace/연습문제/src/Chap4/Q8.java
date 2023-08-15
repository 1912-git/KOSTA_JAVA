package Chap4;

public class Q8 {
	// 방정식 2x+4y=10의 모든 해를 구하시오.
	// 단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.

	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if (2 * i + 4 * j == 10)
					System.out.println(String.format("x=%d, y=%d", i, j));
			}
		}

	}

}
