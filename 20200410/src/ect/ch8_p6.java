package ect;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ch8_p6 extends JFrame {
	public ch8_p6() {
		super("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		for(int i = 0; i < 20; i++) {
			JLabel label = new JLabel(Integer.toString(i));
			label.setLocation((int)(Math.random() * 220) + 30, (int)(Math.random() * 220) + 30);
			label.setSize(20, 20);
			label.setForeground(Color.MAGENTA);
			contentPane.add(label);
		}
		
		setSize(300, 300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ch8_p6();
	}
}
