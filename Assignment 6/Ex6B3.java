/*
 Write a java program to create the following GUI for user registration form. Perform the
following validations:
i.
Password should be minimum 6 characters containing atleast one uppercase letter, one
digit and one symbol.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
class resgiter extends JFrame implements ActionListener
{
    JLabel l1=new JLabel("NAME");
    JLabel l2=new JLabel("PASSWORD");
    JLabel l3=new JLabel("SELECT COUNTRY");
    JLabel l4=new JLabel("GENDER");
    JTextField t1=new JTextField();
    JCheckBox c1=new JCheckBox("MALE");
    JCheckBox c2=new JCheckBox("FEMALE");
    ButtonGroup bg=new ButtonGroup();
    JComboBox c=new JComboBox();
    JButton b=new JButton("SUBMIT");
    JPasswordField p=new JPasswordField();

    public resgiter()
    {
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(700,600);
        l1.setBounds(100,100,200,40);
        l2.setBounds(100,200,200,40);
        l3.setBounds(100,300,200,40);
        l4.setBounds(100,400,200,40);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        t1.setBounds(250,100,150,40);
        add(t1);
        p.setBounds(250,200,150,40);
        add(p);
        c1.setBounds(250,400,100,40);
        c2.setBounds(350,400,100,40);
        add(c1);
        add(c2);
        bg.add(c1);
        bg.add(c2);
        c.setBounds(250,300,120,30);
        c.addItem("INDIA");
        c.addItem("AMERICA");
        c.addItem("AUSTRALIA");
        c.addItem("PHILLIPHINES");
        c.addItem("SPAIN");
        add(c);
        b.setBounds(200,540,100,60);
        add(b);
        b.addActionListener(this);
    }
    public static void main(String[] args)
    {
        new resgiter();
    }
    public void actionPerformed(ActionEvent ar)
    {
        if(ar.getSource()==b)
        {
            this.hide();
            String aa=t1.getText();
//new submit_op(aa);
        }
    }
}