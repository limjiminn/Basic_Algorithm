package _19;

import java.util.Iterator;

/*
 * 문제 소개
 * 
 *  다음 입력 n의 m승의 결과를 출력하시오.
 *  입력 : 5 3
 *  
 *  정답 : 125
 */
public class Main {

	public static void main(String[] args) {

		int n = 5;
		int m = 3;
		int hab = 1;
		for(int i=0; i<m; i++) {
			hab *= n;
		}
		System.out.println(hab);
	}

}
