package ch5.node;

/**
 * 多项式的项
 * @author single
 *
 */
public class PolyNode {
   
	//系数
	private int xs_number=0;
	//次数
	private int cs_number=0;
	//下一个项
	PolyNode next=null;
	
	public PolyNode() {
		this(0, 0);
	}
	
	public PolyNode(int xs_number, int cs_number) {
		this.xs_number = xs_number;
		this.cs_number = cs_number;
		this.next = null;
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
