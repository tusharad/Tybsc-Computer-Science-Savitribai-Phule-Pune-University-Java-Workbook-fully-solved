/*
Write a menu driven program to perform the following operations on a text file “phone.txt”
which contains name and phone number pairs. The menu should have options:
i. Search name and display phone number
ii. Add a new name-phone number pair.
 */
import java.io.*;
import java.util.*;

class phone
{
    String name,phno;
    phone (String nm,String ph)
    {
        name = nm;
        phno=ph;
    }
    public String toString ()
    {
        String s = name + " " + phno ;
        return (s);
    }
    public static void search(phone[] arr,int n)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        for(int i=0;i<n;i++)
        {
            if(arr[i].name.equals(s))
            {
                System.out.println(arr[i].toString());
                return;
            }
        }
        System.out.println("No Records Found");
    }
}
class Ex5A2
{
    public static void main (String args[]) throws IOException
    {
        String s, space = " ";
        int i;
        File f = new File ("phone.txt");
        RandomAccessFile rf = new RandomAccessFile (f, "rw");
        BufferedReader b = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Enter no.of Customer");
        int ch,n;
        n = Integer.parseInt (b.readLine ());
        System.out.println ("Enter Records:\n <name><phone no> :");
        for (i = 0; i < n; i++)
        {
            s = b.readLine () + "\n";
            rf.writeBytes(s);
        }
        rf.close ();
        RandomAccessFile rf1 = new RandomAccessFile (f, "r");
        phone p[] = new phone[n];
        for (i = 0; i < n; i++)
        {
            s = rf1.readLine ();
            StringTokenizer t = new StringTokenizer (s, space);
            String sn = new String (t.nextToken ());
            String sp = new String (t.nextToken ());
            p[i] = new phone(sn,sp);
        }
        do
        {
            System.out.println("Menu :\n"+"1:Search for a phone no by name\n"+"2:Add a new Record \n"+"3:Exit\n"+"Enter your Choice :" );
            ch=Integer.parseInt(b.readLine());
            switch (ch)
            {
                case 1:
                    System.out.println ("Enter name to be searched");
                    phone.search (p,n);
                    break;
                case 2:
                    rf = new RandomAccessFile (f, "rw");
                    System.out.println ("Enter Records:\n <name><phone no> :");
                    String s1 = b.readLine () + "\n";
                    rf.writeBytes(s1);
                    rf.close();
                    rf1 = new RandomAccessFile (f, "r");
                    s = rf1.readLine ();
                    StringTokenizer t = new StringTokenizer (s, space);
                    String sn = new String (t.nextToken ());
                    String sp = new String (t.nextToken ());
                    phone p1 = new phone(sn,sp);
                    System.out.println(" Records are  ");
                    for(i=0;i<n;i++)
                        System.out.println(p[i].toString());
                    System.out.println(p1.toString());
                    break;
                case 3 :System.exit(0);
            }
        }while(ch!=3);
    }
}

