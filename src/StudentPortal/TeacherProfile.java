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

public class TeacherProfile extends JFrame {

	private JPanel contentPane;
	public String email;
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
	Teacheroutput ob =new Teacheroutput();
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
	public TeacherProfile(String email) {
		
		
		this.email=email;
		ob.Output(email);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblStudentProfile = new JLabel("Teacher Profile");
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
				TeacherPage obj = new TeacherPage();
				obj.email=email;
				obj.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(10, 18, 89, 23);
		contentPane.add(btnBack);
		btnHome.setBounds(11, 49, 89, 23);
		contentPane.add(btnHome);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(137, 65, 89, 14);
		contentPane.add(lblName);
		
		namelv = new JLabel(" ");
		
		namelv.setFont(new Font("Tahoma", Font.BOLD, 12));
		namelv.setText(" ");
		namelv.setText(ob.name);
		namelv.setBounds(252, 65, 288, 14);
		contentPane.add(namelv);
		
		JLabel lblId = new JLabel("ID : ");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId.setBounds(183, 94, 46, 14);
		contentPane.add(lblId);
		
		idlv = new JLabel("");
		idlv.setFont(new Font("Tahoma", Font.BOLD, 12));
		idlv.setText("");
		idlv.setText(ob.id);
		idlv.setBounds(252, 94, 359, 14);
		contentPane.add(idlv);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setForeground(new Color(0, 0, 0));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(98, 121, 128, 14);
		contentPane.add(lblEmail);
		
		emaillv = new JLabel("");
		emaillv.setFont(new Font("Tahoma", Font.BOLD, 12));
		emaillv.setText("");
		emaillv.setText(ob.email);
		emaillv.setBounds(252, 121, 300, 14);
		contentPane.add(emaillv);
		
		JLabel lblDepartment = new JLabel("Department : ");
		lblDepartment.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDepartment.setBounds(96, 150, 133, 14);
		contentPane.add(lblDepartment);
		
		deptlv = new JLabel("");
		deptlv.setFont(new Font("Tahoma", Font.BOLD, 12));
		deptlv.setText("");
		deptlv.setText(ob.dept);
		deptlv.setBounds(252, 150, 305, 14);
		contentPane.add(deptlv);
		
		
		JLabel lblPhoneNo = new JLabel("Phone No:");
		lblPhoneNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhoneNo.setBounds(119, 177, 107, 14);
		contentPane.add(lblPhoneNo);
		
		phonelv = new JLabel("");
		phonelv.setFont(new Font("Tahoma", Font.BOLD, 12));
		phonelv.setText("");
		phonelv.setText(ob.phone);
		phonelv.setBounds(252, 177, 329, 14);
		contentPane.add(phonelv);
		
		JLabel lblPermanetAdress = new JLabel("Permanent Adress :");
		lblPermanetAdress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPermanetAdress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPermanetAdress.setBounds(86, 202, 140, 23);
		contentPane.add(lblPermanetAdress);
		
	    permanentlv = new JLabel("");
	    permanentlv.setFont(new Font("Tahoma", Font.BOLD, 12));
		permanentlv.setText("");
		permanentlv.setText(ob.permanentAd);
		permanentlv.setBounds(252, 200, 383, 23);
		contentPane.add(permanentlv);
		
		JLabel lblPresentAdress = new JLabel("Present Adress :");
		lblPresentAdress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPresentAdress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPresentAdress.setBounds(93, 237, 133, 14);
		contentPane.add(lblPresentAdress);
		
		JLabel label = new JLabel("************************************");
		label.setBounds(242, 38, 253, 14);
		contentPane.add(label);
		
		presentlv = new JLabel("");
		presentlv.setFont(new Font("Tahoma", Font.BOLD, 12));
		presentlv.setText("");
		presentlv.setText(ob.presentAd);
		presentlv.setBounds(252, 230, 394, 28);
		contentPane.add(presentlv);
		
		JButton btnEditProfile = new JButton("Edit Profile");
		btnEditProfile.setForeground(new Color(255, 255, 204));
		btnEditProfile.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEditProfile.setBackground(new Color(0, 0, 51));
		btnEditProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TeacherEditProfile obj = new TeacherEditProfile(email);
				obj.setVisible(true);
				dispose();
			}
		});
		btnEditProfile.setBounds(262, 297, 108, 23);
		contentPane.add(btnEditProfile);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 672, 373);
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		contentPane.add(lblNewLabel);
	}

}