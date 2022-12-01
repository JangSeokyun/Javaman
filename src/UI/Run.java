package UI;

public class Run {
	public static void main(String[] args) {
		Frame frame = new Frame();
		new MainPanel(frame.frame);
		frame.frame.setVisible(true);
	}

}
