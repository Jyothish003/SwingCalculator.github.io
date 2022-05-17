import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "unused" })
public class FirstWindow extends JFrame {

	private JPanel contentPane;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tfr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindow frame = new FirstWindow();
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
	public FirstWindow() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 394);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CALCULATOR");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(197, 10, 133, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(98, 81, 13, 22);
		contentPane.add(lblNewLabel_1);
		
		tfa = new JTextField();
		tfa.setBounds(143, 81, 96, 19);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		JLabel labelb = new JLabel("B");
		labelb.setForeground(Color.WHITE);
		labelb.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelb.setBounds(98, 130, 13, 22);
		contentPane.add(labelb);
		
		tfb = new JTextField();
		tfb.setBounds(143, 130, 96, 19);
		contentPane.add(tfb);
		tfb.setColumns(10);
		
		JLabel labelres = new JLabel("Result");
		labelres.setForeground(Color.WHITE);
		labelres.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelres.setBounds(51, 176, 60, 22);
		contentPane.add(labelres);
		
		tfr = new JTextField();
		tfr.setColumns(10);
		tfr.setBounds(143, 181, 96, 19);
		contentPane.add(tfr);
		
		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//LOGIC TO ADD
				String data1=tfa.getText();
				String data2=tfb.getText();
				
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				
				int res=var1+var2;
				String result=String.valueOf(res);
				 tfr.setText(result);
			}
		});
		add.setForeground(Color.BLACK);
		add.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add.setBounds(52, 265, 73, 31);
		contentPane.add(add);
		
		JButton sub = new JButton("SUB");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LOGIC TO SUBTRACTION
				
				String data1=tfa.getText();
				String data2=tfb.getText();
				
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				
				int res=var1-var2;
				String Result=String.valueOf(res);
				 tfr.setText(Result);
			}
		});
		sub.setForeground(Color.BLACK);
		sub.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sub.setBounds(147, 265, 73, 31);
		contentPane.add(sub);
		
		JButton mul = new JButton("MUL");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LOGIC TO MULTIPLICATION
				
				String data1=tfa.getText();
				String data2=tfb.getText();
				
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				
				int res=var1*var2;
				String Result=String.valueOf(res);
				 tfr.setText(Result);
			}
		});
		mul.setForeground(Color.BLACK);
		mul.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mul.setBounds(243, 265, 73, 31);
		contentPane.add(mul);
		
		JButton div = new JButton("DIV");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LOGIC FOR DIVISION
				
				String data1=tfa.getText();
				String data2=tfb.getText();
				
				float var1=Integer.valueOf(data1);
				float var2=Integer.valueOf(data2);
				
				float res=var1/var2;
				String Result=String.valueOf(res);
				 tfr.setText(Result);
			}
		});
		div.setForeground(Color.BLACK);
		div.setFont(new Font("Tahoma", Font.PLAIN, 18));
		div.setBounds(337, 265, 67, 31);
		contentPane.add(div);
		
		JButton rem = new JButton("REM");
		rem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LOGIC FOR REMAINDER
				String data1=tfa.getText();
				String data2=tfb.getText();
				
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				
				int res=var1%var2;
				String Result=String.valueOf(res);
				 tfr.setText(Result);
			}
		});
		rem.setForeground(Color.BLACK);
		rem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rem.setBounds(427, 265, 77, 31);
		contentPane.add(rem);
	}
}
