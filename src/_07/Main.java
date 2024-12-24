package _07;
/*
 * 문제 소개
 * 
 * 입력된 수가 소수인지 판별하시오
 * 
 * 13
 * 
 * 정답 : 13은 소수입니다.
 * 
 * Tag
 * >> 반복문(for, while), if
 */
public class Main {

	public static void main(String[] args) {
		
		int num = 13;
		boolean flag = false;
		
		for(int i=2; i<=num; i++) {
			if(num % i == 0) {
				flag = true;
			}
		}
		if(!flag) {
			System.out.println(num+"은 소수입니다.");
		}else {
			System.out.println(num+"은 소수가 아닙니다.");			
		}
	}
}
