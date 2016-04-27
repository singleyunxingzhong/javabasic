package ch1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double te_f = 0, te_c = 0;
		int ic=0;
		te_f = sc.nextInt();
		sc.close();
        te_c=(te_f-32)*5/9;
        ic = (int)te_c;
        System.out.println(ic);
  
	}

}
