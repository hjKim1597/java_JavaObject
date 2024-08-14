package day08.overriding.basic;

public class Child extends Parent {
	
	/*
	 * 오버라이딩 - 부모님한테 물려 받은 메서드의 내용을 바꿔 쓰는 것
	 * 규칙
	 * 부모님의 메서드 원형과 동일하게 만들면 된다
	 * 
	 */
	
	void method02() { // 숫자 옆 삼각형 모양 = 오버라이딩 된 상태
		System.out.println("자식의 오버라이딩 된 메서드 2번 실행");
	}

}
