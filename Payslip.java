package paycrawl;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Window.Type;

public class Payslip extends JFrame {

	private JPanel contentPane;
	private JTextField txtDfgdfg;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void slip() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payslip frame = new Payslip();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Payslip() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 583, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(15, 16, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtDfgdfg = new JTextField();
		txtDfgdfg.setEditable(false);
		txtDfgdfg.setBounds(83, 13, 153, 20);
		contentPane.add(txtDfgdfg);
		txtDfgdfg.setColumns(10);
		
		JLabel lblIdNumber = new JLabel("ID Number");
		lblIdNumber.setBounds(279, 16, 64, 14);
		contentPane.add(lblIdNumber);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(347, 13, 153, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(83, 63, 153, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEarnings = new JLabel("Earnings");
		lblEarnings.setBounds(143, 131, 64, 14);
		contentPane.add(lblEarnings);
		
		JLabel lblDeductions = new JLabel("Deductions");
		lblDeductions.setBounds(359, 131, 69, 14);
		contentPane.add(lblDeductions);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setBounds(61, 151, 46, 14);
		contentPane.add(lblSalary);
		
		JLabel lblPostion = new JLabel("Position");
		lblPostion.setBounds(280, 41, 63, 14);
		contentPane.add(lblPostion);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(347, 38, 127, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCompany = new JLabel("Company");
		lblCompany.setBounds(15, 41, 64, 14);
		contentPane.add(lblCompany);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(83, 38, 153, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblPayPeriod = new JLabel("Pay Period");
		lblPayPeriod.setBounds(15, 66, 64, 14);
		contentPane.add(lblPayPeriod);
		
		JLabel lblRate = new JLabel("Rate");
		lblRate.setBounds(15, 91, 46, 14);
		contentPane.add(lblRate);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(46, 88, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblHoursWorked = new JLabel("Hours Worked");
		lblHoursWorked.setBounds(172, 91, 100, 14);
		contentPane.add(lblHoursWorked);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(267, 88, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblOvertimePay = new JLabel("Overtime Pay");
		lblOvertimePay.setBounds(61, 167, 78, 14);
		contentPane.add(lblOvertimePay);
		
		JLabel lblHolidayPay = new JLabel("Holiday Pay");
		lblHolidayPay.setBounds(61, 181, 71, 14);
		contentPane.add(lblHolidayPay);
		
		JLabel lblTardiness = new JLabel("Tardiness");
		lblTardiness.setBounds(292, 151, 61, 14);
		contentPane.add(lblTardiness);
		
		JLabel lblAbscences = new JLabel("Abscences");
		lblAbscences.setBounds(292, 167, 76, 14);
		contentPane.add(lblAbscences);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(292, 181, 46, 14);
		contentPane.add(lblTax);
		
		JLabel lblGrossPay = new JLabel("Gross Pay");
		lblGrossPay.setBounds(208, 244, 64, 14);
		contentPane.add(lblGrossPay);
		
		JLabel lblNetPay = new JLabel("Net Pay");
		lblNetPay.setBounds(208, 263, 64, 14);
		contentPane.add(lblNetPay);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(267, 237, 101, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(267, 260, 101, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
	}
}
