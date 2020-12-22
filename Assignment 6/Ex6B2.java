/*
Write a menu driven program to perform the following operations on a set of integers. The
Load operation should generate 50 random integers (2 digits) and display the numbers on the
screen. The save operation should save the numbers to a file “numbers.txt”. The Compute menu
provides various operations and the result is displayed in a message box. The Search operation
accepts a number from the user in an input dialog and displays the search result in a message
dialog. The sort operation sorts the numbers and displays the sorted data on the screen.
 */
import java.io.*;
import java.lang.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.math.*;
class Slip2Prog1 extends JFrame implements ActionListener
{
    JMenuBar mbar;
    JMenu operation,sort;
    JMenuItem load,save,exit;
    JMenuItem asc,dsc;
    JTextField tf;
    int n=10,ch;
    int arr[];
    Slip2Prog1()
    {
        arr = new int[10];
        setLayout(new BorderLayout());
        mbar=new JMenuBar();
        operation=new JMenu("Operation");
        sort=new JMenu("Sort");
        load=new JMenuItem("Load");
        save=new JMenuItem("Save");
        exit=new JMenuItem("Exit");
        asc=new JMenuItem("Ascending");
        dsc=new JMenuItem("Descending");
        tf = new JTextField(50);
        operation.add(load);
        operation.add(save);
        operation.add(exit);
        sort.add(asc);
        sort.add(dsc);
        mbar.add(operation);
        mbar.add(sort);
        setJMenuBar(mbar);
        add(tf,BorderLayout.SOUTH);
        setTitle("Menus and sub-menus ");
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        load.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);
        asc.addActionListener(this);
        dsc.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Load"))
        {
            tf.setText("");
            Random random = new Random();
            for(int i=0;i<n;i++)
                arr[i] = random.nextInt(100) + 1;
            for(int i=0;i<n;i++)
                tf.setText(tf.getText()+","+arr[i]);
        }
        if(e.getActionCommand().equals("Save"))
        {
            try{
                BufferedWriter outputWriter = new BufferedWriter(new FileWriter("numbers.txt"));
                for(int i=0;i<n;i++)
                    outputWriter.write(arr[i]+",");
                outputWriter.close();
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        if(e.getActionCommand().equals("Exit"))
        {
            dispose();
        }
        if(e.getActionCommand().equals("Ascending"))
        {
            int temp;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n-1;j++)
                {
                    if(arr[j] > arr[j+1])
                    {
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            tf.setText("");
            for(int i=0;i<n;i++)
                tf.setText(tf.getText()+","+arr[i]);
        }
        if(e.getActionCommand().equals("Descending"))
        {
            int temp;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n-1;j++)
                {
                    if(arr[j] < arr[j+1])
                    {
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            tf.setText("");
            for(int i=0;i<n;i++)
                tf.setText(tf.getText()+","+arr[i]);
        }
    }
    public static void main(String args[])
    {
        new Slip2Prog1();
    }
}