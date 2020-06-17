package listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;

public class MyKeyListener implements KeyListener {

	JLabel la; // 필드설정

	public MyKeyListener(JLabel la) {
		this.la = la;

	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println(e.getKeyChar());
		la.setText(la.getText() + e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int  keycode = e.getKeyCode();
		switch(keycode) {
		case KeyEvent.VK_UP:
			la.setLocation(la.getX(), la.getY()-10);
			break;
		case KeyEvent.VK_DOWN:
			la.setLocation(la.getX(), la.getY()+10);
			break;
		case KeyEvent.VK_LEFT:
			la.setLocation(la.getX()-10, la.getY());
			break;
		case KeyEvent.VK_RIGHT:
			la.setLocation(la.getX()+10, la.getY());
			break;
		}

	}



@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub

}

}
