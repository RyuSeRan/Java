package 종합실습과제;

import java.util.Scanner;

public class 문제15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("프로 점수 : "); 
		int a=sc.nextInt();
		a=a/10;
		char b;
		switch (a) {
		case 9:
			b='A';
			break;
		case 8:
			b='B';
			break;
		case 7:
			b='C';
			break;
		case 6:
			b='D';
			break;
		default:
			b='E';
			break;
		}
		System.out.println("등급 : "+b);
	}

}
