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
import java.awt.TextField;
import java.awt.Button;

public class StudentEditProfile extends JFrame {

	private JPanel contentPane;
	String email;
	TextField tsection;
	TextField tpin;
	TextField tfather;
	TextField tmother;
	TextField tphone;
	TextField tpermanent;
	TextField tpresent;
	
	String section,father,mother,phone,permanent,present;
	int pin;
	
	

	/**
	 * Launch the application.
	 */
	StudentOutput ob =new StudentOutput();
	
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
	public StudentEditProfile(String email) {
		this.email = email;
		ob.Output(email);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudentProfile = new JLabel("Student Profile Edit");
		lblStudentProfile.setBounds(218, 11, 215, 32);
		lblStudentProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentProfile.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStudentProfile.setForeground(new Color(0, 0, 0));
		contentPane.add(lblStudentProfile);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFocusPainted(false);
		btnBack.setBackground(new Color(0, 0, 51));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setForeground(new Color(255, 255, 204));
		btnBack.setBounds(12, 18, 89, 23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentPage obj = new StudentPage(email);
				obj.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnBack);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setBounds(12, 46, 89, 23);
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
		btnLogOut.setBackground(new Color(0, 0, 51));
		contentPane.add(btnLogOut);
		
		JLabel lblSecurityPin = new JLabel("Security pin :");
		lblSecurityPin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSecurityPin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSecurityPin.setBounds(114, 64, 129, 23);
		contentPane.add(lblSecurityPin);
		
		JLabel lblSection = new JLabel("Section :");
		lblSection.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSection.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSection.setBounds(112, 101, 129, 16);
		contentPane.add(lblSection);
		
		JLabel lblFathersName = new JLabel("Father's Name :");
		lblFathersName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFathersName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFathersName.setBounds(107, 141, 136, 16);
		contentPane.add(lblFathersName);
		
		tpin = new TextField();
		tpin.setText(Integer.toString(ob.pin));
		tpin.setBounds(268, 64, 191, 24);
		contentPane.add(tpin);
		
		JLabel lblPermanentAdress = new JLabel("Permanent Adress :");
		lblPermanentAdress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPermanentAdress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPermanentAdress.setBounds(78, 252, 165, 16);
		contentPane.add(lblPermanentAdress);
		
		JLabel lblMothersName = new JLabel("Mother's Name :");
		lblMothersName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMothersName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMothersName.setBounds(116, 182, 127, 16);
		contentPane.add(lblMothersName);
		
		JLabel lblPhone = new JLabel("Phone :");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setForeground(new Color(0, 0, 0));
		lblPhone.setBounds(114, 220, 129, 16);
		contentPane.add(lblPhone);
		
		JLabel lblPresentAdress = new JLabel("Present Adress :");
		lblPresentAdress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPresentAdress.setForeground(new Color(0, 0, 0));
		lblPresentAdress.setHorizontalAlignment(SwingConstants.CENTER);
		lblPresentAdress.setBounds(126, 290, 136, 16);
		contentPane.add(lblPresentAdress);
		 
		 JLabel label = new JLabel("********************************************");
		 label.setBounds(217, 41, 347, 14);
		 contentPane.add(label);
		
		 tsection = new TextField();
		tsection.setText(ob.section);
		tsection.setBounds(268, 100, 191, 24);
		contentPane.add(tsection);
		
		tfather = new TextField();
		tfather.setText(ob.fatherName);
		tfather.setBounds(268, 139, 191, 24);
		contentPane.add(tfather);
		
		tmother = new TextField();
		tmother.setText(ob.motherName);
		tmother.setBounds(269, 178, 191, 24);
		contentPane.add(tmother);
		
		tphone = new TextField();
		tphone.setText(ob.phone);
		tphone.setBounds(269, 216, 191, 24);
		contentPane.add(tphone);
		
		tpermanent = new TextField();
		tpermanent.setText(ob.permanentAd);
		tpermanent.setBounds(269, 250, 191, 24);
		contentPane.add(tpermanent);
		
		tpresent = new TextField();
		tpresent.setText(ob.presentAd);
		tpresent.setBounds(268, 285, 191, 24);
		contentPane.add(tpresent);
		
		JButton btnDone = new JButton("Submit");
		btnDone.setBackground(new Color(0, 0, 51));
		btnDone.setForeground(new Color(255, 255, 204));
		btnDone.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pin=Integer.parseInt(tpin.getText());
				section=tsection.getText();
				father=tfather.getText();
				mother=tmother.getText();
				phone=tphone.getText();
				permanent=tpermanent.getText();
				present=tpresent.getText();
				
				UpdateData obj =new UpdateData();
				obj.updateAllData(pin, section, father, mother, phone,permanent, present, ob.sn);
				StudentProfile obj1=new StudentProfile(email);
				obj1.setVisible(true);
				dispose();
				
				
				
				
			}
		});
		btnDone.setBounds(268, 316, 120, 23);
		contentPane.add(btnDone);
		
		
		JLabel Piclabel = new JLabel("");
		Piclabel.setBounds(5, 5, 644, 355);
		Piclabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		contentPane.add(Piclabel);
	}
	}


