package 제07차시_2;

import 제07차시_2.Car;

public class Main {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//myCar 객체의 필드(속성, 멤버변수)들을 지정하세요.
		myCar.Maker="아우디";
		myCar.차종="아우디";
		myCar.Color="검정색";
		myCar.Number="123-456";
		myCar.User="인간";
		myCar.연비=10.45;
		myCar.현재연비=10;
		myCar.현재속도=12.4;
		myCar.배기량=12;
		myCar.주행상태=1;
		myCar.주행가능거리=50000;
		
		//myCar 객체의 필드 값들을 모두 출력하세요.
		System.out.println("제조사 : "+myCar.Maker);
		System.out.println("차종 : "+myCar.차종);
		System.out.println("차량색상 : "+myCar.Color);
		System.out.println("차량번호 : "+myCar.Number);
		System.out.println("차량소유자 : "+myCar.User);
		System.out.println("연비 : "+myCar.연비);
		System.out.println("현재연비 : "+myCar.현재연비);
		System.out.println("현재속도 : "+myCar.현재속도);
		System.out.println("배기량 : "+myCar.배기량);
		System.out.println("주행상태 : "+myCar.주행상태);
		System.out.println("주행가능거리 : "+myCar.주행가능거리);

		//myCar 객체의 메소드를 호출하여 동작시키세요.
		myCar.시동건다();
		myCar.기어변속한다();
		myCar.속도조절한다();
		myCar.방향전환한다();
		myCar.뱡향지시등켠다();
		myCar.비상등켠다();
		myCar.경적울린다();
		myCar.연료주입구연다();
		myCar.후드연다();
		myCar.선루프연다();
		myCar.트렁크연다();
	}

}
