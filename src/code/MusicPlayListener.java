package code;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MusicPlayListener implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		
		
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			System.out.println("Pressed");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
