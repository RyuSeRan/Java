package 종합실습과제;

public class 문제49 {

	public static void main(String[] args) {
		int su = 1, d = -1, x = 0, y = 0, arr[][] = new int[5][5];
		for (int i = 0; i < 5; i++) {
			d=-d;
			for (int j = 0; j < 5-i; j++) {
				arr[x][y]=su++;
				y+=d;
			}
			for (int j = 0; j < 5-i; j++) {
				arr[x][y]=su++;
				x+=d;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

}
