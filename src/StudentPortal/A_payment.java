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

import org.omg.CORBA.FloatSeqHelper;
import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;

public class A_payment extends JFrame {

	private JPanel contentPane;
	
	JPanel panel = new JPanel();
	JLabel idlbl = new JLabel("");
	JLabel paidL = new JLabel("");
	JLabel DueL = new JLabel("");
	
	int TAmount=737000;
	int TDue=0;
	int Tpaid=0;
	String id;
	private JTextField IdField;
	private JTextField addAmount;

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
	public A_payment() {
		
				
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
				AdministratorPage obj = new AdministratorPage();
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
		
		JButton Search = new JButton("Search");
		Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentOutput ob = new StudentOutput();
				id = IdField.getText();
				IdField.setText("");
				ob.payment(id);
				Tpaid=ob.amount;
				TDue=TAmount-Tpaid;
				panel.setVisible(true);
				idlbl.setText(id);
				paidL.setText(Integer.toString(Tpaid));
				if(Tpaid==0)
				{
					DueL.setText(Integer.toString(0));
				}
				else {
					DueL.setText(Integer.toString(TDue));
				}
				
				
			}
		});
		
		IdField = new JTextField();
		IdField.setBounds(273, 64, 179, 23);
		contentPane.add(IdField);
		IdField.setColumns(10);
		Search.setForeground(new Color(255, 255, 204));
		Search.setFont(new Font("Tahoma", Font.BOLD, 12));
		Search.setFocusPainted(false);
		Search.setBackground(new Color(0, 0, 51));
		Search.setBounds(319, 98, 89, 23);
		contentPane.add(Search);
		
		JLabel lblPayment = new JLabel("Payment");
		lblPayment.setHorizontalAlignment(SwingConstants.CENTER);
		lblPayment.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPayment.setBounds(243, 10, 165, 32);
		contentPane.add(lblPayment);
		btnHome.setBounds(10, 50, 89, 23);
		contentPane.add(btnHome);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Student ID :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(115, 61, 148, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("*******************************");
		label.setBounds(243, 41, 209, 14);
		contentPane.add(label);
		
		
		panel.setVisible(false);
		panel.setBounds(99, 132, 490, 230);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTotalPaid = new JLabel("Total Paid :");
		lblTotalPaid.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotalPaid.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalPaid.setBounds(62, 56, 97, 25);
		panel.add(lblTotalPaid);
		
		
		paidL.setHorizontalAlignment(SwingConstants.LEFT);
		paidL.setFont(new Font("Tahoma", Font.BOLD, 13));
		paidL.setBounds(169, 61, 134, 18);
		panel.add(paidL);
		
		JLabel lblTotalDue = new JLabel("Total Due  :");
		lblTotalDue.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalDue.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotalDue.setBounds(62, 78, 97, 25);
		panel.add(lblTotalDue);
		
		
		DueL.setHorizontalAlignment(SwingConstants.LEFT);
		DueL.setFont(new Font("Tahoma", Font.BOLD, 13));
		DueL.setBounds(169, 82, 134, 18);
		panel.add(DueL);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Amount to Add");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(99, 114, 164, 25);
		panel.add(lblNewLabel_2);
		
		addAmount = new JTextField();
		addAmount.setHorizontalAlignment(SwingConstants.LEFT);
		addAmount.setFont(new Font("Tahoma", Font.BOLD, 13));
		addAmount.setBounds(109, 138, 149, 20);
		panel.add(addAmount);
		addAmount.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ID :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(103, 40, 46, 18);
		panel.add(lblNewLabel_3);
		
		
		
		idlbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		idlbl.setBounds(169, 40, 154, 18);
		panel.add(idlbl);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StudentOutput ob = new StudentOutput();
				ob.payment(id);
				UpdateData obj= new UpdateData();
				obj.updatePayment(id, ob.amount+Integer.valueOf(addAmount.getText()));
				
				ob.payment(id);
				TDue=TAmount-ob.amount;
				idlbl.setText(id);
				paidL.setText(Integer.toString(ob.amount));
				DueL.setText(Integer.toString(TDue));
				addAmount.setText("");
				
				
			}
		});
		btnAdd.setForeground(new Color(255, 255, 204));
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdd.setFocusPainted(false);
		btnAdd.setBackground(new Color(0, 0, 51));
		btnAdd.setBounds(190, 169, 89, 23);
		panel.add(btnAdd);
		
		JButton btnCancle = new JButton("Cancle");
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				id="";
				Tpaid=0;
				TDue=737000;			
				panel.setVisible(false);
			}
		});
		btnCancle.setForeground(new Color(255, 255, 204));
		btnCancle.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancle.setFocusPainted(false);
		btnCancle.setBackground(new Color(0, 0, 51));
		btnCancle.setBounds(80, 169, 89, 23);
		panel.add(btnCancle);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 672, 412);
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("StudentPagePic1.jpg")));
		contentPane.add(lblNewLabel);
		
	}
}
