package listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class MyMouseListener implements MouseListener {
	
	JButton button;
	
	public MyMouseListener(JButton button) {
		this.button = button;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");


	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
		int x = e.getX();
		int y = e.getY();
		button.setLocation(x, y);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEntered");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited");

	}

}
