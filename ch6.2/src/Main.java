import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= 0;
		int m=0;
				
		n = sc.nextInt();
		m = sc.nextInt();
		int sum=0;
		
		String outNum = "";
		
		for(int i=n;i<m;i++){
			sum=0;
            for(int j=1;j<i;j++){
            	if(i%j==0){
            		//System.out.println(i+"i,j"+j);
            		sum+=j;
            	}
            }
           // System.out.println(sum+"=i:"+i);
            if(sum==i){
            	outNum+=i+" ";
            }
		}
		
		
		if(outNum.equals("")){
			System.out.println("NIL");
		}else
		  System.out.println(outNum.trim());
		sc.close();
	}
}
