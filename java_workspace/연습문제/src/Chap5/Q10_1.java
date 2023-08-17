package Chap5;


public class Q10_1 {

	public static void main(String[] args) {
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
				'(', ')', '-', '_', '+', '=', '|', '[', ']', '{', '}', ';',
				':', ',', '.', '/' };
						 // 0	 1	  2	   3    4    5    6    7    8    9 
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };

		String result = "`~!wer";
		String src = "";
		
		for(int i = 0;i < result.length();i++) {
			char ch = result.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				for(int j = 0;j < numCode.length;j++) {
					if(ch == numCode[j]) {
						src += j;
					}
				}
			} else {
				for(int j = 0;j < abcCode.length;j++) {
					if(ch == abcCode[j]) {
						src += (char) (j + 'a');
					}
				}
			}
		}
		
		System.out.println(src);
		
		// src: abc123
	}
}


