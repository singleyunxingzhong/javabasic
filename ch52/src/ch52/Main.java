package ch52;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		boolean flag = true;
		for (;flag;) {
			str = sc.next().trim();
			if (!str.endsWith(".")) {
				System.out.print(str.length() + " ");
			} else {
				System.out.print(str.length() - 1);
				flag=false;
				break;
			}
		}
		sc.close();
	}

}
