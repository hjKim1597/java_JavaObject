package day12.exception.trycatch;

public class TryCatchEx03 {

	public static void main(String[] args) {
		
		/*
		 * main 메서드에서 실행시 매개값을 주는 방법
		 * 
		 * Run탭 -> run configration(실행 설정) -> arguments탭 
		 * 
		 * ${string_prompt}
		 * 
		 */
		
		try {
			// 두 수의 합을 구하는 코드
			String a = args[0]; // arguments 띄어쓰기 기준으로 값이 넣어짐
			String b = args[1];
			
			// 문자열을 숫자로 바꾸는 코드
			int x = Integer.parseInt(a);
			int y = Integer.parseInt(b);
			
			System.out.println("두 수의 합: " + (x + y));	
			
			// 예외
			String str = null;
			str.charAt(0);
				
		} 
		catch (ArrayIndexOutOfBoundsException | ClassCastException e) { // or 구문으로 여러 예외를 동시에 처리
			System.out.println("실행시에 매개값을 2개 입력하세요.");
		}
		catch(NumberFormatException e) {
			System.out.println("매개값을 숫자로 입력하세요.");
		}
		catch(Exception e) { // 모든 예외처리 -> exceotion클래수눈 예외 종류 클래스 중에서 최고 부모클래스이기 때문에 처리 가능 
			// catch문 제일 위로 올리게 되면 아래의 예외를 처리할 수 없음
			System.out.println("기타 예외입니다.");
		}
	}
}