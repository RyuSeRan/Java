package 종합실습과제;

import java.util.Scanner;

public class 문제35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 : ");
		int n=sc.nextInt();
		int su1=1,su2=0,su=0;
		System.out.print("수열 : ");
		for (int i = 1; i < n; i++) {
			su=su1+su2;
			su2=su1;
			su1=su;
			System.out.print(su+" ");
		}
		System.out.println("\n"+n+"번째 수 : "+su);
	}

}
