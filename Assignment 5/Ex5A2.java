/*
2.Write a menu driven program to perform the following operations on a text file “phone.txt”
which contains name and phone number pairs. The menu should have options:
i. Search name and display phone number
ii. Add a new name-phone number pair.

*/
import java.io.*;
import java.util.Scanner;

public class Ex5A2{
	static final String fname = "Phone.txt";

	static String getNum(String Name){
		try{
		File f = new File(fname);
		Scanner reader = new Scanner(f);
		String str;
		String[] str2 = new String[3];
		while(reader.hasNextLine()){
			str = reader.nextLine();
			str2 = str.split(" ",2);
			str2[0] = str2[0].toLowerCase();
			if(str2[0].equals(Name)){
				return str2[1];
			}
		}
		return "-";
		}
		catch (FileNotFoundException ex){
			System.out.println("sorry!");
			System.exit(0);
		}
		return "-";
	}

	static String addNum(String Name,String Num){
		try{
		FileWriter writer = new FileWriter(fname,true);
		writer.write("\n"+Name+" "+Num);
		writer.close();
		return "Successful!";
		}
		catch(IOException ex){
			return "Error!";
		}
	}

	public static void main(String[] args) throws FileNotFoundException{
		Scanner in = new Scanner(System.in);
		int choice;
		String Name;
		String Num;
		File f = new File(fname);
		System.out.println(fname);
		if(!(f.isFile())){
			System.out.println("Where is phone.txt?");
			System.exit(0);
		}
		while(true){
			System.out.println("1.Search number");
			System.out.println("2.Add a number");
			System.out.println("3.Exit");
			choice = in.nextInt();
			switch(choice){
				case 1:
				System.out.println("Enter Name:");
				Name = in.next();
				System.out.println(getNum(Name));
				break;

				case 2:
				System.out.println("Enter Name:");
				Name = in.next();
				System.out.println("Enter Number:");
				Num = in.next();
				System.out.println(addNum(Name,Num));
				break;

				case 3:
				System.exit(0);
				break;
			}
		}
	}
}
