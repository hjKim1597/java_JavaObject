package day12.exception.throws_;

public class ThrowsEx02 {
	
	// 생성자
	public ThrowsEx02() throws Exception { // 예외 떠넘기기
		System.out.println("생성자 호출");
		aaa();
		System.out.println("생성자 종료"); // 메서드 강제 종료
	}
	
	public void aaa() throws Exception { // 예외 떠넘기기
		System.out.println("aaa 호출");
		bbb();
		System.out.println("aaa 종료"); // 메서드 강제 종료
	}
	
	public void bbb() throws Exception { // 예외 떠넘기기
		System.out.println("bbb 호출");
		System.out.println(10 / 0); // 예외			
//		try {
//			System.out.println(10 / 0); // 예외	
//		} 
//		catch (Exception e) {
//			System.out.println("예외 처리완료");
//		}
		System.out.println("bbb 종료");
	}
}
