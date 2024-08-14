package day10.ploy.basic2;

public class Person { // extends Object 가 Person 뒤에 생략되어 있음

	// 부모 클래스 - 공통으로 사용될 기능을 작성할 예정
	// 클래스 복사 - 컨트롤 또는 쉬프트로 여러 개 선택하기
	
	String name;
	int age;
	
	
	Person() {
		this("이름 없음", 1);
		
		//this.name = "이름 없음";
		//this.age= 1;
	}
	
	
	Person(String name) {
		
		this(name, 1);
		/*
		this.name = name;
		this.age = 1;
		 */
	}
	
	
	// 생성자 하나 추가해볼 예정
	// 생성자 연결 - 생성자의 첫번째 줄에서 this()를 내 생성자로 연결함
	Person(String name, int age) { //굳이 이름 다르게 해서 초기화해줄 필요 없어짐
		super(); // 부모인 Object의 기본 생성자 호출
		this.name = name;
		this.age = age;
		// System.out.println("두 개짜리 생성자로 호출됨");
	}
	
	 
	
	String info() {
		return "이름: " + name+", 나이: "  + age;
	}
	
	
	
	
	
	
}
