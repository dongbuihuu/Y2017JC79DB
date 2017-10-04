package JAVACORE_TRAINING.ADVANCED_TOPICs.SWING_APPs.SAMPLES;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class frmComboBox extends JFrame {

	private JPanel contentPane;
	private JTextField txtRollNo;
	private JTextField txtFullName;
	private JTextField txtMark;
	private JComboBox cboStudent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmComboBox frame = new frmComboBox();
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
	public frmComboBox() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 267);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cboStudent = new JComboBox();
		cboStudent.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				StudentEntity objStudent = (StudentEntity) cboStudent.
																		   getItemAt(cboStudent.getSelectedIndex());
				txtRollNo.setText(""+objStudent.getiRollNo());
				txtFullName.setText(objStudent.getsFullName());
				txtMark.setText(""+objStudent.getdMark());
			}
		});
		cboStudent.setBounds(10, 23, 414, 34);
		contentPane.add(cboStudent);
		
		txtRollNo = new JTextField();
		txtRollNo.setEditable(false);
		txtRollNo.setBounds(10, 80, 414, 34);
		contentPane.add(txtRollNo);
		txtRollNo.setColumns(10);
		
		txtFullName = new JTextField();
		txtFullName.setForeground(new Color(255, 255, 240));
		txtFullName.setBackground(new Color(30, 144, 255));
		txtFullName.setColumns(10);
		txtFullName.setBounds(10, 125, 414, 34);
		contentPane.add(txtFullName);
		
		txtMark = new JTextField();
		txtMark.setForeground(new Color(255, 255, 240));
		txtMark.setBackground(new Color(255, 140, 0));
		txtMark.setColumns(10);
		txtMark.setBounds(10, 170, 414, 34);
		contentPane.add(txtMark);
		
		LoadDataStudentIntoComboBox();		
	}
	
	void LoadDataStudentIntoComboBox(){
		//1.
		StudentEntity objS01 = new StudentEntity();
		objS01.setiRollNo(100);
		objS01.setsFullName("Nguyễn Văn A");
		objS01.setdMark(8.5);
		
		StudentEntity objS02 = new StudentEntity();
		objS02.setiRollNo(200);
		objS02.setsFullName("Nguyễn Văn B");
		objS02.setdMark(7.5);
		
		StudentEntity objS03 = new StudentEntity();
		objS03.setiRollNo(300);
		objS03.setsFullName("Nguyễn Văn C");
		objS03.setdMark(9.5);
		
		StudentEntity objS04 = new StudentEntity();
		objS04.setiRollNo(400);
		objS04.setsFullName("Nguyễn Văn D");
		objS04.setdMark(7.5);
		
		//2.
		cboStudent.addItem(objS01);
		cboStudent.addItem(objS02);
		cboStudent.addItem(objS03);
		cboStudent.addItem(objS04);		
	}
}
