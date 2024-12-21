package _01;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 문제소개
 * - 학생정보들을 저장하고 학생이름으로 검색했을 때 학번을 출력하는 프로그램 작성
 * 
 * - Student 클래스 생성
 * - String name, no를 가짐 (이름과 학번)
 * 
 * - 학생들을 ArrayList에 저장한 이후, 
 *   계속 검색을 하겠느냐 y -> 반복
 *   종료하고싶으면 n -> 프로그램 종료
 *   
 * - 학생 이름이 있는 경우 그 학생의 학번을 출력
 * - 학생 이름이 없으면, 없는 학생 이름이라고 출력
 * - 깃 연동 체크
 */
public class Main {
	
	public static void main(String[] args) {
		
		Student st1 = new Student("김철수", "20241221");
		Student st2 = new Student("박지수", "20240719");
		Student st3 = new Student("임지민", "20241003");
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for(Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("계속 검색을 하고싶으면 y, 종료하고싶으면 n");
			String input = scan.next();
			boolean flag = false;
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				System.out.print("학생명 :");
				String name = scan.next();
				
				for(Student stu : list) {
					if(stu.getName().equals(name)) {
						System.out.println("해당 학생의 학번 : "+stu.getNo());
						flag = true;
					}
				}
				
				if(!flag) {
					System.out.println("해당하는 힉생이름이 없습니다.");
				}
				
				
			}else {
				break;
			}
			
			
		}
		
		System.out.println("종료합니다.");
	}

}
