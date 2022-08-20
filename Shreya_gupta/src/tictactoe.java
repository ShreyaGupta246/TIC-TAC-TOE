import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tictactoe {

	private JFrame frmTicTacToe;
	private JTextField xscore;
	private JTextField oscore;
	private int xscore1=0;
	private int oscore1=0;
	private String startGame="X";
	private int bt1=100;
	private int bt2=100;
	private int bt3=100;
	private int bt4=100;
	private int bt5=100;
	private int bt6=100;
	private int bt7=100;
	private int bt8=100;
	private int bt9=100;
	private int count=0;
	


	 //Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tictactoe window = new tictactoe();
					window.frmTicTacToe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 // Create the application.

	public tictactoe() {
		initialize();
	}

	private void playerTurn()
	{
		if(startGame.equalsIgnoreCase("X"))
		{
			startGame="O";
		}
		else
		{
			startGame="X";
		}
	}
	
	private void winner()
	{
		if(bt1==1 && bt2==1 && bt3==1)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "......WINNER...... \n      Player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
			xscore1++;
			xscore.setText(String.valueOf(xscore1));
		}
		else if(bt4==1 && bt5==1 && bt6==1)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "......WINNER...... \n      Player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
			xscore1++;
			xscore.setText(String.valueOf(xscore1));
		}
		else if(bt7==1 && bt8==1 && bt9==1)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "......WINNER...... \n      Player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
			xscore1++;
			xscore.setText(String.valueOf(xscore1));
		}
		else if(bt1==1 && bt4==1 && bt7==1)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "......WINNER...... \n      Player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
			xscore1++;
			xscore.setText(String.valueOf(xscore1));
		}
		else if(bt2==1 && bt5==1 && bt8==1)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "......WINNER...... \n      Player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
			xscore1++;
			xscore.setText(String.valueOf(xscore1));
		}
		else if(bt3==1 && bt6==1 && bt9==1)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "......WINNER...... \n      Player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
			xscore1++;
			xscore.setText(String.valueOf(xscore1));
		}
		else if(bt1==1 && bt5==1 && bt9==1)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "......WINNER...... \n      Player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
			xscore1++;
			xscore.setText(String.valueOf(xscore1));
		}
		else if(bt3==1 && bt5==1 && bt7==1)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "......WINNER...... \n      Player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
			xscore1++;
			xscore.setText(String.valueOf(xscore1));
		}
		// player o is the winner//
		else if(bt1==0 && bt2==0 && bt3==0)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "......WINNER...... \n      Player O wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
			oscore1++;
			oscore.setText(String.valueOf(oscore1));
		}
		else if(bt4==0 && bt5==0 && bt6==0)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "......WINNER...... \n      Player O wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
			oscore1++;
			oscore.setText(String.valueOf(oscore1));
		}
		else if(bt7==0 && bt8==0 && bt9==0)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "......WINNER...... \n      Player O wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
			oscore1++;
			oscore.setText(String.valueOf(oscore1));
		}
		else if(bt1==0 && bt4==0 && bt7==0)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "......WINNER...... \n      Player O wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
			oscore1++;
			oscore.setText(String.valueOf(oscore1));
		}
		else if(bt2==0 && bt5==0 && bt8==0)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "......WINNER...... \n      Player O wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
			oscore1++;
			oscore.setText(String.valueOf(oscore1));
		}
		else if(bt3==0 && bt6==0 && bt9==0)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "......WINNER...... \n      Player O wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
			oscore1++;
			oscore.setText(String.valueOf(oscore1));
		}
		else if(bt1==0 && bt5==0 && bt9==0)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "......WINNER...... \n      Player O wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
			oscore1++;
			oscore.setText(String.valueOf(oscore1));
		}
		else if(bt3==0 && bt5==0 && bt7==0)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "......WINNER...... \n      Player O wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
			oscore1++;
			oscore.setText(String.valueOf(oscore1));
		}
		
		else if(count==9)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "       ......TIE......\n     No one wins ","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
		}
			
	}
	
	

	 // Initialize the contents of the frame.
	
	private void initialize() {
		frmTicTacToe = new JFrame();
		frmTicTacToe.setTitle("TIC TAC TOE");
		frmTicTacToe.setBounds(100, 100, 752, 485);
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTicTacToe.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frmTicTacToe.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton button1 = new JButton("");
		button1.setBackground(new Color(255, 228, 225));
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button1.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					button1.setForeground(Color.GREEN);
					bt1=1;
					count++;
				}
				else
				{
					button1.setForeground(Color.RED);
					bt1=0;
					count++;
				}
				 playerTurn();
				 winner();
			}
		});
		button1.setFont(new Font("Times New Roman", Font.BOLD, 70));
		panel_1.add(button1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton button2 = new JButton("");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button2.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					button2.setForeground(Color.GREEN);
					bt2=1;
					count++;
				}
				else
				{
					button2.setForeground(Color.RED);
					bt2=0;
					count++;
				}
				 playerTurn();
				 winner();
			}
		});
		button2.setFont(new Font("Times New Roman", Font.BOLD, 70));
		panel_2.add(button2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton button3 = new JButton("");
		button3.setBackground(new Color(255, 228, 225));
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button3.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					button3.setForeground(Color.GREEN);
					bt3=1;
					count++;
				}
				else
				{
					button3.setForeground(Color.RED);
					bt3=0;
					count++;
				}
				 playerTurn();
				 winner();
			}
		});
		button3.setFont(new Font("Times New Roman", Font.BOLD, 70));
		panel_3.add(button3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("PLAYER X");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel_4.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		xscore = new JTextField();
		xscore.setHorizontalAlignment(SwingConstants.CENTER);
		xscore.setFont(new Font("Times New Roman", Font.BOLD, 44));
		xscore.setText("0");
		panel_5.add(xscore, BorderLayout.CENTER);
		xscore.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton button4 = new JButton("");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button4.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					button4.setForeground(Color.GREEN);
					bt4=1;
					count++;
				}
				else
				{
					button4.setForeground(Color.RED);
					bt4=0;
					count++;
				}
				 playerTurn();
				 winner();
			}
		});
		button4.setFont(new Font("Times New Roman", Font.BOLD, 70));
		panel_6.add(button4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton button5 = new JButton("");
		button5.setBackground(new Color(255, 228, 225));
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button5.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					button5.setForeground(Color.GREEN);
					bt5=1;
					count++;
				}
				else
				{
					button5.setForeground(Color.RED);
					bt5=0;
					count++;
				}
				 playerTurn();
				 winner();
			}
		});
		button5.setFont(new Font("Times New Roman", Font.BOLD, 70));
		panel_7.add(button5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton button6 = new JButton("");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			button6.setText(startGame);
			if(startGame.equalsIgnoreCase("X"))
			{
				button6.setForeground(Color.GREEN);
				bt6=1;
				count++;
			}
			else
			{
				button6.setForeground(Color.RED);
				bt6=0;
				count++;
			}
			 playerTurn();
			 winner();
				
			}
		});
		button6.setFont(new Font("Times New Roman", Font.BOLD, 70));
		panel_8.add(button6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("PLAYER O");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		oscore = new JTextField();
		oscore.setHorizontalAlignment(SwingConstants.CENTER);
		oscore.setFont(new Font("Times New Roman", Font.BOLD, 44));
		oscore.setText("0");
		panel_10.add(oscore, BorderLayout.CENTER);
		oscore.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JButton button7 = new JButton("");
		button7.setBackground(new Color(255, 228, 225));
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button7.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					button7.setForeground(Color.GREEN);
					bt7=1;
					count++;
					
				}
				else
				{
					button7.setForeground(Color.RED);
					bt7=0;
					count++;
				}
				 playerTurn();
				 winner();
			}
		});
		button7.setFont(new Font("Times New Roman", Font.BOLD, 70));
		panel_11.add(button7, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JButton button8 = new JButton("");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button8.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					button8.setForeground(Color.GREEN);
					bt8=1;
					count++;
				}
				else
				{
					button8.setForeground(Color.RED);
					bt8=0;
					count++;
				}
				 playerTurn();
				 winner();
			}
		});
		button8.setFont(new Font("Times New Roman", Font.BOLD, 70));
		panel_12.add(button8, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton button9 = new JButton("");
		button9.setBackground(new Color(255, 228, 225));
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button9.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					button9.setForeground(Color.GREEN);
					bt9=1;
					count++;
				}
				else
				{
					button9.setForeground(Color.RED);
					bt9=0;
					count++;
				}
				 playerTurn();
				 winner();
			}
		});
		button9.setFont(new Font("Times New Roman", Font.BOLD, 70));
		panel_13.add(button9, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton reset = new JButton("RESET");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button1.setText(null);
				button2.setText(null);
				button3.setText(null);
				button4.setText(null);
				button5.setText(null);
				button6.setText(null);
				button7.setText(null);
				button8.setText(null);
				button9.setText(null);
				bt1=100;
				bt2=100;
				bt3=100;
				bt4=100;
				bt5=100;
				bt6=100;
				bt7=100;
				bt8=100;
				bt9=100;
				count=0;
				
			}
		});
		reset.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_14.add(reset, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton exit = new JButton("EXIT");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTicTacToe = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmTicTacToe, "Confirm if you want to Quit the game and Exit","TIC TAC TOE",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		exit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_15.add(exit, BorderLayout.CENTER);
	}

}
