package day07;

public class Variable {
	
	// 멤버변수
	int a; // 기본값으로 자동 초기화
	
	// 지역변수
	void printNum(int c) {
		int b = 1;
		
		System.out.println("멤버변수: " + a); // 자동 초기화 값 = 0
		System.out.println("지역변수: " + b); // b는 초기화가 되어 있어야 출력이 가능함 -> int b;는 출력 불가능
		System.out.println("매개변수: " + c); // 지역변수와 같음

	}
}
