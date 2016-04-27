package ch9;

public class Mp3 extends Item {
	private String artist;
	private String filename;
	private String album;

	public Mp3(String title, int playingTime, String comment, boolean gotIt, String filename, String artist,
			String album) {
		super(title, playingTime, comment, gotIt);
		this.filename = filename;
		this.album = album;
		this.artist = artist;
	}

	public void print() {
		super.print();
		System.out.println(this.artist+this.album+this.filename);
	}
}
