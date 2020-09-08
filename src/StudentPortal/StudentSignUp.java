package StudentPortal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class StudentSignUp extends JFrame {
	

	private JPanel contentPane;
	private JTextField name;
	private JTextField id;
	private JTextField dept;
	private JTextField email;
	private JTextField password;
	private JTextField pin;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSignUp frame = new StudentSignUp();
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
	public StudentSignUp() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(243, 105, 217, 23);
		contentPane.add(id);
		
		JLabel lblStudentName = new JLabel("Name :");
		lblStudentName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStudentName.setBounds(109, 70, 108, 23);
		contentPane.add(lblStudentName);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(110, 208, 108, 23);
		contentPane.add(lblPassword);
		
		pin = new JTextField();
		pin.setColumns(10);
		pin.setBounds(243, 243, 217, 23);
		contentPane.add(pin);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setForeground(new Color(255, 255, 204));
		btnSignUp.setBackground(new Color(0, 0, 51));
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Id=id.getText();
				String Name= name.getText();
				String Email = email.getText();
				String Password = password.getText();
				String Dept = dept.getText();
				int Pin = Integer.parseInt(pin.getText());
				
				StudentInput inp = new StudentInput();
				inp.paymentInsert(Id,30000);
				inp.Insert(Name, Id, Email, Password, Pin, Dept);
				
				if (inp.counter==1) {
					StudentLogIn obj = new StudentLogIn();
					obj.setVisible(true);
					dispose();	
				}
				
				
			}
		});
		btnSignUp.setBounds(243, 288, 89, 23);
		contentPane.add(btnSignUp);
		
		JButton btnHome = new JButton("Home");
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
		btnHome.setFocusPainted(false);
		btnHome.setBounds(10, 11, 89, 23);
		contentPane.add(btnHome);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(243, 176, 217, 23);
		contentPane.add(email);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(243, 209, 217, 23);
		contentPane.add(password);
		
		JLabel lblStudentSignUp = new JLabel("Student Sign Up");
		lblStudentSignUp.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStudentSignUp.setForeground(new Color(0, 0, 0));
		lblStudentSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentSignUp.setBounds(222, 14, 222, 14);
		contentPane.add(lblStudentSignUp);
		
		dept = new JTextField();
		dept.setColumns(10);
		dept.setBounds(243, 142, 217, 23);
		contentPane.add(dept);
		
		JLabel lblHidepin = new JLabel("Security Pin :");
		lblHidepin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHidepin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHidepin.setBounds(110, 242, 108, 23);
		contentPane.add(lblHidepin);
		
		JLabel lblDepartment = new JLabel("Department :");
		lblDepartment.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDepartment.setBounds(109, 141, 108, 23);
		contentPane.add(lblDepartment);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(new Color(255, 255, 204));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setBackground(new Color(0, 0, 51));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SignUp obj = new SignUp();
				obj.setVisible(true);
				dispose();
			}
		});
		btnBack.setFocusPainted(false);
		btnBack.setBounds(10, 40, 89, 23);
		contentPane.add(btnBack);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setForeground(new Color(0, 0, 0));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(110, 175, 108, 23);
		contentPane.add(lblEmail);
		
		JLabel lblStudentEmail = new JLabel("Id :");
		lblStudentEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStudentEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStudentEmail.setBounds(110, 104, 108, 23);
		contentPane.add(lblStudentEmail);
		
		JLabel label = new JLabel("*****************************************");
		label.setBounds(232, 34, 285, 14);
		contentPane.add(label);
		
		name = new JTextField();
		name.setBounds(243, 71, 217, 23);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		lblNewLabel.setBounds(-20, 1, 672 , 412);
		contentPane.add(lblNewLabel);
	}
}
