package ect;
import java.awt.*;

import javax.swing.*;

public class ch8_e extends JFrame{
	public ch8_e() {//������
		super("300 * 300 ���� ������ �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new FlowLayout());
		contentPane.setBackground(Color.ORANGE);	
		
		contentPane.add(new JButton("OK")); //���� �߰��Ҷ� .add
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ch8_e();

	}

}
