package gui;
import javax.swing.JFrame;
import adapter.MouseAdapter_HW;
import adapter.MyKeyAdapter_HW;


public class MyFrame_HW extends JFrame {

	public MyFrame_HW() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("MyFrame_HW");
		MyPanel_HW panel = new MyPanel_HW();
		
		
		this.add(panel);
		this.addMouseListener(new MouseAdapter_HW(panel));
		this.addKeyListener(new MyKeyAdapter_HW(panel));
		this.setVisible(true);


	}

}

//https://www.youtube.com/watch?v=nQ3QMYnYHtg&feature=youtu.be