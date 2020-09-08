package StudentPortal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Color;

public class Administrator extends JFrame {

	private JPanel contentPane;
	private JTextField email;
	private JPasswordField password;
	
	String Email="admin@diu.edu.bd";
	String Password="diu123456";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Administrator frame = new Administrator();
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
	public Administrator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(123, 159, 70, 22);
		contentPane.add(lblPassword);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBackground(new Color(0, 0, 51));
		btnHome.setForeground(new Color(255, 255, 204));
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage obj = new HomePage();
				obj.setVisible(true);
				dispose();
				
			}
		});
		
		JLabel lblAdministratorLogIn = new JLabel("Administrator Log In");
		lblAdministratorLogIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdministratorLogIn.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAdministratorLogIn.setBounds(213, 32, 223, 29);
		contentPane.add(lblAdministratorLogIn);
		btnHome.setFocusPainted(false);
		btnHome.setBounds(10, 11, 89, 23);
		contentPane.add(btnHome);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(new Color(255, 255, 204));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setBackground(new Color(0, 0, 51));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn obj = new LogIn();
				obj.setVisible(true);
				dispose();
			}
		});
		
		password = new JPasswordField();
		password.setBounds(231, 160, 230, 29);
		contentPane.add(password);
		
		JLabel label = new JLabel("********************************************");
		label.setBounds(208, 57, 353, 14);
		contentPane.add(label);
		btnBack.setFocusPainted(false);
		btnBack.setBounds(10, 42, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setBackground(new Color(0, 0, 51));
		btnLogIn.setForeground(new Color(255, 255, 204));
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String dEmail=email.getText();
			String dPassword=password.getText();
				
			
				
					
	            if ((dPassword.equals(Password))&&(dEmail.equals(Email))) {
					//System.out.println("matched");
					AdministratorPage obj = new AdministratorPage();
				
					obj.setVisible(true);
					
					
					dispose();
				}
	            else {
	            	JOptionPane.showMessageDialog(null,"The emaail or the password that you've entered is incorrect.");
	            }
			
			}
		});
		btnLogIn.setBounds(231, 217, 89, 23);
		contentPane.add(btnLogIn);
		
		email = new JTextField();
		email.setBounds(231, 120, 230, 29);
		contentPane.add(email);
		email.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(123, 123, 70, 22);
		contentPane.add(lblEmail);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(5, 5, 646, 363);
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		contentPane.add(lblNewLabel);
		
		
	}

}
