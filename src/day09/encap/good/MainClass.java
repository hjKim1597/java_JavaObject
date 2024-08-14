package day09.encap.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyDate me = new MyDate();

		me.setYear(2024);
		me.setMonth(5);
		me.setDay(20);
		me.setSsn("000520-4222222");
		
		int year = me.getYear(); 
		int month = me.getMonth();
		int day = me.getDay();
		String ssn = me.getSsn();
		
		System.out.println("년도: " + year);
		System.out.println("월: " + month);
		System.out.println("일: " + day);
		System.out.println("주민번호: " + ssn);
	
		
	
		
		
	
	}
	
	

}
