package Teacher.Y2017JC79.socket_programming.MODULES03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChatServer {
	// Lắng nghe kết nối đến trên cổng 9001
	private static final int iPORT = 9999;
	// Khai báo danh sách tên các máy khách đã kết nối thành công
	private static List<String> lisNames = new ArrayList<String>();
	// Khai báo danh sách dữ liệu cần ghi
	private static List<PrintWriter> lisWriters = new ArrayList<PrintWriter>();

	public static void main(String[] args) throws Exception {
		System.out.println("Server is running.......");
		// 1. Khai báo và khởi tạo Socket Server<lắng nghe cổng 9001>
		ServerSocket objSServer = new ServerSocket(iPORT);
		try {
			// 2. Đặt chế độ chạy mãi mãi
			while (true) {
				// Tạo ra 1 thread dành riêng cho từng Client socket và start nó.
				new Handler(objSServer.accept()).start();
			}
		} finally {
			objSServer.close();
		}
	}

	private static class Handler extends Thread {
		private String sName; // Tên máy khách
		private Socket m_objSocket;
		private BufferedReader m_objBr; // Luồng đọc dữ liệu từ Server về
		private PrintWriter m_objPw; // Luồng ghi dữ liệu từ Server --> Client

		public Handler(Socket objSocket) {
			m_objSocket = objSocket;
			System.out.println(String.format("- Port client: %s", objSocket.getPort()));
			System.out.println(String.format("- HostAddress: %s", objSocket.getInetAddress().getHostAddress()));
			System.out.println();
		}

		public void run() {
			try {
				// 1. Khởi tạo luồng đọc dữ liệu nhận được từ Socket Client
				m_objBr = new BufferedReader(new InputStreamReader(m_objSocket.getInputStream()));
				// 2. Khởi tạo luồng ghi dữ liệu từ socket server xuống Socket
				// client
				m_objPw = new PrintWriter(m_objSocket.getOutputStream(), true);

				// 3. Đặt chế độ chạy mãi mãi
				while (true) {
					// 4. Gửi yêu cầu xuống client cần cung cấp Tên máy khách
					m_objPw.println("SUBMITNAME");

					// 5. Nhận về Tên máy khách từ Socket client
					sName = m_objBr.readLine();

					// 6. Nếu ko có dữ liệu gì --> thoát khỏi ứng dụng này.
					if (sName == null || sName.isEmpty())
						return;

					// 7. Dùng cơ chế động bộ block
					// để kiểm tra & thêm máy khách vào danh sách
					synchronized (lisNames) {
						// TH tên máy khách ko tồn tại trong danh sách
						// --> thêm mới nó vào danh sách
						if (!lisNames.contains(sName)) {
							lisNames.add(sName);
							System.out.println(String.format("- Coms Name: %s", sName));
							break;
						}
					}
				}
				// 8. Định nghĩa keyword cho phía client
				m_objPw.println("NAMEACCEPTED");
				// 9. Gửi thông báo về Socket client là
				// tên máy khách đã được chấp nhận
				lisWriters.add(m_objPw);

				// 10. Đặt chế độ chạy mãi mãi
				while (true) {
					// 11. Chờ nhận các thông điệp từ Socket Client gửi đến
					String sData = m_objBr.readLine();
					if (sData == null)
						return;
					else {
						System.out.println(
								String.format("[%s]: Nội dung Client gửi về: %s", new Date().toLocaleString(), sData));
						m_objPw.println("Anh nhận được dữ liệu của chú gửi rồi nhé :D");
					}
				}
			} catch (IOException e) {
				System.out.println(e);
			} finally {
				try {
					m_objSocket.close();
				} catch (IOException e) {
				}
			}
		}
	}
}
