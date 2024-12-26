package _11;
/*
 * 문제 소개
 * 
 * 입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는
 * 숫자 사각형을 출력하시오
 * 
 * 4
 * 
 * 1 2 3 4
 * 8 7 6 5
 * 9 10 11 12
 * 16 15 14 13
 * 
 * Tag
 * >>> 중첩반복문(for, while), 조건문(if), 배열
 */
public class Main {
	
	public static void main(String[] args) {
		
		int n = 4;
		
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			
			if(i % 2 == 0) {
				for(int j=0; j<n; j++) {
					arr[i][j] += i * n + j + 1;
				}
			}else {
				for(int j=n-1; j>=0; j--) {
					arr[i][j] += i * n + n - j;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
