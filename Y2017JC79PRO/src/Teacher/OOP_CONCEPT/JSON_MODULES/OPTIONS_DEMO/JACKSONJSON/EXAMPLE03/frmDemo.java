package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON.EXAMPLE03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmDemo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmDemo frame = new frmDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser objFile = new JFileChooser();
				objFile.setCurrentDirectory(new java.io.File("."));
				objFile.setDialogTitle("Chọn file: ");
				objFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				String[] EXTENSION = new String[] { "json" };
				FileNameExtensionFilter filter = new FileNameExtensionFilter("JSON Database files", EXTENSION);
				objFile.setFileFilter(filter);
				objFile.setMultiSelectionEnabled(false);

				int returnVal = objFile.showSaveDialog(getParent());
				String ParentPath = "";
				String FileName = "";
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					FileName = objFile.getSelectedFile().getPath();
				}
			}
		});
		btnNewButton.setBounds(22, 11, 89, 23);
		contentPane.add(btnNewButton);
	}
}
