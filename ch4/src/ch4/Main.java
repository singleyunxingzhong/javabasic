package ch4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =0;
		int odd = 0;
		int ers=0;
		
		x=sc.nextInt();
		while(x!=-1){
			if(x%2!=0){
				odd++;
			}else{
				ers++;
			}
			x=sc.nextInt();
		}
		System.out.println(odd+" "+ers);
		sc.close();
	}

}
