package day12.exception.trycatch;

public class TryCatchEx01 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 0;
		
		try {	
			System.out.println(x + y);
			System.out.println(x - y);
			System.out.println(x / y); // 기존방식으로 실행시 0으로 나눌 수 없어서 예외 발생
		}
		catch(ArithmeticException e) { // 예외의 종류가 들어감
			System.out.println("0으로 나누지 마세요");
		}
		System.out.println(x * y); // try문의 (x/y) 뒤에 들어가게 되면 실행되지 않고 빠져나오기 때문에 바깥에 출력
		System.out.println("프로그램 정상 종료");
	}
}
