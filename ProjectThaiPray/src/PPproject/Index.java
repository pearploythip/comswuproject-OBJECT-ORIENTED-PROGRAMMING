package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Index extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 650 );
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		// text field
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField.setBounds(345, 329, 220, 48);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		// name
		JLabel name = new JLabel("\u0E0A\u0E37\u0E48\u0E2D");
		name.setFont(new Font("Tahoma", Font.PLAIN, 28));
		name.setBounds(252, 320, 44, 58);
		contentPane.add(name);
		
		
		// text
		JLabel lblThaiPray = new JLabel("Thai Pray");
		lblThaiPray.setFont(new Font("Tahoma", Font.PLAIN, 67));
		lblThaiPray.setBounds(314, 177, 353, 90);
		contentPane.add(lblThaiPray);
		
		
		// ok botton
		JButton ok = new JButton("\u0E15\u0E01\u0E25\u0E07");
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu menu = new Menu();
				menu.setVisible(true);
				setVisible(false);
				
			}
		});
		ok.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ok.setBounds(380, 404, 123, 48);
		contentPane.add(ok);
		
		
		// monk pic
		JLabel monk = new JLabel("");
		monk.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\pic\\monk.png"));
		monk.setBounds(102, 107, 194, 160);
		contentPane.add(monk);
		
		
		// bg index
		JLabel bgindex = new JLabel("");
		bgindex.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\pic\\bg01.jpg"));
		bgindex.setBounds(0, 0, 834, 611);
		contentPane.add(bgindex);
	}
}
