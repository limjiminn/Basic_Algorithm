package _22;
/*
 * 문제 소개
 * 
 * 입력된 수가 팰린드롬인지 판별하시오
 * 
 * 입력 : 12321
 * 
 * 정답 : True
 */
public class Main {

	public static void main(String[] args) {

		String n = "12321";
		
		int len = n.length();
		boolean result = true;
		
		for(int i=0; i< len/2; i++) {
			if(n.charAt(i) != n.charAt(len-i-1)) {
				result = false;
			}
		}
		
		System.out.println(result);
	}

}
