import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame_Pizza {
	public static void main(String[] args) {
		JFrame frame = new JFrame("MyFrame Pizza");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label1 = new JLabel(" Welcome to java pizza. Choose the type of pizza. ");
		JButton button1 = new JButton(" Combination Pizza ");
		JButton button2 = new JButton(" Potato Pizza ");
		JButton button3 = new JButton(" Rosted meat Pizza ");
		JLabel label2 = new JLabel(" Count ");
		JTextField field = new JTextField(10); // 10은 길이를 뜻함
		
		panel1.add(label1);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(label2);
		panel2.add(field);
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);
		frame.setSize(600, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}	
}

//	public static void main(String[] args) {
//		JFrame frame = new JFrame("MyFrame");
//		JPanel panel = new JPanel();
//		JLabel label1 = new JLabel("               Welcome to java pizza. Choose the type of pizza.                      ");
//		JButton button1 = new JButton(" Combination Pizza ");
//		JButton button2 = new JButton(" Potato Pizza ");
//		JButton button3 = new JButton(" Rosted meat Pizza ");
//		JLabel label2 = new JLabel(" Count ");
//		JTextField field = new JTextField(5); // 10은 길이를 뜻함
//		
//		panel.add(label1);
//		panel.add(button1);
//		panel.add(button2);
//		panel.add(button3);
//		panel.add(label2);
//		panel.add(field);
//		frame.setContentPane(panel);
//		frame.setSize(550, 100);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		frame.setVisible(true);
//	}
//
//}

//https://www.youtube.com/watch?v=MrFy8nyUbD8&feature=youtu.be
