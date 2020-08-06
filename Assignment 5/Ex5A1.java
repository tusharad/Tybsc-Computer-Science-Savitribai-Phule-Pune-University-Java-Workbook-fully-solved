/*
Write a program to accept a string as command line argument and check whether it is a file or
directory. If it is a directory, list the contents of the directory, count how many files the
directory has and delete all files in that directory having extension .txt. (Ask the user if the
files have to be deleted). If it is a file, display all information about the file (path, size,
attributes etc).
 */
import java.io.*;

public class Ex5A1 {
    public static void main(String[] a){
        String fname = a[0];
        File f = new File(fname);
        int num = 0;
        if(f.isDirectory()){
            System.out.println("Given file "+fname+" is a Directory");
            System.out.println("List of files are");
            String[] s = f.list();
            for(int i = 0;i< s.length;i++){
                File f1 = new File(fname,s[i]);
                if(f1.isFile()){
                    num++;
                    System.out.println(s[i]);
                }
                else
                    System.out.println("\n"+s[i]+" is a sub directory");
            }
            System.out.println("Number of files are "+ num);
        }
        else{
            if(f.exists()){
                System.out.println("\n"+fname+" is a file");
                System.out.println("Details of "+fname+" are : ");
                System.out.println("Path of file is "+f.getPath());
                System.out.println("Absolute Path of file is "+f.getAbsolutePath());
                System.out.println("Size of file is "+f.length());
            }
            else
                System.out.println(fname+" file is not present ");
        }
    }
}
