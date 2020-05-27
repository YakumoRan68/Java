import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class ch10_p3 extends JFrame {
	private JRadioButton[] JRButtons = new JRadioButton[2];
	private ButtonGroup g = new ButtonGroup();
	private static int cnt = 0;
	
	private void AddRadioButton( String name) {
		JRadioButton Btn = new JRadioButton(name);
		Btn.addItemListener(new CustomItemListener());
		JRButtons[cnt++] = Btn;
		g.add(Btn);
		getContentPane().add(Btn);
	}
	
	class CustomItemListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			Container CP = getContentPane();
			CP.setBackground(e.getItem() == JRButtons[0] ? Color.red : Color.blue);
		}
	}
	
	public ch10_p3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container CP = getContentPane();
		CP.setLayout(new FlowLayout());

		AddRadioButton("Red");
		AddRadioButton("Blue");
		
		setSize(200, 200);
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new ch10_p3();
	}
}
