package StudentPortal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class StudentProfile extends JFrame {

	private JPanel contentPane;
	//String email="mdrezvee@gmail.com";
	String email;
	JLabel namelv;
	JLabel idlv;
	JLabel emaillv;
	JLabel deptlv;
	JLabel sectionlv;
	JLabel fatherlv;
	JLabel motherlv;
	JLabel phonelv;
	JLabel permanentlv;
	JLabel presentlv;
	StudentOutput ob =new StudentOutput();
	

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
	public StudentProfile(String email) {
		//System.out.println("profile page "+email);
		
		this.email=email;
		ob.Output(email);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudentProfile = new JLabel("Student Profile");
		lblStudentProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentProfile.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStudentProfile.setForeground(new Color(0, 0, 0));
		lblStudentProfile.setBounds(218, 11, 215, 32);
		contentPane.add(lblStudentProfile);
		
		JButton btnHome = new JButton("Log Out");
		btnHome.setBackground(new Color(0, 0, 51));
		btnHome.setForeground(new Color(255, 255, 204));
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage obj = new HomePage();
				obj.setVisible(true);
				dispose();
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setFocusPainted(false);
		btnBack.setForeground(new Color(255, 255, 204));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setBackground(new Color(0, 0, 51));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentPage obj = new StudentPage(email);
				obj.email=email;
				obj.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(10, 18, 89, 23);
		contentPane.add(btnBack);
		btnHome.setBounds(11, 51, 89, 23);
		contentPane.add(btnHome);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(146, 65, 89, 14);
		contentPane.add(lblName);
		
		namelv = new JLabel(" ");
		
		namelv.setFont(new Font("Tahoma", Font.BOLD, 12));
		namelv.setText("");
		namelv.setText(ob.name);
		namelv.setBounds(260, 66, 288, 14);
		contentPane.add(namelv);
		
		JLabel lblId = new JLabel("ID : ");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId.setBounds(159, 90, 79, 14);
		contentPane.add(lblId);
		
		idlv = new JLabel("");
		idlv.setText(ob.id);
		idlv.setFont(new Font("Tahoma", Font.BOLD, 12));
		idlv.setBounds(260, 91, 359, 14);
		contentPane.add(idlv);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(146, 115, 89, 14);
		contentPane.add(lblEmail);
		
		emaillv = new JLabel("");
		emaillv.setText(ob.email);
		emaillv.setFont(new Font("Tahoma", Font.BOLD, 12));
		emaillv.setBounds(260, 116, 300, 14);
		contentPane.add(emaillv);
		
		JLabel lblDepartment = new JLabel("Department : ");
		lblDepartment.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDepartment.setBounds(95, 140, 144, 14);
		contentPane.add(lblDepartment);
		
		deptlv = new JLabel("");
		deptlv.setText(ob.dept);
		deptlv.setFont(new Font("Tahoma", Font.BOLD, 12));
		deptlv.setBounds(260, 141, 305, 14);
		contentPane.add(deptlv);
		
		JLabel lblSection = new JLabel("Section : ");
		lblSection.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSection.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSection.setBounds(95, 165, 144, 14);
		contentPane.add(lblSection);
		
		sectionlv = new JLabel("");
		sectionlv.setText(ob.section);
		sectionlv.setFont(new Font("Tahoma", Font.BOLD, 12));
		sectionlv.setBounds(260, 166, 281, 14);
		contentPane.add(sectionlv);
		
		JLabel lblFathersName = new JLabel("Father's Name :");
		lblFathersName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFathersName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFathersName.setBounds(123, 190, 130, 14);
		contentPane.add(lblFathersName);
		
		fatherlv = new JLabel("");
		fatherlv.setText(ob.fatherName);
		fatherlv.setFont(new Font("Tahoma", Font.BOLD, 12));
		fatherlv.setBounds(260, 191, 272, 14);
		contentPane.add(fatherlv);
		
		JLabel lblNewLabel_1 = new JLabel("Mother's Name : ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(77, 215, 161, 14);
		contentPane.add(lblNewLabel_1);
		
		motherlv = new JLabel("");
		motherlv.setText(ob.motherName);
		motherlv.setFont(new Font("Tahoma", Font.BOLD, 12));
		motherlv.setBounds(260, 216, 254, 14);
		contentPane.add(motherlv);
		
		JLabel lblPhoneNo = new JLabel("Phone No :");
		lblPhoneNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhoneNo.setBounds(74, 240, 161, 14);
		contentPane.add(lblPhoneNo);
		
		phonelv = new JLabel("");
		phonelv.setText(ob.phone);
		phonelv.setHorizontalAlignment(SwingConstants.LEFT);
		phonelv.setFont(new Font("Tahoma", Font.BOLD, 12));
		phonelv.setBounds(258, 241, 329, 14);
		contentPane.add(phonelv);
		
		JLabel lblPermanetAdress = new JLabel("Permanent Adress :");
		lblPermanetAdress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPermanetAdress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPermanetAdress.setBounds(69, 264, 168, 23);
		contentPane.add(lblPermanetAdress);
		
	    permanentlv = new JLabel("");
	    permanentlv.setText(ob.permanentAd);
	    permanentlv.setFont(new Font("Tahoma", Font.BOLD, 12));
		permanentlv.setBounds(259, 263, 392, 23);
		contentPane.add(permanentlv);
		
		JLabel lblPresentAdress = new JLabel("Present Adress :");
		lblPresentAdress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPresentAdress.setBounds(136, 300, 114, 14);
		contentPane.add(lblPresentAdress);
		
		presentlv = new JLabel("");
		presentlv.setText(ob.presentAd);
		presentlv.setFont(new Font("Tahoma", Font.BOLD, 12));
		presentlv.setBounds(257, 291, 394, 28);
		contentPane.add(presentlv);
		
		JButton btnEditProfile = new JButton("Edit Profile");
		btnEditProfile.setBackground(new Color(0, 0, 51));
		btnEditProfile.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEditProfile.setForeground(new Color(255, 255, 204));
		btnEditProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				StudentEditProfile ob= new StudentEditProfile(email);
				ob.setVisible(true);
				dispose();
			}
		});
		
		JLabel label = new JLabel("***************************************");
		label.setBounds(220, 40, 272, 14);
		contentPane.add(label);
		btnEditProfile.setBounds(251, 336, 144, 23);
		contentPane.add(btnEditProfile);
		
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 672, 373);
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		contentPane.add(lblNewLabel);
		
		
	}
}
