package Chap5;

public class Q12 {

	public static void main(String[] args) {
			//3m짜리 우물에 바닥에 달팽이가 있다.
			//달팽이는 낮동안 55cm 올라올 수 있다.
			//하지만 날이 지면 잠을 자야 한다. 자는 동안 3cm를 미끄러져 내려온다.
			//달팽이가 우물 밖으로 나오는데 몇일이 걸릴까?
			//반복문과 조건문을 이용하여 프로그램을 작성하시오.
			int depth=300;
			int d=0;
	
			while(true) {
				if(depth>300)
					break;
				d++;
				depth=52*d;
			
			}
			System.out.println(d);
//   ----------------------------------------------------
			int depth2=3*100,height=0;
			final int up=55;
			final int down=3;
			int days=0;
			
			while(true) {
				height+=up;
				height-=down;
				days++;
				if(depth2<=height) break;
				
				
			}
			System.out.println(days);
			
	}

}
