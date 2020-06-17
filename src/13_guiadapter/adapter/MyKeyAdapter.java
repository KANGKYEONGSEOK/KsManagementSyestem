package adapter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;

public class MyKeyAdapter extends KeyAdapter {

	MyPanel la; // 필드설정

	public MyKeyAdapter(JLabel la) {
		this.la = la;

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		switch (keycode) {
		case KeyEvent.VK_UP:
			la.setLocation(la.getX(), la.getY() - 10);
			break;
		case KeyEvent.VK_DOWN:
			la.setLocation(la.getX(), la.getY() + 10);
			break;
		case KeyEvent.VK_LEFT:
			la.setLocation(la.getX() - 10, la.getY());
			break;
		case KeyEvent.VK_RIGHT:
			la.setLocation(la.getX() + 10, la.getY());
			break;
		}

	}

}
