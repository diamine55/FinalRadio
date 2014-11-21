package code;

public class Song {

	private String title;
	private String filepath;
	private String artist;
	private String album;

	public Song(String Art, String Alb, String Song, String Path) {
		artist = Art;
		album = Alb;
		title = Song;
		filepath = Path;
		System.out.println(artist + album + title + filepath);

	}

	public String getTitle() {
		return title;
	}

	public String getFilepath() {
		return filepath;
	}

	public String getArtist() {
		return artist;
	}

	public String getAlbum() {
		return album;
	}

}
