package gui;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextArea extends JFrame {
	private JButton b=new JButton("Add Data");
	private JButton c=new JButton("Clear Data");
	private JTextArea t=new JTextArea(20,40);
	private Map<String,String> m=new HashMap<String,String>();
	public TextArea() {
		m.putAll(Countries.capitals());
	}
}
