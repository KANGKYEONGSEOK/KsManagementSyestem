import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlowLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Test");
		JPanel panel = new JPanel();
		JButton button1 = new JButton(" press me ");
		JButton button2 = new JButton(" then me ");

		panel.add(button1);
		panel.add(button2);

		frame.setContentPane(panel); // 프레임에 패널을 붙임
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

//https://youtu.be/d3MGgi6Z9KQ
