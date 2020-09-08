package StudentPortal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gallery extends JFrame {

	private JPanel contentPane;
	String email;
	
	int flag;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gallery frame = new Gallery();
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
	public Gallery() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnGallary = new JButton("Home");
		btnGallary.setBounds(0, 107, 89, 23);
		btnGallary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==1) {
					S_HomePage Sobj = new S_HomePage();
					Sobj.setVisible(true);
					Sobj.email=email;
					flag=0;
					dispose();
				}
				else if(flag==2) {
					T_HomePage Tobj = new T_HomePage();
					Tobj.setVisible(true);
					Tobj.email =email;
					flag=0;
					dispose();
				}
				else if(flag==3) {
					A_HomePage Aobj = new A_HomePage();
					Aobj.setVisible(true);
					flag=0;
					dispose();
					
				}
				else {
				HomePage obj = new HomePage();
				obj.setVisible(true);
				dispose();
				}
			}
		});
		contentPane.setLayout(null);
		btnGallary.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGallary.setFocusPainted(false);
		btnGallary.setBackground(new Color(0, 0, 51));
		btnGallary.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnGallary.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGallary.setForeground(new Color(255, 255, 204));
		contentPane.add(btnGallary);
		
		JLabel lbl1 = new JLabel("New label");
		lbl1.setIcon(new ImageIcon(HomePage.class.getResource("Pic1.jpg")));
		lbl1.setBounds(179, 0, 283, 82);
		contentPane.add(lbl1);
		
		JButton button = new JButton("Gallary");
		button.setBounds(0, 135, 89, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		JButton btnAdmission = new JButton("Admission");
		btnAdmission.setBounds(0, 162, 89, 23);
		btnAdmission.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Admission obj = new Admission();
				obj.email=email;
				obj.flag=flag;
				obj.setVisible(true);
				dispose();
			
			}
		});
		
		JLabel lbl3 = new JLabel("New label");
		lbl3.setVisible(true);
		lbl3.setIcon(new ImageIcon(HomePage.class.getResource("Pic7.jpg")));
		lbl3.setBounds(229, 84, 201, 143);
		contentPane.add(lbl3);
		
		JLabel lbl7 = new JLabel("New label");
		lbl7.setVisible(true);
		lbl7.setIcon(new ImageIcon(HomePage.class.getResource("Pic6.jpg")));
		lbl7.setBounds(455, 230, 201, 143);
		contentPane.add(lbl7);
		
		JLabel lal4 = new JLabel("New label");
		lal4.setVisible(true);
		lal4.setIcon(new ImageIcon(HomePage.class.getResource("Pic3.jpg")));
		lal4.setBounds(453, 84, 201, 143);
		contentPane.add(lal4);
		
		JLabel lal6 = new JLabel("New label");
		lal6.setVisible(true);
		lal6.setIcon(new ImageIcon(HomePage.class.getResource("Pic5.jpg")));
		lal6.setBounds(227, 230, 201, 143);
		contentPane.add(lal6);
		
		JLabel lal5 = new JLabel("New label");
		lal5.setVisible(true);
		lal5.setIcon(new ImageIcon(HomePage.class.getResource("Pic4.jpg")));
		lal5.setBounds(1, 226, 203, 147);
		contentPane.add(lal5);
		btnAdmission.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdmission.setBackground(new Color(0, 0, 51));
		btnAdmission.setForeground(new Color(255, 255, 204));
		btnAdmission.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdmission.setFocusTraversalKeysEnabled(false);
		btnAdmission.setFocusPainted(false);
		btnAdmission.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(btnAdmission);
		
		JButton btnAboutUs = new JButton("About Us");
		btnAboutUs.setBounds(0, 189, 89, 23);
		btnAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AboutUs obj = new AboutUs();
				obj.email=email;
				obj.flag=flag;
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
		contentPane.add(btnAboutUs);
		button.setEnabled(false);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setBackground(new Color(0, 0, 51));
		button.setForeground(new Color(255, 255, 204));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setFocusTraversalKeysEnabled(false);
		button.setFocusPainted(false);
		button.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(button);
		
		JLabel lbl2 = new JLabel("New label");
		lbl2.setVisible(true);
		lbl2.setIcon(new ImageIcon(HomePage.class.getResource("Pic2.jpg")));
		lbl2.setBounds(0, 83, 201, 143);
		contentPane.add(lbl2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 672, 412);
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		contentPane.add(lblNewLabel);
		
		
	}
}
