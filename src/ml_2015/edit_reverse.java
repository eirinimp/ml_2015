package ml_2015;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class edit_reverse {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					edit_reverse window = new edit_reverse();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public edit_reverse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("\u0391\u03C1\u03C7\u03B9\u03BA\u03AE");
		button.setMaximumSize(new Dimension(20, 20));
		button.setFont(new Font("Arial", Font.PLAIN, 10));
		button.setBounds(0, 0, 20, 20);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u03A0\u03AF\u03C3\u03C9");
		button_1.setMaximumSize(new Dimension(20, 20));
		button_1.setFont(new Font("Arial", Font.PLAIN, 10));
		button_1.setBounds(21, 0, 20, 20);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\u0391\u03C1\u03C7\u03B9\u03BA\u03AE");
		button_2.setMaximumSize(new Dimension(20, 20));
		button_2.setFont(new Font("Arial", Font.PLAIN, 10));
		button_2.setBounds(414, 0, 20, 20);
		frame.getContentPane().add(button_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 21, 434, 7);
		frame.getContentPane().add(separator);
		
		JLabel label = new JLabel("\u0395\u03A0\u0395\u039E\u0395\u03A1\u0393\u0391\u03A3\u0399\u0391 \u0391\u03A0\u039F\u0398\u0395\u039C\u0391\u03A4\u039F\u03A3 \u03A0\u03A1\u039F\u03AA\u039F\u039D\u03A4\u039F\u03A3");
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Arial", Font.PLAIN, 15));
		label.setBackground(Color.DARK_GRAY);
		label.setBounds(0, 25, 434, 15);
		frame.getContentPane().add(label);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 42, 434, 7);
		frame.getContentPane().add(separator_1);
		
		JLabel label_1 = new JLabel("Copyright uStore A.E. 2015");
		label_1.setHorizontalTextPosition(SwingConstants.LEFT);
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Arial", Font.PLAIN, 10));
		label_1.setBackground(Color.DARK_GRAY);
		label_1.setBounds(0, 247, 434, 14);
		frame.getContentPane().add(label_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 245, 434, 7);
		frame.getContentPane().add(separator_2);
		
		JLabel label_2 = new JLabel("\u03A7\u03C1\u03AE\u03C3\u03C4\u03B7\u03C2");
		label_2.setBounds(325, 3, 80, 15);
		frame.getContentPane().add(label_2);
	}

}
