
//Required packages
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class TicTacToe {
	private JFrame frame;
	private String startGame = "X";
	
	private int xCount=0;//marks of the player with symbol "X"
	private int oCount=0;//marks of the player with symbol "O"
	
	private int b1=5;
	private int b2=5;
	private int b3=5;
	private int b4=5;
	private int b5=5;
	private int b6=5;
	private int b7=5;
	private int b8=5;
	private int b9=5;
	
	

	private JTextField txtCountX;//to display the marks of the player with symbol "X"
	private JTextField txtCountO;//to display the marks of the player with symbol "O"
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToe() {
		initialize();
		
	}
		
	/*
	 * methods to implement
	 * winning game
	 * choosePlayer
	 */
		
	private void winningGame() {
		//"X" => 1 & "O" => 0
		//To check the winning condition
		//8 logical combination for each players to win
		//it need to check winning condition after each button click event

		//X win combinations
		if(b1==1 && b2==1&& b3==1) {
			JOptionPane.showMessageDialog(null," X Won !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtCountX.setText(String.valueOf(xCount));
		}
		
		else if(b4==1 && b5==1&& b6==1) {
			JOptionPane.showMessageDialog(null," X Won !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtCountX.setText(String.valueOf(xCount));
		}
		
		else if(b7==1 && b8==1 && b9==1 ) {
			JOptionPane.showMessageDialog(null," X Won !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtCountX.setText(String.valueOf(xCount));
		}
		
		else if(b1==1 && b4==1&& b7==1) {
			JOptionPane.showMessageDialog(null," X Won !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtCountX.setText(String.valueOf(xCount));
		}
		
		else if(b2==1 && b5==1&& b8==1) {
			JOptionPane.showMessageDialog(null," X Won !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtCountX.setText(String.valueOf(xCount));
		}
		
		else if(b3==1 && b6==1&& b9==1) {
			JOptionPane.showMessageDialog(null," X Won !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtCountX.setText(String.valueOf(xCount));
		}
		
		else if(b1==1 && b5==1&& b9==1) {
			JOptionPane.showMessageDialog(null," X Won !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtCountX.setText(String.valueOf(xCount));
		}
		
		else if(b3==1 && b5==1&& b7==1) {
			JOptionPane.showMessageDialog(null," X Won !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtCountX.setText(String.valueOf(xCount));
		}
		
		// O win combinations
		
		else if(b1==0 && b2==0&& b3==0) {
			JOptionPane.showMessageDialog(null," O Won !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			txtCountO.setText(String.valueOf(oCount));
		}
		
		else if(b4==0 && b5==0&& b6==0) {
			JOptionPane.showMessageDialog(null," O Won !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			txtCountO.setText(String.valueOf(oCount));
		}
		
		else if(b7==0 && b8==0 && b9==0 ) {
			JOptionPane.showMessageDialog(null," O Won !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			txtCountO.setText(String.valueOf(oCount));
		}
		
		else if(b1==0 && b4==0&& b7==0) {
			JOptionPane.showMessageDialog(null," O Won !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			txtCountO.setText(String.valueOf(oCount));
		}
		
		else if(b2==0 && b5==0 && b8==0) {
			JOptionPane.showMessageDialog(null," O Won !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			txtCountO.setText(String.valueOf(oCount));
		}
		
		else if(b3==0 && b6==0&& b9==0) {
			JOptionPane.showMessageDialog(null," O Won !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			txtCountO.setText(String.valueOf(oCount));
		}
		
		else if(b1==0 && b5==0&& b9==0) {
			JOptionPane.showMessageDialog(null," O Won !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			txtCountO.setText(String.valueOf(oCount));
		}
		
		else if(b3==0 && b5==0&& b7==0) {
			JOptionPane.showMessageDialog(null," O Won !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			txtCountO.setText(String.valueOf(oCount));
		}
		
		else if ((b1==0|| b1==1)&& (b2==0|| b2==1)&& (b3==0|| b3==1) &&  
				 (b4==0|| b4==1)&& (b5==0|| b5==1)&& (b6==0|| b6==1) &&
				 (b7==0|| b7==1)&& (b8==0|| b8==1)&& (b9==0|| b9==1)	
				) {
			JOptionPane.showMessageDialog(null," Draw ! ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		}		
				
	}
	
	
	private void choosePlayer() {
		//To choose player in each turn
		//if first turn is "X" then next turn must be "O"
		if(startGame.equalsIgnoreCase("X")) {
			startGame="O";
		}
		else {
			startGame="X";
		}
		
		
		
		
		
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(true);
		frame.setBounds(475, 150, 400, 450);//(x_cordiante,y_cordinate,width,height)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));//Used to arrange the components into 5 regions (N,E,S,W,C)
		frame.setTitle("<<<======TIC TAC TOE======>>>");
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 128, 255), 3, true));//create a thin light blue color outside border
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(5, 3, 2, 2));//Create grid with 5 rows & 3 columns
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 160), 1, true));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton Button_1 = new JButton("");
		Button_1.setBackground(new Color(51, 255, 204));
		Button_1.setFont(new Font("Tahoma", Font.BOLD, 85));
		Button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button_1.setText(startGame);	
				if(startGame.equalsIgnoreCase("X") )
				{
					Button_1.setForeground(new Color(153,0,0));
					b1=1;
					
					
				}
				else 
				{
					Button_1.setForeground(new Color(255,255,255));
					b1=0;
					
					
				}
				choosePlayer();
				winningGame();
				
				
				
				
			}
		});
		panel_1.add(Button_1, BorderLayout.CENTER);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 160), 1, true));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton Button_2 = new JButton("");
		Button_2.setBackground(new Color(51, 255, 204));
		Button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button_2.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					Button_2.setForeground(new Color(153,0,0));
					b2=1;
					
				}
				else 
				{
					Button_2.setForeground(new Color(255,255,255));
					b2=0;
					
				}
				choosePlayer();
				winningGame();
			}
		});
		Button_2.setFont(new Font("Tahoma", Font.BOLD, 85));
		panel_2.add(Button_2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 160), 1, true));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton Button_3 = new JButton("");
		Button_3.setBackground(new Color(51, 255, 204));
		Button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button_3.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					Button_3.setForeground(new Color(153,0,0));
					b3=1;
					
				}
				else 
				{
					Button_3.setForeground(new Color(255,255,255));
					b3=0;
					
				}
				choosePlayer();
				winningGame();
			}
		});
		Button_3.setFont(new Font("Tahoma", Font.BOLD, 85));
		panel_3.add(Button_3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 160), 1, true));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton Button_4 = new JButton("");
		Button_4.setBackground(new Color(51, 255, 204));
		Button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button_4.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					Button_4.setForeground(new Color(153,0,0));
					b4=1;
					
				}
				else 
				{
					Button_4.setForeground(new Color(255,255,255));
					b4=0;
					
				}
				choosePlayer();
				winningGame();
			}
		});
		Button_4.setFont(new Font("Tahoma", Font.BOLD, 85));
		panel_4.add(Button_4, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 160), 1, true));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JButton Button_5 = new JButton("");
		Button_5.setBackground(new Color(51, 255, 204));
		Button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button_5.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					Button_5.setForeground(new Color(153,0,0));
					b5=1;
					
				}
				else 
				{
					Button_5.setForeground(new Color(255,255,255));
					b5=0;
					
				}
				choosePlayer();
				winningGame();
			}
		});
		Button_5.setFont(new Font("Tahoma", Font.BOLD, 85));
		panel_5.add(Button_5, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 160), 1, true));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton Button_6 = new JButton("");
		Button_6.setBackground(new Color(51, 255, 204));
		Button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button_6.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					Button_6.setForeground(new Color(153,0,0));
					b6=1;
					
				}
				else 
				{
					Button_6.setForeground(new Color(255,255,255));
					b6=0;
					
				}
				choosePlayer();
				winningGame();
			}
		});
		Button_6.setFont(new Font("Tahoma", Font.BOLD, 85));
		panel_6.add(Button_6, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 160), 1, true));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton Button_7 = new JButton("");
		Button_7.setBackground(new Color(51, 255, 204));
		Button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button_7.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					Button_7.setForeground(new Color(153,0,0));
					b7=1;
					
				}
				else 
				{
					Button_7.setForeground(new Color(255,255,255));
					b7=0;
					
				}
				choosePlayer();
				winningGame();
			}
		});
		Button_7.setFont(new Font("Tahoma", Font.BOLD, 85));
		panel_7.add(Button_7, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 160), 1, true));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton Button_8 = new JButton("");
		Button_8.setBackground(new Color(51, 255, 204));
		Button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button_8.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					Button_8.setForeground(new Color(153,0,0));
					b8=1;
					
				}
				else 
				{
					Button_8.setForeground(new Color(255,255,255));
					b8=0;
					
				}
				choosePlayer();
				winningGame();
			}
		});
		Button_8.setFont(new Font("Tahoma", Font.BOLD, 85));
		panel_8.add(Button_8, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 160), 1, true));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton Button_9 = new JButton("");
		Button_9.setBackground(new Color(51, 255, 204));
		Button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button_9.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					Button_9.setForeground(new Color(153,0,0));
					b9=1;
					
				}
				else 
				{
					Button_9.setForeground(new Color(255,255,255));
					b9=0;
					
				}
				choosePlayer();
				winningGame();
			}
		});
		Button_9.setFont(new Font("Tahoma", Font.BOLD, 85));
		panel_9.add(Button_9, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 160), 1, true));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("PLAYER X");
		lblNewLabel.setBackground(new Color(51, 255, 204));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setForeground(new Color(153, 0, 0));	
		panel_10.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 160), 1, true));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		txtCountX = new JTextField();
		txtCountX.setForeground(new Color(153, 0, 0));
		txtCountX.setBackground(new Color(51, 255, 204));
		txtCountX.setHorizontalAlignment(SwingConstants.CENTER);
		txtCountX.setFont(new Font("Tahoma", Font.BOLD, 36));
		txtCountX.setText("0");
		panel_11.add(txtCountX, BorderLayout.CENTER);
		txtCountX.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 160), 1, true));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JButton Button_reset = new JButton("RESET");
		Button_reset.setBackground(new Color(153, 0, 0));
		Button_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Reset");
				//confirm before reset the game
				if (JOptionPane.showConfirmDialog(frame,"Are you sure you want to Reset the game !","Tic Tac Toe",
						JOptionPane.YES_NO_OPTION	)==JOptionPane.YES_NO_OPTION) {
					
					
					
					
					Button_1.setText(null);
					Button_2.setText(null);
					Button_3.setText(null);
					Button_4.setText(null);
					Button_5.setText(null);
					Button_6.setText(null);
					Button_7.setText(null);
					Button_8.setText(null);
					Button_9.setText(null);	
					
					b1=5;
					b2=5;
					b3=5;
					b4=5;
					b5=5;
					b6=5;
					b7=5;
					b8=5;
					b9=5;
					
					
										
					
				}
					
				;	
				
				
			}
		});
		Button_reset.setForeground(new Color(255, 255, 255));
		Button_reset.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_12.add(Button_reset, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 160), 1, true));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("PLAYER O");
		lblNewLabel_1.setBackground(new Color(51, 255, 204));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		panel_13.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 160), 1, true));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		txtCountO = new JTextField();
		txtCountO.setForeground(new Color(255, 255, 255));
		txtCountO.setBackground(new Color(51, 255, 204));
		txtCountO.setHorizontalAlignment(SwingConstants.CENTER);
		txtCountO.setText("0");
		txtCountO.setFont(new Font("Tahoma", Font.BOLD, 36));
		panel_14.add(txtCountO, BorderLayout.CENTER);
		txtCountO.setColumns(10);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 160), 1, true));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton Button_exit = new JButton("EXIT");
		Button_exit.addActionListener(new ActionListener() {
			
			
				
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				//Confirm before exit the game
				if (JOptionPane.showConfirmDialog(frame,"Are you sure you want to exit !","Tic Tac Toe",
						JOptionPane.YES_NO_OPTION	)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				 xCount=0;
				 oCount=0;
				
				
				;	
			}
		});
		Button_exit.setBackground(new Color(153, 0, 0));
		Button_exit.setForeground(new Color(255, 255, 255));
		Button_exit.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_15.add(Button_exit, BorderLayout.CENTER);
	
	}

}