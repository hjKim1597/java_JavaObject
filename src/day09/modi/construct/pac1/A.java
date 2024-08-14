package day09.modi.construct.pac1;

public class A {
	
	A a = new A(1); // public이라서 가능
	A a2 = new A(true); // defalut라 가능
	A a3 = new A("흥"); // private 가능
	
	public A(int a) {}
	A(boolean a) {}
	private A(String a){} // 외부에서 객체를 생성하지 못하게 할 때 private를 붙임

}
