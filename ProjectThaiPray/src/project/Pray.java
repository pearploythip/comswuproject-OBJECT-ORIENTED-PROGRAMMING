package project;

import sun.audio.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Pray extends JFrame {

	/**
	 * 
	 */private InputStream in;
		private AudioStream audio;
	private static final long serialVersionUID = -3141688062138822342L;
	private JPanel contentPane;
	private JFileChooser chooser;
	private JLabel content;
	

	/**
	 * Launch the application.
	 */
	static String msound;
	static String pword;
	public static AudioStream audioStream;
	private final JLabel bgpray = new JLabel("");
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pray frame = new Pray();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Pray() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
//		String gongFile = "C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\sound\\"+ msound + ".wav";
//	    InputStream in = new FileInputStream(gongFile);
//	    // create an audiostream from the inputstream
//	    audioStream = new AudioStream(in);
	    
		JButton play = new JButton("");
		play.setBounds(22, 483, 121, 117);
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				start();
			}
		});
		contentPane.setLayout(null);
		play.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\pic\\1448154746_play.png"));
		play.setOpaque(false);
		play.setContentAreaFilled(false);
		play.setBorderPainted(false);
		play.setFocusPainted(false);
		//play.setBorder(EmptyBorder);
		contentPane.add(play);
		
		JButton pause = new JButton("");
		pause.setBounds(191, 483, 129, 117);
		pause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stop();
			}
		});
		pause.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\pic\\1448154755_pause.png"));
		pause.setOpaque(false);
		pause.setContentAreaFilled(false);
		pause.setBorderPainted(false);
		pause.setFocusPainted(false);
		//pause.setBorder(EmptyBorder);
		contentPane.add(pause);
		
		JButton All = new JButton("");
		All.setBounds(656, 482, 115, 105);
		All.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				All all = new All();
				all.setVisible(true);
				setVisible(false);
				AudioPlayer.player.stop(audio);
			}
		});
		All.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\pic\\1448147764_back.png"));
		All.setSelectedIcon(null);
		All.setOpaque(false);
		All.setContentAreaFilled(false);
		All.setBorderPainted(false);
		All.setFocusPainted(false);
		//pause.setBorder(EmptyBorder);
		contentPane.add(All);
		
		content = new JLabel("");
		content.setBounds(22, 22, 785, 450);
		contentPane.add(content);
		
		bgpray.setBounds(0, 0, 834, 611);
		bgpray.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\pic\\12563-clouds-1366x768-vector-wallpaper.jpg"));
		contentPane.add(bgpray);
	
	}

//	public void eiei2(String sound,String word) {
//		msound = sound;
//		pword = word;
//	}
	
	/**
	 * Creates new form songplay
	 * @return 
	 */
	public void Sound(String fname) {

	  try {
		  in = new FileInputStream(new File (fname));
		  audio = new AudioStream(in);          
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	}
	
	/**
	 * start the sound
	 */
	public void start() {
		AudioPlayer.player.start(audio);
	}
	
	/**
	 * stop the sound
	 */
	public void stop() {
		AudioPlayer.player.stop(audio);
	}

	public void Text(String text) {
		// TODO Auto-generated method stub
		content.setIcon(new ImageIcon(text));
		
	}
}

