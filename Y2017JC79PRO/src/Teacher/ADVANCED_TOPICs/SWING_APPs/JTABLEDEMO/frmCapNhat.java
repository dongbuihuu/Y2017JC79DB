package JAVACORE_TRAINING.ADVANCED_TOPICs.SWING_APPs.JTABLEDEMO;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class frmCapNhat extends JFrame {

	private JPanel contentPane;
	private static StudentObject m_objStudent;
	private JTextField txtRollNo;
	private JTextField txtFullName;
	private JTextField txtMark;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCapNhat frame = new frmCapNhat(m_objStudent);
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
	public frmCapNhat(StudentObject objStudent) {
		m_objStudent = objStudent;
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 208);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtRollNo = new JTextField();
		txtRollNo.setBounds(56, 33, 329, 31);
		contentPane.add(txtRollNo);
		txtRollNo.setColumns(10);
		
		txtFullName = new JTextField();
		txtFullName.setColumns(10);
		txtFullName.setBounds(56, 75, 329, 31);
		contentPane.add(txtFullName);
		
		txtMark = new JTextField();
		txtMark.setColumns(10);
		txtMark.setBounds(56, 117, 329, 31);
		contentPane.add(txtMark);
		
		if(m_objStudent != null){
			txtRollNo.setText(""+m_objStudent.getiRollNo());
			txtFullName.setText(m_objStudent.getsFullName());
			txtMark.setText(""+m_objStudent.getdMark());
		}
	}
}
