package _15;

import java.util.Iterator;
import java.util.Scanner;

/*
 * 문제 소개
 * 
 * - 구구단 시작 s부터 f단 까지 입력 받아 아래와 같이 출력하시오.
 * 입력 : 2 3
 * 
 * 정답:
 * 2 * 1 = 2	3 * 1 = 3
 * 2 * 2 = 4	3 * 2 = 6
 * 2 * 3 = 6	3 * 3 = 9
 * 2 * 4 = 8	3 * 4 = 12
 * 2 * 5 = 10	3 * 5 = 15
 * 2 * 6 = 12	3 * 6 = 18
 * 2 * 7 = 14	3 * 7 = 21
 * 2 * 8 = 16	3 * 8 = 24
 * 2 * 9 = 18	3 * 9 = 27 
 */
public class Main {

	public static void main(String[] args) {

		int s = 2;
		int f = 3;
		
		for(int j=1; j<10; j++) {
			for(int i=s; i<=f; i++ ) {
				System.out.printf("%2d *%2d =%2d",i,j,i*j);
			}
			System.out.println();
		}

	}

}
