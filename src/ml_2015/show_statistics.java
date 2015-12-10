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

public class show_statistics {

	private JFrame frmUstore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					show_statistics window = new show_statistics();
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
	public show_statistics() {
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
		
		JLabel lblNewLabel = new JLabel("\u0395\u039C\u03A6\u0391\u039D\u0399\u03A3\u0397 \u03A3\u03A4\u0391\u03A4\u0399\u03A3\u03A4\u0399\u039A\u03A9\u039D \u03A3\u03A4\u039F\u0399\u03A7\u0395\u0399\u03A9\u039D");
		lblNewLabel.setBounds(0, 25, 434, 14);
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		frmUstore.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u0391\u03BB\u03BB\u03B1\u03B3\u03AE");
		btnNewButton.setBounds(335, 210, 89, 23);
		frmUstore.getContentPane().add(btnNewButton);
	}
}
