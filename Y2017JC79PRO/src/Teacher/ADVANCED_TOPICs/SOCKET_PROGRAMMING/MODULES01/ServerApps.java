package JAVACORE_TRAINING.ADVANCED_TOPICS.SOCKET_PROGRAMMING.MODULES01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerApps {

	 /**
     * 1 TCP Server sẽ chạy trên cổng 9090. 
     * Khi có 1 Client kết nối đến, nó sẽ gửi về Client thông tin về thời
     * gian hiện thời(date and time). Sau đó đóng kết nối với client.
     */
	public static void main(String[] args) throws IOException {
		//1. Khai báo và khởi tạo Socket Server<lắng nghe cổng 9001>
		ServerSocket objSServer = new ServerSocket(9999);
        try {    
        	System.out.println("Server is running......");
        	
        	//2. Cho Socket Server chạy mãi mãi
            while (true) {           	            	
            	//3. Khai báo ra 1 đối tượng Socket để nhận thông tin của Socket Client
                Socket objSocket = objSServer.accept();
                try {
                	System.out.println(String.format("- Port client: %s", 
                						objSocket.getPort())); 
                	System.out.println(String.format("- HostAddress: %s", 
    						objSocket.getInetAddress().getHostAddress())); 
                	System.out.println(String.format("- HotName: %s", 
    						objSocket.getInetAddress().getHostName())); 
                	System.out.println();
                	
                	//4. Khai báo 1 đối tượng của PrintWriter
                    PrintWriter objPW =
                    		new PrintWriter(objSocket.getOutputStream(), true);
                    		objPW.println(String.format("[%s]: Đồng ý kết nối cho Client !!!", 
                    				new Date().toLocaleString()));
                } finally {
                	//5. Giải phóng socket client
                	objSocket.close();
                }
            }
        }finally {
        	//5. Giải phóng socket server
        	//objSServer.close();
        }
	}
}
