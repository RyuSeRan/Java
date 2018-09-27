package 종합실습과제;

import java.util.Scanner;

public class 문제48 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("자연수 : ");
		int su=sc.nextInt();
		System.out.print("변환할 진수 : ");
		int k=sc.nextInt();
		System.out.print("변환결과 : ");
		int a=0,b[]=new int[100];
		while(su!=0) {
			b[a++]=su%k;
			su=su/k;
		}
		for (int i = b.length-1; i >= 0; i--) {
			if(b[i]==0)	continue;
			else if(b[i]>=10)	System.out.print((char)(b[i]+55));
			else	System.out.print(b[i]);
		}
	}

}
