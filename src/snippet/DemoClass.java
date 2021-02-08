package snippet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class DemoClass {

	private JFrame VaccancyPost;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoClass window = new DemoClass();
					window.VaccancyPost.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DemoClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		VaccancyPost = new JFrame();
		VaccancyPost.setForeground(Color.BLACK);
		VaccancyPost.setFont(new Font("Arial Unicode MS", Font.BOLD, 18));
		VaccancyPost.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Adhiraj99\\Desktop\\lint whoopers\\lw_logo.png"));
		VaccancyPost.setTitle("Vaccancy Post");
		VaccancyPost.setBounds(100, 100, 682, 758);
		VaccancyPost.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		VaccancyPost.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(209, 52, 297, 36);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name*:");
		lblNewLabel.setBounds(62, 54, 121, 33);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Address*:");
		lblNewLabel_1.setBounds(62, 120, 121, 36);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(209, 120, 369, 61);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Room Details:");
		lblNewLabel_2.setBounds(62, 259, 153, 33);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Single");
		rdbtnNewRadioButton.setBounds(62, 315, 103, 21);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Shared");
		rdbtnNewRadioButton_1.setBounds(403, 315, 103, 21);
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("AC");
		rdbtnNewRadioButton_2.setBounds(62, 352, 103, 21);
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Non-AC");
		rdbtnNewRadioButton_3.setBounds(403, 352, 103, 21);
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Veg");
		rdbtnNewRadioButton_4.setBounds(62, 389, 103, 21);
		buttonGroup_2.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Non-Veg");
		rdbtnNewRadioButton_5.setBounds(403, 389, 133, 21);
		buttonGroup_2.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(rdbtnNewRadioButton_5);
		
		JLabel lblNewLabel_3 = new JLabel("Contact*:");
		lblNewLabel_3.setBounds(62, 453, 121, 36);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(209, 453, 219, 33);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(209, 508, 219, 33);
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		JLabel lblNewLabel_4 = new JLabel("(Optional)");
		lblNewLabel_4.setBounds(475, 505, 103, 33);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 18));
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Rent Amt*.:");
		lblNewLabel_5.setBounds(62, 572, 121, 36);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(209, 576, 109, 36);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(475, 644, 121, 43);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				String s1=textField_1.getText();
				String s2=textField_2.getText();
				String s4=textField_4.getText();
				if(s.length()==0||s==null)
					JOptionPane.showMessageDialog(VaccancyPost, "Error: Name Field empty");
				else if(s1.length()==0||s1==null)
					JOptionPane.showMessageDialog(VaccancyPost, "Error: Address Field empty");
				else if(s2.length()==0||s2==null)
					JOptionPane.showMessageDialog(VaccancyPost, "Error: Contact Field empty");
				else if(s4.length()==0||s4==null)
					JOptionPane.showMessageDialog(VaccancyPost, "Error: Rent Field empty");
				else if(s4.length()==0||s4==null)
					JOptionPane.showMessageDialog(VaccancyPost, "Error: Rent Field is not integer");
				else 
					JOptionPane.showMessageDialog(VaccancyPost, "Submitted successfully.");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("*(denotes mandatory field)");
		lblNewLabel_6.setBounds(64, 644, 254, 43);
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.ITALIC, 18));
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Location:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setBounds(62, 195, 97, 33);
		panel.add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Kolkata", "Durgapur", "Jadavpur", "Dhaka", "Sealdah"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setMaximumRowCount(5);
		comboBox.setBounds(399, 204, 137, 36);
		panel.add(comboBox);
	}
}
