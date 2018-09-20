package 종합실습과제;

public class 문제19 {

	public static void main(String[] args) {
		int a = 1;
		System.out.print(a);
		for (int i = 2; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(-i);
				a += -i;
			} else {
				System.out.print("+"+i);
				a += i;
			}
		}
		System.out.println("=" + a);
	}

}
