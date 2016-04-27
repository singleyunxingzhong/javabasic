import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n=0;
        int n_t=0;
        int n_w=1;
        int b1=1;
        int b_sum=0;
        
        n = sc.nextInt();
        if(n==0){
        	b_sum=0;
        }else{
        	while(n!=0){
        	  n_t=n%10;
        	  n=n/10;
        	  if(n_t%2!=0 && n_w%2!=0){
        		  b_sum+=b1;
        		  b1*=2;
        	  }else if(n_t%2==0 && n_w%2==0){
        		  b_sum+=b1;
        		  b1*=2;
        	  }else {
        		  b_sum+=0;
        		  b1*=2;
        	  }
        	  n_w++;
        	}
        }
        sc.close();
        System.out.println(b_sum);
	}
}
