package day07.import_ex;

import java.util.Scanner;

// import day07.abc.Apple; // import 가져오기 - Apple에 ctrl + space
// import day07.abc.Melon;
import day07.abc.*;  // day07.abc 패키지에 있는 클래스를 전부 다 가져와서 import 하는 법


public class Mainclass {

	public static void main(String[] args) {
		
		// abc 패키지에 있는 Apple을 사용
		Apple apple = new Apple(); // 동일한 이름을 가지고 있는 클래스들이 많음
		Melon melon = new Melon(); // 앞에 적힌 Melon은 데이터 타입(참조 타입)이 된다
		
		Scanner scan = new Scanner(System.in);
		
		int a = 1;
		double b = 3.14;
		
		System.out.println(a);
		System.out.println(melon);
	}
}
