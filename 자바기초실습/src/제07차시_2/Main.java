package 제07차시_2;

import 제07차시_2.Car;

public class Main {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//myCar 객체의 필드(속성, 멤버변수)들을 지정하세요.
		myCar.Maker="아우디";
		myCar.Kind="아우디";
		myCar.Color="검정색";
		myCar.Number="123-456";
		myCar.User="인간";
		myCar.Fe=10.45;
		myCar.Nfe=10;
		myCar.Nsp=12.4;
		myCar.Disp=12;
		myCar.Ds=1;
		myCar.Range=50000;
		
		//myCar 객체의 필드 값들을 모두 출력하세요.
		System.out.println("제조사 : "+myCar.Maker);
		System.out.println("차종 : "+myCar.Kind);
		System.out.println("차량색상 : "+myCar.Color);
		System.out.println("차량번호 : "+myCar.Number);
		System.out.println("차량소유자 : "+myCar.User);
		System.out.println("연비 : "+myCar.Fe);
		System.out.println("현재연비 : "+myCar.Nfe);
		System.out.println("현재속도 : "+myCar.Nsp);
		System.out.println("배기량 : "+myCar.Disp);
		System.out.println("주행상태 : "+myCar.Ds);
		System.out.println("주행가능거리 : "+myCar.Range);

		//myCar 객체의 메소드를 호출하여 동작시키세요.
		myCar.Start();
		myCar.Gear();
		myCar.Speed();
		myCar.Redirect();
		myCar.Turn();
		myCar.Tel();
		myCar.Horn();
		myCar.Ofi();
		myCar.Oh();
		myCar.Os();
		myCar.Ot();
	}

}
