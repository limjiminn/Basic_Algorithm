package _24;
/*
 * 문제 소개
 * 
 * 학생수와 점수들이 순서대로 입력된다.
 * 평균보다 넘은 학생들의 비율을 출력하시오
 * 
 * 입력 : 7 100 95 90 80 70 60 50
 * 
 * 정답 : 57.143%
 */
public class Main {

	public static void main(String[] args) {
		
		int[] in = {7, 100, 95, 90, 80, 70, 60, 50};
		
		int sum = 0;
		
		for(int i=1; i<in.length; i++) {
			sum += in[i];
		}
		
		double avg = (double)sum /in[0];
		
		//System.out.println(avg);
		
		int cnt = 0;
		
		for(int i=1; i<in.length; i++) {
			if(in[i] > avg) {
				cnt++;
			}
		}
		
		System.out.println((double)cnt/in[0] * 100);

	}

}
