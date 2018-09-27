package 종합실습과제;

import java.util.Scanner;

public class 문제39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수n : ");
		int n=sc.nextInt();
		int su=1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(su++ + " ");
			}
			System.out.println();
		}
	}

}
