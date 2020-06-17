import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Non_LayoutTester {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Test");
		JPanel panel1 = new JPanel();
		JButton button1 = new JButton(" press me ");
		button1.setBounds(10, 10, 100, 50); // 버튼 사이즈 설정,
		
		
		panel1.setLayout(null); // null은 레이아웃이 없다는 뜻이다. 
		panel1.add(button1);
		
		frame.setContentPane(panel1 ); // 프레임 전체를 의미
		
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

//https://youtu.be/d3MGgi6Z9KQ
