package day10.static_.method;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		Count c = new Count();
		c.a = 10;
		c.method01();
		c.method02();
	
		// static 메서드의 사용 - 클래스명.메서드명()
		Count.method02();
		
		MainClass m = new MainClass();
		m.test();
		
		// 비밀
		Math.random(); // Math.random에 static이 자동으로 들어가 있기 때문에 double d = (double)Math.random();로 적어주지 않아도 됨
		Arrays.toString(new int[3]);
		String.valueOf(false);
		Integer.parseInt("3");
	}
	
	public void test() { // 동일한 static이 아니라 사용이 불가능하지만, 쓰고 싶다면 위에 적힌 Mainclass 객체를 생성해주면 된다 
		
	}
	
	
	
	
}
