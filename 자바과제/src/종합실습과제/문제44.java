package 종합실습과제;

import java.util.Scanner;

public class 문제44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수n : ");
		int n = sc.nextInt();
		int su = 1, nums[][] = new int[n][n];
		for (int i = 1; i <= nums.length; i++) {
			int a=1;
			for (int j = 0; j < i; j++) {
				nums[i-a][j]=su++;
				a++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.printf("%2d ",nums[i][j]);
			}
			System.out.println();
		}
	}

}
