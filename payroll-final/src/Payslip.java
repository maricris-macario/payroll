import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
//import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Window.Type;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Font;

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
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
  		setTitle("Payslip");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 551, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(24, 47, 46, 14);
		contentPane.add(lblNewLabel);

		txtDfgdfg = new JTextField();
		txtDfgdfg.setEditable(false);
		txtDfgdfg.setBounds(92, 44, 153, 20);
		contentPane.add(txtDfgdfg);
		txtDfgdfg.setColumns(10);

		JLabel lblIdNumber = new JLabel("ID Number");
		lblIdNumber.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblIdNumber.setBounds(288, 47, 64, 14);
		contentPane.add(lblIdNumber);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(356, 44, 153, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(92, 94, 153, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblEarnings = new JLabel("Earnings");
		lblEarnings.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEarnings.setBounds(127, 162, 74, 14);
		contentPane.add(lblEarnings);

		JLabel lblDeductions = new JLabel("Deductions");
		lblDeductions.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDeductions.setBounds(304, 162, 80, 14);
		contentPane.add(lblDeductions);

		JLabel lblPostion = new JLabel("Position");
		lblPostion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPostion.setBounds(289, 72, 63, 14);
		contentPane.add(lblPostion);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(356, 69, 127, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblCompany = new JLabel("Company");
		lblCompany.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCompany.setBounds(24, 72, 64, 14);
		contentPane.add(lblCompany);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(92, 69, 153, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblPayPeriod = new JLabel("Pay Period");
		lblPayPeriod.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPayPeriod.setBounds(24, 97, 64, 14);
		contentPane.add(lblPayPeriod);

		JLabel lblRate = new JLabel("Regular Work Rate");
		lblRate.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblRate.setBounds(24, 122, 125, 14);
		contentPane.add(lblRate);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(139, 119, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblHoursWorked = new JLabel("Hours Worked");
		lblHoursWorked.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblHoursWorked.setBounds(312, 122, 100, 14);
		contentPane.add(lblHoursWorked);

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(407, 119, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblGrossPay = new JLabel("Gross Pay");
		lblGrossPay.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblGrossPay.setBounds(176, 306, 64, 14);
		contentPane.add(lblGrossPay);

		JLabel lblNetPay = new JLabel("Net Pay");
		lblNetPay.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNetPay.setBounds(176, 325, 64, 14);
		contentPane.add(lblNetPay);

		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(235, 299, 101, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(235, 322, 101, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(55, 187, 368, 93);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Salary", "", "Tardiness", null},
				{"Overtime Pay", null, "Abscences", null},
				{"Holiday Pay", null, "Undertime Pay", null},
				{null, null, "Tax", null},
			},
			new String[] {
				"", "Amount", "", "Amount"
			}
		));

		JLabel lblPayslip = new JLabel("Payslip");
		lblPayslip.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPayslip.setBounds(237, 11, 115, 22);
		contentPane.add(lblPayslip);
		table.getColumnModel().getColumn(0).setMaxWidth(100);
		table.getColumnModel().getColumn(1).setMaxWidth(100);
		table.getColumnModel().getColumn(2).setMaxWidth(100);
		table.getColumnModel().getColumn(3).setMaxWidth(100);
	}
}
