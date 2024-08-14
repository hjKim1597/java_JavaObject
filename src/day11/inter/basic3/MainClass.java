package day11.inter.basic3;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * 인터페이스 타입으로 선언하고, 구현체에 따라서 다른 클래스가 호출된다
		 * ex) 콘센트 220V
		 */
		
		Printed print = new Lg(); 
//		Printed print = new Samsung();
		print.print("hello world");
		print.colorPrint("goodby...", "검정");
		print.copy(5);
		}
}