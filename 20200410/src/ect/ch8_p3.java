package ect;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ch8_p3 extends JFrame{
	public ch8_p3() {
		super("FlowLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("100 + 200"));
		contentPane.add(new JButton("="));
		JLabel result = new JLabel("300"); //이벤트 관련 처리문이 필요할듯? 8장에 없다
		contentPane.add(result);
		
		setSize(400, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ch8_p3();
	}

}
