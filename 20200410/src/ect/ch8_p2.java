package ect;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ch8_p2 extends JFrame {
	public ch8_p2() {
		super("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new BorderLayout(50, 5)); //АЃАн hgap,vgap
		
		contentPane.add(new JButton("Center"), BorderLayout.CENTER); 
		contentPane.add(new JButton("North"), BorderLayout.NORTH);
		contentPane.add(new JButton("West"), BorderLayout.WEST);
		contentPane.add(new JButton("East"), BorderLayout.EAST);
		contentPane.add(new JButton("South"), BorderLayout.SOUTH);
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ch8_p2();
	}

}
