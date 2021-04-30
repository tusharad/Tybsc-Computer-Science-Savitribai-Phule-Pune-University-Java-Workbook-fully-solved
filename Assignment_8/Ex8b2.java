/*
2. Design a following Phone Book Application Screen using swing & write a code for
various operations like Delete, Update, Next, Previous. Raise an appropriate
exception if invalid data is entered like name left blank and negative phone Number.
*/

import javax.swing.*;

public class Ex8b2 extends JFrame{

	JFrame f;
	JTextField Tname,Taddress,Tphone,Temail;
	JLabel Lname,Laddress,Lphone,Lemail;
	JButton Bprev,Bdelete,Bupdate,Bnext,Bexit;
	
	Ex8b2(){
		Lname = new JLabel("Name");
		Lname.setBounds(10,10,100,30);
		Tname = new JTextField();
		Tname.setBounds(120,10,100,30);
		add(Lname);
		add(Tname);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

	public static void main(String[] args){
		new Ex8b2();
	}
}
