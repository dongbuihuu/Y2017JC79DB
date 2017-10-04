package JAVACORE_TRAINING.ADVANCED_TOPICS.SOCKET_PROGRAMMING.MODULES02;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientApps {
	private BufferedReader m_objBr;
    private PrintWriter m_objPw;
    private JFrame frm = new JFrame("Ứng dụng phía Client");
    private JTextField txtData = new JTextField(40);
    private JTextArea txtMessage = new JTextArea(8, 60);
    
    public ClientApps() {
    	 //Khi khởi tạo ra 1 đối tượng frame thì trên đó luôn có 1 component là
    	//ContentPane đã được thiết lập chế độ layout là "BorderLayout"
        txtMessage.setEditable(false); //ko cho chỉnh sửa
        frm.getContentPane().add(txtData, "North");
        frm.getContentPane().add(
        				new JScrollPane(txtMessage), "Center");

        //1. Đăng ký thực thi sự kiện
        txtData.addActionListener(new ActionListener() {          
            public void actionPerformed(ActionEvent e) {
            	m_objPw.println(txtData.getText());
                   String sData;
                try {
                	sData = m_objBr.readLine();
                    if (sData == null || sData.equals("")) {
                          System.exit(0);
                      }
                } catch (IOException ex) {
                	sData = "Error: " + ex;
                }
                txtMessage.append(sData + "\n");
                txtData.selectAll();
            }
        });	
	}
    
    public void connectToServer() throws IOException {
        //1. Khai báo địa chỉ IP Server
        String sServerAddress = "192.168.0.160";

        //2. Khởi tạo kết nối và khởi tạo streams
        Socket objSocket = new Socket(sServerAddress, 9999);
        m_objBr = new BufferedReader(
                new InputStreamReader(
                			objSocket.getInputStream()));
        m_objPw = new PrintWriter(
        					objSocket.getOutputStream(), true);
        
        txtMessage.append(m_objBr.readLine() + "\n");        
    }
    
    public static void main(String[] args) throws Exception {
        //1. Khởi tạo sự thể hiện cho frame
    	ClientApps objClient = new ClientApps();
        objClient.frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        objClient.frm.pack();
        objClient.frm.setVisible(true);
        //2. Thực thi kết nối tới Socket Server 
        objClient.connectToServer();
    }    
}
