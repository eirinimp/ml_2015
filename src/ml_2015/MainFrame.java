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

public class MainFrame {

	private JFrame frmUstore;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmUstore.setVisible(true);
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
		frmUstore.setForeground(Color.DARK_GRAY);
		frmUstore.setFont(new Font("Arial", Font.PLAIN, 15));
		frmUstore.setTitle("uStore");
		frmUstore.setBounds(100, 100, 450, 300);
		frmUstore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUstore.getContentPane().setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(305, 79, 86, 20);
		frmUstore.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(305, 110, 86, 20);
		frmUstore.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(230, 82, 65, 14);
		frmUstore.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(230, 113, 65, 14);
		frmUstore.getContentPane().add(lblPassword);
		
		JLabel lblUstore = new JLabel("uStore");
		lblUstore.setFont(new Font("Arial", Font.PLAIN, 30));
		lblUstore.setBounds(50, 22, 107, 55);
		frmUstore.getContentPane().add(lblUstore);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setForeground(Color.DARK_GRAY);
		btnLogIn.setFont(new Font("Arial", Font.PLAIN, 12));
		btnLogIn.setBounds(305, 151, 89, 23);
		frmUstore.getContentPane().add(btnLogIn);
		
		JLabel lblCopyrightsUstoreAe = new JLabel("Copyright uStore A.E. 2015");
		lblCopyrightsUstoreAe.setBackground(Color.DARK_GRAY);
		lblCopyrightsUstoreAe.setHorizontalTextPosition(SwingConstants.LEFT);
		lblCopyrightsUstoreAe.setHorizontalAlignment(SwingConstants.LEFT);
		lblCopyrightsUstoreAe.setFont(new Font("Arial", Font.PLAIN, 10));
		lblCopyrightsUstoreAe.setBounds(0, 247, 434, 14);
		frmUstore.getContentPane().add(lblCopyrightsUstoreAe);
	}
}
