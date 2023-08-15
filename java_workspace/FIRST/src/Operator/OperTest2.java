package Operator;

public class OperTest2 {

	public static void main(String[] args) {
		//부호연산자
		int i = -10;
		i = +i;
		System.out.println(i);
		i = -i;
		System.out.println(i);
		//부정연산자
		boolean power = false;
		power = !power;
		System.out.println(power);
		power = !power;
		System.out.println(power);
		//보수연산자
		int j = 10;
		System.out.println(j);
		j = ~j;
		System.out.println(j);
	}

}
