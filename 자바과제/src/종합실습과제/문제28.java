package 종합실습과제;

import java.util.Scanner;

public class 문제28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 n : ");
		int n = sc.nextInt();
		int cnt = 0;
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				cnt = 1;
		if (cnt == 1)
			System.out.println("합성수");
		else
			System.out.println("소수");
	}

}
