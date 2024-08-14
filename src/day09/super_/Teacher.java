package day09.super_;

public class Teacher extends Person {


	String subject;
	
	Teacher(String name, int age, String subject) {
		super(name, age); // 기본 생성자인 super(); 에서 매개변수 넣어줌
		//this.name = name; 매개변수를 넣어줬기 때문에 필요없어져서 주석 처리됨
		//this.age = age;
		this.subject = subject;
	}
	
	
	
	
	String info() {
		//return "이름 :"+name+", 나이 :"+age+", 과목 :"+subject;
		return super.info()+", 과목 :"+subject;
	}
	

}
