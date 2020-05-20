package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Button2 extends JFrame {
	private JButton b1=new JButton("Button1");
	private JButton b2=new JButton("Button2");
	private JTextField txt=new JTextField(10);
	
class ButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		String name=((JButton)e.getSource()).getText();
		txt.setText(name);
	}
}
	private ButtonListener bl=new ButtonListener();
	public Button2() {
		b1.addActionListener(bl);
		b2.addActionListener(bl);
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(txt);
	}
	public static void main(String[] args) {
		Button2 button2=new Button2();
		button2.setSize(200,150);
		button2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button2.setVisible(true);
	}
}