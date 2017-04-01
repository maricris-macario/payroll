/* NOTES
 * 
 * Abscences - deduct to salary rate/hr
 * Tax
 * 
 * 
 * */

package paycrawl;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Payrollv2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payrollv2 frame = new Payrollv2();
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
	public Payrollv2() {
		setTitle("Payroll");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(21, 26, 46, 14);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(87, 23, 178, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setBounds(362, 26, 46, 14);
		contentPane.add(lblPosition);
		
		String[] options = new String[] {"Manager", "Supervisor", "Clerk", "Accountant", "Production Supervisor", "Tailor", "Maintenance"};
		JComboBox<String> position = new JComboBox(options);
		position.setBounds(434, 23, 132, 20);
		contentPane.add(position);
		
		JLabel lblOvertimePay = new JLabel("Overtime Pay");
		lblOvertimePay.setBounds(21, 113, 83, 14);
		contentPane.add(lblOvertimePay);
		
		JLabel lblTotalHours = new JLabel("Holiday Pay");
		lblTotalHours.setBounds(21, 138, 83, 14);
		contentPane.add(lblTotalHours);
		
		textField_1 = new JTextField();
		textField_1.setBounds(114, 110, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(364, 169, 64, 14);
		contentPane.add(lblTax);
		
		textField_2 = new JTextField();
		textField_2.setBounds(438, 166, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAbscences = new JLabel("Abscences");
		lblAbscences.setBounds(364, 141, 64, 14);
		contentPane.add(lblAbscences);
		
		textField_3 = new JTextField();
		textField_3.setBounds(438, 141, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblBenefits = new JLabel("Benefits");
		lblBenefits.setBounds(21, 227, 57, 14);
		contentPane.add(lblBenefits);
		
		JLabel lblSss = new JLabel("SSS");
		lblSss.setBounds(66, 255, 38, 14);
		contentPane.add(lblSss);
		
		textField_4 = new JTextField();
		textField_4.setBounds(137, 252, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblPhilHealth = new JLabel("Phil Health");
		lblPhilHealth.setBounds(66, 280, 64, 14);
		contentPane.add(lblPhilHealth);
		
		textField_5 = new JTextField();
		textField_5.setBounds(137, 277, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblPagibig = new JLabel("Pag-ibig");
		lblPagibig.setBounds(271, 252, 61, 14);
		contentPane.add(lblPagibig);
		
		textField_6 = new JTextField();
		textField_6.setBounds(342, 249, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnCompute = new JButton("Compute");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payslip p = new Payslip();
				p.slip();
			}
		});
		btnCompute.setBounds(506, 308, 89, 23);
		contentPane.add(btnCompute);
		
		JLabel lblIdNumber = new JLabel("ID Number");
		lblIdNumber.setBounds(21, 51, 64, 14);
		contentPane.add(lblIdNumber);
		
		textField_7 = new JTextField();
		textField_7.setBounds(87, 48, 120, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(114, 135, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblTardiness = new JLabel("Tardiness");
		lblTardiness.setBounds(364, 116, 64, 14);
		contentPane.add(lblTardiness);
		
		textField_9 = new JTextField();
		textField_9.setBounds(438, 110, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(156, 210, 343, 2);
		contentPane.add(separator);
	}
}
