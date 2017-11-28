package first_programming_truongnm.swing_series;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class FileChooser extends JFrame implements ActionListener {
	private JMenuBar jmb;
	private JMenu jmFile, jmEdit;
	private JMenuItem jmiNew, jmiOpen, jmiSave, jmiExit;

	public FileChooser() {
		this.setTitle("Notepad");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		this.setLayout(null);

		jmb = new JMenuBar();
		this.setJMenuBar(jmb);

		jmFile = new JMenu("File");
		jmEdit = new JMenu("Edit");

		jmb.add(jmFile);
		jmb.add(jmEdit);

		jmiNew = new JMenuItem("New");
		jmiOpen = new JMenuItem("Open");
		jmiSave = new JMenuItem("Save");
		jmiExit = new JMenuItem("Exit");

		jmiNew.addActionListener(this);
		jmiOpen.addActionListener(this);
		jmiSave.addActionListener(this);
		jmiExit.addActionListener(this);

		jmFile.add(jmiNew);
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.addSeparator();
		jmFile.add(jmiExit);

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jmiNew) {
			JOptionPane.showMessageDialog(null, "New is updating");
		}
		if (e.getSource() == jmiOpen) {
			JOptionPane.showMessageDialog(null, "Open is updating");
		}
		if (e.getSource() == jmiSave) {
			JOptionPane.showMessageDialog(null, "Save is updating");
		}
		if (e.getSource() == jmiExit) {
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		new FileChooser();
	}

}
