package StudentPortal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class SignUp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setForeground(new Color(255, 255, 204));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(0, 0, 51));
		btnNewButton.setFocusPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				HomePage obj = new HomePage();
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(10, 11, 99, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setForeground(new Color(255, 255, 204));
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogIn.setBackground(new Color(0, 0, 51));
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn obj = new LogIn();
				obj.setVisible(true);
				dispose();
			}
		});
		btnLogIn.setFocusPainted(false);
		btnLogIn.setBounds(391, 226, 99, 31);
		contentPane.add(btnLogIn);
		
		JButton btnTeacherSignup = new JButton("Teacher SignUp");
		btnTeacherSignup.setBackground(new Color(102, 51, 51));
		btnTeacherSignup.setForeground(new Color(255, 255, 153));
		btnTeacherSignup.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTeacherSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherSignUp obj = new TeacherSignUp();
				obj.setVisible(true);
				dispose();
				
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(0, 0, 51));
		btnBack.setForeground(new Color(255, 255, 204));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage obj = new HomePage();
				obj.setVisible(true);
				dispose();
				
			}
		});
		
		JLabel lblSignUp = new JLabel("Sign Up");
		lblSignUp.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignUp.setBounds(270, 27, 118, 31);
		contentPane.add(lblSignUp);
		
		JLabel label = new JLabel("********************");
		label.setBounds(280, 56, 277, 14);
		contentPane.add(label);
		btnBack.setFocusPainted(false);
		btnBack.setBounds(10, 40, 99, 23);
		contentPane.add(btnBack);
		btnTeacherSignup.setBounds(251, 173, 185, 39);
		contentPane.add(btnTeacherSignup);
		
		JButton btnStudentSignup = new JButton("Student SignUp");
		btnStudentSignup.setForeground(new Color(255, 255, 153));
		btnStudentSignup.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnStudentSignup.setBackground(new Color(102, 51, 51));
		btnStudentSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentSignUp obj = new StudentSignUp();
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnStudentSignup.setBounds(141, 123, 185, 39);
		contentPane.add(btnStudentSignup);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 656, 373);
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		contentPane.add(lblNewLabel);
	}

}
