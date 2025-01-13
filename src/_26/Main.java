package _26;
/*
 * 문제 소개
 * 
 * 상수는 수를 다른사람과 다르게 거꾸로 읽는다. 예를 들어, 734과 893을 칠판에 적었다면
 * 상수는 이수를 437과 398로 거꾸로 읽는다. 따라서 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
 * 
 * 예제 입력 ; 734 893
 * 예제 출력 : 437
 */
public class Main {

	public static void main(String[] args) {
		
		int a = 734;
		int b = 893;
		
		int resultA = reverseNum(a);
		int resultB = reverseNum(b);
		
		if(resultA > resultB) {
			System.out.println(resultA);
		}else if(resultA < resultB) {
			System.out.println(resultB);
		}else {
			System.out.println("숫자가 같습니다.");			
		}
		
	}
	
	public static int reverseNum(int num) {
		int[] arrNum = new int[3];
		
		int lenNum = 0;
		do {
			arrNum[lenNum] = num % 10;
			num /= 10;
			lenNum++;
		}while(num > 0);
		
		int tranNum = 0;
		int mux = 1; //1 -> 10 -> 100 -> 1000
		for(int i=arrNum.length-1; i>=0; i--) {
			 tranNum += arrNum[i]*mux;
			 mux*=10;
		}
		
		return tranNum;
	}
}
