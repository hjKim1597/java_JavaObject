package day11.inter.basic;

public interface Inter1 {
	
	// 인터페이스는 상수, 추상 메서드를 정의한다
	double PI = 3.14; // 인터페이스에 변수를 선언하면, 자동으로 상수로 선언된다 (초기값으로 지정해줘야 함)
	void method01(); // 인터페이스에 메서드를 선언하면, 자동으로 추상 메서드가 된다 (중괄호{} 사용 불가)
}
