package Q3;

import java.util.Scanner;

public class Lab2Part2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char[][] grid = new char[5][5];
		grid[0][0] = 'A';
		grid[0][1] = 'N';
		grid[0][2] = 'N';
		grid[0][3] = 'A';

		grid[1][0] = 'S';
		grid[1][1] = 'T';
		grid[1][2] = 'E';
		grid[1][3] = 'V';
		grid[1][4] = 'E';

		grid[3][0] = 'C';
		grid[3][1] = 'R';
		grid[3][2] = 'A';
		grid[3][3] = 'I';
		grid[3][4] = 'G';

		for (int c = 0; c < 5; c++) {
			System.out.print(grid[3][c]);
		}

		for (int c = 0; c < 4; c++) {
			grid[2][c] = sc.next().charAt(0);
		}
		for (int c = 0; c < 4; c++) {
			grid[1][c] = sc.next().charAt(0);
		}

		for (int r = 0; r < 5; r++) {

			for (int c = 0; c < 5; c++) {
				System.out.print(grid[r][c]);
			}
			System.out.println();
		}

	}

}
