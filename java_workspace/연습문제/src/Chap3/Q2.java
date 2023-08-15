package Chap3;

public class Q2 {

	public static void main(String[] args) {
		// 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
        // 만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면,
        // 13개의 바구니가 필요할 것이다.
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
		int numOfBucket = (numOfApples%sizeOfBucket==0 ? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket+1); 
		// numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0)
		//삼항연산자  --사과의 개수/하나의 바구니 사과 담을수 있는 개수 나머지가 0이면 나누고 아니면 나누고 +1
		// 모든 사과를 담는데 필요한 바구니의 수
		System.out.println("필요한 바구니의 수 :"+numOfBucket);
	}

}
