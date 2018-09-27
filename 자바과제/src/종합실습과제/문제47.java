package 종합실습과제;

public class 문제47 {

	public static void main(String[] args) {
		int arr1[][]=new int[5][5];
		int arr2[][]=new int[5][5];
		int su=1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr1[i][j]=su++;
			}
		}
		int a=4;
		for (int i = 0; i < 5; i++) {
			int b=4;
			for (int j = 0; j < 5; j++) {
				arr2[j][i]=arr1[a][b--];
			}
			a--;
		}
		System.out.println("[arr1 배열 요소]");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ",arr1[i][j]);
			}
			System.out.println();
		}
		System.out.println("\n[arr2 배열 요소]");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ",arr2[i][j]);
			}
			System.out.println();
		}
	}

}
