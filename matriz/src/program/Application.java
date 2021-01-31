package program;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main Diagonal:");
		
		for (int i = 0; i < n; i++) {
			System.out.println(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers: " + count);
		*/
		
		int n, m;
		
		m = sc.nextInt();
		n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position: " + i + "," + j + ":");
					
					if (j>0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					
					if (i>0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					
					if (j< mat[i].length) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					
					if (i>mat.length) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
		
	}

}
