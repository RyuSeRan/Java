package 종합실습과제;

import java.util.Scanner;

public class 문제43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수n : ");
		int n=sc.nextInt();
		int nums[]=new int[n+1];
		System.out.println("[배열 요소]");
		for (int i = 0; i <= n; i++) {
			nums[i] = i;
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = 2; j < i; j++) {
				if(nums[i]%j==0) {
					nums[i]=0;
					break;
				}
			}
		}
		for (int i = 2; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
