package 제09차시_1;

import 제09차시_2.ClassC;

public class Main {

	public static void main(String[] args) {
		ClassA oA = new ClassA();
		oA.a1=11;	// private 접근 불가능
		oA.a2=12;	// default 같은 패키지에서는 접근 가능
		oA.a3=13;	// protected 같은 패키지에서는 접근 가능
		oA.a4=14;	// public 접근 가능
		
		ClassC oC = new ClassC();	// 다른 패키지
		oC.c1=31;	// private 접근 불가능
		oC.c2=32;	// default 다른 패키지에서는 접근 불가능
		oC.c3=33;	// protected 다른 패키지에서는 접근 불가능
		oC.c4=34;	// public 접근 가능
		
		ClassB oB = new ClassB();
		oB.b1=21;	// private 접근 불가능
		oB.b2=22;	// default 같은 패키지에서는 접근 가능
		oB.b3=23;	// protected 같은 패키지에서는 접근 가능
		oB.b4=24;	// public 접근 가능
		oB.c4=25;	// public 접근 가능
	}

}
