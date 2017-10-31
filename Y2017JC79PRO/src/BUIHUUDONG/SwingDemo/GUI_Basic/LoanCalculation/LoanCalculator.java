package BUIHUUDONG.SwingDemo.GUI_Basic.LoanCalculation;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoanCalculator extends JFrame {
	private JTextField jtfAnnualInterestRate = new JTextField();
	private JTextField jtfNumberOfYears = new JTextField();
	private JTextField jtfLoanAmount = new JTextField();
	private JTextField jtfMonthlyPayment = new JTextField();
	private JTextField jtfTotalPayment = new JTextField();

	// 1. Tao 1 Nut
	private JButton jbtComputeLoan = new JButton("Compute Payment");

	// 2. Tao 1 ham tao
	public LoanCalculator() {
		JPanel p1 = new JPanel(new GridLayout(5, 2));

		JLabel label = new JLabel("Annual Interest Rate");
		label.setFont(new Font("Serif", Font.PLAIN, 24));
		p1.add(label);

		p1.add(jtfAnnualInterestRate);
		JLabel label_1 = new JLabel("Number of Years");

		p1.add(label_1);

		p1.add(jtfNumberOfYears);
		JLabel label_2 = new JLabel("Loan Amount");

		p1.add(label_2);

		p1.add(jtfLoanAmount);
		JLabel label_3 = new JLabel("Monthly Payment");

		p1.add(label_3);

		p1.add(jtfMonthlyPayment);
		JLabel label_4 = new JLabel("Total Payment");

		p1.add(label_4);

		p1.add(jtfTotalPayment);

		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(jbtComputeLoan);

		// 2 add panel to frame
		getContentPane().add(p1, BorderLayout.CENTER);
		getContentPane().add(p2, BorderLayout.SOUTH);
		// getContentPane().add(p1);
	}

	public static void main(String[] args) {
		LoanCalculator frame = new LoanCalculator();
		frame.pack();
		frame.setTitle("LoanCalculator");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
