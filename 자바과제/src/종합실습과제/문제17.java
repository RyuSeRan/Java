package 종합실습과제;

import java.util.Scanner;

public class 문제17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 : ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		for (int i = n; i >= m; i--) {
			System.out.print(i+" ");
		}
	}

}
 