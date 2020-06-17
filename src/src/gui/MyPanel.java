package gui;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import adapter.PanelMouseAdapter;

public class MyPanel extends JPanel{

	public MyPanel() {
		this.addMouseListener(new PanelMouseAdapter(this));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
//		super.paintComponent(g);
//		g.drawRect(50, 50, 50, 50); //네모
//		g.drawOval(100, 100, 100, 100); //원
//		g.drawLine(250, 250, 250, 300); //선
//		g.drawString("hello", 400, 400); // 글
	}
}


