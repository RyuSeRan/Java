package 종합실습과제;

import java.util.Scanner;

public class 문제31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("암호문 : ");
		String a = sc.nextLine();
		char[] b = a.toCharArray();
		System.out.print("평문 : ");
		for (int i = 0; i < b.length; i++) {
			if (b[i] != ' ')
				System.out.print((char)(b[i] - 3));
			else
				System.out.print(b[i]);
		}
	}

}
//EH FDUHIXO IRU DVVLQDWRU