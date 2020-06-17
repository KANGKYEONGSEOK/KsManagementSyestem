import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import listener.MyListener_FahrenheitConverter;

public class FahrenheitConverter {

	public FahrenheitConverter() {
		JFrame frame = new JFrame("FahrenheitConverter");
		JPanel panel = new JPanel();
		JLabel label1 = new JLabel("Fahrenheit temperature:");
		JLabel label2 = new JLabel("Celsius temperature:");
		JTextField field1 = new JTextField(10); // 10은 길이를 뜻함
		JTextField field2 = new JTextField(10);
		JButton button = new JButton("Convert");

		button.addActionListener(new MyListener_FahrenheitConverter(field1, field2));
		// frame.addMouseListener(new MyMouseListener(button));

		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button);
		frame.setContentPane(panel);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

//http://wpkc.egloos.com/5001703
//https://yongkun95.tistory.com/entry/JAVA-GUI-%EA%B8%B0%EC%B4%88-%EB%8B%A4%EC%A7%80%EA%B8%B0
