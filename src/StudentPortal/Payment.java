package StudentPortal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Payment extends JFrame {

	private JPanel contentPane;
	
	JLabel tAmount;
	JLabel tDue;
	JLabel pAmount;
	
	String email;
	int TAmount=737000;
	int TDue=0;

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
	 * @param id 
	 */
	public Payment(String id) {
		
		StudentOutput ob = new StudentOutput();
		ob.payment(id);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		btnBack.setBounds(10, 16, 89, 23);
		contentPane.add(btnBack);
		
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
		
		JLabel lblPayment = new JLabel("Payment");
		lblPayment.setHorizontalAlignment(SwingConstants.CENTER);
		lblPayment.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPayment.setBounds(243, 20, 165, 32);
		contentPane.add(lblPayment);
		btnHome.setBounds(10, 45, 89, 23);
		contentPane.add(btnHome);
		
		JLabel lblPaidAmount = new JLabel("Paid Amount :");
		lblPaidAmount.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPaidAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPaidAmount.setBounds(87, 139, 106, 23);
		contentPane.add(lblPaidAmount);
		
		JLabel lblTotalAmount = new JLabel("Total Amount :");
		lblTotalAmount.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotalAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalAmount.setBounds(87, 105, 106, 23);
		contentPane.add(lblTotalAmount);
		
		JLabel lblTatalDue = new JLabel("Tatal Due :");
		lblTatalDue.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTatalDue.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTatalDue.setBounds(87, 173, 106, 23);
		contentPane.add(lblTatalDue);
		
		tAmount = new JLabel("");
		tAmount.setText(Integer.toString(TAmount));
		tAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		tAmount.setFont(new Font("Tahoma", Font.BOLD, 12));
		tAmount.setBounds(206, 105, 250, 23);
		contentPane.add(tAmount);
		
		pAmount = new JLabel("");
		pAmount.setText(Integer.toString(ob.amount));
		pAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		pAmount.setFont(new Font("Tahoma", Font.BOLD, 12));
		pAmount.setBounds(203, 144, 250, 23);
		contentPane.add(pAmount);
		
		JLabel label = new JLabel("*******************************");
		label.setBounds(243, 50, 209, 14);
		contentPane.add(label);
		TDue=TAmount-ob.amount;
		
		tDue = new JLabel("");
		tDue.setText(Integer.toString(TDue));
		tDue.setHorizontalAlignment(SwingConstants.RIGHT);
		tDue.setFont(new Font("Tahoma", Font.BOLD, 12));
		tDue.setBounds(203, 178, 250, 23);
		contentPane.add(tDue);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 672, 412);
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		contentPane.add(lblNewLabel);
	}

	
}
