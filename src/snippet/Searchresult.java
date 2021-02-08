package snippet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class Searchresult extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Searchresult frame = new Searchresult();
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
	public Searchresult() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Adhiraj99\\Desktop\\lint whoopers\\lw_logo.png"));
		setTitle("Booking(Demo)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLandlordRahulKumar = new JLabel("  Landlord: Rahul Kumar");
		lblLandlordRahulKumar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLandlordRahulKumar.setBounds(10, 10, 257, 36);
		contentPane.add(lblLandlordRahulKumar);
		
		JLabel lblContact = new JLabel("  Contact: 5022378589\r\n");
		lblContact.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContact.setBounds(10, 56, 257, 36);
		contentPane.add(lblContact);
		
		JLabel lblRentAmtRsmonth = new JLabel("  Rent Amt.: Rs.15000/month");
		lblRentAmtRsmonth.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRentAmtRsmonth.setBounds(10, 102, 257, 36);
		contentPane.add(lblRentAmtRsmonth);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Not Available");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(80, 149, 103, 32);
		contentPane.add(btnNewButton);
		
		table = new JTable();
		table.setBounds(10, 10, 257, 171);
		contentPane.add(table);
		
		JLabel lblLandlordRahulKumar_1 = new JLabel("  Landlord: Sunil Dutta");
		lblLandlordRahulKumar_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLandlordRahulKumar_1.setBounds(282, 10, 257, 36);
		contentPane.add(lblLandlordRahulKumar_1);
		
		JLabel lblContact_1 = new JLabel("  Contact: 5486263352\r\n");
		lblContact_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContact_1.setBounds(277, 56, 257, 36);
		contentPane.add(lblContact_1);
		
		JLabel lblRentAmtRsmonth_1 = new JLabel("  Rent Amt.: Rs.12000/month");
		lblRentAmtRsmonth_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRentAmtRsmonth_1.setBounds(282, 102, 257, 36);
		contentPane.add(lblRentAmtRsmonth_1);
		
		JButton btnNewButton_1 = new JButton("Book");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton_1, "Not Available");;
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(352, 149, 103, 32);
		contentPane.add(btnNewButton_1);
		
		table_1 = new JTable();
		table_1.setBounds(282, 10, 257, 171);
		contentPane.add(table_1);
		
		JLabel lblLandlordRahulKumar_1_1 = new JLabel("  Landlord: Kaustav Ganguly");
		lblLandlordRahulKumar_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLandlordRahulKumar_1_1.setBounds(10, 191, 257, 36);
		contentPane.add(lblLandlordRahulKumar_1_1);
		
		JLabel lblContact_1_1 = new JLabel("  Contact: 8965222345\r\n");
		lblContact_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContact_1_1.setBounds(10, 237, 257, 36);
		contentPane.add(lblContact_1_1);
		
		JLabel lblRentAmtRsmonth_1_1 = new JLabel("  Rent Amt.: Rs.10000/month");
		lblRentAmtRsmonth_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRentAmtRsmonth_1_1.setBounds(10, 283, 257, 36);
		contentPane.add(lblRentAmtRsmonth_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Book");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton_1_1, "Not Available");;
		}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(80, 330, 103, 32);
		contentPane.add(btnNewButton_1_1);
		
		table_2 = new JTable();
		table_2.setBounds(10, 191, 257, 171);
		contentPane.add(table_2);
		
		JLabel lblLandlordRahulKumar_1_2 = new JLabel("  Landlord: Arnab Nandi");
		lblLandlordRahulKumar_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLandlordRahulKumar_1_2.setBounds(282, 191, 257, 36);
		contentPane.add(lblLandlordRahulKumar_1_2);
		
		JLabel lblContact_1_2 = new JLabel("  Contact: 6234788795\r\n");
		lblContact_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContact_1_2.setBounds(282, 237, 257, 36);
		contentPane.add(lblContact_1_2);
		
		JLabel lblRentAmtRsmonth_1_2 = new JLabel("  Rent Amt.: Rs.18000/month");
		lblRentAmtRsmonth_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRentAmtRsmonth_1_2.setBounds(282, 283, 257, 36);
		contentPane.add(lblRentAmtRsmonth_1_2);
		
		JButton btnNewButton_1_2 = new JButton("Book");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton_1_2, "Not Available");;
					}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2.setBounds(352, 330, 103, 32);
		contentPane.add(btnNewButton_1_2);
		
		table_3 = new JTable();
		table_3.setBounds(282, 191, 257, 171);
		contentPane.add(table_3);
	}

}
