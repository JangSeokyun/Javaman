package UI;
import java.awt.*;
import javax.swing.*;
import UI.*;
import UI.Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JFrame {
	public MainPanel(JFrame frame) {
		Container contentPane = frame.getContentPane();
		contentPane.setBackground(new Color(0xECD8C8));		// 배경 색 칠하기
		contentPane.setLayout(null);						// 그리드 레이아웃 - 배치자 제거
		
		/*-------------------------------게임 시작 버튼---------------------------------*/
		JButton StartBtn = new JButton("게임 시작");
		StartBtn.setSize(150, 40);						// 시작버튼 크기
		StartBtn.setLocation(100, 300); 				// 시작버튼 위치
		StartBtn.setForeground(Color.WHITE);			// 시작버튼 글씨 색상
		StartBtn.setBackground(new Color(0x013a63));	// 시작버튼 색상
		StartBtn.setFont(new Font("Neo둥근모", Font.PLAIN, 20));	// 시작버튼 폰트
		contentPane.add(StartBtn); // 시작버튼 달기
		
		/*---------------------------------랭킹 버튼----------------------------------*/
		JButton RankBtn = new JButton("랭킹");
		RankBtn.setSize(150, 40);						// 랭킹버튼 크기
		RankBtn.setLocation(450, 300);					// 랭킹버튼 위치
		RankBtn.setForeground(Color.WHITE);				// 랭킹버튼 글씨 색상
		RankBtn.setBackground(new Color(0x5e3023));		// 랭킹버튼 색상
		RankBtn.setFont(new Font("Neo둥근모", Font.PLAIN, 20));	// 랭킹버튼 폰트
		contentPane.add(RankBtn); // 랭킹버튼 달기
		
		/*-----------------------------------제목-----------------------------------*/
		JLabel Title = new JLabel("쿠마고치", SwingConstants.CENTER);
		Title.setBounds(210, 60, 274, 50);
		Title.setFont(new Font("Neo둥근모", Font.BOLD, 40));
		Title.setForeground(Color.WHITE);
		contentPane.add(Title);
		
		/*-----------------------------------사진-----------------------------------*/
		ImageIcon Bear = new ImageIcon("images/mainbear.png");
		Image img = Bear.getImage();
		Image changeImg = img.getScaledInstance(350,350,Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		// 위 코드는 사진 크기 강제 조절함, 사진 바꾸면 필요X
		
		JLabel MainBear = new JLabel(changeIcon);
		MainBear.setBounds(175, 130, 350, 350);
		contentPane.add(MainBear);
		
		StartBtn.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	frame.setVisible(false);
	    		Frame newframe = new Frame();
	    		new ModeSelectPanel(newframe.frame);
	    		newframe.frame.setVisible(true);
	        }
	    });
		
		RankBtn.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	frame.setVisible(false);
	    		Frame newframe = new Frame();
	    		new RankPanel(newframe.frame);
	    		newframe.frame.setVisible(true);
	        }
	    });
		
	}
	


}