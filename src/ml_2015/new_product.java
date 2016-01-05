package ml_2015;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class new_product {

	private JFrame frmUstore;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new_product window = new new_product();
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
	public new_product() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUstore = new JFrame();
		frmUstore.setFont(new Font("Arial", Font.PLAIN, 15));
		frmUstore.setTitle("uStore");
		frmUstore.setBounds(100, 100, 450, 300);
		frmUstore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUstore.getContentPane().setLayout(null);
		
		JButton button_01 = new JButton("");
		button_01.setIcon(new ImageIcon("src\\icons\\home.png"));
		button_01.setBackground(Color.WHITE);
		button_01.setBounds(0, 0, 50, 50);
		frmUstore.getContentPane().add(button_01);
		button_01.setMaximumSize(new Dimension(20, 20));
		button_01.setFont(new Font("Arial", Font.PLAIN, 10));
		
		JButton button_02 = new JButton("");
		button_02.setIcon(new ImageIcon("src\\icons\\back.png"));
		button_02.setBackground(Color.WHITE);
		button_02.setMaximumSize(new Dimension(20, 20));
		button_02.setFont(new Font("Arial", Font.PLAIN, 10));
		button_02.setBounds(51, 0, 50, 50);
		frmUstore.getContentPane().add(button_02);
		
		JLabel label_0 = new JLabel("\u03A7\u03C1\u03AE\u03C3\u03C4\u03B7\u03C2");
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
		
		JLabel label_01 = new JLabel("\u0394\u0397\u039C\u0399\u039F\u03A5\u03A1\u0393\u0399\u0391 \u039D\u0395\u039F\u03A5 \u03A0\u03A1\u039F\u03AA\u039F\u039D\u03A4\u039F\u03A3");
		label_01.setBackground(Color.DARK_GRAY);
		label_01.setForeground(Color.DARK_GRAY);
		label_01.setFont(new Font("Arial", Font.PLAIN, 20));
		label_01.setBounds(10, 55, 500, 25);
		frmUstore.getContentPane().add(label_01);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 85, 1200, 7);
		frmUstore.getContentPane().add(separator_2);
		
		JLabel label_1 = new JLabel("\u03A4\u03AF\u03C4\u03BB\u03BF\u03C2");
		label_1.setFont(new Font("Arial", Font.PLAIN, 15));
		label_1.setBounds(450, 120, 100, 25);
		frmUstore.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Barcode");
		label_2.setFont(new Font("Arial", Font.PLAIN, 15));
		label_2.setBounds(450, 160, 100, 25);
		frmUstore.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u039A\u03B1\u03C4\u03B7\u03B3\u03BF\u03C1\u03AF\u03B1");
		label_3.setFont(new Font("Arial", Font.PLAIN, 15));
		label_3.setBounds(450, 200, 100, 25);
		frmUstore.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u03A5\u03C0\u03BF\u03BA\u03B1\u03C4\u03B7\u03B3\u03BF\u03C1\u03AF\u03B1");
		label_4.setFont(new Font("Arial", Font.PLAIN, 15));
		label_4.setBounds(450, 240, 100, 25);
		frmUstore.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("\u03A4\u03B9\u03BC\u03AE");
		label_5.setFont(new Font("Arial", Font.PLAIN, 15));
		label_5.setBounds(450, 280, 100, 25);
		frmUstore.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("\u03A6.\u03A0.\u0391.");
		label_6.setFont(new Font("Arial", Font.PLAIN, 15));
		label_6.setBounds(450, 320, 100, 25);
		frmUstore.getContentPane().add(label_6);
		
		textField_1 = new JTextField();
		textField_1.setBounds(570, 120, 200, 25);
		frmUstore.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(570, 160, 200, 25);
		frmUstore.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(570, 200, 200, 25);
		frmUstore.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(570, 240, 200, 25);
		frmUstore.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(570, 280, 200, 25);
		frmUstore.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(570, 320, 200, 25);
		frmUstore.getContentPane().add(textField_6);
		
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
