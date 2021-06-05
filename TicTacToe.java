package saturdayproject;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class TicTacToe implements ActionListener{
	 static Random rand = new Random();
	    JFrame frame = new JFrame();
	    JPanel titlePanel = new JPanel();
	    JPanel ButtonPanel = new JPanel();
	    static JLabel textField = new JLabel();
	    static JButton [] buttons = new JButton[9];
	     boolean Player1Turn;
	    TicTacToe(){
	    	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(800,800);
	frame.getContentPane().setBackground(new Color(50,50,50));
	frame.setVisible(true);
	textField.setBackground(new Color(25,25,25));
	textField.setForeground(new Color(25,255,0));
	textField.setFont(new Font("INK Free",Font.BOLD,75));
	textField.setHorizontalAlignment(JLabel.CENTER);
	textField.setText("Tic-Tac-Toe");
	textField.setOpaque(true);
	titlePanel.setLayout(new BorderLayout());
	titlePanel.setBounds(0,0,800,100);
	
	ButtonPanel.setLayout(new GridLayout(3,3));
	ButtonPanel.setBackground(new Color(150,150,150));
	
	for(int i =0; i<9; i++) {
		buttons[i]= new JButton();
		ButtonPanel.add(buttons[i]);
		buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
		buttons[i].setFocusable(false);
		buttons[i].addActionListener(this);
	}
	
	titlePanel.add(textField);
	frame.add(titlePanel,BorderLayout.NORTH);
	
	FirstTurn();

	frame.add(ButtonPanel);
	
	
	    }
	    @Override
		public void actionPerformed(ActionEvent e) {
			for(int i =0; i<9; i++) {
				if(e.getSource()==buttons[i]){
					if(Player1Turn) {
						if(buttons[i].getText()=="") {
							buttons[i].setForeground(new Color(255,0,0));
							buttons[i].setText("X");
							Player1Turn = false;
							textField.setText("O turn");
							check();
						}
					}
					else {
						if(buttons[i].getText()=="") {
							buttons[i].setForeground(new Color(0,0,255));
							buttons[i].setText("O");
							Player1Turn = true;
							textField.setText("X turn");
						check();
					}
				}
				}
			 }
			}
		
	    public  void FirstTurn(){
	    	try {
	    	Thread.sleep(2000);
	    	}
	    	catch(InterruptedException e) {
	    		e.printStackTrace();
	    	}
	    	if(rand.nextInt(2)==0){
	    		Player1Turn = true;
	    	textField.setText("O turn");
	    	
	    	}
	    	else {
	    		Player1Turn = false;
	    		textField.setText("O turn");
	    	}
	    	

	    }
	    public void check(){
	    	if((buttons[0].getText()=="X")&&
	    		(buttons[1].getText()=="X")&&
	    		(buttons[2].getText()=="X")) {
	    		xWins(0,1,2);
	    	}
	    	if((buttons[3].getText()=="X")&&
		    		(buttons[4].getText()=="X")&&
		    		(buttons[5].getText()=="X")) {
		    		xWins(3,4,5);
		    	}
	    	if((buttons[6].getText()=="X")&&
		    		(buttons[7].getText()=="X")&&
		    		(buttons[8].getText()=="X")) {
		    		xWins(6,7,8);
		    	}
	    	if((buttons[0].getText()=="X")&&
		    		(buttons[3].getText()=="X")&&
		    		(buttons[6].getText()=="X")) {
		    		xWins(0,3,6);
		    	}
	    	if((buttons[1].getText()=="X")&&
		    		(buttons[4].getText()=="X")&&
		    		(buttons[7].getText()=="X")) {
		    		xWins(1,4,7);
		    	}
	    	if((buttons[2].getText()=="X")&&
		    		(buttons[5].getText()=="X")&&
		    		(buttons[8].getText()=="X")) {
		    		xWins(2,5,8);
		    	}
	    	if((buttons[2].getText()=="X")&&
		    		(buttons[4].getText()=="X")&&
		    		(buttons[6].getText()=="X")) {
		    		xWins(2,4,6);
		    	}
	    	
	    	if((buttons[0].getText()=="O")&&
		    		(buttons[1].getText()=="O")&&
		    		(buttons[2].getText()=="O")) {
		    		oWins(0,1,2);
		    	}
		    	if((buttons[3].getText()=="O")&&
			    		(buttons[4].getText()=="O")&&
			    		(buttons[5].getText()=="O")) {
			    		oWins(3,4,5);
			    	}
		    	if((buttons[6].getText()=="O")&&
			    		(buttons[7].getText()=="O")&&
			    		(buttons[8].getText()=="O")) {
			    		oWins(6,7,8);
			    	}
		    	if((buttons[0].getText()=="O")&&
			    		(buttons[3].getText()=="O")&&
			    		(buttons[6].getText()=="O")) {
			    		oWins(0,3,6);
			    	}
		    	if((buttons[1].getText()=="O")&&
			    		(buttons[4].getText()=="O")&&
			    		(buttons[7].getText()=="O")) {
			    		oWins(1,4,7);
			    	}
		    	if((buttons[2].getText()=="O")&&
			    		(buttons[5].getText()=="O")&&
			    		(buttons[8].getText()=="O")) {
			    		oWins(2,5,8);
			    	}
		    	if((buttons[2].getText()=="O")&&
			    		(buttons[4].getText()=="O")&&
			    		(buttons[6].getText()=="O")) {
			    		oWins(2,4,6);
			    	}
	    }
	    public void xWins(int a, int b, int c){
            buttons[a].setBackground(Color.GREEN);
            buttons[b].setBackground(Color.GREEN);
            buttons[c].setBackground(Color.GREEN);
            for(int i =0; i<9; i++) {
            	buttons[i].setEnabled(false);
            }
            textField.setText("X wins");
	    }
	    public static void oWins(int a, int b, int c){
	    	   buttons[a].setBackground(Color.GREEN);
	            buttons[b].setBackground(Color.GREEN);
	            buttons[c].setBackground(Color.GREEN);
	            for(int i =0; i<9; i++) {
	            	buttons[i].setEnabled(false);
	            }
	            textField.setText("O wins");
		    }
	    }

