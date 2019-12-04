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
		Song YourSong = new Song("공주는 잠 못 이루고");
		System.out.println("내 노래는 " + mySong.getTitle());
		System.out.println("너 노래는 " + YourSong.getTitle());
	}
}
