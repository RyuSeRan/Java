package 종합실습과제;

import java.util.Scanner;

public class 문제11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\r|\n|,");
		System.out.print("원(x1,y1,r1) : ");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int r1=sc.nextInt();
		sc.nextLine();
		System.out.print("원(x2,y2,r2) : ");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int r2=sc.nextInt();
		int A=(int) (Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2));
		int B=(int) Math.pow((r1-r2), 2);
		System.out.println(B<=A?"겹침":"겹치지않음");
	}

}
