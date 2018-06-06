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

public class All extends JFrame {

	private JPanel contentPane;
	public String sound;
	public String word;

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
		setBounds(100, 100, 720, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// 01 ∫Ÿ™“æ√–√—µπµ√—¬
		JButton btnNewButton = new JButton("\u0E1A\u0E39\u0E0A\u0E32\u0E1E\u0E23\u0E30\u0E23\u0E31\u0E15\u0E19\u0E15\u0E23\u0E31\u0E22");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				word = "1";
				sound = "1";
		
				Pray pray1 = null;
				try {
					pray1 = new Pray();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				pray1.setVisible(true);
				Pray.msound = sound;
				pray1.pword = word;
				setVisible(false);
				
			}
		});
		btnNewButton.setBounds(125, 53, 142, 66);
		contentPane.add(btnNewButton);
		
		
		// 02  π¡— °“√æ√–æÿ∑∏‡®È“
		JButton button = new JButton("\u0E19\u0E21\u0E31\u0E2A\u0E01\u0E32\u0E23\u0E1E\u0E23\u0E30\u0E1E\u0E38\u0E17\u0E18\u0E40\u0E08\u0E49\u0E32");
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.setBounds(421, 53, 142, 66);
		contentPane.add(button);
		
		//03 ∫∑æ√–æÿ∑∏§ÿ≥
		JButton button_1 = new JButton("\u0E1A\u0E17\u0E1E\u0E23\u0E30\u0E1E\u0E38\u0E17\u0E18\u0E04\u0E38\u0E13");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_1.setBounds(125, 168, 142, 66);
		contentPane.add(button_1);
		
		
		//04  Õ“√∏π“»’≈  5
		JButton arathana = new JButton("\u0E2D\u0E32\u0E23\u0E18\u0E19\u0E32\u0E28\u0E35\u0E25 5");
		arathana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				word = "arathana";
				sound = "arathana";
		
				Pray pray1 = null;
				try {
					pray1 = new Pray();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				pray1.setVisible(true);
				pray1.msound = sound;
				pray1.pword = word;
				setVisible(false);
				
				
			}
		});
		arathana.setFont(new Font("Tahoma", Font.PLAIN, 16));
		arathana.setBounds(421, 168, 142, 66);
		contentPane.add(arathana);
		
		//∫∑ ¡“∑“π»’≈
		JButton samathan = new JButton("\u0E2A\u0E21\u0E32\u0E17\u0E32\u0E19\u0E28\u0E35\u0E25");
		samathan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				word = "samathan";
				sound = "samathan";
		
				Pray pray1 = null;
				try {
					pray1 = new Pray();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				pray1.setVisible(true);
				pray1.msound = sound;
				pray1.pword = word;
				setVisible(false);
				
				
			}
		});
		samathan.setFont(new Font("Tahoma", Font.PLAIN, 17));
		samathan.setBounds(125, 285, 142, 66);
		contentPane.add(samathan);
		
		//·ºË‡¡µµ“
		JButton button_4 = new JButton("\u0E41\u0E1C\u0E48\u0E40\u0E21\u0E15\u0E15\u0E32");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_4.setBounds(421, 285, 142, 66);
		contentPane.add(button_4);
		
		JButton Menu = new JButton("");
		Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				setVisible(false);
				
				
				
			}
		});
		Menu.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\pic\\1448147609_home.png"));
		Menu.setBounds(580, 375, 81, 60);
		Menu.setOpaque(false);
		Menu.setContentAreaFilled(false);
		Menu.setBorderPainted(false);
		Menu.setFocusPainted(false);
		contentPane.add(Menu);
		
		JLabel label = new JLabel("\u0E19\u0E21\u0E31\u0E2A\u0E01\u0E32\u0E23\u0E1E\u0E23\u0E30\u0E1E\u0E38\u0E17\u0E18\u0E40\u0E08\u0E49\u0E32");
		label.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\pic\\1266817655.jpg"));
		label.setBounds(-13, 0, 717, 446);
		contentPane.add(label);
	}

}
