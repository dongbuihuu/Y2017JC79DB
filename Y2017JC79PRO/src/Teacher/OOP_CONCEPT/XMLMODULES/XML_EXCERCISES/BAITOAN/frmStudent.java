package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.XMLMODULES.XML_EXCERCISES.BAITOAN;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class frmStudent extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaSV;
	private JTextField txtHovaTen;
	private JTextField txtEmail;
	private JTextField txtDiemSo;
	private List<Student> mlisStudent;
	private JLabel lblInformation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmStudent frame = new frmStudent();
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
	public frmStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 494, 289);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("- Mời các chuyên gia nhập đầy đủ thông tin:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 11, 370, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("- Mã SV :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 47, 76, 25);
		contentPane.add(lblNewLabel_1);

		txtMaSV = new JTextField();
		txtMaSV.setBounds(96, 44, 370, 28);
		contentPane.add(txtMaSV);
		txtMaSV.setColumns(10);

		JLabel lblHV = new JLabel("- Họ và Tên :");
		lblHV.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHV.setBounds(10, 89, 76, 25);
		contentPane.add(lblHV);

		txtHovaTen = new JTextField();
		txtHovaTen.setColumns(10);
		txtHovaTen.setBounds(96, 86, 370, 28);
		contentPane.add(txtHovaTen);

		JLabel lblEmail = new JLabel("- Email : ");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmail.setBounds(10, 128, 76, 25);
		contentPane.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(96, 125, 370, 28);
		contentPane.add(txtEmail);

		JLabel lblimS = new JLabel("- Điểm Số :");
		lblimS.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblimS.setBounds(10, 167, 76, 25);
		contentPane.add(lblimS);

		txtDiemSo = new JTextField();
		txtDiemSo.setColumns(10);
		txtDiemSo.setBounds(96, 164, 176, 28);
		contentPane.add(txtDiemSo);

		JButton btnHienThiDanhSach = new JButton(" Hiển thị DSSV");
		btnHienThiDanhSach.setIcon(new ImageIcon(frmStudent.class
				.getResource("/JAVACORE_TRAINING/TEACHER/OOP_CONCEPT/XMLMODULES/XML_EXCERCISES/BAITOAN/img_04.png")));
		btnHienThiDanhSach.setBounds(328, 203, 140, 28);
		contentPane.add(btnHienThiDanhSach);

		JButton btnThemDs = new JButton("Thêm vào danh sách");
		btnThemDs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 1. Lấy các thông tin trên giao diện --> object --> List
				if (txtMaSV.getText().isEmpty()) {
					JOptionPane.showMessageDialog(getParent(), "Nhập vào đi thôi :D");
				} else if (txtHovaTen.getText().isEmpty()) {
					JOptionPane.showMessageDialog(getParent(), 
							"Nhập vào đi thôi :D");
				} else if (txtEmail.getText().isEmpty()) {
					JOptionPane.showMessageDialog(getParent(), 
							"Nhập vào đi thôi :D");
				} else if (txtDiemSo.getText().isEmpty()) {
					JOptionPane.showMessageDialog(getParent(), 
							"Nhập vào đi thôi :D");
				}else{
					//2. Lấy các thông tin gắn vào đối tượng Student
					Student objStudent = new Student();
					objStudent.setsRollNo(txtMaSV.getText());
					objStudent.setsFullName(txtHovaTen.getText());
					objStudent.setsEmail(txtEmail.getText());
					objStudent.setdMark(Double.
									parseDouble(txtDiemSo.getText()));
					
					//3. Đưa sv vào danh sách
					mlisStudent.add(objStudent);
					lblInformation.setText(String.
							format("- Hiện có %s Sinh viên trong danh sách :D", 
											mlisStudent.size()));
				}
			}
		});
		btnThemDs.setIcon(new ImageIcon(frmStudent.class
				.getResource("/JAVACORE_TRAINING/TEACHER/OOP_CONCEPT/XMLMODULES/XML_EXCERCISES/BAITOAN/img_01.png")));
		btnThemDs.setBounds(126, 203, 199, 28);
		contentPane.add(btnThemDs);
		
		lblInformation = new JLabel("");
		lblInformation.setEnabled(false);
		lblInformation.setBounds(0, 247, 325, 14);
		contentPane.add(lblInformation);

		// Khởi tạo List Student
		mlisStudent = new ArrayList<>();
	}
}
