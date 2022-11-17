package UI;

import java.awt.*;
import javax.swing.*;

public class Frame{
	public JFrame frame = new JFrame("BearFish");
	
	public Frame() {
		frame.setTitle("BearFish");
		frame.setSize(700, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}
}