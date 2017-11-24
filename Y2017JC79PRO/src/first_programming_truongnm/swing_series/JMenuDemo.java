package first_programming_truongnm.swing_series;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class JMenuDemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Menu");

		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setResizable(false);

		JMenuBar mnb = new JMenuBar();
		frame.setJMenuBar(mnb);

		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");

		file.setMnemonic(KeyEvent.VK_F);
		edit.setMnemonic(KeyEvent.VK_E);

		mnb.add(file);
		mnb.add(edit);

		JMenuItem minew = new JMenuItem("New");
		JMenuItem miopen = new JMenuItem("Open");
		JMenuItem misave = new JMenuItem("Save");
		JMenuItem misaveas = new JMenuItem("Save As");
		JMenuItem miexit = new JMenuItem("Exit");

		minew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		miopen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		misave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		misaveas.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
		miexit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));

		file.add(minew);
		file.add(miopen);
		file.add(misave);
		file.add(misaveas);
		file.add(miexit);

		JMenuItem micut = new JMenuItem("Cut");
		JMenuItem micopy = new JMenuItem("Copy");
		JMenuItem mipaste = new JMenuItem("Paste");
		JMenu jmFind = new JMenu("Find");
		JMenuItem miUp = new JMenuItem("Up");
		JMenuItem miDown = new JMenuItem("Down");

		jmFind.setMnemonic(KeyEvent.VK_J);

		jmFind.add(miUp);
		jmFind.add(miDown);

		edit.add(jmFind);
		edit.add(micopy);
		edit.add(micut);
		edit.add(mipaste);

		miUp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
		miDown.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
		micopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		micut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		mipaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
	}

}
