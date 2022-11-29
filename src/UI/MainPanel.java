package UI;
import java.awt.*;
import javax.swing.*;

public class MainPanel extends JFrame {
	public MainPanel(JFrame frame) {
		Container contentPane = frame.getContentPane();
		contentPane.setBackground(new Color(0xECD8C8));		// ��� �� ĥ�ϱ�
		contentPane.setLayout(null);						// �׸��� ���̾ƿ� - ��ġ�� ����
		
		/*-------------------------------곰 모드 선택 버튼---------------------------------*/
		JButton BearModeBtn = new JButton("곰 모드");
		BearModeBtn.setSize(150, 40);						// ���۹�ư ũ��
		BearModeBtn.setLocation(275, 300); 				// ���۹�ư ��ġ
		BearModeBtn.setForeground(Color.WHITE);			// ���۹�ư �۾� ����
		BearModeBtn.setBackground(new Color(0x013a63));	// ���۹�ư ����
		BearModeBtn.setFont(new Font("HYGungSo 굵게", Font.PLAIN, 20));	// ���۹�ư ��Ʈ
		contentPane.add(BearModeBtn); // ���۹�ư �ޱ�
		
		/*---------------------------------물고기 모드 선택 버튼----------------------------------*/
		JButton FishModeBtn = new JButton("물고기 모드");
		FishModeBtn.setSize(150, 40);						// ��ŷ��ư ũ��
		FishModeBtn.setLocation(450, 300);					// ��ŷ��ư ��ġ
		FishModeBtn.setForeground(Color.WHITE);				// ��ŷ��ư �۾� ����
		FishModeBtn.setBackground(new Color(0x5e3023));		// ��ŷ��ư ����
		FishModeBtn.setFont(new Font("Neo둥근모 Pro 보통", Font.PLAIN, 20));	// ��ŷ��ư ��Ʈ
		contentPane.add(FishModeBtn); // ��ŷ��ư �ޱ�
		/*-------------------------------무한 포식 모드 선택 버튼---------------------------------*/
		JButton InfiniteModeBtn = new JButton("무한 포식 모드");
		InfiniteModeBtn.setSize(150, 40);						// ���۹�ư ũ��
		InfiniteModeBtn.setLocation(100, 300); 				// ���۹�ư ��ġ
		InfiniteModeBtn.setForeground(Color.WHITE);			// ���۹�ư �۾� ����
		InfiniteModeBtn.setBackground(new Color(0x013a63));	// ���۹�ư ����
		InfiniteModeBtn.setFont(new Font("Neo둥근모 Pro 보통", Font.PLAIN, 20));	// ���۹�ư ��Ʈ
		contentPane.add(InfiniteModeBtn); // ���۹�ư �ޱ�
		
		/*-----------------------------------����-----------------------------------*/
		JLabel Title = new JLabel("Kuma-Gotchi", SwingConstants.CENTER);
		Title.setBounds(210, 60, 274, 50);
		Title.setFont(new Font("Neo둥근모 Pro 보통", Font.BOLD, 40));
		Title.setForeground(Color.WHITE);
		contentPane.add(Title);
		/*-----------------------------------����-----------------------------------*/
		JLabel ModeTitle = new JLabel("모드 선택", SwingConstants.CENTER);
		Title.setBounds(210, 60, 274, 50);
		Title.setFont(new Font("Neo둥근모 Pro 보통", Font.BOLD, 40));
		Title.setForeground(Color.WHITE);
		contentPane.add(Title);
		
		/*-----------------------------------����-----------------------------------*/
		ImageIcon Bear = new ImageIcon("images/mainbear.png");
		Image img = Bear.getImage();
		Image changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		// �� �ڵ�� ���� ũ�� ���� ������, ���� �ٲٸ� �ʿ�X
		
		JLabel MainBear = new JLabel(changeIcon);
		MainBear.setBounds(175, 130, 350, 350);
		contentPane.add(MainBear);
		
	}
	

}
