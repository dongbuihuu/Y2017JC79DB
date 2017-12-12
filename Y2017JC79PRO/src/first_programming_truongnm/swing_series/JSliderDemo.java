package first_programming_truongnm.swing_series;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderDemo extends JFrame implements ChangeListener {
	private JSlider js;

	public JSliderDemo() {
		js = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
		js.setPaintTicks(true);
		js.setMajorTickSpacing(20);
		js.setMinorTickSpacing(10);

		js.setPaintLabels(true);

		this.add(js);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

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
				new JSliderDemo();

			}
		});

	}

	@Override
	public void stateChanged(ChangeEvent e) {

		if (js.getValueIsAdjusting()) {
			System.out.println("Value of Js is: " + js.getValue());
		}

	}

}
