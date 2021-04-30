/*
1. Create a student table with fields roll number, name, percentage. Insert values in the
table. Display all the details of the student table in a tabular format on the screen (using
swing).

*/
package Assignment_8;

import javax.swing.*;
import java.sql.*;

public class Ex8a1 extends JFrame{

    Ex8a1(){
        //no code
    }
    Ex8a1(Object[][] data){
        String[] columns = { "Roll", "Name", "Percentage" };
        JTable table = new JTable(data, columns);
        this.add(new JScrollPane(table));
        this.setTitle("Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    static Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/","postgres","modern");
        }
        catch(Exception e)
        { System.out.println(e);}
        return conn;
    }

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ResultSet num = null;
            conn = getConnection();
            if(conn==null) {
                System.out.println("Connection failed ");
                System.exit(0);
            }
                System.out.println("Connection successful..");
                stmt = conn.createStatement();
                rs = stmt.executeQuery("Select * from student");
                num = stmt.executeQuery("Select count(*) from student");
                num.next();
                int n = num.getInt(1);
                int i = 0;
                Object[][] data = new Object[n][3];
                while(rs.next())
                {
                    data[i][0] = rs.getInt(1);
                    data[i][1] = rs.getString(2);
                    data[i][2] = rs.getFloat(3);
                    i++;
                }
                conn.close();
        new Ex8a1(data);
}
}
