
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

class NumberPanel extends JPanel {
	public NumberPanel() {
		setBackground(Color.magenta);
		JLabel label = new JLabel("0");
		label.setFont(new Font("Arial", Font.PLAIN, 30));
		label.setForeground(Color.yellow);
		label.setBorder(new EmptyBorder(0, 20, 0, 20));
		add(label);
		
		setSize(100, 50);
	}
}

public class ch9_c extends JFrame {

	public ch9_c() {
		setTitle("ch9_c");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container CP = getContentPane();
		CP.setLayout(null);

		for(int i = 0; i < 3; i++) {
			NumberPanel NP = new NumberPanel();
			NP.setSize(70, 45);
			NP.setLocation(60 + 100 * i, 50);
			CP.add(NP);
		}
		
		JLabel Status = new JLabel("시작합니다.");
		Status.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		Status.setSize(150, 30);
		Status.setLocation(140, 180);
		CP.add(Status);
		
		CP.addKeyListener(new CustomKeyListener());
		CP.setFocusable(true);
		CP.requestFocus();
		setSize(400, 300);
		setVisible(true);
	}
	
	class CustomKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				Container CP = getContentPane();
				
				Boolean flag = true;
				JLabel label = (JLabel) ((JPanel) CP.getComponent(0)).getComponent(0); //java는 형변환이 이렇게 까다롭다.
				int num = (int)(Math.random() * 5);
				label.setText(Integer.toString(num));
				
				for(int i = 1; i < 3; i++) {
					int num_later = (int)(Math.random() * 5);
					label =  (JLabel) ((JPanel) CP.getComponent(i)).getComponent(0);
					flag = flag && num == num_later;
					label.setText(Integer.toString(num_later));
				}
				
				((JLabel) CP.getComponent(3)).setText(flag ? "축하합니다!!!" : "아쉽군요");
			}
		}
	}
	
	public static void main(String[] args) {
		new ch9_c();
	}
}
