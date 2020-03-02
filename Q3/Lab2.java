package Q3;

public class Lab2 {

	static public void printChecker(char[][] checkBoard) {
		System.out.println();
		System.out.println("Output with Method:");
		for (int r = 0; r <= 2; r++) {
			for (int c = 0; c <= 2; c++) {
				System.out.print(checkBoard[r][c]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// part 1
		char[][] checkBoard = new char[3][3];

		checkBoard[0][0] = 'w';
		checkBoard[0][1] = 'b';
		checkBoard[0][2] = 'w';
		checkBoard[1][0] = 'b';
		checkBoard[1][1] = 'w';
		checkBoard[1][2] = 'b';
		checkBoard[2][0] = 'w';
		checkBoard[2][1] = 'b';
		checkBoard[2][2] = 'w';
		System.out.println("Output without loop:");
		System.out.print(checkBoard[0][0]);
		System.out.print(checkBoard[0][1]);
		System.out.println(checkBoard[0][2]);
		System.out.print(checkBoard[1][0]);
		System.out.print(checkBoard[1][1]);
		System.out.println(checkBoard[1][2]);
		System.out.print(checkBoard[2][0]);
		System.out.print(checkBoard[2][1]);
		System.out.println(checkBoard[2][2]);
		System.out.println();

		// output with loop
		System.out.println("Output with loop:");
		for (int r = 0; r <= 2; r++) {
			for (int c = 0; c <= 2; c++) {
				System.out.print(checkBoard[r][c]);
			}
			System.out.println();
		}

		printChecker(checkBoard);

	}

}
