package _27;
/*
 * 문제 소개
 * 
 * 입력 n에 따른 달팽이 모양의 숫자를 출력하시오
 * 
 * 예제 입력: 5
 * 
 * 출력
 *   1  2  3  4 5
 *  16 17 18 19 6
 *  15 24 25 20 7
 *  14 23 22 21 8
 *  13 12 11 10 9
 */
public class Main {

	public static void main(String[] args) {

		int n = 5;
		int[][] arr = new int[10][10];
		
		int x = 0;
		int y = 0;
		int num = 1;
		int f = n;
		for(int i=0; i<2*n-1; i++) {
			switch(i % 4) {
			case 0: // right
				for(int k=0; k<f; k++) {
					arr[y][x] = num;
					x++;
					num++;
				}
				x--;
				y++;
				f--;
				break;
			case 1: // under
				for(int k=0; k<f; k++) {
					arr[y][x] = num;
					y++;
					num++;
				}
				y--;
				x--;

				break;
			case 2: // left
				for(int k=0; k<f; k++) {
					arr[y][x] = num;
					x--;
					num++;
				}
				x++;
				y--;
				f--;
				break;
			case 3: // up
				for(int k=0; k<f; k++) {
					arr[y][x] = num;
					y--;
					num++;
				}
				y++;
				x++;
				break;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		

	}

}
