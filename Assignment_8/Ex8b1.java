package Assignment_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Ex8b1 {
    Connection conn;
    Statement stmt;
    PreparedStatement ps1,ps2,ps3;
    ResultSet rs;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Ex8b1() throws SQLException {
        conn = Ex8a1.getConnection();
        stmt = conn.createStatement();
        ps1 = conn.prepareStatement("Insert into student values(?,?,?)");
        ps2 = conn.prepareStatement("update student set ? = ? where roll = ?");
        ps3 = conn.prepareStatement("Delete from student where roll=?");
    }

    void insertValue() throws IOException, SQLException {
        System.out.println("Enter the Roll, name and Percentage to be inserted ");
        int roll = Integer.parseInt(br.readLine());
        String name = br.readLine();
        float per = Float.parseFloat(br.readLine());
        ps1.setInt(1,roll); ps1.setString(2,name);ps1.setFloat(3,per);
        ps1.executeUpdate();
    }

    void deleteValue() throws IOException, SQLException {
        System.out.println("Enter the Roll Number for the student record to be deleted");
        int roll = Integer.parseInt(br.readLine());
        ps3.setInt(1,roll);
        ps3.executeUpdate();
    }

    void modifyValue() throws IOException, SQLException {
        System.out.println("Enter the Roll Number for the student record to be Modified");
        int roll = Integer.parseInt(br.readLine());
        ps2.setInt(3,roll);
        System.out.println("Enter Column: (1.roll/2.name/3.per) Number to be changed");
        int choice = Integer.parseInt(br.readLine());
        switch (choice){
            case 1 -> {
                System.out.println("Enter New roll Number");
                int newRoll = Integer.parseInt(br.readLine());
                ps2.setString(1,"roll_no");
                ps2.setInt(2,newRoll);
            }
            case 2-> {
                System.out.println("Enter New Name");
                String newName = br.readLine();
                ps2.setString(1,"name");
                ps2.setString(2,newName);
            }
            case 3->{
                System.out.println("Enter New Percentage");
                float newPer = Float.parseFloat(br.readLine());
                ps2.setString(1,"percentage");
                ps2.setFloat(2,newPer);
            }
            default -> System.out.println("Invalid option");
        }
    }

    void display() throws SQLException {
        rs = stmt.executeQuery("Select * from student");
        while(rs.next()){
            System.out.print("Roll: "+ rs.getInt(1)+" | ");
            System.out.print("Name: "+ rs.getString(2)+" | ");
            System.out.println("Percentage: "+ rs.getFloat(3)+" | ");
        }
    }

    public static void main(String[] args) throws IOException, SQLException {
       Ex8b1 obj = new Ex8b1();
       while(true){
           System.out.println("1.Insert/2.Modify/3.Delete/4.View All/5.Exit");
           System.out.print("Enter Option: ");
           int choice = Integer.parseInt(obj.br.readLine());
           switch (choice) {
               case 1 -> obj.insertValue();
               case 2 -> obj.modifyValue();
               case 3 -> obj.deleteValue();
               case 4 -> obj.display();
               case 5 -> System.exit(0);
               default -> System.out.println("Invalid option");
           }
       }
    }
}
