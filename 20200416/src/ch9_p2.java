import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class ch9_p2 extends JFrame {
	public ch9_p2() {
		setTitle("ch9_p2");
		Container CP = getContentPane();
		CP.setBackground(Color.CYAN);
		
		CP.addKeyListener(new CustomKeyListener());
		CP.setFocusable(true);
		CP.requestFocus();
		setSize(300, 200);
		setVisible(true);
	}
	
	class CustomKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_R) {
				getContentPane().setBackground(Color.RED);
			}
		}
		public void keyReleased(KeyEvent e) {
			getContentPane().setBackground(Color.CYAN);
		}
	}
	
	public static void main(String[] args) {
		new ch9_p2();
	}

}
