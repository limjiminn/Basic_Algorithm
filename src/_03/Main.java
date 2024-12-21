package _03;

import java.util.Scanner;

/*
 * 문제 소개
 * - 가장 많이 출현한 수를 출력하시오.
 * - 1 2 2 3 1 4 2 2 4 3 5 3 2
 * - 정답: 2(5회)
 * 
 * Tag 
 * >> 배열, for
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] inputNum = new int[13];
		
		/*
		 * inputNum[0] = 1 ; inputNum[1] = 2 ; inputNum[2] = 2 ; inputNum[3] = 3 ;
		 * inputNum[4] = 1 ; inputNum[5] = 4 ; inputNum[6] = 2 ; inputNum[7] = 2 ;
		 * inputNum[8] = 4 ; inputNum[9] = 3 ; inputNum[10] = 5; inputNum[11] = 3;
		 * inputNum[12] = 2;
		 */		
		for(int i=0; i<13; i++) {
			inputNum[i] = scan.nextInt();
		}
		
		int[] mode = new int[10];
		
		for(int i=0; i<13; i++) {
			mode[inputNum[i]]++;  //
		}
		
		int maxMode = 0; //최빈수
		int maxCnt = 0; //최빈수가 나온횟수
		
		
		for(int i=0; i<10; i++) {
			if(maxCnt < mode[i]) {
				maxCnt = mode[i];
				maxMode = i;
			}
		}
		System.out.println("정답 : "+maxMode+" ("+maxCnt+"회)");
	}
}
