package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMOJDBC.MOD_HOANCHINH;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CONNECTIONMAN.IMICSQLServerManager;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;

public class frmViews extends JFrame {

	private JPanel contentPane;
	private JTable jtbLoadData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmViews frame = new frmViews();
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
	public frmViews() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLoadData = new JButton("ANH CHO EM XIN DỮ LIỆU :D");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 1. Khai báo và khởi tạo đối tượng
				Connection objConnection = null;
				IMICSQLServerManager obj = new IMICSQLServerManager();

				// 4. Sử dụng thuộc tính getConnection để nhận về 1 đối tượng
				// chứa đầy đủ thông tin kết nối.
				try {
					objConnection = obj.OpenConnection("192.168.0.220", "y2016jc36", "nothing", "TICKETBOX_DB", 1433);

					// 5. Kiểm tra trạng thái kết nối(Thành công/Thất bại)?
					if (!objConnection.isClosed()) {
						
						//6. Khai báo và khởi tạo Controllers
						Controllers objController = new Controllers(objConnection);
						
						//7. Ủy quyền thực thi nghiệp vụ
						jtbLoadData.setModel(objController.BindingOf());
					}
				}catch(Exception ex){
					
				}
			}
		});
		btnLoadData.setBounds(10, 0, 179, 23);
		contentPane.add(btnLoadData);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 34, 414, 217);
		contentPane.add(scrollPane);
		
		jtbLoadData = new JTable();
		scrollPane.setViewportView(jtbLoadData);
	}
}
