package day11.final_.field;

public class Person {
	
	/*
	 * final이 붙은 변수는 직접 초기화 하거나, 생성자를 통해서 초기화해야 한다
	 */
	public final String nation = "대한민국"; // 직접 초기화
	public final String ssn;
	public String name;
	
	public Person(String ssn, String name) { // 생성자 통한 초기화
		this.ssn = ssn; // final - 객체 생성시 초기값이 지정됨
		this.name = name;
	}
}
