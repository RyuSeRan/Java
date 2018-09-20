package 종합실습과제;
 
import java.util.Scanner;

public class 문제12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\r|\n|,");
		System.out.print("두 과목 점수 : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if ((a+b)/2>=60) {
			if((a>=40) && (b>=40)) {
				System.out.println("합격");
			}
			else	System.out.println("불합격(과락)");
		}
		else	System.out.println("불합격");
	}

}
