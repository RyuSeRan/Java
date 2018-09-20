package 종합실습과제;

public class 문제24 {

	public static void main(String[] args) {
		System.out.println("[ASCII 코드표]");
		int cnt=0;
		for (int i = 32; i <= 127; i++) {
			if(cnt==10) {
				System.out.print("\n");
				cnt=0;
			}
			System.out.print(i+" "+(char)i+"\t");
			cnt++;
		}
	}

}
