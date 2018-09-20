package 종합실습과제;

import java.util.Scanner;

public class 문제29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 3개 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = 0;
		for (int i = 1; i < (a > b ? (a > c ? a : c) : (b > c ? b : c)); i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				max=i;
			}
		}
		System.out.println("최대공약수(GCD) : "+max);
	}

}
