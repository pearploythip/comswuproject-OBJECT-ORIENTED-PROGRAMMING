package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton pray = new JButton("");
		pray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				All all = new All();
				all.setVisible(true);
				setVisible(false);
			}
		});
		pray.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\pic\\1448142780_41_itunes.png"));
		pray.setBackground(new Color(240, 240, 240));
		pray.setBounds(192, 134, 194, 186);
		pray.setOpaque(false);
		pray.setContentAreaFilled(false);
		pray.setBorderPainted(false);
		pray.setFocusPainted(false);
		contentPane.add(pray);
		
		JLabel lblPray = new JLabel("\u0E1A\u0E17\u0E2A\u0E27\u0E14\u0E21\u0E19\u0E15\u0E4C");
		lblPray.setHorizontalAlignment(SwingConstants.CENTER);
		lblPray.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPray.setBounds(231, 320, 114, 45);
		contentPane.add(lblPray);
		
		JLabel lblGame = new JLabel("\u0E15\u0E2D\u0E1A\u0E04\u0E33\u0E16\u0E32\u0E21");
		lblGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblGame.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGame.setBounds(478, 321, 102, 45);
		contentPane.add(lblGame);
		
		JLabel label = new JLabel("\u0E2B\u0E19\u0E49\u0E32\u0E2B\u0E25\u0E31\u0E01");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label.setBounds(335, 48, 171, 35);
		contentPane.add(label);
		
		JButton game = new JButton("");
		game.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Quiz01 q = new Quiz01();
				q.initialize();
				setVisible(false);
			}
		});
		game.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\pic\\1448140105_Quiz-Games-red.png"));
		game.setBounds(438, 134, 194, 186);
		contentPane.add(game);
		game.setOpaque(false);
		game.setContentAreaFilled(false);
		game.setBorderPainted(false);
		game.setFocusPainted(false);
		
		JLabel bgmenu = new JLabel("");
		bgmenu.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\pic\\1266817655.jpg"));
		bgmenu.setBounds(0, 0, 834, 611);
		contentPane.add(bgmenu);
		

	}
}
