package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class All extends JFrame {

	private JPanel contentPane;
	public String sound;
	public String word;
	private Pray pray = new Pray();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					All frame = new All();
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
	public All() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// 01 ∫Ÿ™“æ√–√—µπµ√—¬
		JButton btnNewButton = new JButton("\u0E1A\u0E39\u0E0A\u0E32\u0E1E\u0E23\u0E30\u0E23\u0E31\u0E15\u0E19\u0E15\u0E23\u0E31\u0E22");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pray.Sound("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\sound\\1.wav");
				pray.Text("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\text\\01.png");
				pray.setVisible(true);
			}
		});
		btnNewButton.setBounds(125, 53, 180, 95);
		contentPane.add(btnNewButton);
		
		
		// 02  π¡— °“√æ√–æÿ∑∏‡®È“
		JButton button = new JButton("\u0E19\u0E21\u0E31\u0E2A\u0E01\u0E32\u0E23\u0E1E\u0E23\u0E30\u0E1E\u0E38\u0E17\u0E18\u0E40\u0E08\u0E49\u0E32");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pray.Sound("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\sound\\2.wav");
				pray.Text("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\text\\02.png");
				pray.setVisible(true);
				
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.setBounds(464, 54, 180, 95);
		contentPane.add(button);
		
		//03 ∫∑æ√–æÿ∑∏§ÿ≥
		JButton button_1 = new JButton("\u0E1A\u0E17\u0E1E\u0E23\u0E30\u0E1E\u0E38\u0E17\u0E18\u0E04\u0E38\u0E13");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pray.Sound("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\sound\\3.wav");
				pray.Text("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\text\\03.png");
				pray.setVisible(true);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_1.setBounds(125, 168, 180, 95);
		contentPane.add(button_1);
		
		
		//04  Õ“√∏π“»’≈  5
		JButton arathana = new JButton("\u0E2D\u0E32\u0E23\u0E18\u0E19\u0E32\u0E28\u0E35\u0E25 5");
		arathana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pray.Sound("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\sound\\4.wav");
				pray.Text("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\text\\04.png");
				pray.setVisible(true);
				
			}
		});
		arathana.setFont(new Font("Tahoma", Font.PLAIN, 16));
		arathana.setBounds(464, 168, 180, 95);
		contentPane.add(arathana);
		
		//05  ∫∑ ¡“∑“π»’≈
		JButton samathan = new JButton("\u0E2A\u0E21\u0E32\u0E17\u0E32\u0E19\u0E28\u0E35\u0E25");
		samathan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				pray.Sound("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\sound\\5.wav");
				pray.Text("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\text\\05.png");
				pray.setVisible(true);
				
			}
		});
		samathan.setFont(new Font("Tahoma", Font.PLAIN, 17));
		samathan.setBounds(125, 285, 180, 95);
		contentPane.add(samathan);
		
		//06  ·ºË‡¡µµ“
		JButton button_4 = new JButton("\u0E41\u0E1C\u0E48\u0E40\u0E21\u0E15\u0E15\u0E32");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pray.Sound("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\sound\\6.wav");
				pray.Text("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\text\\06.png");
				pray.setVisible(true);
				
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_4.setBounds(464, 286, 180, 95);
		contentPane.add(button_4);
		
		// back to home
		JButton home = new JButton("");
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu menu = new Menu();
				menu.setVisible(true);
				setVisible(false);
			}
		});
		home.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\pic\\1448147609_home.png"));
		home.setBounds(639, 487, 87, 70);
		home.setOpaque(false);
		home.setContentAreaFilled(false);
		home.setBorderPainted(false);
		home.setFocusPainted(false);
		contentPane.add(home);
		
		JLabel lblNewLabel = new JLabel("\u0E2B\u0E19\u0E49\u0E32\u0E2B\u0E25\u0E31\u0E01");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(649, 550, 71, 29);
		contentPane.add(lblNewLabel);
		
		// bg all
		JLabel bgall = new JLabel("");
		bgall.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\pic\\bg02.jpg"));
		bgall.setBounds(-12, 0, 846, 600);
		contentPane.add(bgall);
	}
}
