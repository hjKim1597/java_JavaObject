package day11.abstract_.good;

public class MainClass {

	public static void main(String[] args) {
		
		// 추상 클래스는 객체 생성이 안된다
		// 추상 클래스를 사용하려면 자식으로 생성해서, 부모 타입에 저정하고 이것을 객체 추상화라고 부른다
//		Store s = new Store();
		Store s = new SeoulStore(); // 다형성 - 객체 추상화 (자식으로 생성해서 부모 타입에 저장)
//		Store s = new BusanStore(); // 부산으로 바꾸면 부산스토어 메서드의 출력을 가져온다
		
//		SeoulStore s = new SeoulStore();
		s.apple();
		s.melon();
		s.orange();
		s.mango(); // 부모님한테 상속받은 메서드
		String name = s.getName(); // 부모님한테 상속받은 메서드
		System.out.println(name);
	}
}
