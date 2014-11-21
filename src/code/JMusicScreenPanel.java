package code;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class JMusicScreenPanel extends JPanel {
	private static final long serialVersionUID = -2692100090680543455L;
	private MusicPlayer mp;
	private String _artName;
	private String _albName;
	private String _songName;
	private BufferedImage _playB;

	public JMusicScreenPanel(Song song) {

		// this.mp = new MusicPlayer();
		loadSong(song);

		try {
			_playB = ImageIO.read(this.getClass().getResource(
					"/Images/playButton.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void loadSong(Song song) {
		_artName = song.getArtist();
		_albName = song.getAlbum();
		_songName = song.getTitle();		
		// this.mp.loadFile(song.getFilepath());
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.black);
		g.setColor(Color.white);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		g.drawString(_artName, 10, 50);
		g.drawString(_albName, 10, 100);
		g.drawString(_songName, 10,150);
		g.drawImage(_playB, (getWidth()/2)-25, getHeight()-55, 50, 50, this);
	}

}
