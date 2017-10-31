package BUIHUUDONG.ExceptionHandling.Logger;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerMessage {

	public static void main(String[] args) {
		try {
			Handler handler = new FileHandler("outlog.log");
			Logger.getLogger("").addHandler(handler);

			System.out.println(10 / 0);
		} catch (Exception e) {
			Logger logger = Logger.getLogger("LoggerMessage");
			StackTraceElement elements[] = e.getStackTrace();
			for (int i = 0, n = elements.length; i < n; i++) {
				logger.log(Level.WARNING, elements[i].getMethodName());
			}

		}
	}

}
