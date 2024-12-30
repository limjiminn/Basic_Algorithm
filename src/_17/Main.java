package _17;

import java.util.Iterator;

/*
 * 문제 소개
 * 
 * 다음 입력 n을 받아 아래와 같은 *을 출력하시오.
 * 
 * 입력 : 5
 * 
 * 정답 : 
 * *****
 *  ****
 *   ***
 *    **
 *     *
 */
public class Main {

	public static void main(String[] args) {

		int n = 5;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i>j) {
					System.out.print(" ");					
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
