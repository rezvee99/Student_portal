package StudentPortal;

import java.awt.BorderLayout;
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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class TForgetPassword extends JFrame {

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
					TForgetPassword frame = new TForgetPassword();
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
	public TForgetPassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblForgatePassword = new JLabel("Forgate Password for teacher");
		lblForgatePassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgatePassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblForgatePassword.setBounds(170, 22, 305, 29);
		contentPane.add(lblForgatePassword);
		
		JButton btnHome = new JButton("Home");
		btnHome.setFocusPainted(false);
		btnHome.setForeground(new Color(255, 255, 204));
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnHome.setBackground(new Color(0, 0, 51));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage obj = new HomePage();
				obj.setVisible(true);
				dispose();
			}
		});
		
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
		
		Email = new JTextField();
		Email.setBounds(232, 119, 243, 29);
		contentPane.add(Email);
		Email.setColumns(10);
		
		JButton btnCountinue = new JButton("Countinue");
		btnCountinue.setForeground(new Color(255, 255, 204));
		btnCountinue.setBackground(new Color(0, 0, 51));
		btnCountinue.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCountinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Teacheroutput ob= new Teacheroutput();
				email= Email.getText();
				pin = Integer.parseInt(Pin.getText());
				ob.Output(email);
				
				if(pin==ob.pin) {
					TNewPassword obj = new TNewPassword(email);
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
		lblEmail.setBounds(140, 121, 65, 23);
		contentPane.add(lblEmail);
		
		Pin = new JTextField();
		Pin.setColumns(10);
		Pin.setBounds(232, 171, 243, 29);
		contentPane.add(Pin);
		
		JLabel lblSecurityPin = new JLabel("Security Pin :");
		lblSecurityPin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSecurityPin.setBounds(125, 169, 99, 29);
		contentPane.add(lblSecurityPin);
		btnBack.setBounds(10, 41, 89, 23);
		contentPane.add(btnBack);
		
		JLabel label = new JLabel("**********************************************************");
		label.setBounds(167, 45, 365, 14);
		contentPane.add(label);
		btnHome.setBounds(10, 11, 89, 23);
		contentPane.add(btnHome);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(5, 5, 646, 363);
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		contentPane.add(lblNewLabel);
	}

}
