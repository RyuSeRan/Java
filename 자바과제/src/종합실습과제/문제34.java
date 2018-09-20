package 종합실습과제;

import java.util.Scanner;

public class 문제34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("자연수 : ");
		int n=sc.nextInt();
		int su=1;
		System.out.print("수열 : ");
		for (int i = 0; i < n; i++) {
			su+=i;
			System.out.print(su+" ");
		}
		System.out.println("\n"+n+"번째 수 : "+su);
	}

}
