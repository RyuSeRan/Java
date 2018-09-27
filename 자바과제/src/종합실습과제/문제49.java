package 종합실습과제;

public class 문제49 {

	public static void main(String[] args) {
		int su = 1, d = 1, x = 0, y = -1, arr[][] = new int[5][5];
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				y+=d;
				arr[x][y]=su++;
			}
			for (int j = 0; j < i-1; j++) {
				x+=d;
				arr[x][y]=su++;
			}
			d*=-1;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

}
