package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class MyListener_FahrenheitConverter implements ActionListener {

	JTextField field1;
	JTextField field2;

	public MyListener_FahrenheitConverter(JTextField field1, JTextField field2) {
		this.field1 = field1;
		this.field2 = field2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// JButton button= (JButton)e.getSource();
		double c = (Double.parseDouble(field1.getText()) - 32) / 1.8; // ���� ���� ���ڷ� �ٲ� ����
		field2.setText(Double. toString(c)); 
	}

}

//// https://www.youtube.com/watch?v=1oK-MWJISVw&feature=youtu.be ��ư������