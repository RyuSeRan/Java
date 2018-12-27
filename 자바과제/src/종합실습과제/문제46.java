package 종합실습과제;

import java.util.Scanner;

public class 문제46 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]={0, 95, 100, 88, 65, 76, 89, 58, 93, 77, 99 };
		int arr[][]=new int[2][11];
		for (int i = 1; i < 11; i++) {
			//arr[0][i] = a[i];
			arr[0][i]=sc.nextInt();
			arr[1][i] = 1;
		}
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				if (arr[0][i] < arr[0][j])
					arr[1][i]++;
			}
		}
		System.out.println("[석차 연명부]");
		for (int i = 1; i < 11; i++) {
			System.out.printf("%d번 : %d점(%d등)\n", i, arr[0][i], arr[1][i]);
		}
	}

}
