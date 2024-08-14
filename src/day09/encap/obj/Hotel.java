package day09.encap.obj;

public class Hotel {

	// 호텔이 쉐프를 필요로 한다면?
	private Chef chef; // 클래스 타입: 쉐프 접근제어자 데이터타입 변수명
	
	// 호텔이 생성될 때, 쉐프를 초기화
//	public Hotel() { // 기본 생성자
//		this.chef = new Chef();
//	}
	
	public Hotel(Chef chef) {
		this.chef = chef; // 매개변수를 받을 때 선언해줌 = 쉐프에 쉐프를 저장
	}
	
	// getter / setter - 객체를 매개변수로 받는, 객체를 반환하는 모형
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public Chef getChef() { // Chef = 데이터 타입
		return chef;
	}
}
