package 종합실습과제;

import java.util.Scanner;

public class 문제33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 : ");
		int n=sc.nextInt();
		int m=0,b=n;
		while(b!=0) {
			m=(m*10)+(b%10);
			b=b/10;
		}
		if(m==n)	System.out.println("판정결과 : 대칭수(회문)");
		else	System.out.println("판정결과 : 비대칭수");
	}

}
