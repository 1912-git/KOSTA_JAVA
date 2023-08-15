package Chap4;

public class Q13 {

	public static void main(String[] args) {
		// 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다.

        String value = "12o34";
        char ch=' ';
        boolean isNumber = true;
        // 반복문과 charAt(int i)를 이용해서 문자열의 문자를 // 하나씩 읽어서 검사한다.
        for(int i=0; i < value.length() ;i++) {
            if(value.charAt(i)>=65) isNumber = false;
        }

        /*
        ch = value.charAt(i);
        if(!(ch>='0' && ch <= '9')){
            isNumber = false;
            break;
            }
        }
        */
        if (isNumber) {
            System.out.println(value+"는 숫자입니다.");
        }else{
            System.out.println(value+"는 숫자가 아닙니다.");
        }
	}

}
