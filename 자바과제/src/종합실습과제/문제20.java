package 종합실습과제;

import java.util.Scanner;

public class 문제20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 12자리 : ");
		String A = sc.next();
		char[] a = A.toCharArray();
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s += (a[i] - '0') * (2 + i % 8);
		}
		int t = s % 11;
		System.out.println("13번째 수 : "+((11-t)%10));
	}

}
