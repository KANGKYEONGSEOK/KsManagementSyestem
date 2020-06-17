import javax.swing.JFrame;
import javax.swing.JLabel;

import adapter.MyMouseAdapter;
import listener.MyMouseListener;

public class MyMouseFrame extends JFrame {

	public MyMouseFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("입력하면 윈도우 바에 출력");
		this.setLayout(null); // 위치를 마음대로 조정가능
		
		JLabel la = new JLabel();
		la.setText("Hello");
		la.setSize(60, 30);
		la.setLocation(30, 30);
		
		this.add(la);
		this.addMouseListener(new MyMouseAdapter(la));
		
		this.setVisible(true);


	}

}

//https://www.youtube.com/watch?v=nQ3QMYnYHtg&feature=youtu.be