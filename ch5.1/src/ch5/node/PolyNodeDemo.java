package ch5.node;

public class PolyNodeDemo {

	public static void main(String[] args) {
		PolyList p1 = new PolyList();
		p1.insert(new PolyNode(2, 2));
		p1.insert(new PolyNode(100, 3));
		p1.insert(new PolyNode(45, 5));
		p1.insert(new PolyNode(7, 20));
		p1.insert(new PolyNode(5,0));
		System.out.println("p1=" + p1.printS());
		
		 //多项式p2  
        PolyList p2=new PolyList();  
        p2.insert(new PolyNode(8,2));  
        p2.insert(new PolyNode(7,3));  
        p2.insert(new PolyNode(4,4));  
        p2.insert(new PolyNode(6,18));  
        p2.insert(new PolyNode(7,20));  
        p2.insert(new PolyNode(7,0));
        System.out.println("p2="+p2.printS());  
          
       //相加  
       PolyList resultList1= PolyList.add(p1, p2);  
       System.out.println("p1+p2="+resultList1.printS());  
         
       System.out.println();  
	}

}
