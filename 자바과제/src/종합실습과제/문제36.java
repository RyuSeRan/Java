package 종합실습과제;

import java.util.Scanner;

public class 문제36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 : ");
		int n=sc.nextInt();
		System.out.print("결과 : ");
		while(n!=0) {
			for (int i = 2; i <= n; i++) {
				if(n%i==0) {
					System.out.print(i+" ");
					n=n/i;
					break;
				}
			}
		}
	}

}
