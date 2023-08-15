package Operator;

public class NullTest {

	public static void main(String[] args) {
		String str = null;
		str += "A";
		System.out.println(str); // nullA로 출력

		String str1 = "";
		str1 += "A";
		System.out.println(str1); // A로 출력

	}

}
