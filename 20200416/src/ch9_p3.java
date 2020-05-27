import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class ch9_p3 extends JFrame {
	
	public ch9_p3() {
		setTitle("ch9_p3");
		Container CP = getContentPane();
		CP.setBackground(Color.GREEN);
		CP.addMouseListener(new CustomMouseLitener());
		CP.addMouseMotionListener(new CustomMouseLitener());
		
		setSize(300, 200);
		setVisible(true);
	}
	
	class CustomMouseLitener extends MouseAdapter {
		public void mouseReleased(MouseEvent e) {getContentPane().setBackground(Color.GREEN);}
		public void mouseDragged(MouseEvent e) {getContentPane().setBackground(Color.YELLOW);}
	}
	
	public static void main(String[] args) {
		new ch9_p3();
	}
}
