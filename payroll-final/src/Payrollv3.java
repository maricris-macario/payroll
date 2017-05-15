import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Payrollv3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payrollv3 frame = new Payrollv3();
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
	public Payrollv3() {
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 674, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeNumber = new JLabel("Employee  Number");
		lblEmployeeNumber.setBounds(32, 41, 116, 14);
		contentPane.add(lblEmployeeNumber);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(32, 66, 64, 14);
		contentPane.add(lblName);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(32, 104, 67, 14);
		contentPane.add(lblYear);
		
		JLabel lblPayrollPeriod = new JLabel("Payroll Period");
		lblPayrollPeriod.setBounds(32, 129, 93, 14);
		contentPane.add(lblPayrollPeriod);
		
		JLabel lblAddPayslip = new JLabel("Add Payslip");
		lblAddPayslip.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAddPayslip.setBounds(267, 4, 124, 29);
		contentPane.add(lblAddPayslip);
		
		JLabel lblNewLabel = new JLabel("Earning");
		lblNewLabel.setBounds(82, 175, 76, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDeductions = new JLabel("Deductions");
		lblDeductions.setBounds(284, 175, 76, 14);
		contentPane.add(lblDeductions);
		
		JLabel lblNewLabel_1 = new JLabel("Overtime");
		lblNewLabel_1.setBounds(487, 175, 76, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblBasicPay = new JLabel("Basic Pay");
		lblBasicPay.setBounds(33, 195, 92, 14);
		contentPane.add(lblBasicPay);
		
		JLabel lblOvertimePay = new JLabel("Overtime Pay");
		lblOvertimePay.setBounds(33, 220, 86, 14);
		contentPane.add(lblOvertimePay);
		
		JLabel lblNewLabel_2 = new JLabel("Withholding Tax");
		lblNewLabel_2.setBounds(217, 195, 99, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PhilHealth");
		lblNewLabel_3.setBounds(217, 220, 64, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("SSS");
		lblNewLabel_4.setBounds(217, 242, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Pag ibig");
		lblNewLabel_5.setBounds(217, 267, 64, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblRegularOt = new JLabel("Regular OT");
		lblRegularOt.setBounds(437, 195, 86, 14);
		contentPane.add(lblRegularOt);
		
		JLabel lblRestdayOt = new JLabel("Restday OT");
		lblRestdayOt.setBounds(437, 220, 86, 14);
		contentPane.add(lblRestdayOt);
		
		JLabel lblHoliday = new JLabel("Holiday OT");
		lblHoliday.setBounds(437, 245, 76, 14);
		contentPane.add(lblHoliday);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 295, 618, 2);
		contentPane.add(separator);
		
		textField = new JTextField();
		textField.setBounds(156, 41, 124, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 63, 162, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(135, 98, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(135, 123, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTo = new JLabel("to");
		lblTo.setBounds(231, 126, 46, 14);
		contentPane.add(lblTo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(258, 123, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(109, 192, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(109, 217, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(316, 192, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(316, 214, 86, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(316, 239, 86, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(316, 264, 86, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(511, 192, 86, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(511, 217, 86, 20);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(511, 239, 86, 20);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblEarning = new JLabel("Gross Pay");
		lblEarning.setBounds(81, 308, 76, 14);
		contentPane.add(lblEarning);
		
		JLabel lblNewLabel_6 = new JLabel("Net Pay");
		lblNewLabel_6.setBounds(308, 308, 54, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Undertime Deductions");
		lblNewLabel_7.setBounds(495, 308, 133, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblEarnings = new JLabel("Earnings");
		lblEarnings.setBounds(20, 326, 67, 14);
		contentPane.add(lblEarnings);
		
		JLabel lblOvertimePay_1 = new JLabel("Overtime Pay");
		lblOvertimePay_1.setBounds(20, 353, 93, 14);
		contentPane.add(lblOvertimePay_1);
		
		JLabel lblUndertimeDeductions = new JLabel("Undertime Deductions");
		lblUndertimeDeductions.setBounds(20, 378, 138, 14);
		contentPane.add(lblUndertimeDeductions);
		
		textField_5 = new JTextField();
		textField_5.setBounds(146, 372, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(146, 347, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(146, 320, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblTotalGrossPay = new JLabel("Total Gross Pay");
		lblTotalGrossPay.setBounds(258, 326, 104, 14);
		contentPane.add(lblTotalGrossPay);
		
		JLabel lblTotalDeductions = new JLabel("Total Deductions");
		lblTotalDeductions.setBounds(258, 353, 119, 14);
		contentPane.add(lblTotalDeductions);
		
		textField_17 = new JTextField();
		textField_17.setBounds(361, 320, 86, 20);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(361, 347, 86, 20);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblTardiness = new JLabel("Tardiness");
		lblTardiness.setBounds(468, 326, 76, 14);
		contentPane.add(lblTardiness);
		
		JLabel lblNewLabel_8 = new JLabel("Abscences");
		lblNewLabel_8.setBounds(468, 353, 86, 14);
		contentPane.add(lblNewLabel_8);
		
		textField_19 = new JTextField();
		textField_19.setBounds(542, 323, 86, 20);
		contentPane.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(542, 350, 86, 20);
		contentPane.add(textField_20);
		textField_20.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 412, 618, 2);
		contentPane.add(separator_1);
		
		JLabel lblTotalGrossPay_1 = new JLabel("Total Gross Pay");
		lblTotalGrossPay_1.setBounds(82, 426, 115, 14);
		contentPane.add(lblTotalGrossPay_1);
		
		textField_21 = new JTextField();
		textField_21.setBounds(55, 451, 133, 20);
		contentPane.add(textField_21);
		textField_21.setColumns(10);
		
		JLabel lblTotalEarnings = new JLabel("Total Earnings");
		lblTotalEarnings.setBounds(266, 426, 107, 14);
		contentPane.add(lblTotalEarnings);
		
		textField_22 = new JTextField();
		textField_22.setBounds(236, 451, 124, 20);
		contentPane.add(textField_22);
		textField_22.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Total Undertime Deductions");
		lblNewLabel_9.setBounds(426, 425, 168, 14);
		contentPane.add(lblNewLabel_9);
		
		textField_23 = new JTextField();
		textField_23.setBounds(437, 451, 116, 20);
		contentPane.add(textField_23);
		textField_23.setColumns(10);
	}
}
