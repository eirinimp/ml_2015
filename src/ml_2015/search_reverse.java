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

public class search_reverse {

	private JFrame frmUstore;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					search_reverse window = new search_reverse();
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
	public search_reverse() {
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
		
		JLabel label = new JLabel("Copyright uStore A.E. 2015");
		label.setBounds(0, 247, 434, 14);
		label.setHorizontalTextPosition(SwingConstants.LEFT);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("Arial", Font.PLAIN, 10));
		label.setBackground(Color.DARK_GRAY);
		frmUstore.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("\u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397 \u03A3\u03A4\u039F \u0391\u03A0\u039F\u0398\u0395\u039C\u0391");
		lblNewLabel.setBounds(0, 25, 434, 14);
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		frmUstore.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(120, 90, 200, 20);
		frmUstore.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397");
		btnNewButton.setBounds(170, 120, 100, 23);
		frmUstore.getContentPane().add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 21, 434, 7);
		frmUstore.getContentPane().add(separator);
		
		JButton button = new JButton("\u0391\u03C1\u03C7\u03B9\u03BA\u03AE");
		button.setBounds(0, 0, 20, 20);
		frmUstore.getContentPane().add(button);
		button.setMaximumSize(new Dimension(20, 20));
		button.setFont(new Font("Arial", Font.PLAIN, 10));
		
		JButton button_1 = new JButton("\u0391\u03C0\u03BF\u03C3\u03CD\u03BD\u03B4\u03B5\u03C3\u03B7");
		button_1.setMaximumSize(new Dimension(20, 20));
		button_1.setFont(new Font("Arial", Font.PLAIN, 10));
		button_1.setBounds(414, 0, 20, 20);
		frmUstore.getContentPane().add(button_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 42, 434, 7);
		frmUstore.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 245, 434, 7);
		frmUstore.getContentPane().add(separator_2);
		
		JLabel label_1 = new JLabel("\u03A7\u03C1\u03AE\u03C3\u03C4\u03B7\u03C2");
		label_1.setBounds(325, 3, 80, 15);
		frmUstore.getContentPane().add(label_1);
		
		JButton button_2 = new JButton("\u03A0\u03AF\u03C3\u03C9");
		button_2.setMaximumSize(new Dimension(20, 20));
		button_2.setFont(new Font("Arial", Font.PLAIN, 10));
		button_2.setBounds(21, 0, 20, 20);
		frmUstore.getContentPane().add(button_2);
	}
}
