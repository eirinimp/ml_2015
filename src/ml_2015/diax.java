package ml_2015;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class diax {

	private JFrame frmUstore;
	private JTextField new_product_textField_1;
	private JTextField new_product_textField_2;
	private JTextField new_product_textField_3;
	private JTextField new_product_textField_4;
	private JTextField new_product_textField_5;
	private JTextField new_product_textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					diax window = new diax();
					window.frmUstore.setVisible(true);
					window.frmUstore.setSize(1200, 600);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public diax() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUstore = new JFrame();
		frmUstore.setIconImage(Toolkit.getDefaultToolkit().getImage("src\\icons\\logo.png"));
		frmUstore.setFont(new Font("Arial", Font.PLAIN, 15));
		frmUstore.setTitle("uStore");
		frmUstore.setBounds(100, 100, 450, 300);
		frmUstore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUstore.getContentPane().setLayout(null);
		
		JButton button_00 = new JButton("");
		button_00.setIcon(new ImageIcon("src\\icons\\logo.png"));
		button_00.setBackground(Color.WHITE);
		button_00.setBounds(0, 0, 50, 50);
		frmUstore.getContentPane().add(button_00);

		JLabel label_0 = new JLabel("\u0394\u03B9\u03B1\u03C7\u03B5\u03B9\u03C1\u03B9\u03C3\u03C4\u03AE\u03C2");
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
		
		JLabel label_1 = new JLabel("\u0394\u0397\u039C\u0399\u039F\u03A5\u03A1\u0393\u0399\u0391");
		label_1.setFont(new Font("Arial", Font.PLAIN, 15));
		label_1.setBounds(120, 310, 150, 70);
		frmUstore.getContentPane().add(label_1);

		JLabel label_12 = new JLabel("\u039D\u0395\u039F\u03A5 \u03A0\u03A1\u039F\u03AA\u039F\u039D\u03A4\u039F\u03A3");
		label_12.setFont(new Font("Arial", Font.PLAIN, 15));
		label_12.setBounds(98, 330, 150, 70);
		frmUstore.getContentPane().add(label_12);

		JLabel label_2 = new JLabel("\u03A0\u03A1\u039F\u0392\u039F\u039B\u0397");
		label_2.setFont(new Font("Arial", Font.PLAIN, 15));
		label_2.setBounds(330, 300, 150, 70);
		frmUstore.getContentPane().add(label_2);

		JLabel label_22 = new JLabel("\u0391\u03A0\u039F\u0398\u0395\u039C\u0391\u03A4\u039F\u03A3");
		label_22.setFont(new Font("Arial", Font.PLAIN, 15));
		label_22.setBounds(318, 320, 150, 70);
		frmUstore.getContentPane().add(label_22);

		JLabel label_23 = new JLabel("\u03A0\u03A1\u039F\u03AA\u039F\u039D\u03A4\u039F\u03A3");
		label_23.setFont(new Font("Arial", Font.PLAIN, 15));
		label_23.setBounds(325, 340, 150, 70);
		frmUstore.getContentPane().add(label_23);

		JLabel label_3 = new JLabel("\u0395\u03A0\u0395\u039E\u0395\u03A1\u0393\u0391\u03A3\u0399\u0391");
		label_3.setFont(new Font("Arial", Font.PLAIN, 15));
		label_3.setBounds(525, 300, 150, 70);
		frmUstore.getContentPane().add(label_3);

		JLabel label_32 = new JLabel("\u0391\u03A0\u039F\u0398\u0395\u039C\u0391\u03A4\u039F\u03A3");
		label_32.setFont(new Font("Arial", Font.PLAIN, 15));
		label_32.setBounds(521, 320, 150, 70);
		frmUstore.getContentPane().add(label_32);

		JLabel label_33 = new JLabel("\u03A0\u03A1\u039F\u03AA\u039F\u039D\u03A4\u039F\u03A3");
		label_33.setFont(new Font("Arial", Font.PLAIN, 15));
		label_33.setBounds(528, 340, 150, 70);
		frmUstore.getContentPane().add(label_33);

		JLabel label_4 = new JLabel("\u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397 \u03A3\u03A4\u0391");
		label_4.setFont(new Font("Arial", Font.PLAIN, 15));
		label_4.setBounds(720, 310, 150, 70);
		frmUstore.getContentPane().add(label_4);

		JLabel label_42 = new JLabel("\u0391\u03A0\u039F\u0398\u0395\u039C\u0391\u03A4\u0391");
		label_42.setFont(new Font("Arial", Font.PLAIN, 15));
		label_42.setBounds(730, 330, 150, 70);
		frmUstore.getContentPane().add(label_42);

		JLabel label_5 = new JLabel("\u0395\u039C\u03A6\u0391\u039D\u0399\u03A3\u0397");
		label_5.setFont(new Font("Arial", Font.PLAIN, 15));
		label_5.setBounds(945, 300, 150, 70);
		frmUstore.getContentPane().add(label_5);

		JLabel label_52 = new JLabel("\u03A3\u03A4\u0391\u03A4\u0399\u03A3\u03A4\u0399\u039A\u03A9\u039D");
		label_52.setFont(new Font("Arial", Font.PLAIN, 15));
		label_52.setBounds(938, 320, 150, 70);
		frmUstore.getContentPane().add(label_52);

		JLabel label_53 = new JLabel("\u03A3\u03A4\u039F\u0399\u03A7\u0395\u0399\u03A9\u039D");
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
				
				JLabel label_task = new JLabel("\u0394\u0397\u039C\u0399\u039F\u03A5\u03A1\u0393\u0399\u0391 \u039D\u0395\u039F\u03A5 \u03A0\u03A1\u039F\u03AA\u039F\u039D\u03A4\u039F\u03A3");
				label_task.setBackground(Color.DARK_GRAY);
				label_task.setForeground(Color.DARK_GRAY);
				label_task.setFont(new Font("Arial", Font.PLAIN, 20));
				label_task.setBounds(10, 55, 500, 25);
				frmUstore.getContentPane().add(label_task);
				
				JSeparator separator_2 = new JSeparator();
				separator_2.setBounds(0, 85, 1500, 7);
				frmUstore.getContentPane().add(separator_2);
				
				JLabel new_product_label_1 = new JLabel("\u03A4\u03AF\u03C4\u03BB\u03BF\u03C2");
				new_product_label_1.setFont(new Font("Arial", Font.PLAIN, 15));
				new_product_label_1.setBounds(450, 120, 100, 25);
				frmUstore.getContentPane().add(new_product_label_1);
				
				JLabel new_product_label_2 = new JLabel("Barcode");
				new_product_label_2.setFont(new Font("Arial", Font.PLAIN, 15));
				new_product_label_2.setBounds(450, 160, 100, 25);
				frmUstore.getContentPane().add(new_product_label_2);
				
				JLabel new_product_label_3 = new JLabel("\u039A\u03B1\u03C4\u03B7\u03B3\u03BF\u03C1\u03AF\u03B1");
				new_product_label_3.setFont(new Font("Arial", Font.PLAIN, 15));
				new_product_label_3.setBounds(450, 200, 100, 25);
				frmUstore.getContentPane().add(new_product_label_3);
				
				JLabel new_product_label_4 = new JLabel("\u03A5\u03C0\u03BF\u03BA\u03B1\u03C4\u03B7\u03B3\u03BF\u03C1\u03AF\u03B1");
				new_product_label_4.setFont(new Font("Arial", Font.PLAIN, 15));
				new_product_label_4.setBounds(450, 240, 100, 25);
				frmUstore.getContentPane().add(new_product_label_4);
				
				JLabel new_product_label_5 = new JLabel("\u03A4\u03B9\u03BC\u03AE");
				new_product_label_5.setFont(new Font("Arial", Font.PLAIN, 15));
				new_product_label_5.setBounds(450, 280, 100, 25);
				frmUstore.getContentPane().add(new_product_label_5);
				
				JLabel new_product_label_6 = new JLabel("\u03A6.\u03A0.\u0391.");
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
				
				JButton new_product_button = new JButton("\u0394\u0397\u039C\u0399\u039F\u03A5\u03A1\u0393\u0399\u0391");
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
				
				JLabel label_task = new JLabel("\u03A0\u03A1\u039F\u0392\u039F\u039B\u0397 \u0391\u03A0\u039F\u0398\u0395\u039C\u0391\u03A4\u039F\u03A3 \u03A0\u03A1\u039F\u03AA\u039F\u039D\u03A4\u039F\u03A3");
				label_task.setBackground(Color.DARK_GRAY);
				label_task.setForeground(Color.DARK_GRAY);
				label_task.setFont(new Font("Arial", Font.PLAIN, 20));
				label_task.setBounds(10, 55, 500, 25);
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
				
				JLabel label_task = new JLabel("\u0395\u03A0\u0395\u039E\u0395\u03A1\u0393\u0391\u03A3\u0399\u0391 \u0391\u03A0\u039F\u0398\u0395\u039C\u0391\u03A4\u039F\u03A3 \u03A0\u03A1\u039F\u03AA\u039F\u039D\u03A4\u039F\u03A3");
				label_task.setBackground(Color.DARK_GRAY);
				label_task.setForeground(Color.DARK_GRAY);
				label_task.setFont(new Font("Arial", Font.PLAIN, 20));
				label_task.setBounds(10, 55, 500, 25);
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
				
				JLabel label_task = new JLabel("\u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397 \u03A3\u03A4\u0391 \u0391\u03A0\u039F\u0398\u0395\u039C\u0391\u03A4\u0391");
				label_task.setBackground(Color.DARK_GRAY);
				label_task.setForeground(Color.DARK_GRAY);
				label_task.setFont(new Font("Arial", Font.PLAIN, 20));
				label_task.setBounds(10, 55, 500, 25);
				frmUstore.getContentPane().add(label_task);
				
				JSeparator separator_2 = new JSeparator();
				separator_2.setBounds(0, 85, 1500, 7);
				frmUstore.getContentPane().add(separator_2);
				
				//search_textField = new JTextField();
				//search_textField.setFont(new Font("Arial", Font.PLAIN, 15));
				//search_textField.setBounds(330, 180, 500, 40);
				//frmUstore.getContentPane().add(search_textField);
				//search_textField.setColumns(10);
				
				JButton search_btn = new JButton("\u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397");
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
				
				JLabel label_task = new JLabel("\u0395\u039C\u03A6\u0391\u039D\u0399\u03A3\u0397 \u03A3\u03A4\u0391\u03A4\u0399\u03A3\u03A4\u0399\u039A\u03A9\u039D \u03A3\u03A4\u039F\u0399\u03A7\u0395\u0399\u03A9\u039D");
				label_task.setBackground(Color.DARK_GRAY);
				label_task.setForeground(Color.DARK_GRAY);
				label_task.setFont(new Font("Arial", Font.PLAIN, 20));
				label_task.setBounds(10, 55, 500, 25);
				frmUstore.getContentPane().add(label_task);
				
				JSeparator separator_2 = new JSeparator();
				separator_2.setBounds(0, 85, 1200, 7);
				frmUstore.getContentPane().add(separator_2);
				
				JButton statistics_btn = new JButton("\u0391\u039B\u039B\u0391\u0393\u0397");
				statistics_btn.setBackground(new Color(30, 144, 255));
				statistics_btn.setForeground(Color.white);
				statistics_btn.setFont(new Font("Arial", Font.PLAIN, 12));
				statistics_btn.setBounds(950, 450, 150, 25);
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
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 535, 1200, 7);
		frmUstore.getContentPane().add(separator_3);

		JLabel label_10 = new JLabel("Copyright uStore A.E. 2015");
		label_10.setHorizontalTextPosition(SwingConstants.LEFT);
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setFont(new Font("Arial", Font.PLAIN, 10));
		label_10.setBackground(Color.DARK_GRAY);
		label_10.setBounds(10, 540, 434, 14);
		frmUstore.getContentPane().add(label_10);
	}
}