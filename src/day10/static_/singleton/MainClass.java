package day10.static_.singleton;

public class MainClass {
	
	public static void main(String[] args) {
	
	// Singleton s = new Singleton(); // private로 인해 객체 생성 불가
	
	// 3번의 getInstance()로 객체를 끄집어 낸다
	Singleton s = Singleton.getInstance(); // 객체 생성방법
	Singleton s2 = Singleton.getInstance();
	System.out.println(s == s2);
	
	String name = s.getName();
	String name2 = s2.getName();
	
	System.out.println(name); // 둘 다 홍길동
	System.out.println(name2);
	}
}
