package day11.final_.method;

public class Child extends Parent {
	
//	public void method01() {	
//	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01(); // final 메서드지만 main으로 내려와서 사용 가능
	}
}
