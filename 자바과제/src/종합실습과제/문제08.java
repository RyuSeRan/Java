package 종합실습과제;
 
import java.util.Scanner;

public class 문제08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\r|\n|,");
		System.out.print("정수 : ");
		int a=sc.nextInt();
		System.out.println("절댓값 : "+(a<0?-a:a));
	}

}
