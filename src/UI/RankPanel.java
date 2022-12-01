package UI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RankPanel extends JFrame {
	public RankPanel(JFrame frame) {
		//Font font = new Font("neo둥근모 pro", Font.PLAIN, 30);
		Container contentPane = frame.getContentPane();
		contentPane.setBackground(new Color(0xECD8C8));		// ��� �� ĥ�ϱ�
		contentPane.setLayout(null);						// �׸��� ���̾ƿ� - ��ġ�� ����
		
		/*-------------------------------Home Button---------------------------------*/
		JButton HomeBtn = new JButton("");
		HomeBtn.setIcon(new ImageIcon("images/HomeBtn.png"));
		HomeBtn.setSelectedIcon(new ImageIcon("images/HomeBtn.png"));
		HomeBtn.setBounds(10, 10, 30, 30);
		HomeBtn.setPressedIcon(new ImageIcon("images/HomeBtnPress.png"));
		contentPane.add(HomeBtn);
		
		/*-----------------------------------RankBear-----------------------------------*/
		ImageIcon RankBear = new ImageIcon("images/RankBear.png");
		Image rankImg1 = RankBear.getImage();
		Image rankChangeImg = rankImg1.getScaledInstance(300,450,Image.SCALE_SMOOTH);
		ImageIcon rankChangeIcon = new ImageIcon(rankChangeImg);
		JLabel RankB = new JLabel(rankChangeIcon);
		RankB.setBounds(-20, 50, 300, 450);
		contentPane.add(RankB);
		
		/*-----------------------------------Rank Window-----------------------------------*/
		ImageIcon RankWindow = new ImageIcon("images/RankWindow.png");
		Image rankImg2 = RankWindow.getImage();
		Image rankChangeImg2 = rankImg2.getScaledInstance(450,450,Image.SCALE_SMOOTH);
		ImageIcon rankChangeIcon2 = new ImageIcon(rankChangeImg2);
		JLabel RankW = new JLabel(rankChangeIcon2);
		RankW.setBounds(230, 0, 450, 450);
		contentPane.add(RankW);
		
		HomeBtn.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	frame.setVisible(false);
	    		Frame newframe = new Frame();
	    		new MainPanel(newframe.frame);
	    		newframe.frame.setVisible(true);
	        }
	    });
	}
}
