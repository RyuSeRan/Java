package 제09차시_1;

import 제09차시_2.ClassC;

public class ClassB extends ClassC {
	private int b1;
	int b2;
	protected int b3;
	public int b4;
	
	public ClassB() {
		b1 = 21;
		b2 = 22;
		b3 = 23;
		b4 = 24;
		
		c1 = 25;
		c2 = 26;	// default 부모클래스로부터 상속받았지만 접근 불가능
		c3 = 27;	// protected 부모클래스로부터 상속받아서 접근 가능
		c4 = 28;
	}
}
