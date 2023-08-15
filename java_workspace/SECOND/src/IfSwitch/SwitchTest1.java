package IfSwitch;
import java.util.Scanner;
public class SwitchTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 사용자에게 직접 입력을 받을 때 사용
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();//화면에서 입력받은 정수를 변수에 저장
		System.out.print("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();

		int total = (kor + math + eng);
		int avg = total / 3;
		System.out.println("국어 점수 = " + kor + ", 수학 점수 = " + math + ", 영어 점수 = " + eng);
		System.out.println("점수 합계 = " + total);
		System.out.println("점수 평균 = " + avg);

		// 본격 switch문
		switch (avg / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break; // 특정 케이스문에 해당이 되어도 break가 없으면 아래도 계속 처리가 진행됨.
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default: // if문에서 else에 해당이 됨. 다만 정수 혹은 문자 형태의 데이터만 출력 가능함
			System.out.println("F");
		}
	}

}
