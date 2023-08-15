package Variable;
public class CastTest {

	public static void main(String[] args) {
		
		byte bt = 10;
		int i = bt; // 자동 형변환
		byte bt2 = (byte) i;

		short bt3 = (short) i;

		float f = i;

		int i2 = (int) f; // 소숫점 잘림

		double d = f;
		float f2 = (float) d; // 큰 타입에서 작은타입 형변환
		
		// (주의) long과 float : 크기는 long이 더 크지만 자동 형변환은 float이 가능함.
        long l = (long)f;	//long 빼고 작은거에서 큰거 형변환은 다 생략가능
        float  f3 = l;
        byte b=10;
        char ch='A';
        int a=10;
        ch=(char) b;//형이 다른건 무조건 생략불가능
        float e=b;
        float h=a;
        
        
        
		
	}

}
