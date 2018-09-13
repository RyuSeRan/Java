package 종합실습과제;

import java.util.Scanner;

public class 문제02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("두 정수 : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("몫 : "+a/b);
		System.out.println("나머지 : "+a%b);
	}

}
