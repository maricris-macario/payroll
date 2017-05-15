package paycrawl;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Paycrawl {

	private JFrame frame;
	private JTextField name;
	private JTextField rate;
	private JTextField salary;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtHrs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paycrawl window = new Paycrawl();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Paycrawl() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		String[] options = new String[] {"Manager", "Supervisor", "Clerk", "Accountant", "Production Supervisor", "Tailor", "Maintenance"};
		JComboBox<String> position = new JComboBox(options);
		position.setBounds(260, 26, 122, 20);
		frame.getContentPane().add(position);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(22, 29, 46, 14);
		frame.getContentPane().add(lblName);
		
		name = new JTextField();
		name.setBounds(65, 26, 173, 20);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblRate = new JLabel("Rate");
		lblRate.setBounds(94, 60, 37, 14);
		frame.getContentPane().add(lblRate);
		
		rate = new JTextField();
		rate.setBounds(127, 57, 86, 20);
		frame.getContentPane().add(rate);
		rate.setColumns(10);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setBounds(22, 289, 46, 14);
		frame.getContentPane().add(lblSalary);
		
		salary = new JTextField();
		salary.setBounds(78, 286, 104, 20);
		frame.getContentPane().add(salary);
		salary.setColumns(10);
		
		JButton btnCompute = new JButton("Compute");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent computeSalary) {
				
			}
		});
		btnCompute.setBounds(201, 317, 89, 23);
		frame.getContentPane().add(btnCompute);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(22, 85, 46, 14);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(191, 85, 46, 14);
		frame.getContentPane().add(lblTo);
		
		textField = new JTextField();
		textField.setBounds(52, 82, 104, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(211, 82, 104, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Overtime Pay");
		lblNewLabel.setBounds(23, 147, 75, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblTotalHours = new JLabel("Total Hours");
		lblTotalHours.setBounds(33, 172, 65, 14);
		frame.getContentPane().add(lblTotalHours);
		
		textField_2 = new JTextField();
		textField_2.setBounds(108, 169, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblBenefits = new JLabel("Benefits");
		lblBenefits.setBounds(278, 146, 46, 14);
		frame.getContentPane().add(lblBenefits);
		
		JLabel lblSss = new JLabel("SSS");
		lblSss.setBounds(288, 164, 46, 14);
		frame.getContentPane().add(lblSss);
		
		JLabel lblPhilHealth = new JLabel("Phil Health");
		lblPhilHealth.setBounds(288, 189, 58, 14);
		frame.getContentPane().add(lblPhilHealth);
		
		JLabel lblPagIbig = new JLabel("Pag-ibig");
		lblPagIbig.setBounds(288, 214, 46, 14);
		frame.getContentPane().add(lblPagIbig);
		
		textField_3 = new JTextField();
		textField_3.setBounds(363, 161, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(363, 186, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(363, 211, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(22, 215, 46, 14);
		frame.getContentPane().add(lblTax);
		
		JLabel lblLates = new JLabel("Absences");
		lblLates.setBounds(22, 239, 46, 14);
		frame.getContentPane().add(lblLates);
		
		textField_6 = new JTextField();
		textField_6.setBounds(108, 212, 86, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		txtHrs = new JTextField();
		txtHrs.setHorizontalAlignment(SwingConstants.CENTER);
		txtHrs.setForeground(Color.LIGHT_GRAY);
		txtHrs.setBounds(108, 236, 86, 20);
		frame.getContentPane().add(txtHrs);
		txtHrs.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(265, 134, 188, 108);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(22, 134, 188, 69);
		frame.getContentPane().add(separator_1);
				
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
