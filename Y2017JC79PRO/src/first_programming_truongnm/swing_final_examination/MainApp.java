package first_programming_truongnm.swing_final_examination;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class MainApp {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new JTableProgramming();

			}
		});
	}

}
