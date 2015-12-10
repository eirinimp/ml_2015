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

public class new_product {

	private JFrame frmUstore;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new_product window = new new_product();
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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		frmUstore.getContentPane().add(menuBar);
		
		JButton button = new JButton("\u0391\u03C1\u03C7\u03B9\u03BA\u03AE");
		button.setMaximumSize(new Dimension(20, 20));
		button.setFont(new Font("Arial", Font.PLAIN, 10));
		menuBar.add(button);
		
		JLabel label = new JLabel("Copyright uStore A.E. 2015");
		label.setHorizontalTextPosition(SwingConstants.LEFT);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("Arial", Font.PLAIN, 10));
		label.setBackground(Color.DARK_GRAY);
		label.setBounds(0, 247, 434, 14);
		frmUstore.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("\u0394\u0397\u039C\u0399\u039F\u03A5\u03A1\u0393\u0399\u0391 \u039D\u0395\u039F\u03A5 \u03A0\u03A1\u039F\u03AA\u039F\u039D\u03A4\u039F\u03A3");
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setBounds(0, 25, 434, 14);
		frmUstore.getContentPane().add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\u03A4\u03AF\u03C4\u03BB\u03BF\u03C2");
		label_1.setBounds(130, 60, 80, 20);
		frmUstore.getContentPane().add(label_1);
		
		JLabel lblBarcode = new JLabel("Barcode");
		lblBarcode.setBounds(130, 90, 80, 20);
		frmUstore.getContentPane().add(lblBarcode);
		
		JLabel label_3 = new JLabel("\u039A\u03B1\u03C4\u03B7\u03B3\u03BF\u03C1\u03AF\u03B1");
		label_3.setBounds(130, 120, 80, 20);
		frmUstore.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u03A5\u03C0\u03BF\u03BA\u03B1\u03C4\u03B7\u03B3\u03BF\u03C1\u03AF\u03B1");
		label_4.setBounds(130, 150, 80, 20);
		frmUstore.getContentPane().add(label_4);
		
		JLabel label_2 = new JLabel("\u03A4\u03B9\u03BC\u03AE");
		label_2.setBounds(130, 180, 80, 20);
		frmUstore.getContentPane().add(label_2);
		
		JLabel label_5 = new JLabel("\u03A6.\u03A0.\u0391.");
		label_5.setBounds(130, 210, 80, 20);
		frmUstore.getContentPane().add(label_5);
		
		textField = new JTextField();
		textField.setBounds(220, 60, 100, 20);
		frmUstore.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(220, 90, 100, 20);
		frmUstore.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(220, 120, 100, 20);
		frmUstore.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(220, 150, 100, 20);
		frmUstore.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(220, 180, 100, 20);
		frmUstore.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(220, 210, 100, 20);
		frmUstore.getContentPane().add(textField_5);
	}

}
