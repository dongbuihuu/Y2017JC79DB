package first_programming_truongnm.swing_series;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class JPopUpMenuDemo extends JFrame {

	public JPopUpMenuDemo() {

		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextArea ta = new JTextArea();
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		this.add(ta);

		JPopupMenu popup = new JPopupMenu();
		ta.setComponentPopupMenu(popup);

		JMenuItem miCopy = new JMenuItem("Copy");
		JMenuItem miCut = new JMenuItem("Cut");
		JMenuItem miPaste = new JMenuItem("Paste");
		JMenuItem miDelete = new JMenuItem("Delete");
		JMenuItem miProperties = new JMenuItem("Properties");

		popup.add(miCopy);
		popup.add(miCut);
		popup.add(miPaste);
		popup.add(miDelete);
		popup.add(miProperties);

		this.setSize(500, 500);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new JPopUpMenuDemo();

			}
		});

	}

}
