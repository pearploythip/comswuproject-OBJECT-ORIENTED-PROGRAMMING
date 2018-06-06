package project;
import sun.audio.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Pray extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3141688062138822342L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static String msound;
	static String pword;
	public static AudioStream audioStream;
	public static InputStream in;
	private final JLabel lblNewLabel = new JLabel("");
	
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
	public Pray() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
//		String gongFile = "C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\sound\\"+ msound + ".wav";
//	    InputStream in = new FileInputStream(gongFile);
//	    // create an audiostream from the inputstream
//	    audioStream = new AudioStream(in);
	    
		JButton play = new JButton("");
		play.setBounds(34, 312, 100, 89);
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					eiei();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				fuck();
			}
		});
		contentPane.setLayout(null);
		play.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\pic\\1448154746_play.png"));
		play.setOpaque(false);
		play.setContentAreaFilled(false);
		play.setBorderPainted(false);
		play.setFocusPainted(false);
		//play.setBorder(EmptyBorder);
		contentPane.add(play);
		
		JButton pause = new JButton("");
		pause.setBounds(178, 312, 100, 89);
		pause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fuck2();
			}
		});
		pause.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\pic\\1448154755_pause.png"));
		pause.setOpaque(false);
		pause.setContentAreaFilled(false);
		pause.setBorderPainted(false);
		pause.setFocusPainted(false);
		//pause.setBorder(EmptyBorder);
		contentPane.add(pause);
		
		JButton All = new JButton("");
		All.setBounds(555, 312, 100, 89);
		All.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				All all = new All();
				all.setVisible(true);
				setVisible(false);	
			}
		});
		All.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\pic\\1448147764_back.png"));
		All.setSelectedIcon(null);
		All.setOpaque(false);
		All.setContentAreaFilled(false);
		All.setBorderPainted(false);
		All.setFocusPainted(false);
		//pause.setBorder(EmptyBorder);
		contentPane.add(All);
		lblNewLabel.setBounds(0, 0, 704, 446);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\pic\\12563-clouds-1366x768-vector-wallpaper.jpg"));
		contentPane.add(lblNewLabel);
	
	}

//	public void eiei2(String sound,String word) {
//		msound = sound;
//		pword = word;
//	}
	
	
	public static void eiei() throws IOException
	{
	    // open the sound file as a Java input stream
	    String gongFile = "C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\sound\\"+ msound + ".wav";
	    in = new FileInputStream(gongFile);
	    // create an audiostream from the inputstream
	    audioStream = new AudioStream(in);
	}
//	   
////	    if(mp == true)
////	    {
////	    	   AudioPlayer.player.start(audioStream);
////	    }
////	    else
////	    {
////	    	   AudioPlayer.player.stop(audioStream);
////	    }
//
//	}
	
	
public static void fuck(){
	System.out.print("start");
	AudioPlayer.player.start(audioStream);
	}
public static void fuck2(){
	System.out.print("stop");
	AudioPlayer.player.stop(audioStream);
	}
}

