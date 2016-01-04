package ml_2015;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Point;
import java.awt.Panel;
import javax.swing.JSeparator;

public class diax {

	private JFrame frmUstore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					diax window = new diax();
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
	public diax() {
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
		
		JLabel label_0 = new JLabel("\u0394\u03B9\u03B1\u03C7\u03B5\u03B9\u03C1\u03B9\u03C3\u03C4\u03AE\u03C2");
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
		
		JButton button_1 = new JButton("");
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(100, 180, 125, 125);
		frmUstore.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(305, 180, 125, 125);
		frmUstore.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(510, 180, 125, 125);
		frmUstore.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(715, 180, 125, 125);
		frmUstore.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("");
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
