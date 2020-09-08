package StudentPortal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class Admission extends JFrame {

	private JPanel contentPane;
	int flag;
	String email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admission frame = new Admission();
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
	public Admission() {
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
		
		JButton button = new JButton("Gallary");
		button.setBounds(0, 135, 89, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Gallery obj = new Gallery();
				obj.flag=flag;
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
		contentPane.add(button);
		
		JButton btnAdmission = new JButton("Admission");
		btnAdmission.setBounds(0, 162, 89, 23);
		btnAdmission.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnAdmission.setEnabled(false);
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
		
		JLabel lbl1 = new JLabel("New label");
		lbl1.setIcon(new ImageIcon(HomePage.class.getResource("Pic8.jpg")));
		lbl1.setBounds(92, 0, 564, 236);
		contentPane.add(lbl1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(HomePage.class.getResource("Pic10.jpg")));
		lblNewLabel_1.setBounds(0, 240, 208, 133);
		contentPane.add(lblNewLabel_1);
		
		JLabel lbl2 = new JLabel("New label");
		lbl2.setIcon(new ImageIcon(HomePage.class.getResource("Pic9.jpg")));
		lbl2.setBounds(215, 238, 441, 138);
		contentPane.add(lbl2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 672, 412);
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		contentPane.add(lblNewLabel);
	}

}
