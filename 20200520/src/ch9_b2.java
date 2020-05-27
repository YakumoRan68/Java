import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ch9_b2 extends JFrame {
	private JTextField formula = new JTextField(10);
	private JTextField result = new JTextField(10);
	private String[] text = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "CE", "계산", "+", "-", "*", "/"};
	
	private void AddButton(String Name) {
		JButton btn = new JButton(Name);
		btn.addActionListener(new CustomListener());
		add(btn);
	}
	
	class CustomListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String btn_id = ((JButton)e.getSource()).getText();
			switch(btn_id) {
			case"0":case"1":case"2":case"3":case"4":case"5":case"6":case"7":case"8":case"9":case"+":case"-":case"*":case"/":
				formula.setText(formula.getText() + btn_id); break;
			case "CE" : formula.setText(""); break;
			case "계산" :
				String input = formula.getText();
				char[] operators = {'*', '+', '-', '/'};
				int opindex = -1;
				char operator = 0;
				for(char i : operators ) {
					int index = input.indexOf(i);
					if(index > -1) {
						opindex = index;
						operator = i;
						break;
					}
				}
				
				int op1 = Integer.parseInt(input.substring(0, opindex));
				int op2 = Integer.parseInt(input.substring(opindex + 1)); 
				double opresult = 0.0;
				
				switch(operator) {
				case '+' : opresult = op1 + op2; break;
				case '-' : opresult = op1 - op2; break;
				case '*' : opresult = op1 * op2; break;
				case '/' : opresult = (double)op1 / (double)op2; break;
				}
				
				System.out.println(opresult);
				result.setText(Double.toString(opresult));
				break;
			}
		}
	}
	
	public ch9_b2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container CP = getContentPane();
		CP.setLayout(new GridLayout(5,4));
		
		add(new JLabel("수식"));
		add(formula);
		add(new JLabel("결과"));
		add(result);
	
		for(String str: text) AddButton(str);
			
		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ch9_b2();
	}
}
