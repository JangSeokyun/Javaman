package UI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Map extends JFrame{
	int Wall_garo = 17;
	int Wall_sero = 15;
	final ImageIcon Icon_wall = new ImageIcon("images/wall.png");
	final ImageIcon Icon_road = new ImageIcon("images/road.png");
	JLabel wall[][] = new JLabel[Wall_garo][Wall_sero];
	
	public Map(JFrame frame) {
		frame.setLayout(null);
		frame.setSize(Wall_garo*40+15,Wall_sero*40+35);
		frame.setVisible(true);

		for (int i = 0; i < Wall_garo; i++) {
			for (int j = 0; j < Wall_sero; j++) {

				wall[i][j] = new JLabel();
				wall[i][j].setBounds(i * 40, j * 40, 40, 40);
				frame.add(wall[i][j]);
				wall[i][j].setIcon(Icon_wall);
			}
		}		
		for (int i = 1; i < 16; i++) {
			wall[i][1].setIcon(Icon_road);
		}
		for (int i = 3; i < 14; i++) {
			wall[i][3].setIcon(Icon_road);
			wall[i][7].setIcon(Icon_road);
			wall[i][9].setIcon(Icon_road);
		}
		for (int i = 1; i < 14; i++) {
			wall[1][i].setIcon(Icon_road);
			wall[15][i].setIcon(Icon_road);
		}
		for (int i = 4; i < 7; i++) {
			wall[3][i].setIcon(Icon_road);
			wall[5][i].setIcon(Icon_road);
			wall[11][i].setIcon(Icon_road);
			wall[13][i].setIcon(Icon_road);
		}
		for (int i = 10; i < 14; i++) {
			wall[3][i].setIcon(Icon_road);
			wall[13][i].setIcon(Icon_road);
		}
		for (int i = 5; i < 12; i++) {
			wall[i][13].setIcon(Icon_road);
		}
		for (int i = 4; i < 6; i++) {
			wall[i][11].setIcon(Icon_road);
			wall[i + 7][11].setIcon(Icon_road);
		}
		wall[8][2].setIcon(Icon_road);
		wall[2][5].setIcon(Icon_road);
		wall[14][5].setIcon(Icon_road);
		wall[5][12].setIcon(Icon_road);
		wall[11][12].setIcon(Icon_road);
		wall[2][13].setIcon(Icon_road);
		wall[14][13].setIcon(Icon_road);

		Thread th = new Thread();
		th.start();
		
	}
}
