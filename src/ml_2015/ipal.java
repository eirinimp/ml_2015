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

public class ipal {

	private JFrame frmUstore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ipal window = new ipal();
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
	public ipal() {
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