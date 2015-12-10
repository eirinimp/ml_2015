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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		frmUstore.getContentPane().add(menuBar);
		
		JButton button = new JButton("\u0391\u03C1\u03C7\u03B9\u03BA\u03AE");
		button.setMaximumSize(new Dimension(20, 20));
		button.setFont(new Font("Arial", Font.PLAIN, 10));
		menuBar.add(button);
		
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
	}
}
