package ch7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		System.out.println(num+"="+outNum(num));
		sc.close();
	}

	public static String outNum(int num) {
		String outNum = "";
		int primeNumber = 2;
	    while(primeNumber<=num){
	    	if(primeNumber==num){
	    		outNum+=num;
	    		break;
	    	}else if(num%primeNumber==0){
	    		outNum +=primeNumber+"x";
	    		num=num/primeNumber;
	    	}else{
	    		primeNumber++;
	    	}
	    }
		return outNum;
	}
}
