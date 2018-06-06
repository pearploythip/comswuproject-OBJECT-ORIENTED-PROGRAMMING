package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Index extends JFrame {

	private JPanel contentPane;
	public static String name;
	private static JLabel user;
	private JButton exit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
					frame.setVisible(true);
					inputname();//���¡���ʹ����͡���ͼ����
					loguser();//���¡���ʹ�� log �ͧ�����
				} catch (Exception e) {
					e.printStackTrace();
				}
			}







			private void loguser() throws IOException{
				// TODO Auto-generated method stub
					// TODO Auto-generated method stub
					Writer writer = new FileWriter("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\logfile.txt",true);
					DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd \t HH:mm:ss");	
					Calendar cal = Calendar.getInstance();
					String data = dateFormat.format(cal.getTime());
					writer.write("Name : \t"+name+"\t Time: \t"+data+"\r\n");
					writer.close();
					//�� log �ͧ��������������������С�͡���ͼ���������
			}







			private void inputname() {
				// TODO Auto-generated method stub
				name = JOptionPane.showInputDialog(null, "��سҡ�͡����", "���ͼ����", 2);//�Ѻ���ͨҡ������������㹵���� name
				try{
					if(name==null){
						System.exit(0);//��һԴ˹�ҵ�ҧ�����繡�ûԴ�����
					}
					if(!(name.matches("[�-�A-Za-z]+"))) throw new Exception ("��س�����ѡ�������������ѧ���");	//�������͡���ͼ���� �������������ѡ�� �-� , a-z , A-Z ���ʴ���ͤ�����͹
				} catch (Exception e){
					do{	
						JOptionPane.showMessageDialog(null, e.getMessage(), "���ͼ����",0); 		// �������͡���ͼ���� �������������ѡ�� �-� , a-z , A-Z ���ʴ���ͤ�����͹
						name = JOptionPane.showInputDialog(null, "��سҡ�͡����", "���ͼ����", 2);		// �Ѻ���ͨҡ������������㹵���� name		
						if(name==null){
							System.exit(0); //�Դ���������ͻԴ˹�ҵ�ҧ����͡����
						}
					} while (!(name.matches("[�-�A-Za-z]+"))); // �����͹���Ҽ���������ѡ������㹪�ǧ �-� , a-z , A-Z �������
				}
				
				user.setText("�Թ�յ�͹�Ѻ�س  " + name);//����ͼ�����͹��������� ���ʴ���ͤ�����Ъ��ͼ�����˹�����
				
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
		
		
		
		
		// text
		JLabel lblThaiPray = new JLabel("\u0E1A\u0E17\u0E2A\u0E27\u0E14\u0E21\u0E19\u0E15\u0E4C");
		lblThaiPray.setFont(new Font("Tahoma", Font.PLAIN, 67));
		lblThaiPray.setBounds(306, 157, 353, 90);
		contentPane.add(lblThaiPray);
		
		
		// monk pic
		JLabel monk = new JLabel("");
		monk.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\pic\\monk.gif"));
		monk.setBounds(102, 83, 231, 184);
		contentPane.add(monk);
		
		user = new JLabel("");
		user.setHorizontalAlignment(SwingConstants.CENTER);
		user.setFont(new Font("Tahoma", Font.BOLD, 29));
		user.setBounds(68, 278, 713, 103);
		contentPane.add(user);
		user.setForeground(Color.DARK_GRAY);
		
		JButton btnNewButton = new JButton("\u0E16\u0E31\u0E14\u0E44\u0E1B");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu menu = new Menu();
				menu.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(367, 416, 138, 40);
		contentPane.add(btnNewButton);
		
		
		// bg index
		JLabel bgindex = new JLabel("");
		bgindex.setIcon(new ImageIcon("C:\\Users\\SOM\\Desktop\\java\\ProjectThaiPray\\pic\\bg01.jpg"));
		bgindex.setBounds(0, 0, 834, 611);
		contentPane.add(bgindex);
	
	}
}
