package 종합실습과제;

public class 문제50 {

	public static void main(String[] args) {
		int x = 0, y = 5 / 2, arr[][] = new int[5][5];
		for (int i = 1; i <= 25; i++) {
			arr[x][y] = i;
			x -= 1;
			y += 1;
			if (x == -1 && y == 5) {
				x += 2;
				y -= 1;
			}
			if (x < 0)	x = 4;
			else if (y > 4)	y = 0;
			if (arr[x][y] != 0) {
				x += 2;
				y -= 1;
			}

		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

}
//x--;	y++;	x<0=>x=4;	y>4=>y=0;	x,y!=0=>x+2;	x=-1,y=5=>x=1,y=4;