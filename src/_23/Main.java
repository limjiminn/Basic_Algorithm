package _23;
/*
 * 문제 소개
 * 
 * 입력된 문자열을 뒤집어서 출력하시오
 * 
 * 입력 : ADEFH
 * 
 * 정답 : HFEDA
 */
public class Main {

	public static void main(String[] args) {

		String input = "ADEFH";
		char[] str = input.toCharArray();
		char tmp;
		int len = input.length();
		
		for(int i=0; i<len/2; i++) {
			tmp = str[i];
			str[i] = str[len-i-1];
			str[len-i-1] = tmp;
		}
		input = new String(str);
		System.out.println(input);
		
	}

}
