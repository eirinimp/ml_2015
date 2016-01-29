package ml_2015;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
	
public class MainFrame {
	
	public String typeOfUser;
	public String nameOfUser;
	
	private JTable table;
		
	private JTextField new_product_textField_1;
	private JTextField new_product_textField_2;
	private JTextField new_product_textField_3;
	private JTextField new_product_textField_4;
	private JTextField new_product_textField_5;
	private JTextField new_product_textField_6;
	private JTextField new_product_textField_7;
	private JTextField search_textField;
	private JLabel lblUstore;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel label_0;
	private JLabel label_1;
	private JLabel label_12;
	private JLabel label_2;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_3;
	private JLabel label_32;
	private JLabel label_33;
	private JLabel label_4;
	private JLabel label_42;
	private JLabel label_5;
	private JLabel label_52;
	private JLabel label_53;
	private JLabel label_task_1;
	private JLabel label_task_2;
	private JLabel label_task_3;
	private JLabel label_task_4;
	private JLabel label_task_5;
	private JLabel new_product_label_1;
	private JLabel new_product_label_2;
	private JLabel new_product_label_3;
	private JLabel new_product_label_4;
	private JLabel new_product_label_5;
	private JLabel new_product_label_6;
	private JLabel new_product_label_7;
	private JLabel new_product_label_done;
	private JLabel label_10;
	private JLabel label_conn_error;
	
	private JButton button_00;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton btnLogIn;
	private JButton new_product_button;
	private JButton button_02;
	private JButton search_btn;
	
	private JSeparator separator;
	private JSeparator separator_2;
	private JSeparator separator_3;
	
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
		frmUstore.setIconImage(Toolkit.getDefaultToolkit().getImage("src\\icons\\logo.png"));
		frmUstore.setBackground(new Color(0, 0, 128));
		frmUstore.getContentPane().setFont(new Font("Arial", Font.PLAIN, 11));
		frmUstore.setFont(new Font("Arial", Font.PLAIN, 15));
		frmUstore.setTitle("uStore");
		frmUstore.setBounds(100, 100, 450, 300);
		frmUstore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUstore.getContentPane().setLayout(null);
		frmUstore.setResizable(false);
		
		lblUstore = new JLabel("uStore");
		lblUstore.setFont(new Font("Arial", Font.PLAIN, 40));
		lblUstore.setBounds(100, 60, 200, 60);
		frmUstore.getContentPane().add(lblUstore);
		
