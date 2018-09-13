package 종합실습과제;

import java.util.Scanner;

public class 문제05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("시간(초) : ");
		int S=sc.nextInt();
		int h=S/3600;
		S-=3600*h;
		int m=S/60;
		S-=60*m;
		System.out.printf("%02d시간 %02d분 %02d초",h,m,S);
	}
	
}
