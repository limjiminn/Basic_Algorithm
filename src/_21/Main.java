package _21;
/*
 * 문제 소개
 * 
 * 1~100까지 숫자가 입력될 때 한번이라도 입력되었으면 출력하시오
 * 
 * 입력 : 1 2 3 1 1 2 3 4 5 5
 * 
 * 정답 : 1 2 3 4 5
 */
public class Main {

	public static void main(String[] args) {
		
		boolean[] arr = new boolean[100];
		int[] array = new int[100];
		
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 1;
		array[4] = 1;
		array[5] = 2;
		array[6] = 3;
		array[7] = 4;
		array[8] = 5;
		array[9] = 5;
		
		
		for(int i=0; i<array.length; i++ ) {
			arr[array[i]] = true;
		}
		for(int i=1; i<arr.length; i++ ) {
			if(arr[i]) {
				System.out.print(i+" ");
			}
		}
	}

}
