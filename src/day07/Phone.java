package day07;

public class Phone {
	
	String model;
	int price;
	String color;
	
	// 생성자는 클래스명과 동일하고, 반환 유형이 없다
	Phone() {
		System.out.println("생성자 호출");
		// 보통 멤버변수를 초기화하는 용도로 사용
		model = "가로본능";
		price = 200000;
		color = "빨강";
	}
	
	// 생성자는 중복해서 여러개 선언할 수도 있다
	// 단, 생성자의 매개변수, 종류, 개수가 달라야 한다
	Phone(String pColor){
		color = pColor;
		price = 100000;
		model = "애니콜";
	}

	Phone(String pColor, int pPrice) {
		color = pColor;
		price = pPrice;
		model = "아이폰15";
	}
	
	Phone(int pPrice, String pColor) {
		color = pColor;
		price = pPrice;
		model = "갤럭시노트20";
	}
	
	// 멤버변수 개수만큼 매개변수로 받아주는 생성자
	Phone(String pColor, int pPrice, String pModel){
		color = pColor;
		price = pPrice;
		model = pModel;
	}
	
	void info() {
		System.out.println("-------휴대폰 정보------");
		System.out.println("모델: " + model);
		System.out.println("가격: " + price);
		System.out.println("색상: " + color);
	}
}
