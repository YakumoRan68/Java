import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class ch9_p4 extends JFrame {
	
	public ch9_p4() {
		setTitle("ch9_p4");
		Container CP = getContentPane();
		JLabel la = new JLabel("Test String");
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		CP.add(la);
		
		CP.addKeyListener(new CustomKeyListener());
		
		CP.setFocusable(true);
		CP.requestFocus();
		setSize(300, 200);
		setVisible(true);
	}
	
	class CustomKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			
			JLabel label = (JLabel)getContentPane().getComponent(0);
			Font font = label.getFont();
			int size = font.getSize();
			
			switch (e.getKeyCode()) {
			case KeyEvent.VK_EQUALS : label.setFont(new Font(font.getFamily(), font.getStyle(), size + 5)); break;
			case KeyEvent.VK_MINUS : label.setFont(new Font(font.getFamily(), font.getStyle(), size > 10 ? size - 5 : 10)); break;
			}
		}
	}
	
	public static void main(String[] args) {
		new ch9_p4();
	}
}
