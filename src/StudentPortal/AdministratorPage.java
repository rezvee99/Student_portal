package StudentPortal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AdministratorPage extends JFrame {

	private JPanel contentPane;
	private JTextField did;
	
	JPanel dpanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public AdministratorPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnProfile = new JButton("Home");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				A_HomePage obj = new A_HomePage();
				obj.setVisible(true);
				dispose();
			}
		});
		contentPane.setLayout(null);
		btnProfile.setFocusPainted(false);
		btnProfile.setBackground(new Color(0, 0, 51));
		btnProfile.setForeground(new Color(255, 255, 204));
		btnProfile.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnProfile.setBounds(22, 15, 89, 23);
		contentPane.add(btnProfile);
		
		
		JButton btnLogOut = new JButton("Logout");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LogIn obj = new LogIn();
				obj.setVisible(true);
				dispose();
			}
		});
		btnLogOut.setForeground(new Color(255, 255, 204));
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogOut.setFocusPainted(false);
		btnLogOut.setBackground(Color.BLACK);
		btnLogOut.setBounds(470, 15, 89, 23);
		contentPane.add(btnLogOut);
		
		JButton btnPayment = new JButton("Payment");
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				A_payment obj= new A_payment();
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnPayment.setForeground(new Color(255, 255, 204));
		btnPayment.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPayment.setFocusPainted(false);
		btnPayment.setBackground(Color.BLACK);
		btnPayment.setBounds(123, 15, 89, 23);
		contentPane.add(btnPayment);
		
		JButton btnResistation = new JButton("Resistation");
		btnResistation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnResistation.setForeground(new Color(255, 255, 204));
		btnResistation.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnResistation.setFocusPainted(false);
		btnResistation.setBackground(Color.BLACK);
		btnResistation.setBounds(224, 15, 108, 23);
		contentPane.add(btnResistation);
		
		JButton btnDeleteData = new JButton("Delete Data");
		btnDeleteData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dpanel.setVisible(true);
			}
		});
		btnDeleteData.setForeground(new Color(255, 255, 204));
		btnDeleteData.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDeleteData.setFocusPainted(false);
		btnDeleteData.setBackground(Color.BLACK);
		btnDeleteData.setBounds(344, 15, 114, 23);
		contentPane.add(btnDeleteData);
		
		dpanel = new JPanel();
		dpanel.setVisible(false);
		
		JButton table = new JButton("Table Create");
		table.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TableCreate tc = new TableCreate();
				tc.InfoTable();
			}
		});
		table.setForeground(Color.RED);
		table.setFont(new Font("Tahoma", Font.BOLD, 14));
		table.setFocusPainted(false);
		table.setBackground(new Color(0, 0, 51));
		table.setBounds(234, 50, 149, 23);
		contentPane.add(table);
		dpanel.setBounds(66, 146, 431, 141);
		contentPane.add(dpanel);
		dpanel.setLayout(null);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setForeground(new Color(255, 255, 204));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(0, 0, 51));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Did = did.getText();
				if(Did.equals("")==false) {
				UpdateData ob = new UpdateData();
				ob.deleteData(Did);
				did.setText("");
				dpanel.setVisible(false);
				}
			}
		});
		btnNewButton.setBounds(246, 90, 89, 23);
		dpanel.add(btnNewButton);
		
		JButton btnCancle = new JButton("Cancle");
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				did.setText("");
				dpanel.setVisible(false);
			}
		});
		btnCancle.setForeground(new Color(255, 255, 204));
		btnCancle.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancle.setBackground(new Color(0, 0, 51));
		btnCancle.setBounds(125, 90, 89, 23);
		dpanel.add(btnCancle);
		
		JLabel lblEnterId = new JLabel("Enter ID:");
		lblEnterId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnterId.setBounds(23, 50, 79, 14);
		dpanel.add(lblEnterId);
		
		did = new JTextField();
		did.setBounds(125, 47, 178, 20);
		dpanel.add(did);
		did.setColumns(10);
		
		JLabel lblStudentDeleteData = new JLabel("Delete Student Data");
		lblStudentDeleteData.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentDeleteData.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStudentDeleteData.setBounds(125, 11, 178, 14);
		dpanel.add(lblStudentDeleteData);
		
		
		
		
		
		JLabel lblTitellabel = new JLabel("");
		lblTitellabel.setBounds(18, 9, 613, 75);
		lblTitellabel.setIcon(new ImageIcon(HomePage.class.getResource("TitelPic.jpg")));
		contentPane.add(lblTitellabel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(5, 5, 644, 355);
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		contentPane.add(lblNewLabel);
	}
}
