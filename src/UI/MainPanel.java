package UI;
import java.awt.*;
import javax.swing.*;

public class MainPanel extends JFrame {
	public MainPanel(JFrame frame) {
		Container contentPane = frame.getContentPane();
		contentPane.setBackground(new Color(0xECD8C8));	
		contentPane.setLayout(null);					
		
		/*-------------------------------Game Start---------------------------------*/
		JButton StartBtn = new JButton("게임 시작");
		StartBtn.setSize(150, 40);					
		StartBtn.setLocation(100, 300); 			
		StartBtn.setForeground(Color.WHITE);			
		StartBtn.setBackground(new Color(0x013a63));	
		StartBtn.setFont(new Font("Neo�ձٸ�", Font.PLAIN, 20));
		contentPane.add(StartBtn); // ���۹�ư �ޱ�
		
		/*---------------------------------Rank----------------------------------*/
		JButton RankBtn = new JButton("랭킹");
		RankBtn.setSize(150, 40);					
		RankBtn.setLocation(450, 300);				
		RankBtn.setForeground(Color.WHITE);			
		RankBtn.setBackground(new Color(0x5e3023));		
		RankBtn.setFont(new Font("Neo�ձٸ�", Font.PLAIN, 20));	
		contentPane.add(RankBtn); 
		
		/*-----------------------------------Title-----------------------------------*/
		JLabel Title = new JLabel("Kuma-Gotchi", SwingConstants.CENTER);
		Title.setBounds(210, 60, 274, 50);
		Title.setFont(new Font("Neo�ձٸ�", Font.BOLD, 40));
		Title.setForeground(Color.WHITE);
		contentPane.add(Title);
		
		/*-----------------------------------Mascot-----------------------------------*/
		ImageIcon Bear = new ImageIcon("images/mainbear.png");
		Image img = Bear.getImage();
		Image changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		
		JLabel MainBear = new JLabel(changeIcon);
		MainBear.setBounds(175, 130, 350, 350);
		contentPane.add(MainBear);
		
	}
	

}
