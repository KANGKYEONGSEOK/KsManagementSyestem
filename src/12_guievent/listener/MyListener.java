package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyListener implements ActionListener {

	public MyListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button= (JButton)e.getSource();
		button.setText("HI");
	}

}

//// https://www.youtube.com/watch?v=1oK-MWJISVw&feature=youtu.be 버튼리스너