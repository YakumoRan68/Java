import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ch10_p9 extends JFrame {
	private HashMap<String, String> dict = new HashMap<String, String>();
	private static int cnt = 0;
	JLabel count = new JLabel(String.valueOf(cnt));
	private JTextField eng_input = new JTextField(10);
	private JTextField kor_input = new JTextField(10);
	private DefaultListModel<String> history_model = new DefaultListModel<>();
	private JList<String> history = new JList<String>(history_model);
	
	public ch10_p9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container CP = getContentPane();
		CP.setLayout(new FlowLayout());

		JPanel eng = new JPanel();
		eng.add(new JLabel("����"));
		
		eng.add(eng_input);
		add(eng);
		
		JPanel kor = new JPanel();
		eng.add(new JLabel("�ѱ�"));
		
		eng.add(kor_input);
		add(kor);
		
		JButton save = new JButton("����");
		save.addActionListener(new CustomListener());
		add(save);

		JButton search = new JButton("ã��");
		search.addActionListener(new CustomListener());
		add(search);

		add(count);
		
		history.setPreferredSize(new Dimension(300, 180));
		add(history);
		
		setSize(400, 300);
		setVisible(true);
	}
	
	class CustomListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String eng = eng_input.getText();
			String kor = kor_input.getText();
			String str = "";
			
			if(((JButton)e.getSource()).getText().equals("����")) {
				if( dict.get(eng) != null ) {
					str = "����";
				} else {
					str = "����";
					count.setText(String.valueOf(++cnt));
				}
				
				history_model.addElement(str + " (" + eng + ", " + kor + ")");
				dict.put(eng, kor);
			} else {
				if( dict.get(eng) != null ) {
					str = eng + "�� ���� " + dict.get(eng) + "�Դϴ�." ;
				} else {
					str = eng + "�� �ش��ϴ� �ܾ �����ϴ�." ;
				}
				
				history_model.addElement(str);
			}
			
		}
	}
	
	public static void main(String[] args) {
		new ch10_p9();
	}
}
