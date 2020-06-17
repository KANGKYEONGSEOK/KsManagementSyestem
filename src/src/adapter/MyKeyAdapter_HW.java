package adapter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import gui.MyPanel_HW;

public class MyKeyAdapter_HW extends KeyAdapter {

	MyPanel_HW panel; // 필드설정

	public MyKeyAdapter_HW(MyPanel_HW panel) {
		this.panel = panel;

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		switch (keycode) {
		case KeyEvent.VK_UP:
			panel.y = panel.getY()-30;
			panel.repaint();
			break;
		case KeyEvent.VK_DOWN:
			panel.y = panel.getY()+30;
			panel.repaint();
			break;
		case KeyEvent.VK_LEFT:
			System.out.println("VK_LEFT");
			panel.x = panel.getX()-30;
			panel.repaint();
			break;
		case KeyEvent.VK_RIGHT:
			System.out.println("VK_RIGHT");
			panel.x = panel.getX()+30;
			panel.repaint();
			break;
		}

	}

}
