package StudentPortal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class TNewPassword extends JFrame {

	private JPanel contentPane;
	private JPasswordField Npassword;
	private JPasswordField Cpassword;
	public String email;

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
	public TNewPassword(String email) {
		//System.out.println(email);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewPassword = new JLabel("New Password For Teacher");
		lblNewPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewPassword.setBounds(235, 11, 237, 26);
		contentPane.add(lblNewPassword);
		
		Npassword = new JPasswordField();
		Npassword.setBounds(271, 124, 223, 26);
		contentPane.add(Npassword);
		
		Cpassword = new JPasswordField();
		Cpassword.setBounds(271, 163, 223, 26);
		contentPane.add(Cpassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password :");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConfirmPassword.setBounds(122, 162, 124, 26);
		contentPane.add(lblConfirmPassword);
		
		JButton btnOk = new JButton("OK");
		btnOk.setForeground(new Color(255, 255, 204));
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnOk.setBackground(new Color(0, 0, 51));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NPassword = null;
				String CPassword = null;
				NPassword = Npassword.getText();
				CPassword = Cpassword.getText();
				System.out.println(NPassword);
				System.out.println(CPassword);
				
				Teacheroutput ob1= new Teacheroutput();
				ob1.Output(email);
				System.out.println(ob1.email);
				if(NPassword.equals("") && CPassword.equals(""))
				{
					
					JOptionPane.showMessageDialog(null,"Please Enter A Password");
					
				}
				else {
				if (NPassword.equals(CPassword))
				{
					
					UpdateData ob = new UpdateData();
					ob.updateTeacherPassword(NPassword, ob1.sn);
					LogIn obj = new LogIn();
					obj.setVisible(true);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Password not matched!!");
					Npassword.setText("");
					Cpassword.setText("");
				}
				}
				
			}
		});
		btnOk.setBounds(271, 214, 89, 23);
		contentPane.add(btnOk);
		
		JLabel label = new JLabel("********************************************************");
		label.setBounds(202, 34, 385, 14);
		contentPane.add(label);
		
		JLabel lblNewPassword_1 = new JLabel("New Password :");
		lblNewPassword_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewPassword_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewPassword_1.setBounds(117, 120, 124, 26);
		contentPane.add(lblNewPassword_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 672, 412);
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		contentPane.add(lblNewLabel);
	}

}