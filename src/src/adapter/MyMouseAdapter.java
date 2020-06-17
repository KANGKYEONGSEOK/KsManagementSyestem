package adapter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class MyMouseAdapter extends MouseAdapter {

	JLabel label;

	public MyMouseAdapter(JLabel label) {
		this.label = label;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
		int x = e.getX();
		int y = e.getY();
		label.setLocation(x, y);
	}

}

// https://www.youtube.com/watch?v=nQ3QMYnYHtg&feature=youtu.be
