package JavaProgramming;
//WAP to Perform Matrix Multiplication

//formula : sum =sum+a[r][e] * b[e][c];

public class P63_matrixMultiplicationArray {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { { 1, 0, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
		int rowA = a.length;
		int colA = a[0].length;
		int rowB = b.length;
		int colB = b[0].length;

		int result[][] = new int[rowA][colB];
		if (colA == rowB) {

			for (int r = 0; r < rowA; r++) {

				for (int c = 0; c < colB; c++) {

					int sum = 0;
					for (int e = 0; e < colA; e++) {

						sum = sum + a[r][e] * b[e][c];
					}
					result[r][c] = sum;
				}
			}
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[i].length; j++) {

					System.out.print(result[i][j] + " ");

				}
				System.out.println();
			}

		} else {
			System.out.println("MUltiplication is not Possible");
		}

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[j][i] + " ");
			}
			System.out.println();
		}
	}

}
