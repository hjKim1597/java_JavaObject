package day10.ploy.basic2;

public class House {
	
	// 멤버변수에 Student, Teacher, Employee
//	private Student[] student = new Student[100];
//	private Teacher[] teacher = new Teacher[100];
//	private Employee[] employee = new Employee[100];
	
	private Person[] persons = new Person[100];
	private int index = 0; // 사람수
	
	// 멤버변수에 순서대로, Person들을 저장하는 메서드
	public void checkIn(Person p) { // new Student, new Teacher, new Employee가 들어올 수 있음
		// persons[0] = p;
		// persons[1] = p;
		// persons[2] = p;
		
		persons[index] = p;
		index++;
	}
	
	// 배열에 저장된 회원의 이름을 출력
	public void confirm() {
		
		for(int i = 0; i < index; i++) {
			System.out.println(persons[i].info());
		}
	 
	}

}
