package ml_2015;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;

public class MainFrame {

	private JFrame frmUstore;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmUstore.setVisible(true);
					window.frmUstore.setSize(1200,600);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmUstore = new JFrame();
		frmUstore.setBackground(new Color(0, 0, 128));
		frmUstore.getContentPane().setFont(new Font("Arial", Font.PLAIN, 11));
		frmUstore.setFont(new Font("Arial", Font.PLAIN, 15));
		frmUstore.setTitle("uStore");
		frmUstore.setBounds(100, 100, 450, 300);
		frmUstore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUstore.getContentPane().setLayout(null);
		
		JLabel lblUstore = new JLabel("uStore");
		lblUstore.setFont(new Font("Arial", Font.PLAIN, 40));
		lblUstore.setBounds(100, 50, 200, 60);
		frmUstore.getContentPane().add(lblUstore);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(800, 153, 65, 20);
		frmUstore.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(800, 203, 65, 20);
		frmUstore.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 12));
		txtUsername.setBounds(900, 150, 150, 25);
		frmUstore.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 12));
		passwordField.setBounds(900, 200, 150, 25);
		frmUstore.getContentPane().add(passwordField);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setBackground(new Color(30, 144, 255));
		btnLogIn.setForeground(Color.white);
		btnLogIn.setFont(new Font("Arial", Font.PLAIN, 12));
		btnLogIn.setBounds(925, 250, 100, 25);
		frmUstore.getContentPane().add(btnLogIn);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 540, 1200, 7);
		frmUstore.getContentPane().add(separator_3);
		
		JLabel label_10 = new JLabel("Copyright uStore A.E. 2015");
		label_10.setHorizontalTextPosition(SwingConstants.LEFT);
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setFont(new Font("Arial", Font.PLAIN, 10));
		label_10.setBackground(Color.DARK_GRAY);
		label_10.setBounds(10, 545, 434, 14);
		frmUstore.getContentPane().add(label_10);
	}
}
