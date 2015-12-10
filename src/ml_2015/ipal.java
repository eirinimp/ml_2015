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
		frmUstore.setFont(new Font("Arial", Font.PLAIN, 15));
		frmUstore.setTitle("uStore");
		frmUstore.setBounds(100, 100, 450, 300);
		frmUstore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUstore.getContentPane().setLayout(null);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(65, 90, 70, 70);
		frmUstore.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBounds(180, 90, 70, 70);
		frmUstore.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBounds(295, 90, 70, 70);
		frmUstore.getContentPane().add(button_3);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		frmUstore.getContentPane().add(menuBar);
		
		JButton btnNewButton = new JButton("\u0391\u03C1\u03C7\u03B9\u03BA\u03AE");
		btnNewButton.setMaximumSize(new Dimension(20, 20));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 10));
		menuBar.add(btnNewButton);
		
		JLabel label = new JLabel("Copyright uStore A.E. 2015");
		label.setHorizontalTextPosition(SwingConstants.LEFT);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("Arial", Font.PLAIN, 10));
		label.setBackground(Color.DARK_GRAY);
		label.setBounds(0, 247, 434, 14);
		frmUstore.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u03A0\u03A1\u039F\u0392\u039F\u039B\u0397 \u0391\u03A0\u039F\u0398\u0395\u039C\u0391\u03A4\u039F\u03A3 \u03A0\u03A1\u039F\u03AA\u039F\u039D\u03A4\u039F\u03A3");
		label_1.setFont(new Font("Arial", Font.PLAIN, 10));
		label_1.setBounds(65, 171, 70, 70);
		frmUstore.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u0395\u03A0\u0395\u039E\u0395\u03A1\u0393\u0391\u03A3\u0399\u0391 \u0391\u03A0\u039F\u0398\u0395\u039C\u0391\u03A4\u039F\u03A3 \u03A0\u03A1\u039F\u03AA\u039F\u039D\u03A4\u039F\u03A3");
		label_2.setFont(new Font("Arial", Font.PLAIN, 10));
		label_2.setBounds(180, 171, 70, 70);
		frmUstore.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397 \u03A3\u03A4\u0391 \u0391\u03A0\u039F\u0398\u0395\u039C\u0391\u03A4\u0391");
		label_3.setFont(new Font("Arial", Font.PLAIN, 10));
		label_3.setBounds(295, 171, 70, 70);
		frmUstore.getContentPane().add(label_3);
		
	}
}
