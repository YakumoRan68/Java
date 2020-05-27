import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ch10_p10 extends JFrame {
	private HashMap<String, String> dict = new HashMap<String, String>();
	private static int cnt = 0;
	JLabel count = new JLabel(String.valueOf(cnt));
	private JTextField eng_input = new JTextField(10);
	private JTextField kor_input = new JTextField(10);
	private DefaultListModel<String> history_model = new DefaultListModel<>();
	private JList<String> history = new JList<String>(history_model);
	
	private void AddButton(String Name) {
		JButton btn = new JButton(Name);
		btn.addActionListener(new CustomListener());
		add(btn);
	}
	
	public ch10_p10() {
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
		
		AddButton("����");
		AddButton("ã��");
		AddButton("����");
		AddButton("��κ���");

		add(count);
		
		history.setPreferredSize(new Dimension(300, 180));
		add(history);
		
		setSize(400, 300);
		setVisible(true);
	}
	
	class CustomListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String btn_id = ((JButton)e.getSource()).getText();
			String eng = eng_input.getText();
			String kor = kor_input.getText();
			String str = "";
			
			if(btn_id.equals("����")) {
				if( dict.get(eng) != null ) {
					str = "����";
				} else {
					str = "����";
					count.setText(String.valueOf(++cnt));
				}
				
				history_model.addElement(str + " (" + eng + ", " + kor + ")");
				dict.put(eng, kor);
			} else if(btn_id.equals("ã��")){
				if( dict.get(eng) != null ) {
					str = eng + "�� ���� " + dict.get(eng) + "�Դϴ�." ;
				} else {
					str = eng + "�� �ش��ϴ� �ܾ �����ϴ�." ;
				}
				
				history_model.addElement(str);
			} else if(btn_id.equals("����")){
				if( dict.get(eng) != null ) {
					str = "���� (" + eng + ")";
					count.setText(String.valueOf(--cnt));
					dict.remove(eng);
				} else {
					str = "�ش� �ܾ �����ϴ�.";
				}
				
				history_model.addElement(str);
			} else {
				history_model.clear();
				
				Set<String> keys = dict.keySet();
				Iterator<String> it = keys.iterator();
				while(it.hasNext()) {
					String key = (String) it.next();
					history_model.addElement("�ܾ� (" + key + ", " + dict.get(key) + ")");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new ch10_p10();
	}
}
