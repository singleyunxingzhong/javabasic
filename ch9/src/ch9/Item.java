package ch9;

public class Item {
	private String title;
	private int playingTime;
	private String comment;
	private boolean gotIt = false;

	public Item(String title, int playingTime, String comment, boolean gotIt) {
		this.title = title;
		this.playingTime = playingTime;
		this.comment = comment;
		this.gotIt = gotIt;
	}

	public void print() {
		System.out.println(this.title + this.playingTime + this.comment + this.gotIt);
	}
}
