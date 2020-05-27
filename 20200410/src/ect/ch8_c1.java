package ect;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		
		add(new JButton("Open"));
		add(new JButton("Read"));
		add(new JButton("Close"));
		
		//setSize(300, 100);
	}
}

class CenterPanel extends JPanel {
	public CenterPanel() {
		setLayout(null);
		
		JLabel label = new JLabel("Hello Java!");
		label.setSize(100, 20);
		label.setLocation(100, 50);
		
		add(label);
	}
}

public class ch8_c1 extends JFrame {
	public ch8_c1() {
		super("Open Challenge 8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new BorderLayout());
		
		JPanel NPanel = new JPanel();
		NPanel.setBackground(Color.LIGHT_GRAY);
		NPanel.setLayout(new FlowLayout());
		
		NPanel.add(new JButton("Open"));
		NPanel.add(new JButton("Read"));
		NPanel.add(new JButton("Close"));
		
		//NPanel.setSize(300, 100);
		
		//contentPane.add(new NorthPanel(), BorderLayout.NORTH);
		contentPane.add(NPanel, BorderLayout.NORTH); 			//두가지 방법 사용
		contentPane.add(new CenterPanel(), BorderLayout.CENTER); 
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ch8_c1();

	}

}
