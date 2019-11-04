package class8;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstGUIProgram {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("Click Me");
		JButton close = new JButton("Close");
		FlowLayout fl = new FlowLayout();

		Container con = frame.getContentPane();
		con.setLayout(fl);

		con.add(button);
		con.add(close);

		button.addActionListener((ActionEvent ae) -> changeBackground(frame));
		//close.addActionListener(new CloseListener());
		close.addActionListener((e) -> System.exit(0));
		frame.setSize(400, 400);
		frame.setVisible(true);

	}

	static class CloseListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);

		}

	}

	static void changeBackground(JFrame f) {
		System.out.println("Change Background");
		Color c = f.getContentPane().getBackground();
		if (c == Color.RED) {
			f.getContentPane().setBackground(Color.BLUE);
		} else {
			f.getContentPane().setBackground(Color.RED);
		}
	}

}
