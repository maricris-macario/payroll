package paycrawl;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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
	private JTextField name;
	private JTextField idnum;
	private JTextField payperiod;
	private JTextField position;
	private JTextField company;
	private JTextField regularPay;
	private JTextField hrsWorked;
	private JTextField grossPay;
	private JTextField netPay;
	private JTable payslipTable;
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 551, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblName.setBounds(24, 47, 46, 14);
		contentPane.add(lblName);
		
		name = new JTextField();
		name.setEditable(false);
		name.setBounds(92, 44, 153, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblIdNumber = new JLabel("ID Number");
		lblIdNumber.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblIdNumber.setBounds(288, 47, 64, 14);
		contentPane.add(lblIdNumber);
		
		idnum = new JTextField();
		idnum.setEditable(false);
		idnum.setBounds(356, 44, 153, 20);
		contentPane.add(idnum);
		idnum.setColumns(10);
		
		payperiod = new JTextField();
		payperiod.setEditable(false);
		payperiod.setBounds(92, 94, 153, 20);
		contentPane.add(payperiod);
		payperiod.setColumns(10);
		
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
		
		position = new JTextField();
		position.setEditable(false);
		position.setBounds(356, 69, 127, 20);
		contentPane.add(position);
		position.setColumns(10);
		
		JLabel lblCompany = new JLabel("Company");
		lblCompany.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCompany.setBounds(24, 72, 64, 14);
		contentPane.add(lblCompany);
		
		company = new JTextField();
		company.setEditable(false);
		company.setBounds(92, 69, 153, 20);
		contentPane.add(company);
		company.setColumns(10);
		
		JLabel lblPayPeriod = new JLabel("Pay Period");
		lblPayPeriod.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPayPeriod.setBounds(24, 97, 64, 14);
		contentPane.add(lblPayPeriod);
		
		JLabel lblRegularPay = new JLabel("Regular Work Pay");
		lblRegularPay.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblRegularPay.setBounds(24, 122, 125, 14);
		contentPane.add(lblRegularPay);
		
		regularPay = new JTextField();
		regularPay.setEditable(false);
		regularPay.setBounds(139, 119, 86, 20);
		contentPane.add(regularPay);
		regularPay.setColumns(10);
		
		JLabel lblHoursWorked = new JLabel("Hours Worked");
		lblHoursWorked.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblHoursWorked.setBounds(312, 122, 100, 14);
		contentPane.add(lblHoursWorked);
		
		hrsWorked = new JTextField();
		hrsWorked.setEditable(false);
		hrsWorked.setBounds(407, 119, 102, 20);
		contentPane.add(hrsWorked);
		hrsWorked.setColumns(10);
		
		JLabel lblGrossPay = new JLabel("Gross Pay");
		lblGrossPay.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblGrossPay.setBounds(176, 306, 64, 14);
		contentPane.add(lblGrossPay);
		
		JLabel lblNetPay = new JLabel("Net Pay");
		lblNetPay.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNetPay.setBounds(176, 325, 64, 14);
		contentPane.add(lblNetPay);
		
		grossPay = new JTextField();
		grossPay.setEditable(false);
		grossPay.setBounds(235, 299, 101, 20);
		contentPane.add(grossPay);
		grossPay.setColumns(10);
		
		netPay = new JTextField();
		netPay.setEditable(false);
		netPay.setBounds(235, 322, 101, 20);
		contentPane.add(netPay);
		netPay.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(55, 187, 368, 93);
		contentPane.add(scrollPane);
		
		payslipTable = new JTable();
		scrollPane.setViewportView(payslipTable);
		payslipTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"Salary", "", "Tardiness", ""},
				{"Overtime Pay", "", "Abscences", ""},
				{"Holiday Pay", "", "Undertime Pay", ""},
				{"SSS", "", "Tax", ""},
				{"Phil Health", "", null, null},
				{"Pag-ibig", "", null, null},
			},
			new String[] {
				"", "Amount", "", "Amount"
			}
		));
		payslipTable.getColumnModel().getColumn(0).setMaxWidth(100);
		payslipTable.getColumnModel().getColumn(1).setMaxWidth(100);
		payslipTable.getColumnModel().getColumn(2).setMaxWidth(100);
		payslipTable.getColumnModel().getColumn(3).setMaxWidth(100);
		
		JLabel lblPayslip = new JLabel("Payslip");
		lblPayslip.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPayslip.setBounds(237, 11, 115, 22);
		contentPane.add(lblPayslip);
	}
}
