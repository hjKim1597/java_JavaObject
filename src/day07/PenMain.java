package day07;

public class PenMain {
	
	public static void main(String[] args) {
		
		// 클래스명 변수명 = new 클래스명(); -> 객체 생성하기
		Pen black = new Pen(); // Pen 클래스의 메서드와 변수들을 쓸 수 있음 
		black.ink = "검정색";
		black.price = 2000;
		black.company = "모나미";
		
		black.write();
		black.info();
		
		// 빨간펜
		Pen red = new Pen(); // new 뒤에 쓰인 Pen() = 생성자
		red.ink = "빨간색";
		red.price = 1000;
		red.company = "하이테크";
		
		red.write();
		red.info();
		
		System.out.println("---------------");
		//////////////////////////
		Variable v = new Variable(); // 객체 먼저 생성하기
		v.printNum(10);
	
	}
}
