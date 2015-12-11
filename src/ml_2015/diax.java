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
		
		JButton button = new JButton("");
		button.setBounds(10, 90, 70, 70);
		frmUstore.getContentPane().add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(95, 90, 70, 70);
		frmUstore.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBounds(180, 90, 70, 70);
		frmUstore.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBounds(265, 90, 70, 70);
		frmUstore.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBounds(350, 90, 70, 70);
		frmUstore.getContentPane().add(button_4);
		
		JLabel lblNewLabel = new JLabel("ƒ«Ã…œ’—√…¡\n\rÕ≈œ’\n\r–—œ⁄œÕ‘œ”");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel.setBounds(10, 171, 70, 70);
		frmUstore.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("Copyright uStore A.E. 2015");
		label.setHorizontalTextPosition(SwingConstants.LEFT);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("Arial", Font.PLAIN, 10));
		label.setBackground(Color.DARK_GRAY);
		label.setBounds(0, 247, 434, 14);
		frmUstore.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u03A0\u03A1\u039F\u0392\u039F\u039B\u0397 \u0391\u03A0\u039F\u0398\u0395\u039C\u0391\u03A4\u039F\u03A3 \u03A0\u03A1\u039F\u03AA\u039F\u039D\u03A4\u039F\u03A3");
		label_1.setFont(new Font("Arial", Font.PLAIN, 10));
		label_1.setBounds(95, 171, 70, 70);
		frmUstore.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u0395\u03A0\u0395\u039E\u0395\u03A1\u0393\u0391\u03A3\u0399\u0391 \u0391\u03A0\u039F\u0398\u0395\u039C\u0391\u03A4\u039F\u03A3 \u03A0\u03A1\u039F\u03AA\u039F\u039D\u03A4\u039F\u03A3");
		label_2.setFont(new Font("Arial", Font.PLAIN, 10));
		label_2.setBounds(180, 171, 70, 70);
		frmUstore.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397 \u03A3\u03A4\u0391 \u0391\u03A0\u039F\u0398\u0395\u039C\u0391\u03A4\u0391");
		label_3.setFont(new Font("Arial", Font.PLAIN, 10));
		label_3.setBounds(265, 171, 70, 70);
		frmUstore.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u0395\u039C\u03A6\u0391\u039D\u0399\u03A3\u0397 \u03A3\u03A4\u0391\u03A4\u0399\u03A3\u03A4\u0399\u039A\u03A9\u039D \u03A3\u03A4\u039F\u0399\u03A7\u0395\u0399\u03A9\u039D");
		label_4.setFont(new Font("Arial", Font.PLAIN, 10));
		label_4.setBounds(350, 171, 70, 70);
		frmUstore.getContentPane().add(label_4);
		
		JButton btnNewButton = new JButton("\u0391\u03C1\u03C7\u03B9\u03BA\u03AE");
		btnNewButton.setBounds(0, 0, 20, 20);
		frmUstore.getContentPane().add(btnNewButton);
		btnNewButton.setMaximumSize(new Dimension(20, 20));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 10));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 21, 434, 7);
		frmUstore.getContentPane().add(separator);
		
		JButton button_5 = new JButton("\u0391\u03C0\u03BF\u03C3\u03CD\u03BD\u03B4\u03B5\u03C3\u03B7");
		button_5.setMaximumSize(new Dimension(20, 20));
		button_5.setFont(new Font("Arial", Font.PLAIN, 10));
		button_5.setBounds(414, 0, 20, 20);
		frmUstore.getContentPane().add(button_5);
		
		JLabel lblNewLabel_1 = new JLabel("\u0394\u03B9\u03B1\u03C7\u03B5\u03B9\u03C1\u03B9\u03C3\u03C4\u03AE\u03C2");
		lblNewLabel_1.setBounds(325, 3, 80, 15);
		frmUstore.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 247, 1, 2);
		frmUstore.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 245, 434, 7);
		frmUstore.getContentPane().add(separator_2);
		
	}
}
