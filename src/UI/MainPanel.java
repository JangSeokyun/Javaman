package UI;
import java.awt.*;
import javax.swing.*;

public class MainPanel extends JFrame {
	public MainPanel(JFrame frame) {
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
		JPanel main_panel; // 버튼을 붙여질 메인 패널 선언
		JButton bt_img;
		ImageIcon imgb = new ImageIcon("images/BearBtn.png");
		ImageIcon imgb2 = new ImageIcon("images/BearBtnPress.png");
		/*--------------------------------------------------------------------------------------*/
		setSize(275,500); // 프레임 크기 조정(픽셀)
		main_panel = new JPanel(); // 패널 객체화 / 기본배치관리자 FlowLayout
		main_panel.setBackground(Color.WHITE); // 패널 배경색 하얀색으로 설정
		bt_img = new JButton(imgb);
		bt_img.setRolloverIcon(imgb2); // 버튼에 마우스가 올라갈떄 이미지 변환
		bt_img.setBorderPainted(false); // 버튼 테두리 설정해제
		bt_img.setPreferredSize(new Dimension(140, 30)); // 버튼 크기 지정
		main_panel.add(bt_img); // 패널에 버튼을 붙여준다
		add(main_panel); // 메인 프레임에 메인패널을 붙여주는 작업
		setVisible(true); // 프레임 보이게 하기
		contentPane.add(bt_img);
		
		/*---------------------------------Fish Mode Select Button----------------------------------*/
		JPanel main_pane2; // 버튼을 붙여질 메인 패널 선언
		JButton bt_img2;
		ImageIcon imgf = new ImageIcon("images/FishBtn.png");
		ImageIcon imgf2 = new ImageIcon("images/FishBtnPress.png");
		/*--------------------------------------------------------------------------------------*/
		setSize(700,500); // 프레임 크기 조정(픽셀)
		main_pane2 = new JPanel(); // 패널 객체화 / 기본배치관리자 FlowLayout
		main_pane2.setBackground(Color.WHITE); // 패널 배경색 하얀색으로 설정
		bt_img2 = new JButton(imgf);
		bt_img2.setRolloverIcon(imgf2); // 버튼에 마우스가 올라갈떄 이미지 변환
		bt_img2.setBorderPainted(false); // 버튼 테두리 설정해제
		bt_img2.setPreferredSize(new Dimension(140, 30)); // 버튼 크기 지정
		main_pane2.add(bt_img2); // 패널에 버튼을 붙여준다
		add(main_pane2); // 메인 프레임에 메인패널을 붙여주는 작업
		setVisible(true); // 프레임 보이게 하기
		contentPane.add(bt_img2);
		
		/*-------------------------------Infinite Mode Select Button---------------------------------*/
		JPanel main_pane3; // 버튼을 붙여질 메인 패널 선언
		JButton bt_img3;
		ImageIcon imgi = new ImageIcon("images/InfiniteBtn.png");
		ImageIcon imgi2 = new ImageIcon("images/InfiniteBtnPress.png");
		/*--------------------------------------------------------------------------------------*/
		setSize(1000,500); // 프레임 크기 조정(픽셀)
		main_pane3 = new JPanel(); // 패널 객체화 / 기본배치관리자 FlowLayout
		main_pane3.setBackground(Color.WHITE); // 패널 배경색 하얀색으로 설정
		bt_img3 = new JButton(imgi);
		bt_img3.setRolloverIcon(imgi2); // 버튼에 마우스가 올라갈떄 이미지 변환
		bt_img3.setBorderPainted(false); // 버튼 테두리 설정해제
		bt_img3.setPreferredSize(new Dimension(140, 30)); // 버튼 크기 지정
		main_pane3.add(bt_img3); // 패널에 버튼을 붙여준다
		add(main_pane3); // 메인 프레임에 메인패널을 붙여주는 작업
		setVisible(true); // 프레임 보이게 하기
		contentPane.add(bt_img3);
		
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
