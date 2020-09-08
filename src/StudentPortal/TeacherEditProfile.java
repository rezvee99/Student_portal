package StudentPortal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TeacherEditProfile extends JFrame {

	private JPanel contentPane;
	public String email;
	TextField tpin;
	TextField tphone;
	TextField tpermanent;
	TextField tpresent;
	
	String phone,permanent,present;
	int pin;

	/**
	 * Launch the application.
	 */
	
	Teacheroutput ob =new Teacheroutput();
	
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
	public TeacherEditProfile(String Email) {
		
		email=Email;
		ob.Output(email);
	
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblStudentProfile = new JLabel("Teacher Profile Edit");
		lblStudentProfile.setBounds(218, 11, 215, 32);
		lblStudentProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentProfile.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStudentProfile.setForeground(new Color(0, 0, 0));
		contentPane.add(lblStudentProfile);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFocusPainted(false);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setForeground(new Color(255, 255, 204));
		btnBack.setBackground(new Color(0, 0, 51));
		btnBack.setBounds(12, 23, 89, 23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherProfile obj = new TeacherProfile(email);
				obj.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnBack);
		
		JButton btnLogOut = new JButton("Logout");
		btnLogOut.setBounds(12, 57, 89, 23);
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
		lblSecurityPin.setBounds(103, 80, 127, 23);
		contentPane.add(lblSecurityPin);
		
		
		
		tpin = new TextField();
		tpin.setText(Integer.toString(ob.pin));
		tpin.setBounds(259, 80, 276, 24);
		contentPane.add(tpin);
		
		
		
		tphone = new TextField();
		tphone.setText(ob.phone);
		tphone.setBounds(260, 125, 275, 24);
		contentPane.add(tphone);
		
		tpermanent = new TextField();
		tpermanent.setText(ob.permanentAd);
		tpermanent.setBounds(260, 169, 276, 24);
		contentPane.add(tpermanent);
		
		tpresent = new TextField();
		tpresent.setText(ob.presentAd);
		tpresent.setBounds(259, 215, 276, 24);
		contentPane.add(tpresent);
		
		JLabel lblPermanentAdress = new JLabel("Permanent Adress :");
		lblPermanentAdress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPermanentAdress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPermanentAdress.setBounds(82, 169, 147, 16);
		contentPane.add(lblPermanentAdress);
		
		
		
		JLabel lblPhone = new JLabel("Phone :");
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhone.setBounds(132, 133, 98, 16);
		contentPane.add(lblPhone);
		
		JLabel lblPresentAdress = new JLabel("Present Adress :");
		lblPresentAdress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPresentAdress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPresentAdress.setBounds(97, 216, 133, 16);
		contentPane.add(lblPresentAdress);
		
		JButton btnDone = new JButton("Done");
		btnDone.setForeground(new Color(255, 255, 204));
		btnDone.setBackground(new Color(0, 0, 51));
		btnDone.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pin=Integer.parseInt(tpin.getText());
				
				phone=tphone.getText();
				permanent=tpermanent.getText();
				present=tpresent.getText();
				int sn=ob.sn;
				
				
				UpdateData obj =new UpdateData();
				obj.updateTeacherAllData(pin, phone, permanent, present, sn);
				System.out.println("update ok");
				TeacherProfile obj1 = new TeacherProfile(email);
				obj1.setVisible(true);
				dispose();
				
				
				
				
				
			}
		});
		btnDone.setBounds(259, 264, 89, 23);
		contentPane.add(btnDone);
		
		JLabel label = new JLabel("***********************************************");
		label.setBounds(218, 38, 276, 14);
		contentPane.add(label);
		
		
		JLabel Piclabel = new JLabel("");
		Piclabel.setBounds(0, 0, 672, 412);
		Piclabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		contentPane.add(Piclabel);
	}
}
