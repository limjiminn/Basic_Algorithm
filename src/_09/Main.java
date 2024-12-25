package _09;
/*
 * 문제 소개
 * 
 * 입력된 수의 각 자릿수 합을 구하시오
 * 
 * 1242
 * 
 * 정답: 9
 * 
 * Tag
 * >>> 반복문(for,while)
 */
public class Main {

	public static void main(String[] args) {
		
		int num = 1242;
		int accSum = 0;
		
		while(num > 0) {
			accSum += num % 10;
			num /= 10; 
		}
		System.out.println("정답 : "+accSum);
		
	}
}
