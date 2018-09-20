package 종합실습과제;

import java.util.Scanner;

public class 문제21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 n : ");
		int n = sc.nextInt();
		int s = 0, a = 1,sum=0;
		for (int i = 1; i <= n; i++) {
			s=s+a;
			a=a+2;
			sum+=s;
		}
		System.out.println("결과 : "+sum);
	}

}
