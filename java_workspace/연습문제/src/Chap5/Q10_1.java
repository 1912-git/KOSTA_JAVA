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
			int idx=-1;
//			for(int j=0; j<abcCode.length;j++) {
//				if(ch==abcCode[j]) {
//					idx=j;
//					break;
//				}
//			}
//			src+='a'+idx;
			
			if(ch >= 'a' && ch <= 'z') {
				for(int j = 0;j < numCode.length;j++) {
					if(ch == numCode[j]) {
						src += j;  //idx=j;
									//break;
					}
				}
			} else {
				for(int j = 0;j < abcCode.length;j++) {
					if(ch == abcCode[j]) {
						//idx=j;
						//break;
						src += (char) (j + 'a');
					}
				}
				//src+=(char)('a'+idx)
			}
		}
		System.out.println("result:"+result);
		System.out.println("src:"+src);
		
		// src: abc123
	}
}


