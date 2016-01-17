package ml_2015;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

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
	public show_statistics() {
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
		
		JLabel label_01 = new JLabel("\u0395\u039C\u03A6\u0391\u039D\u0399\u03A3\u0397 \u03A3\u03A4\u0391\u03A4\u0399\u03A3\u03A4\u0399\u039A\u03A9\u039D \u03A3\u03A4\u039F\u0399\u03A7\u0395\u0399\u03A9\u039D");
		label_01.setBackground(Color.DARK_GRAY);
		label_01.setForeground(Color.DARK_GRAY);
		label_01.setFont(new Font("Arial", Font.PLAIN, 20));
		label_01.setBounds(10, 55, 500, 25);
		frmUstore.getContentPane().add(label_01);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 85, 1200, 7);
		frmUstore.getContentPane().add(separator_2);
		
		JButton button_1 = new JButton("\u0391\u039B\u039B\u0391\u0393\u0397");
		button_1.setBackground(new Color(30, 144, 255));
		button_1.setForeground(Color.white);
		button_1.setFont(new Font("Arial", Font.PLAIN, 12));
		button_1.setBounds(950, 450, 150, 25);
		frmUstore.getContentPane().add(button_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 535, 1200, 7);
		frmUstore.getContentPane().add(separator_3);

		JLabel label_10 = new JLabel("\u00a9 Copyright uStore A.E. 2015");
		label_10.setHorizontalTextPosition(SwingConstants.LEFT);
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setFont(new Font("Arial", Font.PLAIN, 10));
		label_10.setBackground(Color.DARK_GRAY);
		label_10.setBounds(10, 540, 434, 14);
		frmUstore.getContentPane().add(label_10);
	}
}