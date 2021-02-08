package snippet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Search {

	private JFrame SearchVc;
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
					Search window = new Search();
					window.SearchVc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Search() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		SearchVc = new JFrame();
		SearchVc.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Adhiraj99\\Desktop\\lint whoopers\\lw_logo.png"));
		SearchVc.setTitle("Search Vacancy");
		SearchVc.setBounds(100, 100, 604, 466);
		SearchVc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SearchVc.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Location:");
		lblNewLabel.setBounds(59, 74, 110, 31);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		SearchVc.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Room Type:");
		lblNewLabel_2.setBounds(59, 136, 110, 31);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		SearchVc.getContentPane().add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Single");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(59, 199, 103, 21);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		SearchVc.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Shared");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(356, 199, 103, 21);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		SearchVc.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Ac");
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(59, 242, 103, 21);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		SearchVc.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Veg");
		buttonGroup_2.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(59, 285, 103, 21);
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		SearchVc.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Non-Veg");
		buttonGroup_2.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setBounds(356, 285, 103, 21);
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		SearchVc.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Non-Ac");
		buttonGroup_1.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setBounds(356, 242, 103, 21);
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		SearchVc.getContentPane().add(rdbtnNewRadioButton_5);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Searchresult S_result = new Searchresult();
			S_result.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(179, 355, 212, 38);
		SearchVc.getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Kolkata", "Durgapur", "Jadavpur", "Dhaka", "Sealdah"}));
		comboBox.setSelectedIndex(0);
		comboBox.setMaximumRowCount(5);
		comboBox.setBounds(356, 75, 123, 35);
		SearchVc.getContentPane().add(comboBox);
	}
}
