package _05;
/*
 * 문제 소개
 * - 대문자는 소문자로, 소문자는 대문자로 변환하시오
 * 
 * - helloWorlD
 * 
 * - 정답 : HELLOwORLd
 * 
 * Tag
 * >> 배열, for, if
 */

public class Main {

	public static void main(String[] args) {
		
		String input = "helloWorlD";
		char[] arr;
		arr = input.toCharArray(); //문자열객체를 캐릭터 array로 반환해주는 메서드
		
		for(int i=0; i<arr.length; i++) {
			//'a' 'b' ~ 'z' 'A' 'B' ~ 'Z' 
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char) (arr[i] + ('A'-'a')); //가독성이나 직관적 의미로인해 ('A'-'a')로 표현
			}
			else if(arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char) (arr[i] - ('A'-'a'));				
			}
		}
		System.out.print(arr);
	}
}
