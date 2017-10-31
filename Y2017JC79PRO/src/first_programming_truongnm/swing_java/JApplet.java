package first_programming_truongnm.swing_java;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class JApplet extends javax.swing.JApplet {

	public static void main(String[] args) {
		Container contend = getContentPane();
		contend.setBackground(Color.WHITE);
		contend.setLayout(new FlowLayout());
		contend.add(new JButton("Hello"));
		contend.add(new JButton("Hi"));
		contend.add(new JButton("Xin chao"));

	}

}
