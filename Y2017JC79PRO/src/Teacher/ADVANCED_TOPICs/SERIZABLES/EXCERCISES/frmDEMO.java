package JAVACORE_TRAINING.ADVANCED_TOPICs.SERIZABLES.EXCERCISES;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class frmDEMO extends JFrame {

	private JPanel contentPane;
	private JTable jtbLoadData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmDEMO frame = new frmDEMO();
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
	public frmDEMO() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<Student> lisStudent = new ArrayList<Student>();
				Student sv01 = new Student();
				sv01.setiRollNo(100);
				sv01.setsFullName("Nguyễn Văn A");
				sv01.setdMark(8.5);
				
				Student sv02 = new Student();
				sv02.setiRollNo(200);
				sv02.setsFullName("Trần Thị B");
				sv02.setdMark(9.5);
				
				lisStudent.add(sv01);
				lisStudent.add(sv02);
				
				try {
					jtbLoadData.setModel(new MODELS<Student>()
										.getDataModels(lisStudent));
				} catch (Exception e) {
					e.printStackTrace();
				}				
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		jtbLoadData = new JTable();
		jtbLoadData.setBounds(10, 33, 414, 218);
		contentPane.add(jtbLoadData);
	}
}
