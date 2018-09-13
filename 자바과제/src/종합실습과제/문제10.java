package 종합실습과제;

import java.util.Scanner;

public class 문제10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 : ");
		String a = sc.next();
		char[] b = a.toCharArray();
		System.out.println(b[7]%2==0?"여자":"남자");
	}

}
