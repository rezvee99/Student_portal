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
import javax.swing.JTextField;
import java.awt.Color;

public class SearchStudent extends JFrame {

	private JPanel contentPane;
	private JTextField Id;
	String Email;
	JLabel namelb;
	JLabel idlb;
	JLabel deptlb;
	JLabel sectionlb;
	
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
	public SearchStudent(String email) {
		Email = email;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		btnHome.setForeground(new Color(255, 255, 204));
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnHome.setBackground(new Color(0, 0, 51));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage obj = new HomePage();
				obj.setVisible(true);
				dispose();
			}
		});
		
		JLabel lblSearchStudent = new JLabel("Search Student");
		lblSearchStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchStudent.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSearchStudent.setBounds(210, 20, 216, 30);
		contentPane.add(lblSearchStudent);
		btnHome.setBounds(10, 45, 89, 23);
		contentPane.add(btnHome);
		
		Id = new JTextField();
		Id.setBounds(166, 95, 247, 30);
		contentPane.add(Id);
		Id.setColumns(10);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setForeground(new Color(255, 255, 204));
		btnSearch.setBackground(new Color(0, 0, 51));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String id = Id.getText();
			StudentOutput ob =new StudentOutput(); 
			ob.IDOutput(id);
			namelb.setText(ob.name);
			idlb.setText(ob.id);
			deptlb.setText(ob.dept);
			sectionlb.setText(ob.section);
			
			
			
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSearch.setBounds(232, 147, 94, 30);
		contentPane.add(btnSearch);
		
		JLabel lblNewLabel_1 = new JLabel("Enter ID :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(77, 103, 65, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("*************************************");
		label.setBounds(220, 50, 260, 14);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(37, 204, 489, 158);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Name :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(10, 24, 67, 20);
		panel.add(lblNewLabel_2);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(20, 55, 57, 20);
		panel.add(lblId);
		
		JLabel lblDept = new JLabel("Dept. :");
		lblDept.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDept.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDept.setBounds(10, 86, 67, 20);
		panel.add(lblDept);
		
		JLabel lblSection = new JLabel("Section:");
		lblSection.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSection.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSection.setBounds(10, 109, 67, 20);
		panel.add(lblSection);
		
		namelb = new JLabel("");
		namelb.setBounds(101, 24, 229, 20);
		panel.add(namelb);
		
	    idlb = new JLabel("");
		idlb.setBounds(101, 59, 229, 20);
		panel.add(idlb);
		
		deptlb = new JLabel("");
		deptlb.setBounds(101, 90, 229, 20);
		panel.add(deptlb);
		
		sectionlb = new JLabel("");
		sectionlb.setBounds(101, 113, 229, 20);
		panel.add(sectionlb);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(0, 0, 672, 412);
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		contentPane.add(lblNewLabel);
	}
}
