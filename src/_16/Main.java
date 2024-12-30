package _16;
/*
 * 문제 소개
 * 
 * 다음 입력 n을 받아 아래와 같은 *을 출력하시오
 * 
 * 입력 5
 * 
 * 정답
 * *
 * **
 * ***
 * ****
 * *****
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		int n = 5;
		String star = "*";
		for(int i=1; i<=n; i++) {
			System.out.println(star);
			star +="*";
		}
	}
}
