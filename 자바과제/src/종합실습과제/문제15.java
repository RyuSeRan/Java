package 종합실습과제;

import java.util.Scanner;

public class 문제15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("프로 점수 : ");
		int a=sc.nextInt();
		a=a/10;
		switch (a) {
		case 9:
			System.out.println("등급 : A");
			break;
		case 8:
			System.out.println("등급 : B");
			break;
		case 7:
			System.out.println("등급 : C");
			break;
		case 6:
			System.out.println("등급 : D");
			break;
		default:
			System.out.println("등급 : E");
			break;
		}
	}

}
