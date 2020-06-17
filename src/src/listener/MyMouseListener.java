package listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class MyMouseListener implements MouseListener {
	
	JLabel label;
	
	public MyMouseListener(JLabel label) {
		this.label = label;
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
		label.setLocation(x, y);
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

// https://www.youtube.com/watch?v=nQ3QMYnYHtg&feature=youtu.be
