package StudentPortal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Cursor;

public class A_HomePage extends JFrame {

	private JPanel contentPane;
	
	public String email ;

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
	public A_HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("STUDENT PORTAL");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(192, 5, 274, 43);
		contentPane.add(lblNewLabel_1);
		
		JButton btnContact = new JButton("Contact");
		btnContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnContact.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnContact.setBackground(new Color(0, 0, 51));
		btnContact.setForeground(new Color(255, 255, 204));
		btnContact.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnContact.setFocusTraversalKeysEnabled(false);
		btnContact.setFocusPainted(false);
		btnContact.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnContact.setBounds(0, 245, 89, 23);
		contentPane.add(btnContact);
		
		JButton btnCampus = new JButton("Campus");
		btnCampus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCampus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCampus.setBackground(new Color(0, 0, 51));
		btnCampus.setForeground(new Color(255, 255, 204));
		btnCampus.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCampus.setFocusTraversalKeysEnabled(false);
		btnCampus.setFocusPainted(false);
		btnCampus.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnCampus.setBounds(0, 217, 89, 23);
		contentPane.add(btnCampus);
		
		JLabel lblNewLabel_2 = new JLabel("**************************************");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(199, 37, 298, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnAboutUs = new JButton("About Us");
		btnAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AboutUs obj = new AboutUs();
				obj.flag=3;
				obj.setVisible(true);
				dispose();
			}
		});
		btnAboutUs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAboutUs.setBackground(new Color(0, 0, 51));
		btnAboutUs.setForeground(new Color(255, 255, 204));
		btnAboutUs.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAboutUs.setFocusTraversalKeysEnabled(false);
		btnAboutUs.setFocusPainted(false);
		btnAboutUs.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnAboutUs.setBounds(0, 189, 89, 23);
		contentPane.add(btnAboutUs);
		
		JButton btnAdmission = new JButton("Admission");
		btnAdmission.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Admission obj = new Admission();
				obj.flag=3;
				obj.setVisible(true);
				dispose();
			}
		});
		btnAdmission.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdmission.setBackground(new Color(0, 0, 51));
		btnAdmission.setForeground(new Color(255, 255, 204));
		btnAdmission.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdmission.setFocusTraversalKeysEnabled(false);
		btnAdmission.setFocusPainted(false);
		btnAdmission.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnAdmission.setBounds(0, 162, 89, 23);
		contentPane.add(btnAdmission);
		
		JButton btnGallary = new JButton("Back");
		btnGallary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdministratorPage obj=new AdministratorPage();
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnGallary.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGallary.setFocusPainted(false);
		btnGallary.setBackground(new Color(0, 0, 51));
		btnGallary.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnGallary.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGallary.setForeground(new Color(255, 255, 204));
		btnGallary.setBounds(557, 20, 89, 23);
		contentPane.add(btnGallary);
		
		JButton button = new JButton("Gallary");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Gallery obj = new Gallery();
				obj.flag=3;
				obj.setVisible(true);
				dispose();
			}
		});
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setBackground(new Color(0, 0, 51));
		button.setForeground(new Color(255, 255, 204));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setFocusTraversalKeysEnabled(false);
		button.setFocusPainted(false);
		button.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button.setBounds(0, 135, 89, 23);
		contentPane.add(button);
		
		JLabel VersityImageLabel = new JLabel("New label");
		VersityImageLabel.setForeground(Color.BLUE);
		VersityImageLabel.setIcon(new ImageIcon(HomePage.class.getResource("HomePagepic.jpg")));
		VersityImageLabel.setBounds(0, 0, 656, 373);
		contentPane.add(VersityImageLabel);
		
		JLabel WhitelblNewLabel = new JLabel("New label");
		WhitelblNewLabel.setBounds(0, 0, 656, 373);
		WhitelblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("WhitePage.jpg")));
		contentPane.add(WhitelblNewLabel);
	}
}
