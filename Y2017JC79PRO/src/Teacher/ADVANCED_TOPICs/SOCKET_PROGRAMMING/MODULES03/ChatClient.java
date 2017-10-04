package JAVACORE_TRAINING.ADVANCED_TOPICS.SOCKET_PROGRAMMING.MODULES03;
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

public class ChatClient {
	BufferedReader m_objBr;
    PrintWriter m_objPw;
    JFrame frm = new JFrame();
    JTextField txtValue = new JTextField(40);
    JTextArea txtMessage = new JTextArea(8, 40);
    
    public ChatClient() {     
        txtValue.setEditable(false);
        txtMessage.setEditable(false);
        frm.getContentPane().add(txtValue, "North");
        frm.getContentPane().add(new JScrollPane(txtMessage), "Center");
        frm.pack();
      
        txtValue.addActionListener(new ActionListener() {          
            public void actionPerformed(ActionEvent e) {
            	m_objPw.println(txtValue.getText());
                txtValue.setText("");
            }
        });
    }
    private String getServerAddress() {
        return "192.168.0.160";
    }

    /**
     * Prompt for and return the desired screen name.
     */
    private String getName() {
        return JOptionPane.showInputDialog(null,
            "Nhập vào tên:",
            "Lấy thông tin về Tên máy khách",
            JOptionPane.PLAIN_MESSAGE);
    }

    private void run() throws IOException {
        //1. Nhận về địa chỉ IP Server 
        String sServerAddress = getServerAddress();
        
        //2. Khai báo và khởi tạo Socket Server<lắng nghe cổng 9001>
        Socket objSocket = new Socket(sServerAddress, 9999);
        
        //3. Khai báo & khởi tạo luồng nhận thông điệp
        m_objBr = new BufferedReader(new InputStreamReader(
        		objSocket.getInputStream()));
        m_objPw = new PrintWriter(objSocket.getOutputStream(), true);

        //4. Đặt chế độ chạy mãi mãi
        while (true) {
        	//5. Nhận thông điệp từ Socket Server gửi đến
            String sData = m_objBr.readLine();
            
            //6. Kiểm tra xem Socket Server gửi cho mã thông điệp là gì để
            //còn có phương án xử lý cho phù hợp
            if (sData.startsWith("SUBMITNAME")) {
            	//7. Nhập tên thông qua showInputDialog()
            	String sName = getName();
            	
            	//8. Gửi thông điệp "Tên máy" đến Socket Server
            	m_objPw.println(sName);            	
            	frm.setTitle(sName);
            	
            } else if (sData.startsWith("NAMEACCEPTED")) {
                txtValue.setEditable(true);
                
            } else {
                txtMessage.append(sData + "\n");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        ChatClient client = new ChatClient();
        client.frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        client.frm.setVisible(true);
        client.run();
    }	
}
