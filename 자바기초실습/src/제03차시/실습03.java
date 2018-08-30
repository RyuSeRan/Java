package 제03차시;

public class 실습03 {

	public static void main(String[] args) {
		int a=0,b=0;
		a++; b++;
		a+=15; b+=a;
		a-=1; b*=a; 
		a/=2; b%=3;
		a&=2; b|=a;
		System.out.println("a="+a+", b="+b);
		
		double c=5.5, d=3, e;
		e=c%d;
		System.out.println(e);
		
		String f1="통신과";
		String f2="통신과";
		String g1=new String("통신과");
		String g2=new String("통신과");
		System.out.println((f1==f2)+","+(g1==g2));
		System.out.println(f1.equals(f2)+","+g1.equals(g2));
	}

}
