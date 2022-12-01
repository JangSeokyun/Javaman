package UI;
import java.awt.*;
import javax.swing.*;

public class MainPanel extends JFrame {
	public MainPanel(JFrame frame) {
		Container contentPane = frame.getContentPane();
		contentPane.setBackground(new Color(0xECD8C8));		
		contentPane.setLayout(null);						
		
		/*-------------------------------곰 모드 선택 버튼---------------------------------*/
		JButton BearModeBtn = new JButton("곰 모드");
		BearModeBtn.setSize(150, 40);					
		BearModeBtn.setLocation(275, 300); 			
		BearModeBtn.setForeground(Color.WHITE);			
		BearModeBtn.setBackground(new Color(0x013a63));	
		BearModeBtn.setFont(new Font("Neo둥근모 Pro 보통", Font.PLAIN, 20));	
		contentPane.add(BearModeBtn); 
		
		/*---------------------------------물고기 모드 선택 버튼----------------------------------*/
		JButton FishModeBtn = new JButton("물고기 모드");
		FishModeBtn.setSize(150, 40);				
		FishModeBtn.setLocation(450, 300);				
		FishModeBtn.setForeground(Color.WHITE);				
		FishModeBtn.setBackground(new Color(0x5e3023));		
		FishModeBtn.setFont(new Font("Neo둥근모 Pro 보통", Font.PLAIN, 20));
		contentPane.add(FishModeBtn); 
		/*-------------------------------무한 포식 모드 선택 버튼---------------------------------*/
		JButton InfiniteModeBtn = new JButton("무한 포식 모드");
		InfiniteModeBtn.setSize(150, 40);					
		InfiniteModeBtn.setLocation(100, 300); 				
		InfiniteModeBtn.setForeground(Color.WHITE);			
		InfiniteModeBtn.setBackground(new Color(0x013a63));	
		InfiniteModeBtn.setFont(new Font("Neo둥근모 Pro 보통", Font.PLAIN, 20));
		contentPane.add(InfiniteModeBtn);
		
		JLabel Title = new JLabel("Kuma-Gotchi", SwingConstants.CENTER);
		Title.setBounds(210, 60, 274, 50);
		Title.setFont(new Font("Neo둥근모 Pro 보통", Font.BOLD, 40));
		Title.setForeground(Color.WHITE);
		contentPane.add(Title);
		
		JLabel ModeTitle = new JLabel("모드 선택", SwingConstants.CENTER);
		Title.setBounds(210, 60, 274, 50);
		Title.setFont(new Font("Neo둥근모 Pro 보통", Font.BOLD, 40));
		Title.setForeground(Color.WHITE);
		contentPane.add(Title);
		
		ImageIcon Bear = new ImageIcon("images/mainbear.png");
		Image img = Bear.getImage();
		Image changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		
		JLabel MainBear = new JLabel(changeIcon);
		MainBear.setBounds(175, 130, 350, 350);
		contentPane.add(MainBear);
		
	}
	

}
