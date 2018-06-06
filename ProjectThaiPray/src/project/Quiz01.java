package project;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import sun.audio.*;
import javax.sound.sampled.AudioInputStream;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Quiz01  {

	public static JFrame frame;
	public static JLabel pic;
	public static JButton ans1;
	public static JButton ans2;
	public static JButton ans3;
	public static JButton ans4;

	public static Quiz01 q;
	public static AudioStream audio;
	public static String sound="C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\sound\\7.wav";
	public static int score=0;
	public static int counter=1;
	public static String[] answer = new String[41];
	public static JLabel totalScore;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		
		answer[1]=" บูชาพระรัตนตรัย";// answer //1
		answer[2]="อารธนาศีล 5";
		answer[3]="สมาทานศีล 5";
		answer[4]="แผ่เมตตา";
		answer[5]="ปัญจะ สีลานิ";
		answer[6]="ตะติยัมปิ มะยัง";
		answer[7]="วิสุง วิสุง";//answer //3
		answer[8]="สีลานิ ยาจามะ";
		answer[9]="นมัสการพระพุทธเจ้า";
		answer[10]="บูชาพระรัตนตรัย";
		answer[11]="สมาทานศีล 5";
		answer[12]="บทพระพุทธคุณ";//answer //4
		answer[13]="สมาทานศีล 5";
		answer[14]="แผ่เมตตา";
		answer[15]="บทพระพุทธคุณ";
		answer[16]="นมัสการพระพุทธเจ้า";// answer //4
		answer[17]="บทพระพุทธคุณ";
		answer[18]="แผ่เมตตา";// answer //2
		answer[19]="สมาทานศีล 5";
		answer[20]="บทพระพุทธคุณ";
		answer[21]="ภะคะวะตา";//answer //1
		answer[22]="ทักขิเนยโย";
		answer[23]="ยะทิทัง";
		answer[24]="วิญญูฮีติ";
		answer[25]="ภะคะวา";
		answer[26]="ภะคะวะตา";
		answer[27]="อะภิวาเทมิ";
		answer[28]="สาวะกะสังโฆ";//answer //4
		answer[29]="ภะคะวะโต";
		answer[30]="วิญญูฮีติ";//answer //2
		answer[31]="จัตตาริ";
		answer[32]="สาวะกะสังโฆ";
		answer[33]="บทพระพุทธคุณ";
		answer[34]="แผ่เมตตา";
		answer[35]="สมาทานศีล 5";// answer //3
		answer[36]="บทพระพุทธคุณ";
		answer[37]="เวรมณี";//answer //1
		answer[38]="สิกฺขาปทํ";
		answer[39]="สมาทิยามิ";
		answer[40]="สาวะกะสังโฆ";
		
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		pic = new JLabel("");
		pic.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\question\\q1.png"));
		pic.setHorizontalAlignment(SwingConstants.CENTER);
		pic.setBounds(22, 70, 780, 400);
		frame.getContentPane().add(pic);
		
		JButton bpnplay = new JButton("");
		bpnplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AudioPlayer.player.start(audio);
			}
		});
		bpnplay.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\pic\\1448938173_black_7_music_node.png"));
		bpnplay.setBounds(22, 11, 103, 47);
		bpnplay.setOpaque(false);
		bpnplay.setContentAreaFilled(false);
		bpnplay.setBorderPainted(false);
		bpnplay.setFocusPainted(false);
		frame.getContentPane().add(bpnplay);
		
		JButton btnpause = new JButton("");
		btnpause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AudioPlayer.player.stop(audio);
			}
		});
		btnpause.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\pic\\1448938187_black_4_audio_stop.png"));
		btnpause.setBounds(170, 11, 113, 48);
		btnpause.setOpaque(false);
		btnpause.setContentAreaFilled(false);
		btnpause.setBorderPainted(false);
		btnpause.setFocusPainted(false);
		frame.getContentPane().add(btnpause);
		
		ans1 = new JButton(answer[1]);
		ans1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if ((counter !=1 && counter !=6 && counter!=10) && counter<=10){
					changeqs();
				}
				else if(counter == 1 || counter == 6 || counter == 10){
					score++;
					changeqs();
				}
			}
		});
		ans1.setBounds(68, 493, 261, 44);
		frame.getContentPane().add(ans1);
	
		
		ans2 = new JButton(answer[2]);
		ans2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if ((counter !=5 && counter !=8 ) && counter<=10){
					changeqs();
				}
				else if(counter == 5 || counter == 8 ){
					score++;
					changeqs();
				}
			}
		});
		ans2.setBounds(469, 493, 261, 44);
		frame.getContentPane().add(ans2);
		
		ans3 = new JButton(answer[3]);
		ans3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if ((counter !=2 && counter !=9 ) && counter<=10){
					changeqs();
				}
				else if(counter == 2 || counter == 9 ){
					score++;
					changeqs();
				}
			}
		});
		ans3.setBounds(68, 548, 261, 44);
		frame.getContentPane().add(ans3);
		
		ans4 = new JButton(answer[4]);
		ans4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if ((counter !=3 && counter !=4 && counter!=7) && counter<=10){
					changeqs();
				}
				else if(counter == 3 || counter == 4 || counter == 7){
					score++;
					changeqs();
				}
			}
		});
		ans4.setBounds(469, 548, 261, 44);
		frame.getContentPane().add(ans4);
		
		totalScore = new JLabel("");
		totalScore.setHorizontalAlignment(SwingConstants.CENTER);
		totalScore.setFont(new Font("Tahoma", Font.PLAIN, 46));
		totalScore.setBounds(128, 470, 519, 119);
		frame.getContentPane().add(totalScore);
		
	
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\pic\\idee-regalo-uomo-e-donna-i-regali-per-tutte-le-occasioni-sfondo-4.jpg"));
		lblNewLabel.setBounds(0, 0, 834, 611);
		frame.getContentPane().add(lblNewLabel);
		try{									
			InputStream in = new FileInputStream(new File (sound));
            audio = new AudioStream(in);
        }
        catch(Exception e){
        }
		
	}
	private void changeqs(){
		counter++;
		pic.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\question\\q"+counter+".png"));
		
		if(counter==2){
			ans1.setText(answer[5]);
			ans2.setText(answer[6]);
			ans3.setText(answer[7]);
			ans4.setText(answer[8]);
		}
		else if(counter==3){
			ans1.setText(answer[9]);
			ans2.setText(answer[10]);
			ans3.setText(answer[11]);
			ans4.setText(answer[12]);
		}
		else if(counter==4){
			ans1.setText(answer[13]);
			ans2.setText(answer[14]);
			ans3.setText(answer[15]);
			ans4.setText(answer[16]);
		}
		else if(counter==5){
			ans1.setText(answer[17]);
			ans2.setText(answer[18]);
			ans3.setText(answer[19]);
			ans4.setText(answer[20]);
		}
		else if(counter==6){
			ans1.setText(answer[21]);
			ans2.setText(answer[22]);
			ans3.setText(answer[23]);
			ans4.setText(answer[24]);
		}
		else if(counter==7){
			ans1.setText(answer[25]);
			ans2.setText(answer[26]);
			ans3.setText(answer[27]);
			ans4.setText(answer[28]);
		}
		else if(counter==8){
			ans1.setText(answer[29]);
			ans2.setText(answer[30]);
			ans3.setText(answer[31]);
			ans4.setText(answer[32]);
		}
		else if(counter==9){
			ans1.setText(answer[33]);
			ans2.setText(answer[34]);
			ans3.setText(answer[35]);
			ans4.setText(answer[36]);
		}
		else if(counter==10) {
			ans1.setText(answer[37]);
			ans2.setText(answer[38]);
			ans3.setText(answer[39]);
			ans4.setText(answer[40]);
		}
		else if(counter == 11){
			ans1.setVisible(false);
			ans2.setVisible(false);
			ans3.setVisible(false);
			ans4.setVisible(false);
			totalScore.setText("คะแนนได้ "+ score);
			

	}

}
}