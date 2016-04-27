import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LinkedList<PolyNode> l1 = new LinkedList<PolyNode>();
		LinkedList<PolyNode> l2 = new LinkedList<PolyNode>();

		int cs = 0;
		int xs = 0;
		int flag = 0;

		while (flag <= 1) {
			cs = sc.nextInt();
			xs = sc.nextInt();

			if (flag == 0) {
				l1.add(new PolyNode(cs, xs));
				if (cs == 0) {
					flag++;
				}
			} else {
				l2.add(new PolyNode(cs, xs));
				if (cs == 0) {
					flag++;
				}
			}
		}
//		System.out.println(printPolyList(l1));
//		System.out.println(printPolyList(l2));
		sort(l1);
		sort(l2);
//		System.out.println("After sort");
//		System.out.println(printPolyList(l1));
//		System.out.println(printPolyList(l2));

		System.out.println(printPolyList(add(l1, l2)));
//		System.out.println();
//		System.out.println("Run After" + printPolyList(l1));
//		System.out.println(printPolyList(l2));
		sc.close();
	}

	public static void sort(List<PolyNode> l) {
		int xs_number = 0;
		int cs_number = 0;

		PolyNode p1 = new PolyNode();
		PolyNode p2 = new PolyNode();

		for (int i = 1; i < l.size(); i++) {
			for (int j = 0; j < i; j++) {
				p1 = l.get(j);
				p2 = l.get(j + 1);
				if (p1.getCs_number() < p2.getCs_number()) {
					xs_number = p1.xs_number;
					cs_number = p1.cs_number;

					p1.setCs_number(p2.cs_number);
					p1.setXs_number(p2.xs_number);

					p2.setCs_number(cs_number);
					p2.setXs_number(xs_number);
				}
			}
		}

	}

	public static List<PolyNode> add(LinkedList<PolyNode> l1, LinkedList<PolyNode> l2) {
		LinkedList<PolyNode> result = new LinkedList<PolyNode>();
		PolyNode head1 = (PolyNode) l1.get(0);
		PolyNode head2 = (PolyNode) l2.get(0);
		PolyNode current1 = head1;
		PolyNode current2 = head2;

		int cs_max = 0;
		int index = 0;
		int xs_number = 0;

		Iterator<PolyNode> it1 = l1.iterator();
		Iterator<PolyNode> it2 = l2.iterator();
		Iterator<PolyNode> it3 = result.iterator();

		if (head1.cs_number > head2.cs_number) {
			cs_max = head1.cs_number;
		} else {
			cs_max = head2.cs_number;
		}

		for (int i = cs_max; i >= 0; i--) {
			PolyNode p = new PolyNode(i, 0);
			result.add(p);
		}

		while (it1.hasNext() && index < l1.size()) {
			current1 = l1.get(index);
			if (current1.getCs_number() < result.get(index).getCs_number()) {
				l1.add(index, result.get(index));
				index++;
			} else {
				index++;
			}
		}

		index = 0;
		while (it2.hasNext() && index < l2.size()) {
			current2 = l2.get(index);
			if (current2.getCs_number() < result.get(index).getCs_number()) {
				l2.add(index, result.get(index));
				index++;
			} else {
				index++;
			}
		}

		index = 0;
		while (it3.hasNext() && index < result.size()) {
			xs_number = l1.get(index).getXs_number() + l2.get(index).getXs_number();
			result.get(index).xs_number = xs_number;
			index++;
		}
		return result;
	}

	public static String printPolyList(List<PolyNode> l) {
		StringBuilder s = new StringBuilder("");

		StringBuilder xs_number = new StringBuilder("");

		StringBuilder cs_number = new StringBuilder("");

		StringBuilder theOne = new StringBuilder("");

		int s1 = l.size();
		int i = 0;
		while (i < s1) {
			xs_number.delete(0, xs_number.length());
			cs_number.delete(0, cs_number.length());
			theOne.delete(0, theOne.length());

			PolyNode current = (PolyNode) l.get(i);

			if (current.getXs_number()!=0) {
				if (current.getXs_number() == 1 && current.getCs_number() != 0) {
					xs_number.append("");
				} else {
					xs_number.append(String.valueOf(current.getXs_number()));
				}
				if (current.getCs_number() == 1) {
					cs_number.append("");
					theOne.append(xs_number.toString());
					theOne.append("x");
					theOne.append(cs_number.toString());
				} else if (current.getCs_number() == 0) {

					theOne.append(xs_number.toString());

				} else {
					cs_number.append(String.valueOf(current.getCs_number()));
					theOne.append(xs_number.toString()).append("x").append(cs_number.toString());
				}
				if (i == 0) {
					s.append(theOne.toString());
				} else {
					s.append("+").append(theOne.toString());
				} 
			}else{
				s.append("");
			}
			i++;
		}

		return s.toString();
	}

	public static class PolyNode {
		private int xs_number = 0;
		private int cs_number = 0;

		public PolyNode() {
			this(0, 0);
		}

		public PolyNode(int cs_number, int xs_number) {
			this.xs_number = xs_number;
			this.cs_number = cs_number;
		}

		public int getXs_number() {
			return xs_number;
		}

		public void setXs_number(int xs_number) {
			this.xs_number = xs_number;
		}

		public int getCs_number() {
			return cs_number;
		}

		public void setCs_number(int cs_number) {
			this.cs_number = cs_number;
		}

	}

}
