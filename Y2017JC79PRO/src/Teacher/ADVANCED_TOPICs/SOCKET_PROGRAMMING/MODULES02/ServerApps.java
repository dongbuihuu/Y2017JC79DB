package JAVACORE_TRAINING.ADVANCED_TOPICS.SOCKET_PROGRAMMING.MODULES02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import javax.swing.JOptionPane;

public class ServerApps {
	
	public static void main(String[] args) throws Exception {
		
        System.out.println("Server is running.......");
        int iClientNumber = 0;
        //1. Khai báo và khởi tạo Socket Server<lắng nghe cổng 9001>
        ServerSocket objListener = new ServerSocket(9999);
        try {
        	//2. Cho Socket Server chạy mãi mãi
            while (true) {            	
                new Processing(objListener.accept(), 
                					iClientNumber++).start();
            }
        } finally {
        	objListener.close();
        }
    }
	
	 private static class Processing extends Thread {
	        private Socket m_objSocket;
	        private int iClientNumber;

	        public Processing(Socket objSocket, int iClientNumber) {
	            this.m_objSocket = objSocket;
	            this.iClientNumber = iClientNumber;
	            log(String.format("[Client-%s] at %s", iClientNumber, objSocket));
	            System.out.println(String.format("- Port client: %s", 
						objSocket.getPort())); 
				System.out.println(String.format("- HostAddress: %s", 
						objSocket.getInetAddress().getHostAddress())); 
				System.out.println(String.format("- HotName: %s", 
						objSocket.getInetAddress().getHostName())); 
				System.out.println();
	        }
	        
	        public void run() {
	            try {	  
	            	//1. Khai báo & khởi tạo luồng nhận thông điệp
	                BufferedReader objBr = new BufferedReader(
	                        new InputStreamReader(
	                        			m_objSocket.getInputStream()));	                
	                PrintWriter objPw = new PrintWriter(
	                					m_objSocket.getOutputStream(), true);

	                //2. Gửi 1 thông điệp "welcome" đến client.
	                objPw.println(String.format("[%s]: Đồng ý kết nối với Client!!!", 
            				new Date().toLocaleString()));
	                
	                
	                //3. Nhận thông điệp phản hồi và trả lời đến client
	                //a. Cho Socket Server chạy mãi mãi
	                while (true) {
	                    String sData = objBr.readLine();
	                    if (sData == null || sData.equals(".")) {
	                        break;
	                    }
	                    objPw.println(String.format("[%s]: Em vừa gõ cái này đúng chưa? - %s", 
                				new Date().toLocaleString(), sData));
	                }
	            } catch (IOException e) {
	              
	            } finally {
	                try {
	                	//Giải phóng socket
	                    m_objSocket.close();
	                } catch (IOException e) {
	                    log("Lỗi không thể đóng Socket này được!");
	                }
	                log(String.format("[%s]: Đã đóng kết nối!!!", iClientNumber));
	            }
	        }	        
	        private void log(String message) {
	            System.out.println(message);
	        }
	    }
}
