package day11.inter.basic;

public class Basic implements Inter1, Inter2 { // Object 상속 받고 있음
	/*
	 * 1. 인터페이스의 구현(상속) 키워드 implements
	 * 2. 인터페이스에 선언된 추상 메서드는 자식에서 반드시 오버라이딩 해야 한다
	 */
	
	@Override
	public void method01() {
		System.out.println("Inter1의 재정의된 1번 메서드");
	}

	@Override
	public void method02() {
		System.out.println("Inter2의 재정의된 2번 메서드");
	} 
	
	public void method03() {
		System.out.println("자신의 메서드 3번 실행");
	}
}
