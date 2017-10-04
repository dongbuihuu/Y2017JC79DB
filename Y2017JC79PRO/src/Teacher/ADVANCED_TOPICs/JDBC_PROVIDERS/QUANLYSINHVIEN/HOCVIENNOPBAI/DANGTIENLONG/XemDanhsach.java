package src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.DANGTIENLONG;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CONNECTIONMAN.IMICSQLServerManager;

//import src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMOJDBC.MOD_HOANCHINH.Controllers;
//import src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMOJDBC.MOD_HOANCHINH.IMICSQLServerManager;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;

public class XemDanhsach extends JFrame {

	private JPanel contentPane;
	private JTable jtbLoadData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XemDanhsach frame = new XemDanhsach();
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
	public XemDanhsach() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Ma lop");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(31, 13, 132, 36);
		contentPane.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		comboBox.setForeground(Color.LIGHT_GRAY);
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setBounds(139, 13, 437, 36);
		contentPane.add(comboBox);
		
		JButton btnLoadData = new JButton("Xem");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 1. Khai báo và khởi tạo đối tượng
				Connection objConnection = null;
				IMICSQLServerManager obj = new IMICSQLServerManager();

				// 4. Sử dụng thuộc tính getConnection để nhận về 1 đối tượng
				// chứa đầy đủ thông tin kết nối.
				try {
					objConnection = obj.OpenConnection("TIENLONG\\SQLSERVER", "sa", "long16695", "QUANLYSV", 1433);

					// 5. Kiểm tra trạng thái kết nối(Thành công/Thất bại)?
					if (!objConnection.isClosed()) {
						
						//6. Khai báo và khởi tạo Controllers
						JController objController = new JController(objConnection);
						
						//7. Ủy quyền thực thi nghiệp vụ
						jtbLoadData.setModel(objController.BindingOf());
					}
				}catch(Exception ex){
					
				}
			}
		});
		btnLoadData.setBounds(610, 13, 132, 36);
		contentPane.add(btnLoadData);
		
		jtbLoadData = new JTable();
		jtbLoadData.setBounds(31, 76, 728, 302);
		contentPane.add(jtbLoadData);
	}
}
