package gui;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame extends JFrame {

	public MyFrame() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�Է��ϸ� ������ �ٿ� ���");
		MyPanel panel = new MyPanel();
		
		
		
		this.add(panel);
		this.setVisible(true);


	}

}

//https://www.youtube.com/watch?v=nQ3QMYnYHtg&feature=youtu.be