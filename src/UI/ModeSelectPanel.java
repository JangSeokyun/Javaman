package UI;
import java.awt.*;
import javax.swing.*;

public class ModeSelectPanel extends JFrame {
	public ModeSelectPanel(JFrame frame) {
		//Font font = new Font("neo둥근모 pro", Font.PLAIN, 30);
		Container contentPane = frame.getContentPane();
		contentPane.setBackground(new Color(0xECD8C8));		// ��� �� ĥ�ϱ�
		contentPane.setLayout(null);						// �׸��� ���̾ƿ� - ��ġ�� ����
		
		/*-----------------------------------Title-----------------------------------*/
		JLabel Title = new JLabel("Kuma-Gotchi", SwingConstants.CENTER);
		Title.setBounds(210, 40, 274, 50);
		Title.setFont(new Font("Neo둥근체", Font.BOLD, 40));
		Title.setForeground(Color.WHITE);
		contentPane.add(Title);
		
		/*-------------------------------Bear Mode Select Button---------------------------------*/
		JButton BearModeBtn = new JButton("");
		BearModeBtn.setIcon(new ImageIcon("images/BearBtn.png"));
		BearModeBtn.setSelectedIcon(new ImageIcon("images/BearBtn.png"));
		BearModeBtn.setBounds(275, 210, 140, 30);
		BearModeBtn.setPressedIcon(new ImageIcon("images/BearBtnPress.png"));
		contentPane.add(BearModeBtn);
		
		/*---------------------------------Fish Mode Select Button----------------------------------*/
		JButton FishModeBtn = new JButton("");
		FishModeBtn.setIcon(new ImageIcon("images/FishBtn.png"));
		FishModeBtn.setSelectedIcon(new ImageIcon("images/FishBtn.png"));
		FishModeBtn.setBounds(275, 260, 140, 30);
		FishModeBtn.setPressedIcon(new ImageIcon("images/FishBtnPress.png"));
		contentPane.add(FishModeBtn);
		
		/*-------------------------------Infinite Mode Select Button---------------------------------*/
		JButton InfiniteModeBtn = new JButton("");
		InfiniteModeBtn.setIcon(new ImageIcon("images/InfiniteBtn.png"));
		InfiniteModeBtn.setSelectedIcon(new ImageIcon("images/InfiniteBtn.png"));
		InfiniteModeBtn.setBounds(275, 310, 140, 30);
		InfiniteModeBtn.setPressedIcon(new ImageIcon("images/InfiniteBtnPress.png"));
		contentPane.add(InfiniteModeBtn);
		
		/*-----------------------------------Option Window-----------------------------------*/
		ImageIcon OptionWindow = new ImageIcon("images/OptionWindow.png");
		Image img = OptionWindow.getImage();
		Image changeImg = img.getScaledInstance(350,300,Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		JLabel OptionW = new JLabel(changeIcon);
		OptionW.setBounds(175, 100, 350, 350);
		contentPane.add(OptionW);
		
		/*-----------------------------------Right Bear-----------------------------------*/
		ImageIcon RightBear = new ImageIcon("images/RightBear.png");
		Image img2 = RightBear.getImage();
		Image changeImg2 = img2.getScaledInstance(260,400,Image.SCALE_SMOOTH);
		ImageIcon changeIcon2 = new ImageIcon(changeImg2);
		JLabel RightBear1 = new JLabel(changeIcon2);
		RightBear1.setBounds(450, 50, 260, 400);
		contentPane.add(RightBear1);
		
		/*-----------------------------------Left Bear-----------------------------------*/
		ImageIcon LeftBear = new ImageIcon("images/LeftBear.png");
		Image img3 = LeftBear.getImage();
		Image changeImg3 = img3.getScaledInstance(260,400,Image.SCALE_SMOOTH);
		ImageIcon changeIcon3 = new ImageIcon(changeImg3);
		JLabel LeftBear1 = new JLabel(changeIcon3);
		LeftBear1.setBounds(-20, 50, 260, 400);
		contentPane.add(LeftBear1);
		
	}
}
