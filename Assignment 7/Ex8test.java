import java.sql.*;
import java.io.*;

class Ex8test {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://192.168.100.254/employeeDB", "student", "");
            if (conn == null)
                System.out.println("Connection failed ");
            else {
                System.out.println("Connection successful");
                stmt = conn.createStatement();
                rs = stmt.executeQuery("Select * from emp");
                while (rs.next()) {
                    System.out.print("ID = " + rs.getInt(1));
                    System.out.println("Name = " + rs.getString(2));
                    System.out.println("Salary = " + rs.getInt(3));
                }
                conn.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