		lblUsername = new JLabel("Username");
		lblUsername.setBounds(780, 120, 65, 20);
		frmUstore.getContentPane().add(lblUsername);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(780, 160, 65, 20);
		frmUstore.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 12));
		txtUsername.setBounds(860, 120, 130, 25);
		frmUstore.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 12));
		passwordField.setBounds(860, 160, 130, 25);
		frmUstore.getContentPane().add(passwordField);
		
		label_conn_error = new JLabel("Error!");
		label_conn_error.setBounds(820, 250, 65, 20);
		frmUstore.getContentPane().add(label_conn_error);
		label_conn_error.setVisible(false);
		
		button_00 = new JButton("");
		button_00.setFont(new Font("Arial", Font.PLAIN, 12));
		button_00.setIcon(new ImageIcon("src\\icons\\logo.png"));
		button_00.setBackground(Color.WHITE);
		button_00.setBounds(0, 0, 50, 50);
		frmUstore.getContentPane().add(button_00);
		button_00.setVisible(false);

		label_0 = new JLabel("");
		label_0.setFont(new Font("Arial", Font.BOLD, 12));
		label_0.setBounds(1100, 20, 80, 15);
		frmUstore.getContentPane().add(label_0);
		
		separator = new JSeparator();
		separator.setBounds(0, 51, 1200, 7);
		frmUstore.getContentPane().add(separator);
		separator.setVisible(false);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(0, 85, 1500, 7);
		frmUstore.getContentPane().add(separator_2);
		separator_2.setVisible(false);
		
		button_1 = new JButton("");
		button_1.setIcon(new ImageIcon("src\\icons\\add.png"));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(100, 180, 125, 125);
		frmUstore.getContentPane().add(button_1);
		button_1.setVisible(false);
		
		button_2 = new JButton("");
		button_2.setIcon(new ImageIcon("src\\icons\\screen.png"));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(305, 180, 125, 125);
		frmUstore.getContentPane().add(button_2);
		button_2.setVisible(false);

		button_3 = new JButton("");
		button_3.setIcon(new ImageIcon("src\\icons\\edit.png"));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(510, 180, 125, 125);
		frmUstore.getContentPane().add(button_3);
		button_3.setVisible(false);

		button_4 = new JButton("");
		button_4.setIcon(new ImageIcon("src\\icons\\search_1.png"));
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(715, 180, 125, 125);
		frmUstore.getContentPane().add(button_4);
		button_4.setVisible(false);

		button_5 = new JButton("");
		button_5.setIcon(new ImageIcon("src\\icons\\statistics.png"));
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(920, 180, 125, 125);
		frmUstore.getContentPane().add(button_5);
		button_5.setVisible(false);
		
		label_1 = new JLabel("ƒ«Ã…œ’—√…¡");
		label_1.setFont(new Font("Arial", Font.PLAIN, 15));
		label_1.setBounds(120, 310, 150, 70);
		frmUstore.getContentPane().add(label_1);
		label_1.setVisible(false);

		label_12 = new JLabel("Õ≈œ’ –—œ⁄œÕ‘œ”");
		label_12.setFont(new Font("Arial", Font.PLAIN, 15));
		label_12.setBounds(98, 330, 150, 70);
		frmUstore.getContentPane().add(label_12);
		label_12.setVisible(false);

		label_2 = new JLabel("–—œ¬œÀ«");
		label_2.setFont(new Font("Arial", Font.PLAIN, 15));
		label_2.setBounds(330, 300, 150, 70);
		frmUstore.getContentPane().add(label_2);
		label_2.setVisible(false);

		label_22 = new JLabel("¡–œ»≈Ã¡‘œ”");
		label_22.setFont(new Font("Arial", Font.PLAIN, 15));
		label_22.setBounds(318, 320, 150, 70);
		frmUstore.getContentPane().add(label_22);
		label_22.setVisible(false);

		label_23 = new JLabel("–—œ⁄œÕ‘œ”");
		label_23.setFont(new Font("Arial", Font.PLAIN, 15));
		label_23.setBounds(325, 340, 150, 70);
		frmUstore.getContentPane().add(label_23);
		label_23.setVisible(false);

		label_3 = new JLabel("≈–≈Œ≈—√¡”…¡");
		label_3.setFont(new Font("Arial", Font.PLAIN, 15));
		label_3.setBounds(525, 300, 150, 70);
		frmUstore.getContentPane().add(label_3);
		label_3.setVisible(false);

		label_32 = new JLabel("¡–œ»≈Ã¡‘œ”");
		label_32.setFont(new Font("Arial", Font.PLAIN, 15));
		label_32.setBounds(521, 320, 150, 70);
		frmUstore.getContentPane().add(label_32);
		label_32.setVisible(false);

		label_33 = new JLabel("–—œ⁄œÕ‘œ”");
		label_33.setFont(new Font("Arial", Font.PLAIN, 15));
		label_33.setBounds(528, 340, 150, 70);
		frmUstore.getContentPane().add(label_33);
		label_33.setVisible(false);

		label_4 = new JLabel("¡Õ¡∆«‘«”« ”‘¡");
		label_4.setFont(new Font("Arial", Font.PLAIN, 15));
		label_4.setBounds(720, 310, 150, 70);
		frmUstore.getContentPane().add(label_4);
		label_4.setVisible(false);

		label_42 = new JLabel("¡–œ»≈Ã¡‘¡");
		label_42.setFont(new Font("Arial", Font.PLAIN, 15));
		label_42.setBounds(730, 330, 150, 70);
		frmUstore.getContentPane().add(label_42);
		label_42.setVisible(false);

		label_5 = new JLabel("≈Ã÷¡Õ…”«");
		label_5.setFont(new Font("Arial", Font.PLAIN, 15));
		label_5.setBounds(945, 300, 150, 70);
		frmUstore.getContentPane().add(label_5);
		label_5.setVisible(false);

		label_52 = new JLabel("”‘¡‘…”‘… ŸÕ");
		label_52.setFont(new Font("Arial", Font.PLAIN, 15));
		label_52.setBounds(938, 320, 150, 70);
		frmUstore.getContentPane().add(label_52);
		label_52.setVisible(false);

		label_53 = new JLabel("”‘œ…◊≈…ŸÕ");
		label_53.setFont(new Font("Arial", Font.PLAIN, 15));
		label_53.setBounds(945, 340, 150, 70);
		frmUstore.getContentPane().add(label_53);
		label_53.setVisible(false);
		
		label_task_1 = new JLabel("ƒ«Ã…œ’—√…¡ Õ≈œ’ –—œ⁄œÕ‘œ”");
		label_task_1.setBounds(10, 55, 500, 25);
		label_task_1.setBackground(Color.DARK_GRAY);
		label_task_1.setForeground(Color.DARK_GRAY);
		label_task_1.setFont(new Font("Arial", Font.PLAIN, 20));
		frmUstore.getContentPane().add(label_task_1);
		label_task_1.setVisible(false);
		
		label_task_2 = new JLabel("–—œ¬œÀ« ¡–œ»≈Ã¡‘œ” –—œ⁄œÕ‘œ”");
		label_task_2.setBounds(10, 55, 500, 25);
		label_task_2.setBackground(Color.DARK_GRAY);
		label_task_2.setForeground(Color.DARK_GRAY);
		label_task_2.setFont(new Font("Arial", Font.PLAIN, 20));
		frmUstore.getContentPane().add(label_task_2);
		label_task_2.setVisible(false);
		
		label_task_3 = new JLabel("≈–≈Œ≈—√¡”…¡ ¡–œ»≈Ã¡‘œ” –—œ⁄œÕ‘œ”");
		label_task_3.setBounds(10, 55, 500, 25);
		label_task_3.setBackground(Color.DARK_GRAY);
		label_task_3.setForeground(Color.DARK_GRAY);
		label_task_3.setFont(new Font("Arial", Font.PLAIN, 20));
		frmUstore.getContentPane().add(label_task_3);
		label_task_3.setVisible(false);
		
		label_task_4 = new JLabel("¡Õ¡∆«‘«”« ”‘¡ ¡–œ»≈Ã¡‘¡");
		label_task_4.setBounds(10, 55, 500, 25);
		label_task_4.setBackground(Color.DARK_GRAY);
		label_task_4.setForeground(Color.DARK_GRAY);
		label_task_4.setFont(new Font("Arial", Font.PLAIN, 20));
		frmUstore.getContentPane().add(label_task_4);
		label_task_4.setVisible(false);
		
		label_task_5 = new JLabel("≈Ã÷¡Õ…”« ”‘¡‘…”‘… ŸÕ ”‘œ…◊≈…ŸÕ");
		label_task_5.setBounds(10, 55, 500, 25);
		label_task_5.setBackground(Color.DARK_GRAY);
		label_task_5.setForeground(Color.DARK_GRAY);
		label_task_5.setFont(new Font("Arial", Font.PLAIN, 20));
		frmUstore.getContentPane().add(label_task_5);
		label_task_5.setVisible(false);
		
		new_product_button = new JButton("ƒ«Ã…œ’—√…¡");
		new_product_button.setBackground(new Color(30, 144, 255));
		new_product_button.setForeground(Color.white);
		new_product_button.setFont(new Font("Arial", Font.PLAIN, 12));
		new_product_button.setBounds(600, 420, 120, 25);
		frmUstore.getContentPane().add(new_product_button);
		new_product_button.setVisible(false);
		
		new_product_label_done = new JLabel("\u2713 « ‰ÁÏÈÔıÒ„ﬂ· Ì›Ôı ÒÔ˙¸ÌÙÔÚ ›„ÈÌÂ ÏÂ ÂÈÙı˜ﬂ·!");
		new_product_label_done.setFont(new Font("Arial", Font.PLAIN, 16));
		new_product_label_done.setBounds(480, 480, 350, 25);
		new_product_label_done.setForeground(Color.GREEN);
		frmUstore.getContentPane().add(new_product_label_done);
		new_product_label_done.setVisible(false);
		
		btnLogIn = new JButton("”’Õƒ≈”«");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				connectToDB(txtUsername.getText(), passwordField.getPassword());
				if ( typeOfUser.equals("admin") ){
					lblUstore.setVisible(false);
					lblUsername.setVisible(false);
					lblPassword.setVisible(false);
					txtUsername.setVisible(false);
					passwordField.setVisible(false);
					btnLogIn.setVisible(false);
					button_00.setVisible(true);
					label_0.setVisible(true);
					separator.setVisible(true);
					button_1.setVisible(true);
					button_2.setVisible(true);
					button_3.setVisible(true);
					button_4.setVisible(true);
					button_5.setVisible(true);
					label_1.setVisible(true);
					label_12.setVisible(true);
					label_2.setVisible(true);
					label_22.setVisible(true);
					label_23.setVisible(true);
					label_3.setVisible(true);
					label_32.setVisible(true);
					label_33.setVisible(true);
					label_4.setVisible(true);
					label_42.setVisible(true);
					label_5.setVisible(true);
					label_52.setVisible(true);
					label_53.setVisible(true);
					
					button_1.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							button_1.setVisible(false);
							button_2.setVisible(false);
							button_3.setVisible(false);
							button_4.setVisible(false);
							button_5.setVisible(false);
							label_1.setVisible(false);
							label_12.setVisible(false);
							label_2.setVisible(false);
							label_22.setVisible(false);
							label_23.setVisible(false);
							label_3.setVisible(false);
							label_32.setVisible(false);
							label_33.setVisible(false);
							label_4.setVisible(false);
							label_42.setVisible(false);
							label_5.setVisible(false);
							label_52.setVisible(false);
							label_53.setVisible(false);
							
							label_task_1.setVisible(true);
							separator_2.setVisible(true);
							
							new_product_label_1 = new JLabel("‘ﬂÙÎÔÚ");
							new_product_label_1.setFont(new Font("Arial", Font.PLAIN, 15));
							new_product_label_1.setBounds(450, 120, 100, 25);
							frmUstore.getContentPane().add(new_product_label_1);
							
							new_product_label_2 = new JLabel("Barcode");
							new_product_label_2.setFont(new Font("Arial", Font.PLAIN, 15));
							new_product_label_2.setBounds(450, 160, 100, 25);
							frmUstore.getContentPane().add(new_product_label_2);
							
							new_product_label_3 = new JLabel(" ·ÙÁ„ÔÒﬂ·");
							new_product_label_3.setFont(new Font("Arial", Font.PLAIN, 15));
							new_product_label_3.setBounds(450, 200, 100, 25);
							frmUstore.getContentPane().add(new_product_label_3);
							
							new_product_label_4 = new JLabel("’ÔÍ·ÙÁ„ÔÒﬂ·");
							new_product_label_4.setFont(new Font("Arial", Font.PLAIN, 15));
							new_product_label_4.setBounds(450, 240, 100, 25);
							frmUstore.getContentPane().add(new_product_label_4);
							
							new_product_label_5 = new JLabel("‘ÈÏﬁ");
							new_product_label_5.setFont(new Font("Arial", Font.PLAIN, 15));
							new_product_label_5.setBounds(450, 280, 100, 25);
							frmUstore.getContentPane().add(new_product_label_5);
							
							new_product_label_6 = new JLabel("÷.–.¡.");
							new_product_label_6.setFont(new Font("Arial", Font.PLAIN, 15));
							new_product_label_6.setBounds(450, 320, 100, 25);
							frmUstore.getContentPane().add(new_product_label_6);
							
							new_product_label_7 = new JLabel("–ÔÛ¸ÙÁÙ·");
							new_product_label_7.setFont(new Font("Arial", Font.PLAIN, 15));
							new_product_label_7.setBounds(450, 360, 100, 25);
							frmUstore.getContentPane().add(new_product_label_7);
							
							new_product_textField_1 = new JTextField();
							new_product_textField_1.setColumns(10);
							new_product_textField_1.setBounds(570, 120, 200, 25);
							frmUstore.getContentPane().add(new_product_textField_1);
							
							new_product_textField_2 = new JTextField();
							new_product_textField_2.setColumns(10);
							new_product_textField_2.setBounds(570, 160, 200, 25);
							frmUstore.getContentPane().add(new_product_textField_2);
							
							new_product_textField_3 = new JTextField();
							new_product_textField_3.setColumns(10);
							new_product_textField_3.setBounds(570, 200, 200, 25);
							frmUstore.getContentPane().add(new_product_textField_3);
							
							new_product_textField_4 = new JTextField();
							new_product_textField_4.setColumns(10);
							new_product_textField_4.setBounds(570, 240, 200, 25);
							frmUstore.getContentPane().add(new_product_textField_4);
							
							new_product_textField_5 = new JTextField();
							new_product_textField_5.setColumns(10);
							new_product_textField_5.setBounds(570, 280, 200, 25);
							frmUstore.getContentPane().add(new_product_textField_5);
							
							new_product_textField_6 = new JTextField();
							new_product_textField_6.setColumns(10);
							new_product_textField_6.setBounds(570, 320, 200, 25);
							frmUstore.getContentPane().add(new_product_textField_6);
							//new_product_textField_6.setHorizontalAlignment(JTextField.RIGHT);
							
							new_product_textField_7 = new JTextField();
							new_product_textField_7.setColumns(10);
							new_product_textField_7.setBounds(570, 360, 200, 25);
							frmUstore.getContentPane().add(new_product_textField_7);
							
							new_product_button.setVisible(true);
							new_product_button.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									if (new_product_textField_1.getText().trim().equals("") 
											&& new_product_textField_1.getText() != null ) {
										System.out.println("ERROR");
									} else if (new_product_textField_2.getText().trim().equals("") 
											&& new_product_textField_2.getText() != null ) {
										System.out.println("ERROR2");
									} else if (new_product_textField_3.getText().trim().equals("") 
											&& new_product_textField_3.getText() != null ) {
										System.out.println("ERROR3");
									} else if (new_product_textField_4.getText().trim().equals("") 
											&& new_product_textField_4.getText() != null ) {
										System.out.println("ERROR4");
									} else if (new_product_textField_5.getText().trim().equals("") 
											&& new_product_textField_5.getText() != null ) {
										System.out.println("ERROR5");
									} else if (new_product_textField_6.getText().trim().equals("") 
											&& new_product_textField_6.getText() != null ) {
										System.out.println("ERROR6");
									} else if (new_product_textField_7.getText().trim().equals("") 
											&& new_product_textField_7.getText() != null ) {
										System.out.println("ERROR7");
									} else {
										addNewProduct();
										new_product_label_done.setVisible(true);
									}
								}
							});
							
							button_02 = new JButton("");
							button_02.setIcon(new ImageIcon("src\\icons\\back.png"));
							button_02.setBackground(Color.WHITE);
							button_02.setBounds(51, 0, 50, 50);
							frmUstore.getContentPane().add(button_02);
							button_02.setMaximumSize(new Dimension(20, 20));
							button_02.setFont(new Font("Arial", Font.PLAIN, 10));
							button_02.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e){
									button_1.setVisible(true);
									button_2.setVisible(true);
									button_3.setVisible(true);
									button_4.setVisible(true);
									button_5.setVisible(true);
									label_1.setVisible(true);
									label_12.setVisible(true);
									label_2.setVisible(true);
									label_22.setVisible(true);
									label_23.setVisible(true);
									label_3.setVisible(true);
									label_32.setVisible(true);
									label_33.setVisible(true);
									label_4.setVisible(true);
									label_42.setVisible(true);
									label_5.setVisible(true);
									label_52.setVisible(true);
									label_53.setVisible(true);
									new_product_label_1.setVisible(false);
									new_product_label_2.setVisible(false);
									new_product_label_3.setVisible(false);
									new_product_label_4.setVisible(false);
									new_product_label_5.setVisible(false);
									new_product_label_6.setVisible(false);
									new_product_label_7.setVisible(false);
									new_product_textField_1.setVisible(false);
									new_product_textField_2.setVisible(false);
									new_product_textField_3.setVisible(false);
									new_product_textField_4.setVisible(false);
									new_product_textField_5.setVisible(false);
									new_product_textField_6.setVisible(false);
									new_product_textField_7.setVisible(false);
									button_02.setVisible(false);
									label_task_1.setVisible(false);
									separator_2.setVisible(false);
									new_product_button.setVisible(false);
									new_product_label_done.setVisible(false);
								}
							});
						}
					});
					
					button_2.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							button_1.setVisible(false);
							button_2.setVisible(false);
							button_3.setVisible(false);
							button_4.setVisible(false);
							button_5.setVisible(false);
							label_1.setVisible(false);
							label_12.setVisible(false);
							label_2.setVisible(false);
							label_22.setVisible(false);
							label_23.setVisible(false);
							label_3.setVisible(false);
							label_32.setVisible(false);
							label_33.setVisible(false);
							label_4.setVisible(false);
							label_42.setVisible(false);
							label_5.setVisible(false);
							label_52.setVisible(false);
							label_53.setVisible(false);
							
							label_task_2.setVisible(true);
							separator_2.setVisible(true);
							
							try {
								Connection conn = connect.connect();
								PreparedStatement ps = conn.prepareStatement("select * from products");
								ResultSet rs = ps.executeQuery( );

								table = new JTable( buildTableModel(rs) );
								conn.close();
							} catch (SQLException e1) {
								e1.printStackTrace();
							}
							table.setFont(new Font("Arial", Font.PLAIN, 12));
							table.setBounds(180, 130, 800, 300);
							frmUstore.getContentPane().add(table);
							
							button_02 = new JButton("");
							button_02.setIcon(new ImageIcon("src\\icons\\back.png"));
							button_02.setBackground(Color.WHITE);
							button_02.setBounds(51, 0, 50, 50);
							frmUstore.getContentPane().add(button_02);
							button_02.setMaximumSize(new Dimension(20, 20));
							button_02.setFont(new Font("Arial", Font.PLAIN, 10));
							button_02.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e){
									button_1.setVisible(true);
									button_2.setVisible(true);
									button_3.setVisible(true);
									button_4.setVisible(true);
									button_5.setVisible(true);
									label_1.setVisible(true);
									label_12.setVisible(true);
									label_2.setVisible(true);
									label_22.setVisible(true);
									label_23.setVisible(true);
									label_3.setVisible(true);
									label_32.setVisible(true);
									label_33.setVisible(true);
									label_4.setVisible(true);
									label_42.setVisible(true);
									label_5.setVisible(true);
									label_52.setVisible(true);
									label_53.setVisible(true);
									button_02.setVisible(false);
									label_task_2.setVisible(false);
									separator_2.setVisible(false);
									table.setVisible(false);
								}
							});
						}
					});
					
					button_3.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							button_1.setVisible(false);
							button_2.setVisible(false);
							button_3.setVisible(false);
							button_4.setVisible(false);
							button_5.setVisible(false);
							label_1.setVisible(false);
							label_12.setVisible(false);
							label_2.setVisible(false);
							label_22.setVisible(false);
							label_23.setVisible(false);
							label_3.setVisible(false);
							label_32.setVisible(false);
							label_33.setVisible(false);
							label_4.setVisible(false);
							label_42.setVisible(false);
							label_5.setVisible(false);
							label_52.setVisible(false);
							label_53.setVisible(false);
							
							label_task_3.setVisible(true);
							separator_2.setVisible(true);
							
							//
							ResultSet rs = null;
							try {
								Connection conn = connect.connect();
								PreparedStatement ps = conn.prepareStatement("select * from products");
								rs = ps.executeQuery();

								table = new JTable( buildTableModel(rs) );
								conn.close();
							} catch (SQLException e1) {
								e1.printStackTrace();
							}
							table.setFont(new Font("Arial", Font.PLAIN, 12));
							table.setBounds(180, 130, 800, 300);
							frmUstore.getContentPane().add(table);
							
							button_02 = new JButton("");
							button_02.setIcon(new ImageIcon("src\\icons\\back.png"));
							button_02.setBackground(Color.WHITE);
							button_02.setBounds(51, 0, 50, 50);
							frmUstore.getContentPane().add(button_02);
							button_02.setMaximumSize(new Dimension(20, 20));
							button_02.setFont(new Font("Arial", Font.PLAIN, 10));
							button_02.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e){
									button_1.setVisible(true);
									button_2.setVisible(true);
									button_3.setVisible(true);
									button_4.setVisible(true);
									button_5.setVisible(true);
									label_1.setVisible(true);
									label_12.setVisible(true);
									label_2.setVisible(true);
									label_22.setVisible(true);
									label_23.setVisible(true);
									label_3.setVisible(true);
									label_32.setVisible(true);
									label_33.setVisible(true);
									label_4.setVisible(true);
									label_42.setVisible(true);
									label_5.setVisible(true);
									label_52.setVisible(true);
									label_53.setVisible(true);
									button_02.setVisible(false);
									label_task_3.setVisible(false);
									separator_2.setVisible(false);
									table.setVisible(false);
								}
							});
						}
					});
					
					button_4.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							button_1.setVisible(false);
							button_2.setVisible(false);
							button_3.setVisible(false);
							button_4.setVisible(false);
							button_5.setVisible(false);
							label_1.setVisible(false);
							label_12.setVisible(false);
							label_2.setVisible(false);
							label_22.setVisible(false);
							label_23.setVisible(false);
							label_3.setVisible(false);
							label_32.setVisible(false);
							label_33.setVisible(false);
							label_4.setVisible(false);
							label_42.setVisible(false);
							label_5.setVisible(false);
							label_52.setVisible(false);
							label_53.setVisible(false);
							
							label_task_4.setVisible(true);
							separator_2.setVisible(true);
							
							search_textField = new JTextField();
							search_textField.setColumns(10);
							search_textField.setBounds(330, 180, 500, 40);
							frmUstore.getContentPane().add(search_textField);
							
							search_btn = new JButton("¡Õ¡∆«‘«”«");
							search_btn.setBackground(new Color(30, 144, 255));
							search_btn.setForeground(Color.white);
							search_btn.setFont(new Font("Arial", Font.PLAIN, 12));
							search_btn.setBounds(500, 250, 150, 25);
							frmUstore.getContentPane().add(search_btn);
							
							button_02 = new JButton("");
							button_02.setIcon(new ImageIcon("src\\icons\\back.png"));
							button_02.setBackground(Color.WHITE);
							button_02.setBounds(51, 0, 50, 50);
							frmUstore.getContentPane().add(button_02);
							button_02.setMaximumSize(new Dimension(20, 20));
							button_02.setFont(new Font("Arial", Font.PLAIN, 10));
							button_02.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e){
									button_1.setVisible(true);
									button_2.setVisible(true);
									button_3.setVisible(true);
									button_4.setVisible(true);
									button_5.setVisible(true);
									label_1.setVisible(true);
									label_12.setVisible(true);
									label_2.setVisible(true);
									label_22.setVisible(true);
									label_23.setVisible(true);
									label_3.setVisible(true);
									label_32.setVisible(true);
									label_33.setVisible(true);
									label_4.setVisible(true);
									label_42.setVisible(true);
									label_5.setVisible(true);
									label_52.setVisible(true);
									label_53.setVisible(true);
									button_02.setVisible(false);
									search_btn.setVisible(false);
									label_task_4.setVisible(false);
									separator_2.setVisible(false);
									search_textField.setVisible(false);
								}
							});
						}
					});
					
					button_5.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							button_1.setVisible(false);
							button_2.setVisible(false);
							button_3.setVisible(false);
							button_4.setVisible(false);
							button_5.setVisible(false);
							label_1.setVisible(false);
							label_12.setVisible(false);
							label_2.setVisible(false);
							label_22.setVisible(false);
							label_23.setVisible(false);
							label_3.setVisible(false);
							label_32.setVisible(false);
							label_33.setVisible(false);
							label_4.setVisible(false);
							label_42.setVisible(false);
							label_5.setVisible(false);
							label_52.setVisible(false);
							label_53.setVisible(false);
							
							label_task_5.setVisible(true);
							separator_2.setVisible(true);
							
							button_02 = new JButton("");
							button_02.setIcon(new ImageIcon("src\\icons\\back.png"));
							button_02.setBackground(Color.WHITE);
							button_02.setBounds(51, 0, 50, 50);
							frmUstore.getContentPane().add(button_02);
							button_02.setMaximumSize(new Dimension(20, 20));
							button_02.setFont(new Font("Arial", Font.PLAIN, 10));
							button_02.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e){
									button_1.setVisible(true);
									button_2.setVisible(true);
									button_3.setVisible(true);
									button_4.setVisible(true);
									button_5.setVisible(true);
									label_1.setVisible(true);
									label_12.setVisible(true);
									label_2.setVisible(true);
									label_22.setVisible(true);
									label_23.setVisible(true);
									label_3.setVisible(true);
									label_32.setVisible(true);
									label_33.setVisible(true);
									label_4.setVisible(true);
									label_42.setVisible(true);
									label_5.setVisible(true);
									label_52.setVisible(true);
									label_53.setVisible(true);
									button_02.setVisible(false);
									label_task_5.setVisible(false);
									separator_2.setVisible(false);
								}
							});
						}
					});
				} else if ( typeOfUser.equals("user") ){
					lblUstore.setVisible(false);
					lblUsername.setVisible(false);
					lblPassword.setVisible(false);
					txtUsername.setVisible(false);
					passwordField.setVisible(false);
					btnLogIn.setVisible(false);
					button_00.setVisible(true);
					label_0.setVisible(true);
					separator.setVisible(true);
					button_1.setVisible(true);
					button_2.setVisible(true);
					button_3.setVisible(true);
					button_4.setVisible(true);
					button_5.setVisible(true);
					label_1.setVisible(true);
					label_12.setVisible(true);
					label_2.setVisible(true);
					label_22.setVisible(true);
					label_23.setVisible(true);
					label_3.setVisible(true);
					label_32.setVisible(true);
					label_33.setVisible(true);
					label_4.setVisible(true);
					label_42.setVisible(true);
					label_5.setVisible(true);
					label_52.setVisible(true);
					label_53.setVisible(true);
					
					button_2.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							button_1.setVisible(false);
							button_2.setVisible(false);
							button_3.setVisible(false);
							button_4.setVisible(false);
							button_5.setVisible(false);
							label_1.setVisible(false);
							label_12.setVisible(false);
							label_2.setVisible(false);
							label_22.setVisible(false);
							label_23.setVisible(false);
							label_3.setVisible(false);
							label_32.setVisible(false);
							label_33.setVisible(false);
							label_4.setVisible(false);
							label_42.setVisible(false);
							label_5.setVisible(false);
							label_52.setVisible(false);
							label_53.setVisible(false);
							
							label_task_2.setVisible(true);
							separator_2.setVisible(true);
							
							try {
								Connection conn = connect.connect();
								PreparedStatement ps = conn.prepareStatement("select * from products");
								ResultSet rs = ps.executeQuery( );

								table = new JTable( buildTableModel(rs) );
								conn.close();
							} catch (SQLException e1) {
								e1.printStackTrace();
							}
							table.setFont(new Font("Arial", Font.PLAIN, 12));
							table.setBounds(180, 130, 800, 300);
							frmUstore.getContentPane().add(table);
							
							button_02 = new JButton("");
							button_02.setIcon(new ImageIcon("src\\icons\\back.png"));
							button_02.setBackground(Color.WHITE);
							button_02.setBounds(51, 0, 50, 50);
							frmUstore.getContentPane().add(button_02);
							button_02.setMaximumSize(new Dimension(20, 20));
							button_02.setFont(new Font("Arial", Font.PLAIN, 10));
							button_02.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e){
									button_1.setVisible(true);
									button_2.setVisible(true);
									button_3.setVisible(true);
									button_4.setVisible(true);
									button_5.setVisible(true);
									label_1.setVisible(true);
									label_12.setVisible(true);
									label_2.setVisible(true);
									label_22.setVisible(true);
									label_23.setVisible(true);
									label_3.setVisible(true);
									label_32.setVisible(true);
									label_33.setVisible(true);
									label_4.setVisible(true);
									label_42.setVisible(true);
									label_5.setVisible(true);
									label_52.setVisible(true);
									label_53.setVisible(true);
									button_02.setVisible(false);
									label_task_2.setVisible(false);
									separator_2.setVisible(false);
									table.setVisible(false);
								}
							});
						}
					});
					
					button_3.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							button_1.setVisible(false);
							button_2.setVisible(false);
							button_3.setVisible(false);
							button_4.setVisible(false);
							button_5.setVisible(false);
							label_1.setVisible(false);
							label_12.setVisible(false);
							label_2.setVisible(false);
							label_22.setVisible(false);
							label_23.setVisible(false);
							label_3.setVisible(false);
							label_32.setVisible(false);
							label_33.setVisible(false);
							label_4.setVisible(false);
							label_42.setVisible(false);
							label_5.setVisible(false);
							label_52.setVisible(false);
							label_53.setVisible(false);
							
							label_task_3.setVisible(true);
							separator_2.setVisible(true);
							
							//
							ResultSet rs = null;
							try {
								Connection conn = connect.connect();
								PreparedStatement ps = conn.prepareStatement("select * from products");
								rs = ps.executeQuery();

								table = new JTable( buildTableModel(rs) );
								conn.close();
							} catch (SQLException e1) {
								e1.printStackTrace();
							}
							table.setFont(new Font("Arial", Font.PLAIN, 12));
							table.setBounds(180, 130, 800, 300);
							frmUstore.getContentPane().add(table);
							
							button_02 = new JButton("");
							button_02.setIcon(new ImageIcon("src\\icons\\back.png"));
							button_02.setBackground(Color.WHITE);
							button_02.setBounds(51, 0, 50, 50);
							frmUstore.getContentPane().add(button_02);
							button_02.setMaximumSize(new Dimension(20, 20));
							button_02.setFont(new Font("Arial", Font.PLAIN, 10));
							button_02.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e){
									button_1.setVisible(true);
									button_2.setVisible(true);
									button_3.setVisible(true);
									button_4.setVisible(true);
									button_5.setVisible(true);
									label_1.setVisible(true);
									label_12.setVisible(true);
									label_2.setVisible(true);
									label_22.setVisible(true);
									label_23.setVisible(true);
									label_3.setVisible(true);
									label_32.setVisible(true);
									label_33.setVisible(true);
									label_4.setVisible(true);
									label_42.setVisible(true);
									label_5.setVisible(true);
									label_52.setVisible(true);
									label_53.setVisible(true);
									button_02.setVisible(false);
									label_task_3.setVisible(false);
									separator_2.setVisible(false);
									table.setVisible(false);
								}
							});
						}
					});
					
					button_4.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							button_1.setVisible(false);
							button_2.setVisible(false);
							button_3.setVisible(false);
							button_4.setVisible(false);
							button_5.setVisible(false);
							label_1.setVisible(false);
							label_12.setVisible(false);
							label_2.setVisible(false);
							label_22.setVisible(false);
							label_23.setVisible(false);
							label_3.setVisible(false);
							label_32.setVisible(false);
							label_33.setVisible(false);
							label_4.setVisible(false);
							label_42.setVisible(false);
							label_5.setVisible(false);
							label_52.setVisible(false);
							label_53.setVisible(false);
							
							label_task_4.setVisible(true);
							separator_2.setVisible(true);
							
							search_textField = new JTextField();
							search_textField.setColumns(10);
							search_textField.setBounds(330, 180, 500, 40);
							frmUstore.getContentPane().add(search_textField);
							
							search_btn = new JButton("¡Õ¡∆«‘«”«");
							search_btn.setBackground(new Color(30, 144, 255));
							search_btn.setForeground(Color.white);
							search_btn.setFont(new Font("Arial", Font.PLAIN, 12));
							search_btn.setBounds(500, 250, 150, 25);
							frmUstore.getContentPane().add(search_btn);
							
							button_02 = new JButton("");
							button_02.setIcon(new ImageIcon("src\\icons\\back.png"));
							button_02.setBackground(Color.WHITE);
							button_02.setBounds(51, 0, 50, 50);
							frmUstore.getContentPane().add(button_02);
							button_02.setMaximumSize(new Dimension(20, 20));
							button_02.setFont(new Font("Arial", Font.PLAIN, 10));
							button_02.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e){
									button_1.setVisible(true);
									button_2.setVisible(true);
									button_3.setVisible(true);
									button_4.setVisible(true);
									button_5.setVisible(true);
									label_1.setVisible(true);
									label_12.setVisible(true);
									label_2.setVisible(true);
									label_22.setVisible(true);
									label_23.setVisible(true);
									label_3.setVisible(true);
									label_32.setVisible(true);
									label_33.setVisible(true);
									label_4.setVisible(true);
									label_42.setVisible(true);
									label_5.setVisible(true);
									label_52.setVisible(true);
									label_53.setVisible(true);
									button_02.setVisible(false);
									search_btn.setVisible(false);
									label_task_4.setVisible(false);
									separator_2.setVisible(false);
									search_textField.setVisible(false);
								}
							});
						}
					});
				} else {
					label_conn_error.setVisible(true);
				}
			}
		});
		btnLogIn.setBackground(new Color(30, 144, 255));
		btnLogIn.setForeground(Color.white);
		btnLogIn.setFont(new Font("Arial", Font.PLAIN, 12));
		btnLogIn.setBounds(875, 200, 90, 25);
		frmUstore.getContentPane().add(btnLogIn);
		
		separator_3 = new JSeparator();
		separator_3.setBounds(0, 550, 1200, 7);
		frmUstore.getContentPane().add(separator_3);

		label_10 = new JLabel("\u00a9 Copyright uStore A.E. 2015");
		label_10.setHorizontalTextPosition(SwingConstants.LEFT);
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setFont(new Font("Arial", Font.PLAIN, 10));
		label_10.setBackground(Color.DARK_GRAY);
		label_10.setBounds(10, 555, 434, 14);
		frmUstore.getContentPane().add(label_10);
	}
	
	private void connectToDB( String username, char[] cs ) {
		String passText = new String( cs );

		try {
			Connection conn = connect.connect();
			String query = "SELECT * FROM `users` WHERE `username`=? AND `password`= md5(?) ";
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setString(1, username);
			ps.setString(2, passText);
			
			ResultSet rs = ps.executeQuery();

			while ( rs.next() ) {
					typeOfUser = rs.getString("rights");
					nameOfUser = rs.getString("username");
					
					label_0.setText(nameOfUser);
					label_0.setVisible(true);
			}
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void addNewProduct() {
		
		try {
			Connection conn = connect.connect();
			String query = "INSERT INTO `products`"
							+ "(`title`, `barcode`, `category`, `subcategory`,"
							+ "`price`, `vat`, `quantity`) "
							+ "VALUES (?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setString(1, new_product_textField_1.getText() );
			ps.setString(2, new_product_textField_2.getText() );
			ps.setString(3, new_product_textField_3.getText() );
			ps.setString(4, new_product_textField_4.getText() );
			ps.setDouble(5, Double.parseDouble(new_product_textField_5.getText() ) );
			ps.setInt(6, Integer.parseInt(new_product_textField_6.getText() ) );
			ps.setInt(7, Integer.parseInt( 220+"" ) );
			ps.executeUpdate();

			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static DefaultTableModel buildTableModel(ResultSet rs)
	        throws SQLException {

	    ResultSetMetaData metaData = rs.getMetaData();

	    // names of columns
	    Vector<String> columnNames = new Vector<String>();
	    int columnCount = metaData.getColumnCount();
	    for (int column = 1; column <= columnCount; column++) {
	        columnNames.add(metaData.getColumnName(column));
	    }

	    // data of the table
	    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
	    while (rs.next()) {
	        Vector<Object> vector = new Vector<Object>();
	        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
	            vector.add(rs.getObject(columnIndex));
	        }
	        data.add(vector);
	    }
	    return new DefaultTableModel(data, columnNames);
	}
}