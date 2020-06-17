package adapter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import gui.MyPanel_HW;

public class MouseAdapter_HW extends MouseAdapter {

	MyPanel_HW panel;

	public MouseAdapter_HW(MyPanel_HW panel) {
		this.panel = panel;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//Graphics g = panel.getGraphics();
		panel.x = e.getX();
		panel.y = e.getY();
		//panel.setLocation(x, y);
		panel.repaint();
	}

//	@Override
//	public void mouseClicked(MouseEvent e) {
//		// TODO Auto-generated method stub
//		super.mouseClicked(e);
//	}
//
//	@Override
//	public void mousePressed(MouseEvent e) {
//		// TODO Auto-generated method stub
//		super.mousePressed(e);
//	}
//
//	public MouseAdapter_HW() {
//		// TODO Auto-generated constructor stub
//	}
//
}
