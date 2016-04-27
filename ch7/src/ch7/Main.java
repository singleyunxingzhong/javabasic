package ch7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(), in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5, 6)).print();
		a.print();
		b.print();
		in.close();
	}

}

class Fraction {
	private  int a = 0;
	private int b = 1;

	public Fraction(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public Fraction() {

	}

	public Fraction plus(Fraction r) {
		Fraction c = new Fraction();
		if(r.b==this.b){
			c.a = r.a + this.a;
			c.b = r.b;
		}else{
		    c.b = this.b*r.b;
		    c.a = this.a*r.b+r.a*this.b;
		}	
		
		c.simple();	
		
		return c;
	}

	public Fraction multiply(Fraction b) {
		Fraction c = new Fraction();
		c.a = b.a * this.a;
		c.b = b.b * this.b;
		c.simple();
		return c;
	}

	public void print() {
		this.simple();
		if (a != 0) {
			if(a==b){
				System.out.println("1");
			}else if(b==1&&a!=1){
				System.out.println(a);
			}else{
				System.out.println(this.a + "/" + this.b);
			}
		} else {
			System.out.println("0");
		}

	}

	public double toDouble() {
		double a1 = (double) a;
		double b2 = (double) b;
		double f = a1 / b2;

		return f;
	}

	public void simple() {
		int max = 1;
		int max_t = 1;

		if (b != 0) {
			if (a != 0) {
				if (a == b) {
					this.a = 1;
					this.b = 1;
				} else if (a % b == 0) {
					this.a = a / b;
					this.b = 1;
				} else if (b % a == 0) {
					this.b = b / a;
					this.a = 1;
				} else {
					max = (a > b) ? a : b;

					for (int i = 1; i < max; i++) {
						if (a % i == 0 && b % i == 0) {
							max_t = i;
							max_t = (i > max_t) ? i : max_t;
						}
					}
					a = a / max_t;
					b = b / max_t;
				}
			}
		}
	}
}
