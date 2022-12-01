package UI;
import java.awt.*;
import javax.swing.*;

public class MainPanel extends JFrame {
	public MainPanel(JFrame frame) {
		Container contentPane = frame.getContentPane();

		ImageIcon Bear = new ImageIcon("images/mainbear.png");
		Image img = Bear.getImage();
		Image changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		
		JLabel MainBear = new JLabel(changeIcon);
		MainBear.setBounds(175, 130, 350, 350);
		contentPane.add(MainBear);
		
	}
	

}
