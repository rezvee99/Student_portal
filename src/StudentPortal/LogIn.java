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
import javax.swing.border.BevelBorder;

public class LogIn extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	
	public LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnStudentLogIn = new JButton("Student Log In");
		btnStudentLogIn.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnStudentLogIn.setForeground(new Color(255, 255, 153));
		btnStudentLogIn.setBackground(new Color(102, 51, 51));
		btnStudentLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				StudentLogIn obj = new StudentLogIn();
				obj.setVisible(true);
				dispose();
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(0, 0, 51));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setForeground(new Color(255, 255, 204));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				HomePage obj = new HomePage();
				obj.setVisible(true);
				dispose();
			}
		});
		btnBack.setFocusPainted(false);
		btnBack.setBounds(10, 45, 88, 23);
		contentPane.add(btnBack);
		btnStudentLogIn.setBounds(105, 110, 175, 35);
		contentPane.add(btnStudentLogIn);
		
		JButton btnHome = new JButton("Home");
		btnHome.setForeground(new Color(255, 255, 204));
		btnHome.setBackground(new Color(0, 0, 51));
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnHome.setFocusPainted(false);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage obj = new HomePage();
				obj.setVisible(true);
				dispose();
			}
		});
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBackground(new Color(0, 0, 51));
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSignUp.setForeground(new Color(255, 255, 204));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp obj = new SignUp();
				obj.setVisible(true);
				dispose();
			}
		});
		btnSignUp.setFocusPainted(false);
		btnSignUp.setBounds(401, 248, 104, 35);
		contentPane.add(btnSignUp);
		
		JLabel lblLogIn = new JLabel("Log In");
		lblLogIn.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLogIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogIn.setBounds(245, 33, 142, 35);
		contentPane.add(lblLogIn);
		
		JButton btnAdministratorLogIn = new JButton("Administrator Log In");
		btnAdministratorLogIn.setBackground(new Color(102, 51, 51));
		btnAdministratorLogIn.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdministratorLogIn.setForeground(new Color(255, 255, 153));
		btnAdministratorLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Administrator obj = new Administrator();
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnAdministratorLogIn.setBounds(269, 202, 175, 35);
		contentPane.add(btnAdministratorLogIn);
		btnHome.setBounds(10, 11, 88, 23);
		contentPane.add(btnHome);
		
		JButton btnTeacherLogIn = new JButton("Teacher Log In");
		btnTeacherLogIn.setBackground(new Color(102, 51, 51));
		btnTeacherLogIn.setForeground(new Color(255, 255, 153));
		btnTeacherLogIn.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTeacherLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				TeacherLogIn obj = new TeacherLogIn();
				obj.setVisible(true);
				dispose();
			}
		});
		
		JLabel label = new JLabel("*********************");
		label.setBounds(269, 63, 175, 14);
		contentPane.add(label);
		btnTeacherLogIn.setBounds(192, 156, 175, 35);
		contentPane.add(btnTeacherLogIn);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		lblNewLabel.setBounds(0, 0, 646, 373);
		contentPane.add(lblNewLabel);
	}
}
