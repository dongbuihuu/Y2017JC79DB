package Teacher.Y2017JC79.socket_programming.MODULES01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ClientApps {
	public static void main(String[] args) throws IOException {
		// 1. Khai báo & khởi tạo đối tượng Socket Client
		Socket objSClient = new Socket("10.0.101.113", 9999);

		// 2. Khai báo & khởi tạo đối tượng của Stream
		BufferedReader objIO = new BufferedReader(new InputStreamReader(objSClient.getInputStream()));
		String sData = objIO.readLine();
		JOptionPane.showMessageDialog(null, sData);
		System.exit(0);
	}
}
