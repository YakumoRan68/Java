class Song{
	String Title;
	
	public Song(String title) {
		Title = title;
	}
	
	public String getTitle() {
		return Title;
	}
}

public class ch4_p1 {
	public static void main(String[] args) {
		Song mySong = new Song("Nessun Dorma");
		Song YourSong = new Song("���ִ� �� �� �̷��");
		System.out.println("�� �뷡�� " + mySong.getTitle());
		System.out.println("�� �뷡�� " + YourSong.getTitle());
	}
}
