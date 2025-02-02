package _31;

import java.util.Scanner;

/*
 * 문제 소개
 * 
 * 입력된 수의 팩토리얼을 구하시오
 * 
 * 5
 * 정답 : 120
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		int ars = 0;
		
		ars = calFact(input);
		
		
		System.out.println(ars);
		
	}
	//재귀함수 >> 탈출조건 중요
	public static int calFact(int i) {
		// i*(i-1)*(i-2)...
		
		if(i == 1) {
			return 1;
		}
		
		return i * calFact(i-1);
	}
}
