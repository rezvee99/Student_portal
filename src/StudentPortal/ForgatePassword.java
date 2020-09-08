package StudentPortal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class ForgatePassword extends JFrame {

	private JPanel contentPane;
	private JTextField Email;
	private JTextField Pin;
	String email;
	int pin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgatePassword frame = new ForgatePassword();
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
	public ForgatePassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblForgatePassword = new JLabel("Forgate Password");
		lblForgatePassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgatePassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblForgatePassword.setBounds(226, 21, 203, 29);
		contentPane.add(lblForgatePassword);
		
		JButton btnHome = new JButton("Home");
		btnHome.setForeground(new Color(255, 255, 204));
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnHome.setBackground(new Color(0, 0, 51));
		btnHome.setFocusPainted(false);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage obj = new HomePage();
				obj.setVisible(true);
				dispose();
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(0, 0, 51));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setForeground(new Color(255, 255, 204));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn obj = new LogIn();
				obj.setVisible(true);
				dispose();
			}
		});
		
		Email = new JTextField();
		Email.setBounds(232, 119, 243, 29);
		contentPane.add(Email);
		Email.setColumns(10);
		
		JButton btnCountinue = new JButton("Countinue");
		btnCountinue.setBackground(new Color(0, 0, 51));
		btnCountinue.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCountinue.setForeground(new Color(255, 255, 204));
		btnCountinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentOutput ob= new StudentOutput();
				email= Email.getText();
				pin = Integer.parseInt(Pin.getText());
				ob.Output(email);
				
				if(pin==ob.pin) {
					NewPassword obj = new NewPassword(email);
					obj.setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null,"The pin Doesn't Matched");
				}
					
			}
		});
		btnCountinue.setBounds(234, 227, 111, 23);
		contentPane.add(btnCountinue);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(140, 120, 65, 23);
		contentPane.add(lblEmail);
		
		Pin = new JTextField();
		Pin.setColumns(10);
		Pin.setBounds(232, 171, 243, 29);
		contentPane.add(Pin);
		
		JLabel lblSecurityPin = new JLabel("Security Pin :");
		lblSecurityPin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSecurityPin.setBounds(125, 169, 99, 29);
		contentPane.add(lblSecurityPin);
		
		JLabel label = new JLabel("********************************************");
		label.setBounds(211, 46, 264, 14);
		contentPane.add(label);
		btnBack.setBounds(10, 41, 89, 23);
		contentPane.add(btnBack);
		btnHome.setBounds(10, 11, 89, 23);
		contentPane.add(btnHome);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 672, 412);
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		contentPane.add(lblNewLabel);
	}
}
