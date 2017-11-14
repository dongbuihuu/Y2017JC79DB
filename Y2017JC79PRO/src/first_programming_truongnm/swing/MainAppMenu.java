package first_programming_truongnm.swing;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class MainAppMenu {

	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new MenuDemo();

			}
		});
	}

}
