import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ch10_c extends JFrame {
	private static int NUMIMAGES = 4;
	private static int imgIndex = 0;
	private JLabel imgLabel = new JLabel();
	private ImageIcon[] Images = new ImageIcon[NUMIMAGES];
	private Dimension MenuButtonSize = new Dimension(70, 60);
	private Dimension ImageSize = new Dimension(400, 400);
	
	public ch10_c() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container CP = getContentPane();
		CP.setLayout(new BorderLayout());
		
		for(int i = 0; i < NUMIMAGES; i++) {
			ImageIcon image = new ImageIcon(getClass().getResource("/images/img" + Integer.toString(i) + ".jpg"));
			Images[i] = new ImageIcon(image.getImage().getScaledInstance((int)ImageSize.getWidth(), (int)ImageSize.getHeight(), java.awt.Image.SCALE_SMOOTH));
		}
		imgLabel.setIcon(Images[0]);
		imgLabel.setPreferredSize(new Dimension(300, 300));
		add(imgLabel, BorderLayout.CENTER);
		
		JPanel Menu = new JPanel();
		
		JButton Left = new JButton("¡ç");
		Left.addActionListener(new CustomListener());
		Left.setPreferredSize(MenuButtonSize);
		Menu.add(Left);
		
		JButton Right = new JButton("¡æ");
		Right.addActionListener(new CustomListener());
		Right.setPreferredSize(MenuButtonSize);
		Menu.add(Right);
		
		add(Menu, BorderLayout.SOUTH);
		
		setSize(400, 450);
		setVisible(true);
	}
	
	class CustomListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String btn_id = ((JButton)e.getSource()).getText();
			switch(btn_id) {
				case"¡ç": imgIndex = imgIndex > 0 ? --imgIndex : NUMIMAGES - 1; break;
				case"¡æ": imgIndex = imgIndex < NUMIMAGES - 1 ? ++imgIndex : 0; break;
			}
			System.out.print(imgIndex);
			imgLabel.setIcon(Images[imgIndex]);
		}
	}
	
	public static void main(String args[]) {
		new ch10_c();
	}
}
