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
		eng.add(new JLabel("영어"));
		eng.add(eng_input);
		add(eng);
		
		JPanel kor = new JPanel();
		eng.add(new JLabel("한글"));
		eng.add(kor_input);
		add(kor);
		
		AddButton("저장");
		AddButton("찾기");
		AddButton("삭제");
		AddButton("모두보기");

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
			
			if(btn_id.equals("저장")) {
				if( dict.get(eng) != null ) {
					str = "변경";
				} else {
					str = "삽입";
					count.setText(String.valueOf(++cnt));
				}
				
				history_model.addElement(str + " (" + eng + ", " + kor + ")");
				dict.put(eng, kor);
			} else if(btn_id.equals("찾기")){
				if( dict.get(eng) != null ) {
					str = eng + "의 뜻은 " + dict.get(eng) + "입니다." ;
				} else {
					str = eng + "에 해당하는 단어가 없습니다." ;
				}
				
				history_model.addElement(str);
			} else if(btn_id.equals("삭제")){
				if( dict.get(eng) != null ) {
					str = "삭제 (" + eng + ")";
					count.setText(String.valueOf(--cnt));
					dict.remove(eng);
				} else {
					str = "해당 단어가 없습니다.";
				}
				
				history_model.addElement(str);
			} else {
				history_model.clear();
				
				Set<String> keys = dict.keySet();
				Iterator<String> it = keys.iterator();
				while(it.hasNext()) {
					String key = (String) it.next();
					history_model.addElement("단어 (" + key + ", " + dict.get(key) + ")");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new ch10_p10();
	}
}
