package snippet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Booking {

	private JFrame frmBooking;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Booking window = new Booking();
					window.frmBooking.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBooking = new JFrame();
		frmBooking.setTitle("Booking");
		frmBooking.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Adhiraj99\\Desktop\\lint whoopers\\lw_logo.png"));
		frmBooking.setBounds(100, 100, 608, 439);
		frmBooking.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBooking.getContentPane().setLayout(null);
		
		JLabel lblLandlordRahulKumar = new JLabel("  Landlord: Rahul Kumar");
		lblLandlordRahulKumar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLandlordRahulKumar.setBounds(10, 10, 257, 36);
		frmBooking.getContentPane().add(lblLandlordRahulKumar);
		
		JLabel lblContact = new JLabel("  Contact: 5022378589\r\n");
		lblContact.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContact.setBounds(10, 56, 257, 36);
		frmBooking.getContentPane().add(lblContact);
		
		JLabel lblRentAmtRsmonth = new JLabel("  Rent Amt.: Rs.15000/month");
		lblRentAmtRsmonth.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRentAmtRsmonth.setBounds(10, 102, 257, 36);
		frmBooking.getContentPane().add(lblRentAmtRsmonth);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookingDetails B_result = new BookingDetails();
				B_result.setVisible(true);

				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(80, 149, 103, 32);
		frmBooking.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setBounds(10, 10, 257, 171);
		frmBooking.getContentPane().add(table);
	}

}
