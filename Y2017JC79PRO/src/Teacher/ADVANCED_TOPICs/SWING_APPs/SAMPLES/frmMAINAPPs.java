package JAVACORE_TRAINING.ADVANCED_TOPICs.SWING_APPs.SAMPLES;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import javafx.scene.input.KeyCode;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class frmMAINAPPs extends JFrame {

	private JPanel contentPane;
	private JTextField txtTenDangNhap;
	private JTextField txtMatKhau;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMAINAPPs frame = new frmMAINAPPs();
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
	public frmMAINAPPs() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 631, 237);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "\u0110\u0102NG NH\u1EACP", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("- Vui lòng nhập đầy đủ thông tin :");
		lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 26, 527, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("- Tên đăng nhập :");
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 73, 111, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblMtKhu = new JLabel("- Mật khẩu : ");
		lblMtKhu.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblMtKhu.setBounds(10, 112, 111, 14);
		contentPane.add(lblMtKhu);
		
		txtTenDangNhap = new JTextField();
		txtTenDangNhap.setForeground(SystemColor.text);
		txtTenDangNhap.setBackground(SystemColor.textHighlight);
		txtTenDangNhap.setFont(new Font("Cambria", Font.PLAIN, 14));
		txtTenDangNhap.setBounds(121, 68, 483, 24);
		contentPane.add(txtTenDangNhap);
		txtTenDangNhap.setColumns(10);
		
		txtMatKhau = new JTextField();
		txtMatKhau.setForeground(Color.WHITE);
		txtMatKhau.setFont(new Font("Cambria", Font.PLAIN, 14));
		txtMatKhau.setColumns(10);
		txtMatKhau.setBackground(new Color(255, 140, 0));
		txtMatKhau.setBounds(121, 107, 483, 24);
		contentPane.add(txtMatKhau);
		
		JButton btnThoat = new JButton(" THOÁT");
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  int iOpt = JOptionPane.showConfirmDialog(getParent(), "Bạn có chắc chắn muốn thoát?", 
						  		"Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				  if(iOpt == 0)
					  dispose();
			}
		});
		btnThoat.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnThoat.setBounds(494, 156, 111, 31);
		contentPane.add(btnThoat);
		
		JButton btnDangNhap = new JButton("ĐĂNG NHẬP");
		btnDangNhap.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode() == KeyEvent.VK_ENTER)
					JOptionPane.showMessageDialog(getParent(), "Okie");
			}
		});
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //1. Kiểm tra trạng thái các điều khiển trên JFrame
				if(txtTenDangNhap.getText().isEmpty())
					JOptionPane.showMessageDialog(getParent(), "Nhập vào đi em ơi");
				else if(txtMatKhau.getText().isEmpty())
					JOptionPane.showMessageDialog(getParent(), "Nhập vào đi em ơi");
				else{
					//2. Khởi tạo thông tin cho đối tượng AccountEntity
					AccountEntity objEntity = new AccountEntity();
					objEntity.setsUserName(txtTenDangNhap.getText());
					objEntity.setsPassWord(txtMatKhau.getText());
					
					//3. Tạo ra đối tượng của Controller
					AccountController objController = new AccountController();
					
					//4. Ủy quyền thực thi nghiệp vụ
					boolean isResult = objController.CheckAccount(objEntity);
					if(isResult)
						JOptionPane.showMessageDialog(getParent(), "Okie :D");
					else 
						JOptionPane.showMessageDialog(getParent(), "Ko Okie :D");
				}					
			}
		});
		btnDangNhap.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnDangNhap.setBounds(373, 156, 111, 31);
		contentPane.add(btnDangNhap);
	}
}
