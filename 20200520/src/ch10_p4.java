import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class ch10_p4 extends JFrame {
	private JCheckBox[] JCBox = new JCheckBox[2];
	private JButton test = new JButton();
	private int cnt = 0;
	
	private void AddCheckBox(String name) {
		JCheckBox Btn = new JCheckBox(name);
		Btn.addItemListener(new CustomItemListener());
		JCBox[cnt++] = Btn;
		getContentPane().add(Btn);
	}
	
	class CustomItemListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			test.setEnabled(!JCBox[0].isSelected());
			test.setVisible(!JCBox[1].isSelected());
		}
	}
	
	public ch10_p4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container CP = getContentPane();
		CP.setLayout(new FlowLayout());

		AddCheckBox("버튼 비활성화");
		AddCheckBox("버튼 감추기");
		
		test.setSize(50, 50);
		CP.add(test);
		
		setSize(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ch10_p4();
	}
}
