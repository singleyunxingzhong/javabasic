package ch6worked;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] Tic = new int[n][n];
		int num, tag = -1;
		boolean gotResult = false;

	
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				Tic[i][j] = in.nextInt();
			}
		}

		if(!gotResult){
			for (int i = 0; i < n; i++) {
				num = Tic[0][i];
				for (int j = 0; j < n - 1; j++) {
					if (Tic[j][i] != Tic[j + 1][i]) {
						break;
					}
					if (j == n - 2)
						tag = num;
				}
			}

		}
		
		if (!gotResult) {
			for (int i = 0; i < n; i++) {
				num = Tic[i][0];
				for (int j = 0; j < n - 1; j++) {
					if (Tic[i][j] != Tic[i][j + 1])
						break;
					if (j == n - 2)
						tag = num;
				}
			} 
		}
		
		if (!gotResult) {
			for (int i = 0; i < n - 1; i++) {
				if (Tic[i][i] != Tic[i + 1][i + 1])
					break;
				if (i == n - 2)
					tag = Tic[0][0];
			} 
		}
		
		if (!gotResult) {
			for (int i = 0; i < n - 1; i++) {
				if (Tic[n - 1 - i][i] != Tic[n - 2 - i][i + 1])
					break;
				if (i == n - 2)
					tag = Tic[n - 1][0];
			} 
		}
		if (tag == 1)
			System.out.println("X");
		else if (tag == 0)
			System.out.println("O");
		else
			System.out.println("NIL");
		in.close();
	}
}