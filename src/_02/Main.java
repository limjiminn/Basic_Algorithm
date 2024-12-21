package _02;

import java.util.Iterator;

/*
 * 문제소개
 * 
 * -피보나치 수열을 출력해라
 * 
 * - An = An-1 + An-2
 * - 1 1 2 3 5 8 13 21 34
 * 
 * >> 배열, for
 */
public class Main {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i = 3; i<100; i++) {
			
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for(int i = 1; i<100; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//2번째 방법
		int ppnum = 1;
		int pnum = 1;
		
		System.out.print(ppnum+" ");
		System.out.print(pnum+" ");
		
		for(int i = 3; i<100; i++) {
			
			int num = pnum + ppnum;
			
			ppnum = pnum;
			pnum = num;
			
			System.out.print(num+" ");
		}
	}
}
