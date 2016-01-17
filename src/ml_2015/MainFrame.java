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
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
	
public class MainFrame {
	
	public static Connection conn = connect.connect();
	public String typeOfUser;
	public String nameOfUser;
		
	private JTextField new_product_textField_1;
	private JTextField new_product_textField_2;
	private JTextField new_product_textField_3;
	private JTextField new_product_textField_4;
	private JTextField new_product_textField_5;
	private JTextField new_product_textField_6;
	private JTextField search_textField;
	
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
		
		JLabel lblUstore = new JLabel("uStore");
		lblUstore.setFont(new Font("Arial", Font.PLAIN, 40));
		lblUstore.setBounds(70, 50, 200, 60);
		frmUstore.getContentPane().add(lblUstore);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(330, 80, 65, 20);
		frmUstore.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(330, 120, 65, 20);
		frmUstore.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 12));
		txtUsername.setBounds(400, 80, 130, 25);
		frmUstore.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 12));
		passwordField.setBounds(400, 120, 130, 25);
		frmUstore.getContentPane().add(passwordField);
		
		JButton btnLogIn = new JButton("сумдесг");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				connectToDB(txtUsername.getText(), passwordField.getPassword());
				if (conn != null){
					lblUstore.setVisible(false);
					lblUsername.setVisible(false);
					lblPassword.setVisible(false);
					txtUsername.setVisible(false);
					passwordField.setVisible(false);
					btnLogIn.setVisible(false);
					JButton button_00 = new JButton("");
					button_00.setFont(new Font("Arial", Font.PLAIN, 12));
					button_00.setIcon(new ImageIcon("src\\icons\\logo.png"));
					button_00.setBackground(Color.WHITE);
					button_00.setBounds(0, 0, 50, 50);
					frmUstore.getContentPane().add(button_00);

					JLabel label_0 = new JLabel("  ");
					label_0.setFont(new Font("Arial", Font.BOLD, 12));
					label_0.setBounds(1050, 20, 80, 15);
					frmUstore.getContentPane().add(label_0);

					JButton button_03 = new JButton("");
					button_03.setIcon(new ImageIcon("src\\icons\\power.png"));
					button_03.setBackground(Color.WHITE);
					button_03.setMaximumSize(new Dimension(20, 20));
					button_03.setFont(new Font("Arial", Font.PLAIN, 10));
					button_03.setBounds(1134, 0, 50, 50);
					frmUstore.getContentPane().add(button_03);

					JSeparator separator = new JSeparator();
					separator.setBounds(0, 51, 1200, 7);
					frmUstore.getContentPane().add(separator);
					
					JButton button_1 = new JButton("");
					button_1.setIcon(new ImageIcon("src\\icons\\add.png"));
					button_1.setBackground(Color.WHITE);
					button_1.setBounds(100, 180, 125, 125);
					frmUstore.getContentPane().add(button_1);
					
					JButton button_2 = new JButton("");
					button_2.setIcon(new ImageIcon("src\\icons\\screen.png"));
					button_2.setBackground(Color.WHITE);
					button_2.setBounds(305, 180, 125, 125);
					frmUstore.getContentPane().add(button_2);

					JButton button_3 = new JButton("");
					button_3.setIcon(new ImageIcon("src\\icons\\edit.png"));
					button_3.setBackground(Color.WHITE);
					button_3.setBounds(510, 180, 125, 125);
					frmUstore.getContentPane().add(button_3);

					JButton button_4 = new JButton("");
					button_4.setIcon(new ImageIcon("src\\icons\\search_1.png"));
					button_4.setBackground(Color.WHITE);
					button_4.setBounds(715, 180, 125, 125);
					frmUstore.getContentPane().add(button_4);

					JButton button_5 = new JButton("");
					button_5.setIcon(new ImageIcon("src\\icons\\statistics.png"));
					button_5.setBackground(Color.WHITE);
					button_5.setBounds(920, 180, 125, 125);
					frmUstore.getContentPane().add(button_5);
					
					JLabel label_1 = new JLabel("дглиоуяциа");
					label_1.setFont(new Font("Arial", Font.PLAIN, 15));
					label_1.setBounds(120, 310, 150, 70);
					frmUstore.getContentPane().add(label_1);

					JLabel label_12 = new JLabel("меоу пяозомтос");
					label_12.setFont(new Font("Arial", Font.PLAIN, 15));
					label_12.setBounds(98, 330, 150, 70);
					frmUstore.getContentPane().add(label_12);

					JLabel label_2 = new JLabel("пяобокг");
					label_2.setFont(new Font("Arial", Font.PLAIN, 15));
					label_2.setBounds(330, 300, 150, 70);
					frmUstore.getContentPane().add(label_2);

					JLabel label_22 = new JLabel("апохелатос");
					label_22.setFont(new Font("Arial", Font.PLAIN, 15));
					label_22.setBounds(318, 320, 150, 70);
					frmUstore.getContentPane().add(label_22);

					JLabel label_23 = new JLabel("пяозомтос");
					label_23.setFont(new Font("Arial", Font.PLAIN, 15));
					label_23.setBounds(325, 340, 150, 70);
					frmUstore.getContentPane().add(label_23);

					JLabel label_3 = new JLabel("епенеяцасиа");
					label_3.setFont(new Font("Arial", Font.PLAIN, 15));
					label_3.setBounds(525, 300, 150, 70);
					frmUstore.getContentPane().add(label_3);

					JLabel label_32 = new JLabel("апохелатос");
					label_32.setFont(new Font("Arial", Font.PLAIN, 15));
					label_32.setBounds(521, 320, 150, 70);
					frmUstore.getContentPane().add(label_32);

					JLabel label_33 = new JLabel("пяозомтос");
					label_33.setFont(new Font("Arial", Font.PLAIN, 15));
					label_33.setBounds(528, 340, 150, 70);
					frmUstore.getContentPane().add(label_33);

					JLabel label_4 = new JLabel("амафгтгсг ста");
					label_4.setFont(new Font("Arial", Font.PLAIN, 15));
					label_4.setBounds(720, 310, 150, 70);
					frmUstore.getContentPane().add(label_4);

					JLabel label_42 = new JLabel("апохелата");
					label_42.setFont(new Font("Arial", Font.PLAIN, 15));
					label_42.setBounds(730, 330, 150, 70);
					frmUstore.getContentPane().add(label_42);

					JLabel label_5 = new JLabel("елжамисг");
					label_5.setFont(new Font("Arial", Font.PLAIN, 15));
					label_5.setBounds(945, 300, 150, 70);
					frmUstore.getContentPane().add(label_5);

					JLabel label_52 = new JLabel("статистийым");
					label_52.setFont(new Font("Arial", Font.PLAIN, 15));
					label_52.setBounds(938, 320, 150, 70);
					frmUstore.getContentPane().add(label_52);

					JLabel label_53 = new JLabel("стоивеиым");
					label_53.setFont(new Font("Arial", Font.PLAIN, 15));
					label_53.setBounds(945, 340, 150, 70);
					frmUstore.getContentPane().add(label_53);
					
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
							
							JLabel label_task = new JLabel("дглиоуяциа меоу пяозомтос");
							label_task.setBackground(Color.DARK_GRAY);
							label_task.setForeground(Color.DARK_GRAY);
							label_task.setFont(new Font("Arial", Font.PLAIN, 20));
							label_task.setBounds(10, 55, 500, 25);
							frmUstore.getContentPane().add(label_task);
							
							JSeparator separator_2 = new JSeparator();
							separator_2.setBounds(0, 85, 1500, 7);
							frmUstore.getContentPane().add(separator_2);
							
							JLabel new_product_label_1 = new JLabel("тъТКОР");
							new_product_label_1.setFont(new Font("Arial", Font.PLAIN, 15));
							new_product_label_1.setBounds(450, 120, 100, 25);
							frmUstore.getContentPane().add(new_product_label_1);
							
							JLabel new_product_label_2 = new JLabel("Barcode");
							new_product_label_2.setFont(new Font("Arial", Font.PLAIN, 15));
							new_product_label_2.setBounds(450, 160, 100, 25);
							frmUstore.getContentPane().add(new_product_label_2);
							
							JLabel new_product_label_3 = new JLabel("йАТГЦОЯъА");
							new_product_label_3.setFont(new Font("Arial", Font.PLAIN, 15));
							new_product_label_3.setBounds(450, 200, 100, 25);
							frmUstore.getContentPane().add(new_product_label_3);
							
							JLabel new_product_label_4 = new JLabel("уПОЙАТГЦОЯъА");
							new_product_label_4.setFont(new Font("Arial", Font.PLAIN, 15));
							new_product_label_4.setBounds(450, 240, 100, 25);
							frmUstore.getContentPane().add(new_product_label_4);
							
							JLabel new_product_label_5 = new JLabel("тИЛч");
							new_product_label_5.setFont(new Font("Arial", Font.PLAIN, 15));
							new_product_label_5.setBounds(450, 280, 100, 25);
							frmUstore.getContentPane().add(new_product_label_5);
							
							JLabel new_product_label_6 = new JLabel("ж.п.а.");
							new_product_label_6.setFont(new Font("Arial", Font.PLAIN, 15));
							new_product_label_6.setBounds(450, 320, 100, 25);
							frmUstore.getContentPane().add(new_product_label_6);
							
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
							
							JButton new_product_button = new JButton("дглиоуяциа");
							new_product_button.setBackground(new Color(30, 144, 255));
							new_product_button.setForeground(Color.white);
							new_product_button.setFont(new Font("Arial", Font.PLAIN, 12));
							new_product_button.setBounds(600, 380, 120, 25);
							frmUstore.getContentPane().add(new_product_button);
							
							JButton button_02 = new JButton("");
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
									new_product_textField_1.setVisible(false);
									new_product_textField_2.setVisible(false);
									new_product_textField_3.setVisible(false);
									new_product_textField_4.setVisible(false);
									new_product_textField_5.setVisible(false);
									new_product_textField_6.setVisible(false);
									button_02.setVisible(false);
									label_task.setVisible(false);
									separator_2.setVisible(false);
									new_product_button.setVisible(false);
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
							
							JLabel label_task = new JLabel("пяобокг апохелатос пяозомтос");
							label_task.setBounds(0, 55, 500, 25);
							label_task.setBackground(Color.DARK_GRAY);
							label_task.setForeground(Color.DARK_GRAY);
							label_task.setFont(new Font("Arial", Font.PLAIN, 20));
							frmUstore.getContentPane().add(label_task);
							
							JSeparator separator_2 = new JSeparator();
							separator_2.setBounds(0, 85, 1200, 7);
							frmUstore.getContentPane().add(separator_2);
							
							JButton button_02 = new JButton("");
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
									label_task.setVisible(false);
									separator_2.setVisible(false);
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
							
							JLabel label_task = new JLabel("епенеяцасиа апохелатос пяозомтос");
							label_task.setBackground(Color.DARK_GRAY);
							label_task.setForeground(Color.DARK_GRAY);
							label_task.setFont(new Font("Arial", Font.PLAIN, 20));
							label_task.setBounds(50, 55, 500, 25);
							frmUstore.getContentPane().add(label_task);
							
							JSeparator separator_2 = new JSeparator();
							separator_2.setBounds(0, 85, 1200, 7);
							frmUstore.getContentPane().add(separator_2);
							
							JButton button_02 = new JButton("");
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
									label_task.setVisible(false);
									separator_2.setVisible(false);
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
							
							JLabel label_task = new JLabel("амафгтгсг ста апохелата");
							label_task.setBackground(Color.DARK_GRAY);
							label_task.setForeground(Color.DARK_GRAY);
							label_task.setFont(new Font("Arial", Font.PLAIN, 20));
							label_task.setBounds(50, 55, 500, 25);
							frmUstore.getContentPane().add(label_task);
							
							JSeparator separator_2 = new JSeparator();
							separator_2.setBounds(0, 85, 1500, 7);
							frmUstore.getContentPane().add(separator_2);
							
							search_textField = new JTextField();
							search_textField.setColumns(10);
							search_textField.setBounds(330, 180, 500, 40);
							frmUstore.getContentPane().add(search_textField);
							
							JButton search_btn = new JButton("амафгтгсг");
							search_btn.setBackground(new Color(30, 144, 255));
							search_btn.setForeground(Color.white);
							search_btn.setFont(new Font("Arial", Font.PLAIN, 12));
							search_btn.setBounds(500, 250, 150, 25);
							frmUstore.getContentPane().add(search_btn);
							
							JButton button_02 = new JButton("");
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
									label_task.setVisible(false);
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
							
							JLabel label_task = new JLabel("елжамисг статистийым стоивеиым");
							label_task.setBackground(Color.DARK_GRAY);
							label_task.setForeground(Color.DARK_GRAY);
							label_task.setFont(new Font("Arial", Font.PLAIN, 20));
							label_task.setBounds(0, 55, 500, 25);
							frmUstore.getContentPane().add(label_task);
							
							JSeparator separator_2 = new JSeparator();
							separator_2.setBounds(0, 85, 1500, 7);
							frmUstore.getContentPane().add(separator_2);
							
							JButton statistics_btn = new JButton("аккацг");
							statistics_btn.setBounds(950, 450, 150, 25);
							statistics_btn.setForeground(Color.white);
							statistics_btn.setBackground(new Color(30, 144, 255));
							statistics_btn.setFont(new Font("Arial", Font.PLAIN, 12));
							frmUstore.getContentPane().add(statistics_btn);
							
							JButton button_02 = new JButton("");
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
									label_task.setVisible(false);
									separator_2.setVisible(false);
									statistics_btn.setVisible(false);
								}
							});
						}
					});
					//if(typeOfUser.equals("admin")){
						//diax a = new diax();
						//a.initialize();
					//}
					//else{
						
					//}
				}
			}
		});
		btnLogIn.setBackground(new Color(30, 144, 255));
		btnLogIn.setForeground(Color.white);
		btnLogIn.setFont(new Font("Arial", Font.PLAIN, 12));
		btnLogIn.setBounds(418, 160, 90, 25);
		frmUstore.getContentPane().add(btnLogIn);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 540, 1200, 7);
		frmUstore.getContentPane().add(separator_3);

		JLabel label_10 = new JLabel("\u00a9 Copyright uStore A.E. 2015");
		label_10.setHorizontalTextPosition(SwingConstants.LEFT);
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setFont(new Font("Arial", Font.PLAIN, 10));
		label_10.setBackground(Color.DARK_GRAY);
		label_10.setBounds(10, 545, 434, 14);
		frmUstore.getContentPane().add(label_10);
	}
	
	private void connectToDB( String username, char[] cs ) {
		String passText = new String( cs );

		ResultSet rs = null;

		try {
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from users where `username`='" + username + "' "
					+ "AND `password`='" + passText + "'" );
			connect.printResult(rs);
			
			while ( rs.next() ) {
					typeOfUser = rs.getString("rights");
					nameOfUser = rs.getString("name");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}