package ch5.node;

/**
 * 多项式列表
 * 
 * @author single
 *
 */
public class PolyList {
	// 头部
	private PolyNode head = null;
	// 当前位置
	private PolyNode current = null;

	public PolyList() {

		head = new PolyNode();
		current = head;
		head.next = null;
	}

	// 是否为空
	public boolean isEmpty() {

		return head.next == null;
	}

	// 插入元素
	public void insert(PolyNode node) {
		current.next = node;
		current = node;
	}

	// 打印多项式
	public String printS() {
		// 最终结果
		StringBuilder s = new StringBuilder("");
		// 系数
		StringBuilder xs_number = new StringBuilder("");
		// 次数
		StringBuilder cs_number = new StringBuilder("");
		// 单独项显示结果
		StringBuilder theOne = new StringBuilder("");

		current = head.next;

		while (current != null) {
			xs_number.delete(0, xs_number.length());
			cs_number.delete(0, cs_number.length());
			theOne.delete(0, theOne.length());

			if (current.getXs_number() == 1 && current.getCs_number() != 0) {
				xs_number.append("");
			} else {
				xs_number.append(String.valueOf(current.getXs_number()));
			}

			if (current.getCs_number() == 1) {
				cs_number.append("");

				// 添加系数
				theOne.append(xs_number.toString());
				// 添加X
				theOne.append("x");
				// 添加次数
				theOne.append(cs_number.toString());
			} else if (current.getCs_number() == 0) {

				theOne.append(xs_number.toString());

			} else {
				cs_number.append(String.valueOf(current.getCs_number()));
				theOne.append(xs_number.toString()).append("x^").append(cs_number.toString());
			}

			if (current == head.next)
				s.append(theOne.toString());
			else
				s.append("+").append(theOne.toString());

			current = current.next;
		}
		return s.toString();
	}

	// 加法运算
	public static PolyList add(PolyList p1, PolyList p2) {
		// 表示结果的多项式链表
		PolyList result = new PolyList();
		// 结果的系数和次数
		int xs_number = 0;
		int cs_number = 0;

		// 分别指向p1 p2的第一个元素
		p1.current = p1.head.next;
		p2.current = p2.head.next;

		while (p1.current != null && p2.current != null) {

			if (p1.current.getCs_number() == p2.current.getCs_number()) {
				// 次数相同，则系数相加
				xs_number = p1.current.getXs_number() + p2.current.getXs_number();
				cs_number = p1.current.getCs_number();

				result.insert(new PolyNode(xs_number, cs_number));

				p1.current = p1.current.next;
				p2.current = p2.current.next;

			} else if (p1.current.getCs_number() < p2.current.getCs_number()) {

				result.insert(p1.current);
				p1.current = p1.current.next;

			} else {
				result.insert(p2.current);
				p2.current = p2.current.next;
			}
		}
		while (p1.current != null) {

			result.insert(p1.current);
			p1.current = p1.current.next;
		}
		while (p2.current != null) {

			result.insert(p2.current);
			p2.current = p2.current.next;
		}
		return result;

	}
}
