package StudentPortal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Hostel extends JFrame {
	
	public String Email;

	private JPanel contentPane;

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
	public Hostel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(0, 0, 51));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setForeground(new Color(255, 255, 204));
		btnBack.setFocusPainted(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentPage obj = new StudentPage(Email);
				obj.email=Email;
				
				obj.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(10, 16, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnHome = new JButton("Log Out");
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnHome.setForeground(new Color(255, 255, 204));
		btnHome.setBackground(new Color(0, 0, 51));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage obj = new HomePage();
				obj.setVisible(true);
				dispose();
			}
		});
		
		JLabel lblHostel = new JLabel("Hostel");
		lblHostel.setHorizontalAlignment(SwingConstants.CENTER);
		lblHostel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHostel.setBounds(247, 20, 151, 32);
		contentPane.add(lblHostel);
		btnHome.setBounds(10, 45, 89, 23);
		contentPane.add(btnHome);
		
		JLabel label = new JLabel("*************************");
		label.setBounds(257, 50, 178, 14);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 672, 412);
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		contentPane.add(lblNewLabel);
	}

}
