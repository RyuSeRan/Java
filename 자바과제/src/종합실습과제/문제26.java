package 종합실습과제;

import java.util.Scanner;

public class 문제26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 n : ");
		int n = sc.nextInt();
		int sum = 0, a = 1;
		System.out.print("수열 : ");
		for (int i = 1; i <= n; i++) {
			a*=i;
			System.out.print(a+" ");
			sum+=a;
		}
		System.out.println("\n수열의 합 : "+sum);
	}

}
