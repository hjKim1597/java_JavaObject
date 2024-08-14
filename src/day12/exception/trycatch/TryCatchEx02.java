package day12.exception.trycatch;

public class TryCatchEx02 {
	
	public static void main(String[] args) {
		
		// 반복문에서 예외처리
		String[] arr = {"홍길동", "홍길자", "이순신"};
		
		int i = 0;
		while( i < 4 ) {
			
			try { // try를 쓰고 ctrl + space + Enter 누르면 catch의 예외가 자동으로 적힌다
				System.out.println(arr[i]);
			}
			catch (Exception e) { // 모든 예외를 다 처리할 수 있음
				System.out.println("배열 참조 범위를 벗어남");
			} 
			finally { // try, catch와 상관없이 무조건 실행됨
				System.out.println("나는 예외 여부 상관없이 무조건 실행됨"); // 자원 해제할 때 많이 사용됨 
			}
			i++;
		}
		System.out.println("프로그램 정상 종료");
	}
}
