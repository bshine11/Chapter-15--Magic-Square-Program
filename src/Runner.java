import java.util.Scanner;


public class Runner {
	public static void main(String[] args)
	   {
	   	Scanner input = new Scanner(System.in);

	      System.out.print("Enter the odd# size of the Magic Square -->  ");
	      int size = input.nextInt();
	      MagicSquare magic = new MagicSquare(size);

	      magic.computeMagicSquare();
	      magic.displayMagicSquare();
	      magic.checkRows();          // for 100 & 110 Point Version Only
	      magic.checkColumns();       // for 100 & 110 Point Version Only
	      magic.checkDiagonals();     // for 100 & 110 Point Version Only
		}

}