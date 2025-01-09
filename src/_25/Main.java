package _25;
/*
 * 문제 소개
 * 
 * N이 주어졌을때 N의 사이클의 길이를 구하시오 (1 <= N <=100)
 * 
 * 입력 : 26
 * 
 * 정답 : 4
 *  
 *  (26 > 2+6 = 8
 *   68 > 6+8 = 14
 *   84 > 8+4 = 12
 *   42 > 4+2 = 6
 *   26  
 */
public class Main {

	public static void main(String[] args) {
		
		int n = 31;
		int res = n;
		int tmp = 0;
		int cycle = 0;
		
		do {
			tmp = res / 10 + res % 10;
			res = res % 10 *10 + tmp % 10;
			cycle++;
			
		} while (n != res);
		
		System.out.println(cycle);
		
	}

}
