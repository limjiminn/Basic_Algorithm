package _30;

import java.util.Scanner;

/*
 * 문제 소개
 * 
 * 입력된 숫자까지 + - 를 차례대로 반복하시오.
 * 
 * 예제입력 : 9
 * 출력 1+2-3+4-5+6-7+8-9
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i);
			if(i != num) {
				if(i % 2 == 1) {
					System.out.print("+");
				}else {
					System.out.print("-");				
				}				
			}
		}
	}

}
