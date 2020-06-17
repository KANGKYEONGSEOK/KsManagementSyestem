import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ComponentTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("ComponentTest");
		JPanel panel = new JPanel();
		JButton button = new JButton("Press me!");
		
		panel.add(button);
		frame.setContentPane(panel);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}

}
