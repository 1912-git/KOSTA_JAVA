package ForWhile;

public class BreakTest {

	public static void main(String[] args) {
		outer : for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                System.out.print("*");
                if(i==j) break; // break는 반복문을 종료함. 하지만 모든 반복문을 빠져나오는 것이 아닌 자신을 싸고 있는 가장 가까운 반복문을 종료함.
                //if(i==j) break outer; // break outer은 outer이 붙어있는 반복문을 빠져나감
            }
            System.out.println();
        }
	}

}
