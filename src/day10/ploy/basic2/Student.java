package day10.ploy.basic2;

public class Student extends Person {
	// 상속 받고 싶은 클래스 extends Person 붙임
	

	String studentId; // 고유한 기능만 남겨둠
	
	Student (String name, int age, String studentId) {
		super(name, age);  // 기본 생성자인 super(); 에서 매개변수 넣어줌
		//this.name = name;  매개변수를 넣어줬기 때문에 필요 없어져서 주석 처리됨
		//this.age = age;
		this.studentId = studentId;
	}
	
	
	String info() {
		return super.info()+", 학번: "+studentId;
	}


}
