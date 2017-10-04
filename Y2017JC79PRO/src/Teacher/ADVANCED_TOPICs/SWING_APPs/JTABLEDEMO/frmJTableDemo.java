package JAVACORE_TRAINING.ADVANCED_TOPICs.SWING_APPs.JTABLEDEMO;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class frmJTableDemo extends JFrame {

	private JPanel contentPane;
	private JTable jtbLoadData;
	private JScrollPane scrollPane;
	private JButton btnLyThngTin;
	private DefaultTableModel m_objDTM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmJTableDemo frame = new frmJTableDemo();
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
	public frmJTableDemo() {
		m_objDTM = new DefaultTableModel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLoadData = new JButton("Nạp dữ liệu lên JTable");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 //1. Lấy dữ liệu nguồn:
				 //a. Resultset - chứa dữ liệu lấy về từ CSDL SQL Server
				 //b. List Object
				 List<StudentObject> lisStudent = new ArrayList<>();
				 StudentObject sv01 = new StudentObject();
				 sv01.setiRollNo(100);
				 sv01.setsFullName("Nguyễn Văn A");
				 sv01.setdMark(8.5);
				 
				 StudentObject sv02 = new StudentObject();
				 sv02.setiRollNo(200);
				 sv02.setsFullName("Trần Thị B");
				 sv02.setdMark(9.5);
				 
				 StudentObject sv03 = new StudentObject();
				 sv03.setiRollNo(300);
				 sv03.setsFullName("Hoàng Văn C");
				 sv03.setdMark(9.5);
				 
				 lisStudent.add(sv01);
				 lisStudent.add(sv02);
				 lisStudent.add(sv03);			
				 
				 List<TeacherEntity> lisTech = new ArrayList<>();
				 TeacherEntity objT01 = new TeacherEntity();
				 objT01.setTechId(100);
				 objT01.setsFullName("ABC");
				 
				 TeacherEntity objT02 = new TeacherEntity();
				 objT02.setTechId(200);
				 objT02.setsFullName("ABCD");
				 lisTech.add(objT01);
				 lisTech.add(objT02);
				 
				 //2. Khai báo và khởi tạo Controllers
				 Controllers<TeacherEntity, DefaultTableModel> objController = new Controllers<>();
				 
				 //3. Ủy quyền thực thi 1 nghiệp vụ chuyển từ List Object --> DefaultTableModel
				 if(jtbLoadData == null)
					 jtbLoadData = new JTable();
				 try {
					 m_objDTM = objController.ExecuteOf(lisTech);
					jtbLoadData.setModel(m_objDTM);
				} catch (Exception e) {
					e.printStackTrace();
				}				
			}
		});
		btnLoadData.setBounds(0, 0, 152, 23);
		contentPane.add(btnLoadData);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 24, 434, 238);
		contentPane.add(scrollPane);
		
		jtbLoadData = new JTable();
		scrollPane.setViewportView(jtbLoadData);
		
		btnLyThngTin = new JButton(" Lấy thông tin 1 sinh viên");
		btnLyThngTin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//1. Kiểm tra để chắc chắn người dùng đã chọn 1 bản ghi cần lấy thông tin?
				if(jtbLoadData.getSelectedRow() < 0){
					JOptionPane.showMessageDialog(getParent(), 
							 "Chú cần phải chọn cho anh 1 bản ghi nào đó :D");
				}
				else{
					//2. Lấy thông tin của bản ghi nào đó --> Bindding vào đối tượng mà chúng ta có?
					StudentObject objStudent = new StudentObject();					
					objStudent.setiRollNo(Integer.parseInt(String.valueOf(m_objDTM.
												getValueAt(jtbLoadData.getSelectedRow(), 0))));
					objStudent.setsFullName(String.valueOf(m_objDTM.
												getValueAt(jtbLoadData.getSelectedRow(), 1)));
					objStudent.setdMark(Double.parseDouble(String.valueOf(m_objDTM.
												getValueAt(jtbLoadData.getSelectedRow(), 2))));
					
					 //3. Khai báo và khởi tạo 1 đối tượng của form khác --> gửi cho nó đối tượng đã chứa
			         //đầy đủ thông tin
					 frmCapNhat frm = new frmCapNhat(objStudent);
					//4. Hiển thị dữ liệu trong đối tượng này ra ngoài màn hình
					 frm.setVisible(true);					
				}							
			}
		});
		btnLyThngTin.setBounds(154, 0, 162, 23);
		contentPane.add(btnLyThngTin);
	}
}
