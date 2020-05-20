package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button1 extends JFrame {
	private JButton b1=new JButton("Button1");
	private JButton b2=new JButton("Button2");
	public Button1() {
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
	}
	public static void main(String[] args) {
		Button1 b=new Button1();
		b.setSize(300,100);
		b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.setVisible(true);
	}
}
