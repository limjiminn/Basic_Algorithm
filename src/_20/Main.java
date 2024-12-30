package _20;
/*
 *  문제 소개
 *  
 *  100 까지 369 게임을 아래와 같이 진행하시오
 *  
 *  정답 :
 *  
 */
public class Main {

	public static void main(String[] args) {
		
		int n = 100;
		
		for(int i=1; i<=n; i++) {
			
			int cnt = getNum(i);
			
			if(cnt == 0) {
				System.out.print(i+" ");
			}else {
				for(int j=0; j<cnt; j++) {
					System.out.print("짝");					
				}
				System.out.print(" ");
			}
			
		}
	}

	public static int getNum(int i) {
		int cnt = 0;
		
		while(i > 0) {
			if(i %10 == 3 ||i %10 == 6 || i %10 == 9) {
				cnt++;
			}
			i /=10;
		}
		return cnt;
	}
}
