package _14;
/*
 * 문제 소개
 * 
 * 입력된 숫자의 개수를 출력하라
 * 입력: 421314218
 * 
 * 0 : 0
 * 1 : 3
 * 2 : 2
 * 3 : 1
 * 4 : 2
 * 5 : 0
 * 6 : 0
 * 7 : 0
 * 8 : 1
 * 9 : 0
 * 
 * Tag
 * >>> 반복문(for 혹은 while) , 배열, %
 */
public class Main {

	public static void main(String[] args) {
		
		int n = 421314218;
		
		int[] arr = new int[10];  //0 ~ 9 입력된 수를 cnt 위한 용도
		
		while(n > 0) {
			arr[n % 10]++;
			n /=10;
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(i+" : "+arr[i]);
		}

	}

}
