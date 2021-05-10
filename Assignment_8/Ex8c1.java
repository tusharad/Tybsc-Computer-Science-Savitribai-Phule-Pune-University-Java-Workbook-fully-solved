import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex8c1 extends JFrame{
    Connection conn;
    JLabel addCourseLabel,viewCourseLabel,addStudentLabel,deleteStudentLabel,viewAllStudentLabel,searchStudentLabel;
    JTextField addCourseField,viewCourseField,addStudentField,deleteStudentField,viewAllStudentField,searchStudentField;
    JButton addCourseButton,viewCourseButton,addStudentButton,deleteStudentButton,viewAllStudentButton,searchStudentButton;
    Ex8c1(){
        conn = getConn();
        addCourseLabel = new JLabel("Enter course");
        addCourseLabel.setBounds(10,10,100,30);
        addCourseField = new JTextField();
        addCourseField.setBounds(110,10,100,30);
        addCourseButton = new JButton("Add course");
        addCourseButton.setBounds(210,10,160,30);

        viewCourseLabel = new JLabel("Enter course");
        viewCourseLabel.setBounds(10,40,100,30);
        viewCourseField = new JTextField();
        viewCourseField.setBounds(110,40,100,30);
        viewCourseButton = new JButton("view course student");
        viewCourseButton.setBounds(210,40,160,30);


        add(addCourseLabel);
        add(addCourseField);
        add(addCourseButton);

        add(viewCourseLabel);
        add(viewCourseField);
        add(viewCourseButton);
        
        setSize(530,300);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    Connection getConn(){
        Connection c = null;
        try {
           Class.forName("org.postgresql.Driver");
           c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
              "postgres", "1246");
        } catch (Exception e) {
           e.printStackTrace();
           System.err.println(e.getClass().getName()+": "+e.getMessage());
           System.exit(0);
        }
        System.out.println("Opened database successfully");
        return c;
    }
    public static void main(String[] args) {
        new Ex8c1();
    }
}
