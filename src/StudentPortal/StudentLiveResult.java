package StudentPortal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class StudentLiveResult extends JFrame {

	private JPanel contentPane;
	String Email;

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
	public StudentLiveResult() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLiveResult = new JLabel("Live Result");
		lblLiveResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiveResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLiveResult.setBounds(246, 11, 178, 28);
		contentPane.add(lblLiveResult);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFocusPainted(false);
		btnBack.setBackground(new Color(0, 0, 51));
		btnBack.setForeground(new Color(255, 255, 204));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
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
		btnHome.setBounds(10, 45, 89, 23);
		contentPane.add(btnHome);
		
		JLabel label = new JLabel("**************************************");
		label.setBounds(232, 32, 253, 14);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 672, 412);
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		contentPane.add(lblNewLabel);
	}

}
