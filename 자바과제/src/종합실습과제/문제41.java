package 종합실습과제;

import java.util.Scanner;

public class 문제41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수n : ");
		int n=sc.nextInt();
		for (int i = 0; i < n ; i++) {
			/*for (int j = n-1; j > i ; j--) {
				System.out.print(" ");
			}*/
			for (int j = 0; j < n-i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i ; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
