package 종합실습과제;

import java.util.Scanner;

public class 문제32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 : ");
		int n = sc.nextInt();
		int sum=0;
		while (n!=0) {
			sum+=n%10;
			n/=10;
		}
		System.out.println("결과 : "+sum);
	}

}
