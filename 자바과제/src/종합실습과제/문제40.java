package 종합실습과제;

import java.util.Scanner;

public class 문제40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수n : ");
		int n=sc.nextInt();
		int su=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(((su++)%5+1) + " ");
			}
			System.out.println();
			su++;
		}
	}
	
}
