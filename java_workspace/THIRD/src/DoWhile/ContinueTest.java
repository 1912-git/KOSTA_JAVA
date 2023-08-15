package DoWhile;

public class ContinueTest {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			// if(i%2==0) sum +=i;
			if (i % 2 != 0)
				continue;
			sum += i;
		}
		System.out.println(sum);

		sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0 || i % 7 == 0) {
				continue;
			} else {
				sum += i;
			}
		}
	}

}
