import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import listener.MyKeyListener;
import listener.MyListener;
import listener.MyMouseListener;

public class MyFrame_Key extends JFrame {

	public MyFrame_Key() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("입력하면 윈도우 바에 출력");
		
		
		
		JLabel la = new JLabel();
		
		
		this.add(la);
		this.addKeyListener(new MyKeyListener(la));
		this.setVisible(true);

	}

}

