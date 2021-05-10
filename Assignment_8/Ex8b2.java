/*
2. Design a following Phone Book Application Screen using swing & write a code for
various operations like Delete, Update, Next, Previous. Raise an appropriate
exception if invalid data is entered like name left blank and negative phone Number.
*/

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Ex8b2 extends JFrame implements ActionListener{

	JFrame f;
	JTextField Tname,Taddress,Tphone,Temail;
	JLabel Lname,Laddress,Lphone,Lemail;
	JButton Bprev,Bdelete,Bupdate,Bnext,Bexit;
	Connection conn;

	Ex8b2(){
		conn = getConn();
		Lname = new JLabel("Name");
		Lname.setBounds(10,10,100,30);
		Tname = new JTextField();
		Tname.setBounds(120,10,100,30);

		Laddress = new JLabel("Address");
		Laddress.setBounds(10,40,100,30);
		Taddress = new JTextField();
		Taddress.setBounds(120,40,100,30);
		
		Lphone = new JLabel("Phone");
		Lphone.setBounds(10,70,100,30);
		Tphone = new JTextField();
		Tphone.setBounds(120,70,100,30);

		Lemail = new JLabel("Email");
		Lemail.setBounds(10,100,100,30);
		Temail = new JTextField();
		Temail.setBounds(120,100,100,30);

		Bprev = new JButton("<<");
		Bprev.setBounds(10,140,100,30);
		Bprev.addActionListener(this);

		Bdelete = new JButton("Delete");
		Bdelete.setBounds(110,140,100,30);
		Bdelete.addActionListener(this);

		Bupdate = new JButton("Update");
		Bupdate.setBounds(210,140,100,30);
		Bupdate.addActionListener(this);

		Bnext = new JButton(">>");
		Bnext.setBounds(310,140,100,30);
		Bnext.addActionListener(this);

		Bexit = new JButton("Exit");
		Bexit.setBounds(410,140,100,30);
		Bexit.addActionListener(this);
		
		add(Lname);
		add(Tname);

		add(Laddress);
		add(Taddress);

		add(Lphone);
		add(Tphone);

		add(Lemail);
		add(Temail);

		add(Bprev);
		add(Bdelete);
		add(Bupdate);
		add(Bnext);
		add(Bexit);

		setSize(530,300);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setValues();
	}

	void setValues(){
		Statement stmt = null;
		try{
 		 stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery( "SELECT * FROM address_book;" );
		 while(rs.next()){
			String Sname = rs.getString("name");
			String address = rs.getString("address");
			String phone = rs.getString("phone");
			String email = rs.getString("email");
		 }
		 Tname.setText("Sname");
		 Taddress.setText("address");
		 Tphone.setText("phone");
		 Temail.setText("email");
		}
		catch(Exception e){

		}
	}

	public void actionPerformed(ActionEvent e){
		String cmd = e.getActionCommand();
        System.out.println(cmd);
		switch(cmd){
			case "<<": break;
			case "Delete": break;
			case ">>": break;
			case "Update": break;
			case "Exit": break;
		}
	}

	Connection getConn(){
		Connection c = null;
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/postgres",
            "postgres", "1246");
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
	  return c;
   }

	public static void main(String[] args){
		new Ex8b2();
	}
}
