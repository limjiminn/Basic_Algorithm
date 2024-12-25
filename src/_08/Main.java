package _08;
/*
 * 문제 소개
 * 
 * 입력된 수의 팩토리얼을 구하시오
 * 
 * 5
 * 
 * 정답 : 120
 * 
 * Tag
 * >> 반복문(for,while)
 */
public class Main {

	public static void main(String[] args) {
		
		int num = 6;
		int total = 1;
		
		for(int i=num; i>0; i--) {
			total *= i;
		}
		System.out.println("정답 : "+total);
	}
}
