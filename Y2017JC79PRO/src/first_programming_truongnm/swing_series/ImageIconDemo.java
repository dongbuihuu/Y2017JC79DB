
package first_programming_truongnm.swing_series;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ImageIconDemo extends JFrame {

	public ImageIconDemo() {
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(500, 500);

		JLabel jLabel = new JLabel();
		jLabel.setSize(400, 400);
		this.add(jLabel);
		ImageIcon imageIcon = new ImageIcon("E:\\Picture\\rose.jpeg", "Rose");
		jLabel.setIcon(imageIcon);

	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ImageIconDemo();

			}
		});
	}
}
