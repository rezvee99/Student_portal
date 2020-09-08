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
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TeacherPage extends JFrame {

	private JPanel contentPane;
	String email;

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
	public TeacherPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		

		JButton btnProfile = new JButton("Home");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				T_HomePage obj = new T_HomePage();
				obj.email=email;
				obj.setVisible(true);
				dispose();
			}
		});
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
		btnLogOut.setBounds(22, 49, 89, 23);
		contentPane.add(btnLogOut);
		
		JButton button = new JButton("Profile");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TeacherProfile obj = new TeacherProfile(email);
				obj.setVisible(true);	
				dispose();
			}
		});
		
		JButton btnMarkEntry = new JButton("Mark Entry");
		btnMarkEntry.setForeground(new Color(255, 255, 204));
		btnMarkEntry.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMarkEntry.setFocusPainted(false);
		btnMarkEntry.setBackground(Color.BLACK);
		btnMarkEntry.setBounds(213, 16, 120, 23);
		contentPane.add(btnMarkEntry);
		
		JButton btnAttendence = new JButton("Attendence");
		btnAttendence.setForeground(new Color(255, 255, 204));
		btnAttendence.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAttendence.setFocusPainted(false);
		btnAttendence.setBackground(Color.BLACK);
		btnAttendence.setBounds(343, 16, 108, 23);
		contentPane.add(btnAttendence);
		
		JButton btnAssignment = new JButton("Assignment");
		btnAssignment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAssignment.setForeground(new Color(255, 255, 204));
		btnAssignment.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAssignment.setFocusPainted(false);
		btnAssignment.setBackground(Color.BLACK);
		btnAssignment.setBounds(461, 16, 131, 23);
		contentPane.add(btnAssignment);
		button.setForeground(new Color(255, 255, 204));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setFocusPainted(false);
		button.setBackground(Color.BLACK);
		button.setBounds(114, 16, 89, 23);
		contentPane.add(button);
		
		
		JLabel lblTitellabel = new JLabel("");
		lblTitellabel.setBounds(18, 9, 613, 75);
		lblTitellabel.setIcon(new ImageIcon(HomePage.class.getResource("TitelPic.jpg")));
		contentPane.add(lblTitellabel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 672, 373);
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		contentPane.add(lblNewLabel);
	}
}