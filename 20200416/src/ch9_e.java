import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ch9_e extends JFrame {

	public ch9_e() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		btn.addActionListener(new Listener());
		c.add(btn);
		
		setSize(250, 120);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ch9_e();
	}

}

class Listener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if (b.getText().equals("Action")) {
			b.setText("�׼�");
		} else {
			b.setText("Action");
		}
	}
}