package gui;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MyPanel_HW extends JPanel{
	
	public int x =20, y=20;

	public MyPanel_HW() {
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(x, y, 50, 50); //³×¸ð
		
	}
	
	//getter & setter 
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
//	public void mouseClicked(MouseEvent e) {
//		panel.x = e.getX();
//		panel.y = e.getY();
//		panel.repaint();
//		}
}