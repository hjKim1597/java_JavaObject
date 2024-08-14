package day09.encap.obj;

public class MainClass {
	
	public static void main(String[] args) {
		
//	Chef chef = new Chef(); // 변수명 - chef
//	Hotel hotel = new Hotel(chef); // 변수명 넣기
		
		// 두 줄을 한 줄로 적으면 
		Hotel hotel = new Hotel(new Chef());
		
		
		// setter
		Chef chef = new Chef();
		hotel.setChef(chef);
		
		
		// getter
		Chef c = hotel.getChef();
		c.cooking();
		
	}
}
	 
