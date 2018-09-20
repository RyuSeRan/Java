package 종합실습과제;

import java.util.Scanner;

public class 문제18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 한 글자 : ");
		char a=sc.next().charAt(0);
		for (int i = a; i <= 90; i++) {
			System.out.print((char)i+" ");
		}
	}

}
//A=65	Z=90