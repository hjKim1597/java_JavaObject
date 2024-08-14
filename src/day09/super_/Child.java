package day09.super_;

public class Child extends Parent {
	
	/*
	Child() {
		super(); // 부모의 기본 생성자// 
	}
	*/
	
	// 자식은 super() 를 통해서 부모의 생성자와 연결이 되어 있음
	// 해결 방법
	// 1. 부모의 기본 생성자를 만듦 -> but 부모 클래스를 못 건드릴 땐 좀 어려운 방식임
	// 2. 부모의 생성자 타입과 강제 연결

	Child(String father, String mother) {
		// super("부","모"); - Parent(String father, String mother) 부모의 틀에 맞게 생성자를 만들어 직접적으로 연결시킴
		super (father, mother);
	}

}
