package 종합실습과제;
 
import java.util.Scanner;

public class 문제07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\r|\n|,");
		System.out.print("두 정수 : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("a AND b : "+(a&b));
		System.out.println("a OR b : "+(a|b));
		System.out.println("NOT a : "+~a);
		System.out.println("a XOR b : "+(a^b));
		System.out.println("a NAND b : "+~(a&b));
		System.out.println("a NOR b : "+~(a|b));		
	}

}
