package challenge;

import java.util.Scanner;

// Write a java program to accept numbers in a matrix of size 4 x 4 by using Scanner class then calculate and display sum of bordered elements.
public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int m, n, sum = 0, row1 = 0, col_n = 0, diag = 0;
		System.out.print("\nEnter the order of the matrix : ");
		m = sc.nextInt();
		n = sc.nextInt();
		int i, j;
		int[][] mat = new int[m][n];
		System.out.print("\nInput the matrix elements \n");
		for(i = 0; i < m; i++)
			{
				for(j = 0; j < n; j++)
				mat[i][j] = sc.nextInt();
			}
		System.out.print("\nBoundary Matrix\n");
		for(i = 0; i < m; i++)
			{
				for(j = 0; j < n; j++)
					{
						if (i == 0 || j == 0 || i == n-1 || j == n -1)
							{
								System.out.print(mat[i][j] + "  ");
								sum = sum + mat[i][j];
							}
						else
								System.out.print(" ");
					}
				System.out.print("\n");
			}
		System.out.print("\nSum of boundary is " + sum);
	}
}