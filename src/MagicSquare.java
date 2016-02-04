import java.text.DecimalFormat;

public class MagicSquare {
	private int size;
	int matrix[][];

	public MagicSquare(int size) {
		this.size = size;
		matrix = new int[size][size];
	}

	public void computeMagicSquare() {
		// initial center top equals 1
		int row = 0;
		int col = size / 2;
		matrix[row][col] = 1;
		// follows the rule of the pattern needed to make a magic square
		for (int k = 2; k < size * size + 1; k++) {
			if (matrix[(row + size - 1) % size][(col + 1) % size] == 0) {
				row = (row + size - 1) % size;
				col = (col + 1) % size;
			} else {
				row = (row + 1) % size;
			}
			matrix[row][col] = k;

		}
	}

	public void displayMagicSquare() {
		DecimalFormat threeDigits = new DecimalFormat("000");
		// header
		System.out.println();
		System.out.println(size + "x" + size + "Magic Square");
		System.out.println("===================");
		for (int rowNums = 0; rowNums < matrix.length; rowNums++) {
			for (int colNums = 0; colNums < matrix.length; colNums++) {
				System.out.print(threeDigits.format(matrix[rowNums][colNums])
						+ " ");
			}
			System.out.println();
		}

	}

	public void checkRows() {
		// header
		System.out.println();
		System.out.println("Checking Rows");
		System.out.println("=============");
		int sumNums = 0;
		// actual check of the rows to make all sums equal
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				sumNums += matrix[row][col];

			}
			System.out.print(sumNums + " ");
			sumNums = 0;
		}

	}

	public void checkColumns() {
		// header
		System.out.println();
		System.out.println();
		System.out.println("Checking Columns");
		System.out.println("================");
		int sumNums = 0;
		// actual check of the columns to make all sums equal
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				sumNums += matrix[row][col];

			}
			System.out.print(sumNums + " ");
			sumNums = 0;
		}
	}

	public void checkDiagonals() {
		// header
		System.out.println();
		System.out.println();
		System.out.println("Checking Diagonals");
		System.out.println("==================");
		int sumNums = 0;
		// actual check of the diagonals to make all sums equal
		for (int k = 0; k < matrix.length; k++) {
			sumNums += matrix[k][k];
		}
		System.out.print(sumNums + " ");
		sumNums = 0;

		for (int k = 0; k < matrix.length; k++) {
			sumNums += matrix[k][k];
		}
			System.out.print(sumNums);

		}
	}

