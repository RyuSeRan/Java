package 종합실습과제;

public class 문제27 {

	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {
			String s = Integer.toString(i);
			if (s.contains("3")||s.contains("6")||s.contains("9"))
				System.out.println(i + ": 짝");
			else
				System.out.println(i);
		}
	}

}
