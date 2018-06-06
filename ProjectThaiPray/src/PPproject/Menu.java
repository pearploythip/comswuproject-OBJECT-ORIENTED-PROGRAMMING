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
		
		JButton game = new JButton("");
		game.setBackground(new Color(240, 240, 240));
		game.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		game.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\pic\\1448140105_Quiz-Games-red.png"));
		game.setBounds(461, 134, 220, 186);
		contentPane.add(game);
		game.setOpaque(false);
		game.setContentAreaFilled(false);
		game.setBorderPainted(false);
		game.setFocusPainted(false);
		
		
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
		pray.setBounds(171, 134, 194, 186);
		pray.setOpaque(false);
		pray.setContentAreaFilled(false);
		pray.setBorderPainted(false);
		pray.setFocusPainted(false);
		//button_1.setBorder(EmptyBorder);
		contentPane.add(pray);
		
		JLabel lblPray = new JLabel("Pray");
		lblPray.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPray.setBounds(249, 320, 61, 45);
		contentPane.add(lblPray);
		
		JLabel lblGame = new JLabel("Game");
		lblGame.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGame.setBounds(550, 321, 71, 45);
		contentPane.add(lblGame);
		
		JLabel bgmenu = new JLabel("");
		bgmenu.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\pic\\1266817655.jpg"));
		bgmenu.setBounds(0, 0, 834, 611);
		contentPane.add(bgmenu);
		

	}

}
