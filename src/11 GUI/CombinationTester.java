import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CombinationTester {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Test");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JButton button1 = new JButton(" press me ");
		JButton button2 = new JButton(" then me ");
		JTextArea ta1 = new  JTextArea("JTextArea");
		panel1.setLayout(new GridLayout(1, 3));
		panel1.add(button1);
		panel1.add(button2);
		panel2.setLayout(new BorderLayout());
		panel2.add(ta1, BorderLayout.CENTER); 
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

//https://youtu.be/d3MGgi6Z9KQ
