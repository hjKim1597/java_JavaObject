package day10.static_.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		// static 사용
		System.out.println(Calculator.pi);
		System.out.println(Calculator.pi); 
		// static은 맨 앞에서 1번만 실행되고 빠지는 특징을 가지기 때문에 sysout의 출력은 1번만 실행되고 그 뒤는 실행되지 않는다
	    System.out.println(Calculator.circle(3)); 
   	}

}
