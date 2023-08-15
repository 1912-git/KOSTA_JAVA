package Chap4;

public class Q12 {

	public static void main(String[] args) {
		for (int i = 1, dan = 2; i < 3; i++, dan += 3) {
			for (int j = 1; j <= 3; j++) {
				for (int k = dan; k <= ((dan + 2 < 10) ? dan + 2 : 9); k++) {
					System.out.print(String.format("%d*%d=%2d\t", k, j, k * j));
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}
