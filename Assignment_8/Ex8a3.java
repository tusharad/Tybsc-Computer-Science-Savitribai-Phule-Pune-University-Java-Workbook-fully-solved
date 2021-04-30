/*
3. Write a program to display information about all columns in the student table. (Use
ResultSetMetaData).

*/
package Assignment_8;
import Assignment_8.Ex8a1;

import java.sql.*;

public class Ex8a3 {
    public static void main(String[] args) throws SQLException {
        Connection conn = Ex8a1.getConnection();
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("Select * from student");
        ResultSetMetaData rsmd = rs.getMetaData();
        int noOfColumns = rsmd.getColumnCount();
        System.out.println("Number of columns = " + noOfColumns);
        for(int i=1; i<=noOfColumns; i++)
        {
            System.out.println("Column No : " + i);
            System.out.println("Column Name : " + rsmd.getColumnName(i));
            System.out.println("Column Type : " + rsmd.getColumnTypeName(i));
            System.out.println("Column display size : " + rsmd.getColumnDisplaySize(i));
        }
    }
}
