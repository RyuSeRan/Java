package 종합실습과제;

import java.util.Scanner;

public class 문제30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pro[] = new int[10];
		System.out.print("점수 10개 : ");
		for (int i = 0; i < 10; i++) {
			pro[i] = sc.nextInt();
		}
		int max = pro[0], min = pro[0];
		for (int i = 0; i < pro.length; i++) {
			if(max<pro[i])	max=pro[i];
			if(min>pro[i])	min=pro[i];
		}
		System.out.println("최고점 : "+max+"\n최하점 : "+min);
	}

}
//65 80 90 65 85 95 25 35 40 50