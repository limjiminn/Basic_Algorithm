package _13;
/*
 * 문제 소개
 * 
 * 입력된 수(N) 만큼 N행 N열의 형태로 연속으로 출력되는
 * 숫자 사각형을 출력하시오.
 * 
 * 4
 * 
 * 1 2 3 4
 * 2 4 6 8 
 * 3 6 9 12
 * 4 8 12 16
 *       
 *  Tag
 *  >> 중첩 반복문 (for , while)
 */
public class Main {

	public static void main(String[] args) {

		int n = 4;
		int[][] arr = new int[n][n];
		
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++ ) {
				arr[i][j] = (i + 1) * (j + 1);
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++ ) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
