package day08.overriding.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
	Child c = new Child();
	c.method01(); // 물려 받은 메서드 
	c.method02(); // 오버라이딩 된 Child의 메서드 2번
	
	}
}
