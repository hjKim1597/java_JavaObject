package day08.overloading.basic;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		Basic b = new Basic();
		
		b.input(10);
		b.input("홍길동");
		b.input(0.5, 20);
		b.input(20, 5.0);
		b.input('A', 5, "생일");
	}
}
