package ml_2015;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.SwingConstants;

public class show_reverse {

	private JFrame frmUstore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					show_reverse window = new show_reverse();
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
	public show_reverse() {
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
		
		JButton button_01 = new JButton("\u0391\u03C1\u03C7\u03B9\u03BA\u03AE");
		button_01.setBackground(Color.WHITE);
		button_01.setBounds(0, 0, 50, 50);
		frmUstore.getContentPane().add(button_01);
		button_01.setMaximumSize(new Dimension(20, 20));
		button_01.setFont(new Font("Arial", Font.PLAIN, 10));
		
		JButton button_02 = new JButton("\u03A0\u03AF\u03C3\u03C9");
		button_02.setBackground(Color.WHITE);
		button_02.setMaximumSize(new Dimension(20, 20));
		button_02.setFont(new Font("Arial", Font.PLAIN, 10));
		button_02.setBounds(51, 0, 50, 50);
		frmUstore.getContentPane().add(button_02);
		
		JLabel label_0 = new JLabel("\u03A7\u03C1\u03AE\u03C3\u03C4\u03B7\u03C2");
		label_0.setFont(new Font("Arial", Font.BOLD, 12));
		label_0.setBounds(1050, 20, 80, 15);
		frmUstore.getContentPane().add(label_0);
		
		JButton button_03 = new JButton("\u0391\u03C0\u03BF\u03C3\u03CD\u03BD\u03B4\u03B5\u03C3\u03B7");
		button_03.setBackground(Color.WHITE);
		button_03.setMaximumSize(new Dimension(20, 20));
		button_03.setFont(new Font("Arial", Font.PLAIN, 10));
		button_03.setBounds(1134, 0, 50, 50);
		frmUstore.getContentPane().add(button_03);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 51, 1200, 7);
		frmUstore.getContentPane().add(separator);
		
		JLabel label_01 = new JLabel("\u03A0\u03A1\u039F\u0392\u039F\u039B\u0397 \u0391\u03A0\u039F\u0398\u0395\u039C\u0391\u03A4\u039F\u03A3 \u03A0\u03A1\u039F\u03AA\u039F\u039D\u03A4\u039F\u03A3");
		label_01.setBackground(Color.DARK_GRAY);
		label_01.setForeground(Color.DARK_GRAY);
		label_01.setFont(new Font("Arial", Font.PLAIN, 20));
		label_01.setBounds(10, 55, 500, 25);
		frmUstore.getContentPane().add(label_01);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 85, 1200, 7);
		frmUstore.getContentPane().add(separator_2);
		
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
