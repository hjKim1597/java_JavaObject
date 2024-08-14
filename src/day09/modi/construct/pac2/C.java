package day09.modi.construct.pac2;

import day09.modi.construct.pac1.A;

public class C {

	A a = new A(1); // public이라서 가능
	
	// 같은 패키지를 벗어남
//	A a2 = new A(true); // defalut 불가능 
//	A a3 = new A("흥"); // private 불가능
	
}
