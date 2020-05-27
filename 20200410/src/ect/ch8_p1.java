package ect;

import javax.swing.JFrame;


public class ch8_p1 extends JFrame {
	public ch8_p1() {
		super("Let\'s study Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ch8_p1();
	}
	
}
