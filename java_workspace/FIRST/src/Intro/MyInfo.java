package Intro;

public class MyInfo {

	public static void main(String args[]) {
		
		
		String name="박철현";		//이름을 저장할 변수 선언하여 본인이름 할당
		String age="만25";//문자열 , int age=25; 숫자로도 가능		//나이를 저장할 변수 선언하여 본인나이 할당
		float h=171.1f;		//키를 저장할 변수 선언하여 본인키 소숫점까지 할당
		double h2=180.5d;
		char g= 'M';		//남여 구분을 저장할 변수를 선언하여 본인 성별 할당 'F' or'M'
		
		
		//자바 기본 형식
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("키:"+h);
		System.out.println("키 희망:"+h2);
		System.out.println("성별:"+g);
		
		
		System.out.println(String.format("%s,%s,%f,%f,%c",name,age,h,h2,g)); //c언어 printf 형식
	
		
		
		
		
		
	}

}
