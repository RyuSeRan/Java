package 종합실습과제;

import java.util.Scanner;

public class 문제45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수n : ");
		int n = sc.nextInt();
		int su = 1, nums[][] = new int[n+1][n+1];
		nums[1][1]=1;
		System.out.println("[파스칼의 삼각형]");
		for (int i = 2; i < nums.length; i++) {
			for (int j = 1; j <= i; j++) {
				nums[i][j]=nums[i-1][j-1]+nums[i-1][j];
			}
		}
		for (int i = 1; i < nums.length; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
